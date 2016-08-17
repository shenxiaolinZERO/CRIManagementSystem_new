<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>机房管理</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/common.css" />
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />
<script type="text/javascript" src="js/refjs/commons.js"></script>
<script type="text/javascript" src="js/selfjs/easyCompRoom.js"></script>
</head>

<body>
	<!-- 下拉机房查询  -->
	<div id="lay" class="easyui-layout" style="width: 100%;height:100%">
		<div region="north" title="机房查询" collapsed=true style="height:100px;">
			<form id="mysearch" method="post">
				机房名称:&nbsp;&nbsp;&nbsp;<input type="text" name="searchname"
					id="searchname" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				机房编号:&nbsp;&nbsp;&nbsp;<input type="text" name="searchid"
					id="searchid" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a
					id="searchbtn" class="easyui-linkbutton">查询</a> <a id="clearbtn"
					class="easyui-linkbutton">清空</a>
			</form>

		</div>
		<div region="center">
			<table id="t_computroom"></table>
		</div>
	</div>

	<!-- 弹出新增机房查询框 -->
	<div id="mydialog" title="新增机房" modal=true draggable=false
		class="easyui-dialog" closed=true style="width:300px;">
		<form id="myform" action="" method="post">
			<input type="hidden" id="crId" name="c.crId" value="" />
			<table>
				<tr>
					<td>机房名称:</td>
					<td><input type="text" name="c.crName" id="crName"
						class="easyui-validatebox" required=true
						validType="midLength[2,10]" missingMessage="机房名必填!"
						invalidMessage="机房名必须在2到10个字符之间!" value="" /></td>
				</tr>

				<tr>
					<td>所属区域：</td>
					<td><input type="text" id="crAId" name="c.AId"
						class="easyui-validatebox" missingMessage="区域必选!" value="" /></td>
				</tr>

				<tr>
					<td>机房地址：</td>
					<td><input type="text" id="crAddr" name="c.crAddr"
						class="easyui-validatebox" missingMessage="机房必选!" value="" /></td>
				</tr>

				<tr>
					<td>机房联系人</td>
					<td><input id="crCtname" type="text" name="c.crCtname"
						value="" /></td>
				</tr>

				<tr>
					<td>联系人电话:</td>
					<td><input id="crCttel" type="text" name="c.crCttel"
						value="" /></td>
				</tr>

				<tr>
					<td>联系人邮箱:</td>
					<td><input type="text" id="crCtemall" name="c.crCtemall"
						class="easyui-validatebox" required=true
						validType="midLength[1,50]"
						invalidMessage="联系人邮箱必须在5到50个字符之间!" value="" /></td>
				</tr>
				<tr>
					<td>是否有效</td>

					<td><input type="radio" value="1" id="crStatus1"
						name="c.crStatus" checked="checked"><label for="crStatus1">是</label>
						<input type="radio" value="0" id="crStatus2" name="c.crStatus"
						style="margin-left: 30px;"><label for="crStatus2">否</label>
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