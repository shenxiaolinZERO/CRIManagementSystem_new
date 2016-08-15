<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>查找用户</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="js/selfjs/user_find.js"></script>
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />

</head>

<body>
	<div class="easyui-panel" title="查询用户" style="width: 1250px; height: 420px; margin: 0; padding: 0;">
			<div style="margin:10px 0;"></div>
			<div id="easyui_toolbar" region="north" border="false" style="border-bottom: 1px solid #ddd; height: 50px; margin-top:0;  padding: 10px; background: #fafafa;">
				<div id="dev_id" style="float: left;">

					用户编号：
					<input type="text" name="dev_id" />
				</div>
				<div id="dev_name" style="float: left;">

					用户姓名：
					<input type="text" name="dev_name" />
				</div>
				<div id="dev_name" style="float: left;">

					<a href="#" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="javascript:alert('search')" style="float: right;">查找</a>
				</div>
			</div>

			<table id="dg" class="easyui-datagrid" title="用户详情" style="width:1250px;height:250px" data-options="rownumbers:true,singleSelect:true,pagination:true,url:'pageUserUserAction'">
				<thead>
					<tr>
						<th data-options="field:'UId',width:80">用户编号</th>
						<th data-options="field:'UName',width:100">用户姓名</th>
						<th data-options="field:'UPassword',width:80">用户密码</th>
						<th data-options="field:'UAge',width:80">用户年龄</th>
						<th data-options="field:'USex',width:80">性别</th>
						<th data-options="field:'UCreatetime',width:160">创建时间</th>
						<th data-options="field:'UTel',width:120">电话</th>
						<th data-options="field:'UEmail',width:150">邮箱</th>
					</tr>
				</thead>
			</table>
		</div>
		<script type="text/javascript">
			$(function() {
				var pager = $('#dg').datagrid('getPager'); // get the pager of datagrid
				pager.pagination({
					buttons: [
						//			{
						//						iconCls: 'icon-search',
						//						handler: function() {
						//							alert('search');
						//						}
						//					}, 
						{
							iconCls: 'icon-cut',
							handler: function() {
								alert('确定删除？');
							}
						}, {
							iconCls: 'icon-edit',
							handler: function() {
								alert('edit');
							}
						}
					]
				});
			});
		</script>
	</body>
</html>

