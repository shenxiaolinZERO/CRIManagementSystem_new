<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'computerRoom_find.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="js/selfjs/comroom_find.js"></script>
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />


</head>

<body>
	<div class="easyui-panel" title="查询机房" icon="icon-save"
		style="width: 1250px; height: 420px; margin: 0; padding: 0;">
		<!-- collapsible="true" minimizable="true" maximizable=true closable="true"-->

		<div class="easyui-layout" fit="true">
			<div id="easyui_toolbar" region="north" border="false"
				style="border-bottom: 1px solid #ddd; height: 50px; margin-top:0;  padding: 10px; background: #fafafa;">

				<div id="dev_id" style="float: left;">

					机房编号： <input type="text" name="dev_id" />
				</div>
				<div id="dev_name" style="float: left;">

					机房名称： <input type="text" name="dev_name" />
				</div>


				<div id="searchbtn" style="float: right; padding-right: 10px;">
					<input type="button" name="searchbtn" class="btn" value="查询"
						onclick="onSearch()" />
					<!--<input type="button" value="修改" class="btn" />
							<input type="button" value="删除" class="btn" />-->
				</div>

			</div>
			<div region="center" border="false">
				<table id="table">
				</table>
			</div>

		</div>

	</div>
	<input type="button" value="修改" class="btn" />
	<input type="button" value="删除" class="btn" />
</body>
</html>
