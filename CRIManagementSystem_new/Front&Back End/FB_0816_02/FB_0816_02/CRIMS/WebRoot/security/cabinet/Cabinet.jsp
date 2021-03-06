<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'cabinet.jsp' starting page</title>

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


<link rel="stylesheet" type="text/css"
	href="easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />
<script type="text/javascript" src="js/refjs/commons.js"></script>
<script type="text/javascript" src="js/selfjs/easyCabinet.js"></script>

</head>

<body>
	<div id="lay" class="easyui-layout" style="width: 100%;height:100%">
		<div region="north" title="机柜查询" collapsed=true style="height:100px;">
			<form id="mysearch" method="post">
				机柜编号：&nbsp;&nbsp;&nbsp;<input type="text" name="searchCabId"
					id="searchCabId" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				所属机房：&nbsp;&nbsp;&nbsp;<input type="text" name="searchCrId"
					id="searchCrId" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a
					id="searchbtn" class="easyui-linkbutton">查询</a> <a id="clearbtn"
					class="easyui-linkbutton">清空</a>
			</form>

		</div>
		<div region="center">
			<table id="t_cabinet"></table>
		</div>
	</div>

	<div id="mydialog" title="新增机柜" modal=true draggable=false
		class="easyui-dialog" closed=true style="width:400px;">
		<form id="myform" action="" method="post">
			<div align="center">
				<input type="hidden" name="tc.cabId" value="" />
				<table>
					<tr>
						<td>机柜U数:</td>
						<td><input type="text" name="tc.cabUnum"
							class="easyui-validatebox" required=true missingMessage="请输入机柜U数"
							value="" /></td>
					</tr>
					<tr>
						<td>所属机房:</td>
						<td><input id="tc.crId" type="text" name="tc.crId"
							class="easyui-combobox" required=true
							url="getComputRoomcabintAction" valueField="crId"
							textField="crName" missingMessage="请输入所属机房" value="" /></td>
					</tr>
					<tr align="center">
						<td colspan="2"><a id="btn1" class="easyui-linkbutton">确定</a>
							<a id="btn2" class="easyui-linkbutton">关闭</a>
						</td>
					</tr>
				</table>
			</div>
		</form>
	</div>
</body>
</html>
