<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>新增任务</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="js/selfjs/task_add.js"></script>
<link rel="stylesheet" type="text/css"	href="easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />
<link rel="stylesheet" type="text/css" href="css/task_add.css">

</head>

<body>
	<div>
		<form id="addtask">
			<div style="float: left;">
				<div class="easyui-panel" title="基本信息"
					style="width: 500px; height: 500px; float: left;" id="basemag">
					<br /> <label for="ps_time">巡检时间：</label><input type="text"
						id="ps_time" name="ps_time" class="easyui-datetimebox" /> <label
						for="pe_time">至</label><input type="text" id="pe_time"
						name="pe_time" class="easyui-datetimebox" /><br /> <br /> <label
						for="u_id">巡检人员:</label><input type="text" id="u_id" name="u_id" />
					<ul class="easyui-tree" id="treeuser">

					</ul>

				</div>
			</div>
			<div style="float: left;  margin-left: 15px;">
				<div class="easyui-panel" title="巡检设备"
					style="width: 500px; height: 500px;  padding-left:0;margin-left: 0;"
					id="checkroad">
					<!--<ul id="box"></ul>-->
					<br /> <input type="text" /><input type="button" value="搜索" />


					<ul class="easyui-tree" id="treetask">

					</ul>

				</div>
			</div>

		</form>
		<!--<div id="clear" style="clear: both;"></div>-->
	</div>

</body>
</html>
