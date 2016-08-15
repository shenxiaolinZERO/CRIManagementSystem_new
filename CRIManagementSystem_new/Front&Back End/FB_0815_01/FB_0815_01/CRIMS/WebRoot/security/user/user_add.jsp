<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>添加用户</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>

<body>
	<form class="form-horizontal" role="form" action="addUserAction">
		<legend class="title">请输入用户信息</legend>
		
		<div class="form-group">
			<label for="user-name" class="col-sm-2 control-label">用户姓名：</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="user-name"
					placeholder="请输入用户姓名" name="u.UName">
			</div>
		</div>
		
		<div class="form-group">
			<label for="user-pass" class="col-sm-2 control-label">用户密码：</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="user-pass"
					placeholder="请输入用户密码" name="u.UPassword">
			</div>
		</div>

		<div class="form-group">
			<label for="user-age" class="col-sm-2 control-label">用户年龄：</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="user-age"
					placeholder="请输入用户年龄" name="u.UAge">
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label">性别：</label>
			<div class="col-sm-2">
				<input type="radio" value="male" name="u.USex" checked="checked">男
				<input type="radio" value="female" name="u.USex"
					style="margin-left: 30px;">女
			</div>
		</div>
		
		<div class="form-group">
			<label for="staff-phone" class="col-sm-2 control-label">联系电话：</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="staff-phone"
					placeholder="请输入联系电话" name="u.UTel">
			</div>
		</div>
		
		<div class="form-group">
			<label for="staff-email" class="col-sm-2 control-label">Email：</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="staff-email"
					placeholder="请输入Email" name="u.UEmall">
			</div>
		</div>
		
		<div class="form-group">
			<label for="staff-address" class="col-sm-2 control-label">详细住址：</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="staff-address"
					placeholder="请输入详细住址" name="u.UAddress">
			</div>
		</div>

		<div class="form-group">
			<label for="staff-note" class="col-sm-2 control-label">备注：</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="staff-note"
					placeholder="请输入备注">
			</div>
		</div>
		
		<div style="margin-left:100px;">
			<input type="radio" value="1" name="rid" id="superAdmin" checked="checked">
			<label for="superAdmin">系统管理员</label> 
			<input type="radio" value="2" name="rid" id="comAdmin" style="margin-left: 30px;">
			<label for="comAdmin">值班班长</label>
			<input type="radio" value="3" name="rid" id="purchaser"	style="margin-left: 30px;">
			<label for="purchaser">值班人员</label>
		</div>
		

		
		<div class="form-group" style="margin:20px;" >
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-success">保存信息</button>
				<button type="submit" class="btn btn-warning">取消</button>
			</div>
		</div>

	</form>

	<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>

</body>
</html>
