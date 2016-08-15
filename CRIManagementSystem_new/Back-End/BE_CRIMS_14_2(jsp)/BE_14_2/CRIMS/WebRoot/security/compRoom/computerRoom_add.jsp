<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'Computer_add.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

</head>

<body>
	<form class="form-horizontal" role="form">
		<legend class="title">请输入机房信息</legend>
		<div class="form-group">
			<label for="cr-id" class="col-sm-2 control-label">机房编号：</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="cr-id"
					placeholder="请输入机房编号">
			</div>
		</div>

		<div class="form-group">
			<label for="cr-name" class="col-sm-2 control-label">机房名称：</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="cr-name"
					placeholder="请输入机房名称">
			</div>
		</div>

		<div class="form-group">
			<label for="a_id" class="col-sm-2 control-label">机房区域：</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="a_id"
					placeholder="请输入机房区域">
			</div>
		</div>
		<div class="form-group">
			<label for="cr_addr" class="col-sm-2 control-label">收藏日期：</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="cr_addr"
					placeholder="请输入收藏日期">
			</div>
		</div>
		<div class="form-group">
			<label for="cr_ctname" class="col-sm-2 control-label">机房联系人：</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="cr_ctname"
					placeholder="请输入机房联系人">
			</div>
		</div>
		<div class="form-group">
			<label for="staff-phone" class="col-sm-2 control-label">联系人电话：</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="staff-phone"
					placeholder="请输入联系电话">
			</div>
		</div>
		<div class="form-group">
			<label for="staff-email" class="col-sm-2 control-label">联系人邮箱：</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="staff-email"
					placeholder="请输入Email">
			</div>
		</div>


		<div class="form-group">
			<label for="staff-note" class="col-sm-2 control-label">状态：</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="staff-note"
					placeholder="请输入备注">
			</div>
		</div>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-success">保存信息</button>
				<button type="submit" class="btn btn-warning">取消</button>
			</div>
		</div>
		</div>
	</form>

	<script type="text/javascript" src="js/refjs/jquery-2.1.4.min.js"></script>
</body>
</html>
