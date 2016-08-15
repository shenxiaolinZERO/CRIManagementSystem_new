<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">

    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<title>登录界面</title>
	<!-- Custom Theme files -->
	<link href="css/loginstyle.css" rel="stylesheet" type="text/css" media="all"/>
	<!-- Custom Theme files -->
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
	<!--Google Fonts-->
	<link href='http://fonts.useso.com/css?family=Roboto:500,900italic,900,400italic,100,700italic,300,700,500italic,100italic,300italic,400' rel='stylesheet' type='text/css'>
	<link href='http://fonts.useso.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
	<!--Google Fonts-->
		<script>
			
		</script>
  </head>
  
  <body>
<div class="login">
	<h2>机房巡检管理系统</h2>
	<div class="login-top">
		<h1>请登录</h1>
		<form id="loginform" action="loginUserAction">

			<input type="text" id="idnumber" name="u.UName" class="idmsg" placeholder="请输入用户名">
			<input type="password" id="password" name="u.UPassword" class="pwdmsg"  placeholder="请输入密码">
			<br/>
			<br/>
			
			<br/>
			<br/>
			 <div class="forgot">
	    	<a href="#">忘记密码</a>
	    	<input type="submit" value="登录" >
	    </div>
	    </form>
	   
	</div>
	<div class="login-bottom">
		<h3>please &nbsp;<a href="#">Login-In</a>&nbsp </h3>
	</div>
</div>	
<div class="copyright">
	<p>Copyright &copy; 2016.机房巡检管理系统 All rights reserved.</p>
</div>

   <script src="js/jquery-2.1.4.min.js" type="text/javascript"></script>
   <script src="js/Encapsulated-Data/login.js" type="text/javascript"></script>

</body>
</html>
