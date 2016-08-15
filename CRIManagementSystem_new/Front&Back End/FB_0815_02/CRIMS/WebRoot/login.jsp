<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>登录界面</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="css/loginstyle.css" rel="stylesheet" type="text/css"
	media="all" />

</head>

<body>
	<div class="login">
		<h2>机房巡检管理系统</h2>
		<form name="form1" action="loginUserAction" method="post">
		<div class="login-top">
			<h1>请登录</h1>		
				<input type="text" id="idnumber" name="u.UName" class="idmsg"
					placeholder="请输入工号"> <input type="password" id="password"
					name="u.UPassword" class="pwdmsg" placeholder="请输入密码">
			<br /> <br />
			<div class="forgot">
				<a href="#">忘记密码</a> 
				<input type="submit" value="登录" style="width:70px;">		
			</div>
		</div>
		</form>
		<div class="login-bottom">
			<h3>
				please &nbsp;<a href="#">Login-In</a>&nbsp;
			</h3>
		</div>
	</div>
	<div class="copyright">
		<p>Copyright &copy; 2016.办公用品管理系统 All rights reserved.</p>
	</div>

	<script src="js/refjs/jquery-2.1.4.min.js" type="text/javascript"></script>
	<script src="js/selfjs/login.js" type="text/javascript"></script>
	<script src="js/refjs/jquery.validate.min.js" type="text/javascript"></script>
    <script src="js/refjs/messages_zh.js" type="text/javascript"></script>
	

</body>
</html>
