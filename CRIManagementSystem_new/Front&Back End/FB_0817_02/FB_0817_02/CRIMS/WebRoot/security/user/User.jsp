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
<script type="text/javascript" src="js/refjs/commons.js"></script>
<script type="text/javascript" src="js/selfjs/easyUser.js"></script>
</head>

<body>
	<div id="lay" class="easyui-layout" style="width: 100%;height:100%">
		<div region="north" title="用户查询" collapsed=true style="height:100px;">
			<form id="mysearch" method="post">
				用户名:&nbsp;&nbsp;&nbsp;<input type="text" name="searchname"
					id="searchname" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				用户编号:&nbsp;&nbsp;&nbsp;<input type="text" name="searchid"
					id="searchid" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a
					id="searchbtn" class="easyui-linkbutton">查询</a> <a id="clearbtn"
					class="easyui-linkbutton">清空</a>
			</form>
		</div>
		<div region="center">
			<table id="t_user"></table>
		</div>
	</div>

	<div id="mydialog" title="新增用户" modal=true draggable=false
		class="easyui-dialog" closed=true style="width:400px;">
		<form id="myform" action="" method="post">
			<input type="hidden" name="u.UId" value="" />
			<table>
				<tr>
					<td>用户名:</td>
					<td><input type="text" name="u.UName"
						class="easyui-validatebox" required=true
						validType="midLength[2,7]" missingMessage="请输入用户名"
						invalidMessage="用户名必须在2到7个字符之间!" value="" /></td>
				</tr>
				<tr>
					<td>密码:</td>
					<td><input type="password" name="u.UPassword"
						class="easyui-validatebox" required=true
						validType="midLength[6,18]" missingMessage="请输入密码"
						invalidMessage="密码必须在6到18个字符之间!" value="" /></td>
				</tr>
				<tr>
					<td>性别:</td>
					<td>男<input type="radio" checked="checked" name="u.USex"
						value="1" /> 女<input type="radio" name="u.USex" value="2" />
					</td>
				</tr>
				<tr>
					<td>年龄:</td>
					<td><input id="u.UAge" type="text" name="u.UAge"
						class="easyui-validatebox" required=true
						validType="midLength[1,3]" missingMessage="请输入年龄"
						invalidMessage="年龄必须在1到13个字符之间!" value="" /></td>
				</tr>

				<tr>
					<td>电话:</td>
					<td><input id="u.UTel" type="text" name="u.UTel"
						class="easyui-validatebox" required=true validType="phoneRex"
						missingMessage="请输入电话号码" invalidMessage="请输入正确的电话号码!" value="" />
					</td>
				</tr>
				<tr>
					<td>所属城市:</td>
					<td><input name="u.AId" class="easyui-combobox"
						url="getAreaUserAction" valueField="AId" textField="AName"
						value="" /></td>
				</tr>
				<tr>
					<td>地址:</td>
					<td><input type="text" name="u.UAddress"
						class="easyui-validatebox" required=true missingMessage="请输入地址!"
						value="" /></td>
				</tr>

				<tr>
					<td>邮箱:</td>
					<td><input type="text" name="u.UEmail"
						class="easyui-validatebox" required=true validType="email"
						missingMessage="请输入邮箱!" invalidMessage="请输入正确的邮箱!" value="" /></td>
				</tr>
				<tr>
					<td>角色:</td>
					<td><input type="radio" value="1" name="rid" id="superAdmin"
						checked="checked"><label for="superAdmin">系统管理员</label> <input
						type="radio" value="2" name="rid" id="comAdmin"
						style="margin-left: 30px;"><label for="comAdmin">值班班长</label>
						<input type="radio" value="3" name="rid" id="purchaser"
						style="margin-left: 30px;"><label for="purchaser">巡检人员</label>
					</td>
				</tr>
				<tr align="center">
					<td colspan="2"><a id="btn1" class="easyui-linkbutton">确定</a>
						<a id="btn2" class="easyui-linkbutton">关闭</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>