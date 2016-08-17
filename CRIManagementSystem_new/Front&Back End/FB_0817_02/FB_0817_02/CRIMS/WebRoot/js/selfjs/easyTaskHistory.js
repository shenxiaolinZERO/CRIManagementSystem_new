		$(function(){

					/**
					 * 	对于form表单的验证 
					 */
										
					var flag ;		//undefined 判断新增和修改方法 
					/**
					 *	初始化数据表格  
					 */
					$('#t_task').datagrid({
							idField:'taskId' ,		//只要创建数据表格 就必须要加 ifField
							title:'历史任务列表' ,
							//width:1300 ,
							fit:true ,
							height:450 ,
							url:'pageHistoryTasktaskAction' ,
							fitColumns:true ,  
							striped: true ,					//隔行变色特性 
							//nowrap: false ,				//折行显示 为true 显示在一会 
							loadMsg: '数据正在加载,请耐心的等待...' ,
							rownumbers:true ,
							//singleSelect:true ,				//单选模式 
							//remoteSort: false ,
							//sortName: 'salary' ,
							//sortOrder: 'desc' ,
							rowStyler: function(index ,record){
								 if(record.age > 25){
									 return "background:red";
								 }
								 // console.info(index);
								 // console.info(record);
							} ,
							frozenColumns:[[				//冻结列特性 ,不要与fitColumns 特性一起使用 
								{
									field:'ck' ,
									width:50 ,
									checkbox: true
								}
							]],
							columns:[[
								{
									field:'taskId' ,
									title:'任务编号' ,
									width:100 ,
									align:'center' ,
									hidden: true

								},
								{
									field:'psTime' ,
									title:'计划开始时间' ,
									width:100,
									formatter:function(value , record){
										return formtime(value);
									} 
								},{
									field:'peTime' ,
									title:'计划结束时间' ,
									width:100,
									formatter:function(value , record){
										return formtime(value);
									} 
								},{
									field:'UName' ,
									title:'巡检人员' ,
									width:100,
									formatter:function(value , record , index){
									
										var str = '';
										$.ajax({
											type:'post' , 
											url : 'getUNameUserAction' ,
											cache:false ,
											async: false ,		//同步请求
											data:{'u.UId':value},
											dataType:'json' ,
											success:function(result){
												str = result.UName;
											}
										});
										return str ;
									}
								},{
									field:'asTime' ,
									title:'实际开始时间' ,
									width:100,
									formatter:function(value , record){
										return formtime(value);
									}
								},{
									field:'aeTime' ,
									title:'实际结束时间' ,
									width:100,
									formatter:function(value , record){
										return formtime(value);
									} 
								},{
									field:'RPost' ,
									title:'岗位' ,
									width:100,
									formatter:function(value , record , index){
									
										var str = '';
										$.ajax({
											type:'post' , 
											url : 'getRPostUserAction' ,
											cache:false ,
											async: false ,		//同步请求
											data:{'u.UId':value},
											dataType:'json' ,
											success:function(result){
												str = result.RPost;
											}
										});
										return str ;
									}
								}
							]] ,
							pagination: true , 
							pageSize: 10 ,
							pageList:[5,10,15,20,50] ,
							toolbar:[
								{
									text:'查询' , 
									iconCls:'icon-search' , 
									handler:function(){
											$('#lay').layout('expand' , 'north');
									}
								}	
							]
					});
					
					
					$('#searchbtn').click(function(){
						$('#t_task').datagrid('load' ,serializeForm($('#mysearch')));
					});
					
					
					$('#clearbtn').click(function(){
						$('#mysearch').form('clear');
						$('#t_task').datagrid('load' ,{});
					});
					
					

			});
			
			//显示时间格式化方法
			 function formtime(val){
				var year = parseInt(val.year)+1900;
				var month = parseInt(val.month)+1;
				month = month>9?month:('0'+month);
				var date = parseInt(val.date);
				
				date = date>9?date:('0'+date);
				var time = year+'-'+month+'-'+date;
				return time;
			} 
		
			//js方法：序列化表单 			
			function serializeForm(form){
				var obj = {};
				$.each(form.serializeArray(),function(index){
					if(obj[this['name']]){
						obj[this['name']] = obj[this['name']] + ','+this['value'];
					} else {
						obj[this['name']] =this['value'];
					}
				});
				return obj;
			}
