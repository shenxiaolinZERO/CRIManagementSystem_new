<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">


<title>添加设备</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"	href="easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />


</head>

<body>
	<div>
		<form class="form-horizontal" role="form">
		<div >
			<div style="float: left;width:30%">
				<div class="easyui-panel" title="选择父对象"
					style="height: 550px; margin: 0; padding: 0;">
					<ul class="easyui-tree" id="treechose"
						data-options="url:'',animate:true,checkbox:false"></ul>
				</div>
			</div>
			<div style="float: left; margin-left: 20px;width:68%;">
				<div class="easyui-panel" title="设备信息"
					style="height: 550px; margin: 0; padding: 0; ">

					<legend class="title">请输入设备信息</legend>
					<div class="form-group">
						<label for="devId" class="col-sm-2 control-label">设备编号：</label>
						<div class="col-sm-2">
							<input type="text" class="" id="devId" name="devId"
								placeholder="请输入设备编号">
						</div>
					</div>
					<div class="form-group">
						<label for="devName" class="col-sm-2 control-label">设备名称：</label>
						<div class="col-sm-2">
							<input type="text" class="" id="devName" name="devName"
								placeholder="请输入设备名称">
						</div>
					</div>
					<div class="form-group">
						<label for="crId" class="col-sm-2 control-label">机房编号：</label>
						<div class="col-sm-2">
							<input type="text" class="" id="crId" name="crId"
								placeholder="请输入机房编号">
						</div>
					</div>
					<div class="form-group">
						<label for="devBusinesssys" class="col-sm-2 control-label">所属业务系统：</label>
						<div class="col-sm-2">
							<input type="text" class="" id="devBusinesssys"
								name="devBusinesssys" placeholder="请输入所属业务系统">
						</div>
					</div>

					<div class="form-group">
						<label for="devCabbegin" class="col-sm-2 control-label">机柜起始U：</label>
						<div class="col-sm-2">
							<input type="text" class="" id="devCabbegin" name="devCabbegin"
								placeholder="请输入机柜起始U">
						</div>
					</div>
					<div class="form-group">
						<label for="devCaboccupy" class="col-sm-2 control-label">所占U数：</label>
						<div class="col-sm-2">
							<input type="text" class="" id="devCaboccupy" name="devCaboccupy"
								placeholder="请输入所占U数">
						</div>
					</div>
					<div class="form-group">
						<label for="devBrandname" class="col-sm-2 control-label">品牌：</label>
						<div class="col-sm-2">
							<input type="text" class="" id="devBrandname" name="devBrandname"
								placeholder="请输入品牌">
						</div>
					</div>
					<div class="form-group">
						<label for="devModelnum" class="col-sm-2 control-label">型号：</label>
						<div class="col-sm-2">
							<input type="text" class="" id="devModelnum" name="devModelnum"
								placeholder="请输入型号">
						</div>
					</div>
					<div class="form-group">
						<label for="devProductnum" class="col-sm-2 control-label">产品号：</label>
						<div class="col-sm-2">
							<input type="text" class="" id="devProductnum"
								name="devProductnum" placeholder="请输入产品号">
						</div>
					</div>
					<div class="form-group">
						<label for="devSerbegintime" class="col-sm-2 control-label">服务开始时间：</label>
						<div class="col-sm-2">
							<input type="text" class="easyui-datebox" id="devSerbegintime"
								name="devSerbegintime">
						</div>
					</div>

					<div class="form-group">
						<label for="devSerendtime" class="col-sm-2 control-label">服务结束时间：</label>
						<div class="col-sm-2">
							<input type="text" class="easyui-datebox" id="devSerendtime"
								name="devSerendtime">
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">状态：</label>
						<div class="col-sm-4">
							<input type="radio" value="male" id="devStatus1" name="devStatus"
								checked="checked"><label for="devStatus1">正常</label> <input
								type="radio" value="female" id="devStatus2" name="devStatus"
								style="margin-left: 30px;"><label for="devStatus2">异常</label>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">是否有效：</label>
						<div class="col-sm-2">
							<input type="radio" value="male" id="devIsvaild1"
								name="devIsvaild" checked="checked"><label
								for="devIsvaild1">是</label> <input type="radio" value="female"
								id="devIsvaild2" name="devIsvaild" style="margin-left: 30px;"><label
								for="devIsvaild2">否</label>
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn">保存信息</button>
							<button type="submit" class="btn btn">取消</button>

						</div>
					</div>
				</div>
			</div>
		</div>
		</form>
	</div>
	<script type="text/javascript" src="js/refjs/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
</body>
</html>
