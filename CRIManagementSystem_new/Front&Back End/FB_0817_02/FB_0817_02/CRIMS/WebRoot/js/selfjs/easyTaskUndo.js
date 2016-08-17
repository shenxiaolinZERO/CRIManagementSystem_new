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
							title:'未完成任务列表' ,
							//width:1300 ,
							fit:true ,
							height:450 ,
							url:'pageTasktaskAction' ,
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
								},{
									field:'bossId' ,
									title:'角色' ,
									width:100,
									hidden:true
								},{
									field:'devId' ,
									title:'角色' ,
									width:100,
									hidden:true
								}
							]] ,
							pagination: true , 
							pageSize: 10 ,
							pageList:[5,10,15,20,50] ,
							toolbar:[
								{
									text:'修改' ,
									iconCls:'icon-edit' , 
									handler:function(){
										flag = 'edit';
										var arr =$('#t_task').datagrid('getSelections');
										if(arr.length != 1){
											$.messager.show({
												title:'提示信息!',
												msg:'只能选择一行记录进行修改!'
											});
										} else {
											$('#mydialog').dialog({
												title:'修改'
											});
											$('#mydialog').dialog('open'); //打开窗口
											$('#myform').get(0).reset();   //清空表单数据 
											$('#myform').form('load',{	   //调用load方法把所选中的数据load到表单中,非常方便
												't.taskId':arr[0].taskId ,
												't.psTime':formtime(arr[0].psTime),
												't.peTime':formtime(arr[0].peTime),
												't.UId':arr[0].UName,
												't.asTime':arr[0].asTime ,
												't.aeTime':arr[0].aeTime ,
												't.devId':arr[0].devId,
												't.bossId':arr[0].bossId
												
											});
										}
										$('#t_task').datagrid('clearSelections');
									
									}
								},{
									text:'删除机柜' ,
									iconCls:'icon-remove' , 
									handler:function(){
											var arr =$('#t_task').datagrid('getSelections');
											if(arr.length <=0){
												$.messager.show({
													title:'提示信息!',
													msg:'至少选择一行记录进行删除!'
												});
											} else {
												
												$.messager.confirm('提示信息' , '确认删除?' , function(r){
														if(r){
																var ids = '';
																for(var i =0 ;i<arr.length;i++){
																	ids += arr[i].taskId + ',' ;
																}
																ids = ids.substring(0 , ids.length-1);
																$.post('deletetaskAction' , {ids:ids} , function(result){
																	//1 刷新数据表格 
																	$('#t_task').datagrid('reload');
																	//2 清空idField   
																	$('#t_task').datagrid('clearSelections');
																	//3 给提示信息 
																	$.messager.show({
																		title:'提示信息!' , 
																		msg:'操作成功!'
																	});
																});
														} else {
															return ;
														}
												});
											}
									}								
								},{
									text:'查询' , 
									iconCls:'icon-search' , 
									handler:function(){
											$('#lay').layout('expand' , 'north');
									}
								}	
							]
					});
					
					
					/**
					 *  提交表单方法
					 */
					$('#btn1').click(function(){
							if($('#myform').form('validate')){
								$.ajax({
									type: 'post' ,
									url: 'edittaskAction',
									cache:false ,
									data:$('#myform').serialize() ,
									dataType:'json' ,
									success:function(result){
										//1 关闭窗口
										$('#mydialog').dialog('close');
										//2刷新datagrid 
										$('#t_cabinet').datagrid('reload');
										//3 提示信息
										$.messager.show({
											title:result.status , 
											msg:result.message
										});
									} ,
									error:function(result){
										$.messager.show({
											title:result.status , 
											msg:result.message
										});
									}
								});
							} else {
								$.messager.show({
									title:'提示信息!' ,
									msg:'数据验证不通过,不能保存!'
								});
							}
					});
					
					/**
					 * 关闭窗口方法
					 */
					$('#btn2').click(function(){
						$('#mydialog').dialog('close');
					});
					
						
					$('#searchbtn').click(function(){
						$('#t_task').datagrid('load' ,serializeForm($('#mysearch')));
					});
					
					
					$('#clearbtn').click(function(){
						$('#mysearch').form('clear');
						$('#t_task').datagrid('load' ,{});
					});
					

			});
			
			
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
