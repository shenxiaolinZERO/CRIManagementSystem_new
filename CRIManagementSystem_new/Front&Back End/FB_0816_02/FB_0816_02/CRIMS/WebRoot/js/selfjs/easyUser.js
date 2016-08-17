$(function(){

	var flag ;		//undefined 判断新增和修改方法 
	/**
	 *	初始化数据表格  
	 */
	$('#t_user').datagrid({
		idField:'UId' ,		//只要创建数据表格 就必须要加 ifField
		title:'用户列表' ,
		//width:1300 ,
		fit:true ,
		height:450 ,
		url:'pageUserUserAction' ,
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
		                				        	  field:'UId' ,
		                				        	  title:'用户编号' ,
		                				        	  width:100 ,
		                				        	  align:'center' ,

		                				          },
		                				          {
		                				        	  field:'UName' ,
		                				        	  title:'用户名' ,
		                				        	  width:100 
		                				          },{
		                				        	  field:'UPassword' ,
		                				        	  title:'用户密码' ,
		                				        	  width:100 ,
		                				        	  hidden: true,
		                				        	  sortable : true 
		                				          },{
		                				        	  field:'USex' , 
		                				        	  title:'性别' ,
		                				        	  width:50 ,
		                				        	  formatter:function(value , record , index){
		                				        		  if(value == 1){
		                				        			  return '<span style=color:red; >男</span>' ;
		                				        		  } else if( value == 2){
		                				        			  return '<span style=color:green; >女</span>' ; 
		                				        		  }
		                				        		  /* console.info(value);
											console.info(record);
											console.info(index);  */
		                				        	  }
		                				          },{
		                				        	  field:'RId' ,
		                				        	  title:'角色id' ,
		                				        	  width:100,
		                				        	  hidden: true
		                				          },{
		                				        	  field:'RPost' ,
		                				        	  title:'角色' ,
		                				        	  width:100
		                				          },{
		                				        	  field:'UAge' ,
		                				        	  title:'年龄' ,
		                				        	  width:100 ,
		                				        	  sortable : true
		                				          },{
		                				        	  field:'AId' ,
		                				        	  title:'地区编号' ,
		                				        	  width:100,
		                				        	  hidden: true
		                				          },{
		                				        	  field:'AName' ,
		                				        	  title:'地区' ,
		                				        	  width:100
		                				          },{
		                				        	  field:'UAddress' ,
		                				        	  title:'地址' ,
		                				        	  width:100
		                				          },{
		                				        	  field:'UCreatetime' , 
		                				        	  title:'创建时间' , 
		                				        	  width:150
		                				          },{
		                				        	  field:'UTel' ,
		                				        	  title:'电话' ,
		                				        	  width:100 ,
		                				          },{
		                				        	  field:'UEmail' ,
		                				        	  title:'邮箱' ,
		                				        	  width:100
		                				          }
		                				          ]] ,
		                				          pagination: true , 
		                				          pageSize: 10 ,
		                				          pageList:[5,10,15,20,50] ,
		                				          toolbar:[
		                				                   {
		                				                	   text:'新增用户' ,
		                				                	   iconCls:'icon-add' , 
		                				                	   handler:function(){
		                				                		   flag = 'add';
		                				                		   $('#mydialog').dialog({
		                				                			   title:'新增用户' 
		                				                		   });
		                				                		   //$('#myform').find('input[name!=sex]').val("");
		                				                		   $('#myform').get(0).reset();
		                				                		   //$('#myform').form('clear');
		                				                		   $('#mydialog').dialog('open');

		                				                	   }

		                				                   },{
		                				                	   text:'修改用户' ,
		                				                	   iconCls:'icon-edit' , 
		                				                	   handler:function(){
		                				                		   flag = 'edit';
		                				                		   var arr =$('#t_user').datagrid('getSelections');
		                				                		   if(arr.length != 1){
		                				                			   $.messager.show({
		                				                				   title:'提示信息!',
		                				                				   msg:'只能选择一行记录进行修改!'
		                				                			   });
		                				                		   } else {
		                				                			   $('#mydialog').dialog({
		                				                				   title:'修改用户'
		                				                			   });
		                				                			   $('#mydialog').dialog('open'); //打开窗口
		                				                			   $('#myform').get(0).reset();   //清空表单数据 
		                				                			   $('#myform').form('load',{	   //调用load方法把所选中的数据load到表单中,非常方便
		                				                				   'u.UId':arr[0].UId ,
		                				                				   'u.UName':arr[0].UName,
		                				                				   'u.UPassword':arr[0].UPassword ,
		                				                				   'u.USex':arr[0].USex ,
		                				                				   'u.UAge':arr[0].UAge ,
		                				                				   'u.AId':arr[0].AId,
		                				                				   'u.UAddress':arr[0].UAddress,
		                				                				   'rid':arr[0].RId,
		                				                				   'u.UTel':arr[0].UTel ,
		                				                				   'u.UEmail':arr[0].UEmail
		                				                			   });
		                				                		   }
		                				                		   $('#t_user').datagrid('clearSelections');

		                				                	   }
		                				                   },{
		                				                	   text:'删除用户' ,
		                				                	   iconCls:'icon-remove' , 
		                				                	   handler:function(){
		                				                		   var arr =$('#t_user').datagrid('getSelections');
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
		                				                						   ids += arr[i].UId + ',' ;
		                				                					   }
		                				                					   ids = ids.substring(0 , ids.length-1);
		                				                					   $.post('deleteUserAction' , {ids:ids} , function(result){
		                				                						   //1 刷新数据表格 
		                				                						   $('#t_user').datagrid('reload');
		                				                						   //2 清空idField   
		                				                						   $('#t_user').datagrid('clearSelections');
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
		                				                	   text:'查询用户' , 
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
				url: flag=='add'?'addUserAction':'editUserAction' ,
						cache:false ,
						data:$('#myform').serialize() ,
						dataType:'json' ,
						success:function(result){
							//1 关闭窗口
							$('#mydialog').dialog('close');
							//2刷新datagrid 
							$('#t_user').datagrid('reload');
							//3 提示信息
							$.messager.show({
								title:result.status , 
								msg:result.message
							});
						} ,
						error:function(result){
							$.meesager.show({
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
		$('#t_user').datagrid('load' ,serializeForm($('#mysearch')));
	});


	$('#clearbtn').click(function(){
		$('#mysearch').form('clear');
		$('#t_user').datagrid('load' ,{});
	});


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
