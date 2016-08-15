<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'User.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="css/common.css" />
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
		<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>

		<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>


		<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css" />
		<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />
	<script type="text/javascript" src="js/commons.js"></script>
<script type="text/javascript">
			$(function(){

					/**
					 * 	对于form表单的验证 
					 */
					//数值验证组件 
					$('#age').numberbox({
						min:0 , 
						max:150 ,
						required:true , 
						missingMessage:'年龄必填!' ,
						precision:0
					});
					
					//日期组件
					$('#birthday').datebox({
						required:true , 
						missingMessage:'生日必填!' ,
						editable:false
					});
					
					$('#salary').numberbox({
						min:1000 , 
						max:20000 ,
						required:true , 
						missingMessage:'薪水必填!' ,
						precision:2
					});
					
					//日期时间组件
					$('#startTime,#endTime').datetimebox({
						required:true , 
						missingMessage:'时间必填!' ,
						editable:false
					});
				
					
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
									field:'UAge' ,
									title:'年龄' ,
									width:100 ,
									sortable : true
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

	</script>
  </head>
  
  <body>
			<div id="lay" class="easyui-layout" style="width: 100%;height:100%" >
				<div region="north" title="用户查询" collapsed=true style="height:100px;" >
					<form id="mysearch" method="post">
							用户名:&nbsp;&nbsp;&nbsp;<input type="text" name="searchname" id="searchname"  />
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							用户编号:&nbsp;&nbsp;&nbsp;<input type="text" name="searchid" id="searchid" />
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<a id="searchbtn" class="easyui-linkbutton">查询</a> <a id="clearbtn" class="easyui-linkbutton">清空</a>
					</form>
				
				</div>
				<div region="center" >
					<table id="t_user"></table>
				</div>
			</div>
  			
 			<div id="mydialog" title="新增用户" modal=true  draggable=false class="easyui-dialog" closed=true style="width:300px;">
	    		<form id="myform" action="" method="post">
	    				<input type="hidden" name="u.UId" value="" />
	    				<table>
	    					<tr>
	    						<td>用户名:</td>
	    						<td><input type="text" name="u.UName" class="easyui-validatebox" required=true validType="midLength[2,5]" missingMessage="用户名必填!" invalidMessage="用户名必须在2到5个字符之间!"  value="" /></td>
	    					</tr>
	    					<tr>
	    						<td>密码:</td>
	    						<td><input type="password" name="u.UPassword" class="easyui-validatebox" required=true validType="equalLength[4]" missingMessage="密码必填!" value="" /></td>
	    					</tr>
	    					<tr>
	    						<td>性别:</td>
	    						<td>
	    							男<input type="radio" checked="checked" name="u.USex" value="1" />
	    							女<input type="radio" name="u.USex" value="2" />
	    						</td>
	    					</tr>
	    					<tr>
	    						<td>年龄:</td>
	    						<td><input id="u.UAge" type="text"  name="u.UAge" value="" /></td>
	    					</tr>
	 
	    					<tr>
	    						<td>电话:</td>
	    						<td><input id="u.UTel" type="text" name="u.UTel" value="" /></td>
	    					</tr>
	    					   
	    					<tr>
	    						<td>邮箱:</td>
	    						<td><input type="text" name="u.UEmail" class="easyui-validatebox" required=true validType="midLength[5,50]" missingMessage="个人描述必填!" invalidMessage="描述必须在5到50个字符之间!"  value="" /></td>
	    					</tr> 
	    					<tr>
	    						<td>角色:</td>
					<td><input type="radio" value="1" name="rid" id="superAdmin"
						checked="checked"><label for="superAdmin">系统管理员</label> <input
						type="radio" value="2" name="rid" id="comAdmin"
						style="margin-left: 30px;"><label for="comAdmin">值班班长</label>
						<input type="radio" value="3" name="rid" id="purchaser"
						style="margin-left: 30px;"><label for="purchaser">值班人员</label>
					</td>
				</tr>
	    					<tr align="center">
	    						<td colspan="2">
	    							<a id="btn1" class="easyui-linkbutton">确定</a>
	    							<a id="btn2" class="easyui-linkbutton">关闭</a>
	    						</td>
	    					</tr>   					 					    					    					    					    					    					    					    					
	    				</table>
	    		</form> 			
 			</div>
  </body>
</html>