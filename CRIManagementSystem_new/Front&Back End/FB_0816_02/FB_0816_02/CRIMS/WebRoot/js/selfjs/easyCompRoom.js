
$(function(){			
	var flag ;		//undefined 判断新增和修改方法 
	/**
	 *	初始化数据表格  
	 */
	$('#t_computroom').datagrid({
		idField:'crId' ,		//只要创建数据表格 就必须要加 idField
		title:'机房列表' ,
		fit:true ,
		height:450 ,
		url:'pageComputRoomcomputRoomAction' ,
		fitColumns:true ,  
		striped: true ,					//隔行变色特性 
		loadMsg: '数据正在加载,请耐心的等待...' ,
		rownumbers:true ,
		rowStyler: function(index ,record){
			if(record.age > 25){
				return "background:red";
			}

		} ,
		//冻结列特性 ,不要与fitColumns 特性一起使用 
		frozenColumns:[[				
		                {
		                	field:'ck' ,
		                	width:50 ,
		                	checkbox: true
		                }
		                ]],
		                columns:[[
		                          {
		                        	  field:'crId' ,
		                        	  title:'机房编号' ,
		                        	  width:100 ,
		                        	  align:'center' ,

		                          },{
		                        	  field:'crName' ,
		                        	  title:'机房名称' ,
		                        	  width:100 
		                          },{
		                        	  field:'crAId' ,
		                        	  title:'所在区域' ,
		                        	  width:100 
		                          },{
		                        	  field:'crAddr' ,
		                        	  title:'机房地址',
		                        	  width:100 
		                          },{
		                        	  field:'crCtname' ,
		                        	  title:'机房管理员' ,
		                        	  width:100 ,
		                        	  sortable : true
		                          },{
		                        	  field:'crCttel' , 
		                        	  title:'联系方式' , 
		                        	  width:150
		                          },{
		                        	  field:'crCtemall' ,
		                        	  title:'邮箱' ,
		                        	  width:100 ,
		                          },{
		                        	  field:'crStatus' ,
		                        	  title:'状态' ,
		                        	  width:100
		                          }
		                          ]] ,
		                          pagination: true , 
		                          pageSize: 10 ,
		                          pageList:[5,10,15,20,50] ,
		                          toolbar:[
		                                   {
		                                	   text:'新增机房' ,
		                                	   iconCls:'icon-add' , 
		                                	   handler:function(){
		                                		   flag = 'add';
		                                		   $('#mydialog').dialog({
		                                			   title:'新增机房' 
		                                		   });
		                                		   $('#myform').get(0).reset();
		                                		   $('#mydialog').dialog('open');
		                                	   }

		                                   },{
		                                	   text:'修改机房' ,
		                                	   iconCls:'icon-edit' , 
		                                	   handler:function(){
		                                		   flag = 'edit';
		                                		   var arr =$('#t_computroom').datagrid('getSelections');
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
		                                				   'c.CrId':arr[0].crId ,
		                                				   'c.CrName':arr[0].crName,
		                                				   'c.AId':arr[0].AId ,
		                                				   'c.crAddr':arr[0].crAddr ,
		                                				   'c.CrCtname':arr[0].crCtname ,
		                                				   'c.CrCttel':arr[0].crCttel ,
		                                				   'c.CrCtemall':arr[0].crCtemall,
		                                				   'c.CrStatus':arr[0].crStatus
		                                			   });
		                                		   }
		                                		   $('#t_computroom').datagrid('clearSelections');

		                                	   }
		                                   },{
		                                	   text:'删除机房' ,
		                                	   iconCls:'icon-remove' , 
		                                	   handler:function(){
		                                		   var arr =$('#t_computroom').datagrid('getSelections');
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
		                                						   ids += arr[i].crId + ',' ;
		                                					   }
		                                					   ids = ids.substring(0 , ids.length-1);
		                                					   $.post('deletecomputRoomAction' , {ids:ids} , function(result){
		                                						   //1 刷新数据表格 
		                                						   $('#t_computroom').datagrid('reload');
		                                						   //2 清空idField   
		                                						   $('#t_computroom').datagrid('clearSelections');
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
		                                	   text:'查询机房' , 
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
				url: flag=='add'?'addcomputRoomAction':'editcomputRoomAction' ,
						cache:false ,
						data:$('#myform').serialize() ,
						dataType:'json' ,
						success:function(result){
							//1 关闭窗口
							$('#mydialog').dialog('close');
							//2刷新datagrid 
							$('#t_computroom').datagrid('reload');
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
		$('#t_computroom').datagrid('load' ,serializeForm($('#mysearch')));
	});


	$('#clearbtn').click(function(){
		$('#mysearch').form('clear');
		$('#t_computroom').datagrid('load' ,{});
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