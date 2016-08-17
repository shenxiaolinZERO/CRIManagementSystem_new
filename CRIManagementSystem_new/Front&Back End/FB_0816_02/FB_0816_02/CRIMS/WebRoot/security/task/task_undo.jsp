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

<title>未完成任务</title>

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
<script>
	function search() {
		var psTime = $('#psTime').val();
		var UName = $('#UName').val();
		$.ajax({
			type : "POST",
			url : "", //action
			data : {
				".psTime" : psTime,
				".UName" : UName
			},

			//data: {"student.name":name,"student.pass":pass},
			success : function(msg) {
				alert("返回消息: " + msg);
				//					$('#tg').datagrid()
				//				if (msg == "ok") {
				//					
				//				} else {
				//					//alert("用户名或者密码不正确！");
				//					$('#msg').html("错误提示:用户名或者密码不正确！");
				//				}
			},
			error : function(request, response, msg) {
				//alert("错误信息:" + msg);
				$("#msg").html("错误提示:服务器内部错误!");

			}
		});
	}
</script>

</head>

<body>
	<div class="easyui-panel" title="查询未完成任务"
		style="width: 1100px; height: 420px; margin: 0; padding: 0;">
		<div style="margin:10px 0;"></div>
		<div id="easyui_toolbar" region="north" border="false"
			style="border-bottom: 1px solid #ddd; height: 50px; margin-top:0;  padding: 10px; background: #fafafa;">
			<div id="psTime" style="float: left;">

				计划开始时间： <input class="easyui-datetimebox" type="text" name="psTime" />
			</div>

			<div id="UName" style="float: left;">

				巡检人员： <input type="text" name="UName" />
			</div>

			<a href="#" class="easyui-linkbutton" iconCls="icon-search"
				plain="true" onclick="javascript:alert('search')"
				style="float: left;">查找</a>
		</div>

		<table id="dg" class="easyui-datagrid" title="未完成任务列表"
			style="width:1100px;height:250px"
			data-options="rownumbers:true,singleSelect:true,pagination:true,url:''">
			<thead>
				<tr>
					<th data-options="field:'psTime',width:80">计划开始时间</th>
					<th data-options="field:'peTime',width:100">计划结束时间</th>
					<th data-options="field:'UName',width:80">巡检人员</th>
					<th data-options="field:'RPost',width:80">巡检岗位</th>
					<th data-options="field:'asTime',width:80">实际开始时间</th>
					<th data-options="field:'aeTime',width:160">实际结束时间</th>
					<!--<th data-options="field:'UTel',width:120">电话</th>
						<th data-options="field:'UEmail',width:150">邮箱</th>-->
				</tr>
			</thead>
		</table>
	</div>
	<script type="text/javascript">
			$(function() {
				var pager = $('#dg').datagrid('getPager'); // get the pager of datagrid
				pager.pagination({
					buttons: [
						//			{
						//						iconCls: 'icon-search',
						//						handler: function() {
						//							alert('search');
						//						}
						//					}, 
						{
							iconCls: 'icon-cut',
							handler: function() {
								alert('确定删除？');
							}
						}, {
							iconCls: 'icon-edit',
							handler: function() {
								alert('edit');
							}
						}
					]
				});
			})
		</script>
</body>

</html>