<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>查询设备</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="js/selfjs/device_find.js"></script>
	<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css" />
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />

</head>

<body>
	<div class="easyui-panel" title="查询管理" icon="icon-save"
		style="width: 1250px; height: 420px; margin: 0; padding: 0;">
		<!-- collapsible="true" minimizable="true" maximizable=true closable="true"-->

		<div class="easyui-layout" fit="true">
			<div id="easyui_toolbar" region="north" border="false"
				style="border-bottom: 1px solid #ddd; height: 50px; margin-top:0;  padding: 10px; background: #fafafa;">

				<div id="dev_id" style="float: left;">
					对象编号： <input type="text" name="dev_id" />
				</div>
				<div id="dev_id" style="float: left;">
					对象名称： <input type="text" name="dev_name" />
				</div>
				<div id="dev_id" style="float: left;">
					所属业务系统： <input type="text" name="dev_businesssys" />
				</div>

				<div style="float: left;">
					服务结束时间: <input name="dev_serendtime" class="easyui-datetimebox" />
					<!--lass="easyui-datebox" -->
				</div>

				<div class="datagrid-btn-separator"></div>

				<div id="dev_state" style="float: left;">
					状态： <select type="text" name="dev_state">
						<option>正常</option>
						<option>异常</option>
					</select>
				</div>

				<div id="dev_is valid" style="float: left;">
					是否有效： <select type="text" name="dev_is valid">
						<option>是</option>
						<option>否</option>
					</select>
				</div>

				<div id="searchbtn" style="float: right; padding-right: 10px;">
					<input type="button" name="searchbtn" class="btn" value="查询"
						onclick="onSearch()" />
					<!--<input type="button" value="修改" class="btn" />
					<input type="button" value="删除" class="btn" />
					-->
				</div>

			</div>
			<div region="center" border="false">
				<div id="tb">

					<a href="#" class="easyui-linkbutton" iconCls="icon-cut"
						plain="true" onclick="javascript:alert('确认删除？')"
						style="float: right;">删除</a> <input type="button" value="修改"
						class="btn" style="float: right;" />

				</div>
				<table id="table"></table>

			</div>

		</div>

	</div>
	<input type="button" value="修改" class="btn" />

</body>
</html>
