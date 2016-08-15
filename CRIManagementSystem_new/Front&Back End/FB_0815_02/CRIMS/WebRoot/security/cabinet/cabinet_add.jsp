<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>添加机柜</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />
</head>

<body>
	<form class="form-horizontal" role="form" action="addcabintAction">
		<legend class="title">请输入机柜信息</legend>
		<div class="form-group">
			<label for="cabUnum" class="col-sm-2 control-label">机柜U数：</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="cabUnum" name="tc.cabUnum"
					placeholder="请输入机柜U数">
			</div>
		</div>
		<div class="form-group">
			<label for="crId" class="col-sm-2 control-label">所属机房：</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="crId" name="tc.crId"
					placeholder="请输入所属机房">
			</div>
		</div>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-success">保存信息</button>
				<button type="submit" class="btn btn-warning">取消</button>
			</div>
		</div>
	</form>

	<script type="text/javascript" src="js/refjs/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>

</body>

</html>
