<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>异常界面</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css"
	href="easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />

</head>

<body>
	<table id="dg" class="easyui-datagrid" title="异常列表"
		style="width:1100px;height:250px"
		data-options="rownumbers:true,singleSelect:true,pagination:true,url:''">
		<thead>
			<tr>
				<th data-options="field:'excId',width:100">异常报告编号</th>
				<th data-options="field:'devId',width:100">异常设备编号</th>
				<th data-options="field:'UId',width:110">报告异常人员编号</th>
				<th data-options="field:'excDetail',width:100">异常报告详情</th>
				<th data-options="field:'excPic',width:100">异常报告照片</th>
				<th data-options="field:'excDate',width:150">异常报告时间</th>

			</tr>
		</thead>
	</table>
</body>
</html>
