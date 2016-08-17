$(function(){

					
					var flag ;		//undefined 判断新增和修改方法 
					/**
					 *	初始化数据表格  
					 */
					$('#t_exception').datagrid({
							idField:'excId' ,		//只要创建数据表格 就必须要加 ifField
							title:'异常报告列表' ,
							//width:1300 ,
							fit:true ,
							height:450 ,
							url:'' ,
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
								//	width:50 ,
									checkbox: true
								}
							]],
							columns:[[
								{
									field:'excId' ,
									title:'异常报告编号' ,
								//	width:100 ,
									align:'center' ,

								},
								{
									field:'devId' ,
									title:'异常设备编号' ,
								//	width:100 
								},{
									field:'UId' ,
									title:'报告异常人员编号' ,
									//width:0 ,
									//hidden: true,
									sortable : true 
								},{
									field:'excDetail' ,
									title:'详情' ,
								//	width:100
								},{
									field:'excPic' , 
									title:'照片' ,
								//	width:50 
								},{
									field:'excDate' ,
									title:'异常报告时间' ,
								//	width:100 ,
									sortable : true
								}
							]] ,
							pagination: true , 
							pageSize: 10 ,
							pageList:[5,10,15,20,50] ,
							
					});
					
					
					/**
					 *  提交表单方法
					 */
					

			});
			
			
			
		
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