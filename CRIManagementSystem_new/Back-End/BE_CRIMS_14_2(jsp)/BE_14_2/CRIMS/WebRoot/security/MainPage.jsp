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

<title>主界面</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link href="css/public.css" type="text/css" rel="stylesheet">
<link href="css/totalStyle.css" type="text/css" rel="stylesheet">
<link href="css/smartMenu.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="js/jquery.js"></script>
<title>机房巡检管理系统-系统管理员</title>
<script type="text/javascript">
	function a() {
		var name = 0;
		if (name == 1) {
			$("#Check").css("display", "none");
		} else if (name == 2) {
			$("#User").css("display", "none");
			$("#ComputerRoom").css("display", "none");
		}
		startTime();
	}
</script>
</head>

<body>
<body onload="a()">
	<div id="admin">
		<!-- 左侧菜单部分-->
		<div class="ad-menu" id="ad-menu">
			<div class="ad-logo">
				<img src="image/top_logo.png" height="63" width="68"> <br />
				<div>
					<label style="color: white;font-size: 1.0em;"> 机房巡检管理系统 <br />
						Computer Room Inspection Manage System </label>
				</div>
			</div>

			<div class="ad-list">
				<ul>
					<!-- 首页 -->
					<li>
						<div class="li-item" id="MainPage">
							<em class="scm li-ico ic1"></em> 首页 <span class="scm arrow"></span>
						</div>
						<dl>
							<dd>
								<a href="/CRIMS/security/MainPage.jsp" class="dd-item"> 首页 <span
									class="scm dd-ar"></span> </a>
								<ul class="ad-item-list">
									<li class="J_menuItem" href="#" data-index="1">首页</li>
								</ul>
							</dd>
						</dl></li>

					<!-- 用户管理 -->
					<li>
						<div class="li-item" id="User">
							<em class="scm li-ico ic2"></em> 用户管理 <span class="scm arrow"></span>
						</div>

						<dl>
							<dd>
								<a href="/CRIMS/security/user/user_add.jsp" class="dd-item"
									target="main-iframe"> 添加用户 <span class="scm dd-ar"></span>
								</a>
								<ul class="ad-item-list"></ul>
							</dd>
							<dd>
								<a href="/CRIMS/security/user/user_find.jsp" class="dd-item"
									target="main-iframe"> 查询用户 <span class="scm dd-ar"></span>
								</a>
								<ul class="ad-item-list"></ul>
							</dd>
						</dl></li>

					<!-- 机房管理 -->
					<li>
						<div class="li-item" id="ComputerRoom">
							<em class="scm li-ico ic3"></em> 机房管理 <span class="scm arrow"></span>
						</div>

						<dl>
							<dd>
								<a href="/CRIMS/security/compRoom/computerRoom_add.jsp"
									class="dd-item" target="main-iframe"> 添加机房 <span
									class="scm dd-ar"></span> </a>
								<ul class="ad-item-list"></ul>
							</dd>
							<dd>
								<a href="/CRIMS/security/compRoom/computerRoom_find.jsp"
									class="dd-item" target="main-iframe"> 查询机房信息 <span
									class="scm dd-ar"></span> </a>
								<ul class="ad-item-list"></ul>
							</dd>
						</dl></li>

					<!-- 设备管理 -->
					<li>
						<div class="li-item" id="Device">
							<em class="scm li-ico ic4"></em> 设备管理 <span class="scm arrow"></span>
						</div>

						<dl>
							<dd>
								<a href="/CRIMS/security/device/device_add.jsp" class="dd-item"
									target="main-iframe"> 添加设备 <span class="scm dd-ar"></span>
								</a>
								<ul class="ad-item-list"></ul>
							</dd>
							<dd>
								<a href="/CRIMS/security/device/device_find.jsp" class="dd-item"
									target="main-iframe"> 查询设备信息 <span class="scm dd-ar"></span>
								</a>
								<ul class="ad-item-list"></ul>
							</dd>
						</dl></li>

					<!-- 任务管理 -->
					<li>
						<div class="li-item" id="Work">
							<em class="scm li-ico ic5"></em> 任务管理 <span class="scm arrow"></span>
						</div>

						<dl>
							<dd>
								<a href="/CRIMS/security/task/task_add.jsp" class="dd-item"
									target="main-iframe"> 发布任务 <span class="scm dd-ar"></span>
								</a>
								<ul class="ad-item-list"></ul>
							</dd>

							<dd>
								<a href="/CRIMS/security/task/task_undo.jsp" class="dd-item"
									target="main-iframe"> 查看未完成任务 <span class="scm dd-ar"></span>
								</a>
								<ul class="ad-item-list"></ul>
							</dd>

							<dd>
								<a href="/CRIMS/security/task/task_history.jsp" class="dd-item"
									target="main-iframe"> 查询历史任务 <span class="scm dd-ar"></span>
								</a>
								<ul class="ad-item-list"></ul>
							</dd>
						</dl></li>

					<!-- 巡检管理 -->
					<li>
						<div class="li-item" id="Check">
							<em class="scm li-ico ic6"></em> 异常报告 <span class="scm arrow"></span>
						</div>

						<dl>
							<dd>
								<a href="/CRIMS/security/exception/exception.jsp"
									class="dd-item" target="main-iframe"> 异常报告 <span
									class="scm dd-ar"></span> </a>
								<ul class="ad-item-list"></ul>
							</dd>
						</dl></li>

				</ul>
			</div>
		</div>

		<!-- 右侧内容部分-->
		<div class="ad-comment-box" id="ad-comment">
			<div class="ad-top-comment">
				<div class="ad-message">
					<!-- 右侧左上角的搜索-->
					<div class="ad-top-left">
						<div class="ad-change-btn">
							<a id="ad-list" href="javascript:;" class="scm ad-list-btn"></a>
						</div>
						<div class="ad-search-box clear">
							<div class="ad-search-sel">
								<select>
									<option>办公室</option>
									<option>财务部</option>
									<option>人资部</option>
									<option>文秘部</option>
									<option>外联部</option>
								</select>
							</div>
							<div class="ad-search-cha">
								<input type="text" class="ad-search-input"
									placeholder="请输入你要查找的内容"> <input type="submit"
									class="scm ad-search-btn" value="">
							</div>
						</div>
					</div>
					<!-- 右侧右上角的通知及当前用户及时间-->
					<div class="ad-top-right">
						<div class="ad-notice"></div>
						<div class="ad-welcom">
							<div class="ad-wel-img">
								<img src="image/top_logo.png" height="36px" width="36">
							</div>
							<div class="ad-wel-text">
								<div class="font-wel">
									欢迎您！ <strong>沈小0</strong>
									<p>${role.RPost}</p>
									<a href="javascript:;"> <strong>【退出】</strong> </a>
								</div>
								<div id="setDateTime"></div>
								<script>
									function startTime() {
										var today = new Date();
										var y = today.getFullYear();
										var mon = today.getMonth();
										var d = today.getDay();
										var h = today.getHours();
										var m = today.getMinutes();

										var s = today.getSeconds();
										m = checkTime(m);
										s = checkTime(s);

										document.getElementById("setDateTime").innerHTML = "现在时间："
												+ h + ":" + m + ":" + s;

										t = setTimeout(function() {
											startTime();
										}, 1000);
										//document.write(today);
									};

									function checkTime(i) {
										if (i < 10) {
											i = "0" + i;
										}
										return i;
									};
								</script>
							</div>
						</div>
					</div>
				</div>
				<div class="ad-main-nav-box">
					<ul id="breadcrumbs-three">
						<li title="首页"><a href="javascript:;" class="dot">首页</a></li>
					</ul>
					<a href="javascript:;" class="scm jian-a J_mainLeft main-sel pre"></a>
					<div class="ad-main-wraper .J_menuItems">
						<ul class="ad-main-list" id="ad-main"></ul>
					</div>
					<a href="javascript:;" class="scm jian-a J_mainRight next"></a>
				</div>
				<div class="ad-sub-nav-box content-tabs">
					<!-- <div class="ad-sub-record">历史记录</div>
                -->
					<a href="javascript:;"
						class="scm jian-a sub-sel pre j_tabBg J_tabLeft"></a>
					<div class="ad-sub-wraper page-tabs J_menuTabs">
						<!--<ul class="ad-sub-list page-tabs-content">
                    -->
						<!--<li class="active J_menuTab" data-id="index_v0.html">首页</li>
                -->
						<!--</ul>-->
					</div>
					<a href="javascript:;" class="scm jian-a next j_tabBg J_tabRight"></a>
				</div>
			</div>

			<div class="ad-main-comment J_mainContent" id="ad-iframe">
				<iframe name="main-iframe" width="100%" height="100%" src=" "
					frameborder="0"></iframe>
			</div>

		</div>
	</div>

	<script type="text/javascript" src="js/refjs/jquery.min.js"></script>
	<script type="text/javascript" src="js/refjs/contabs.js"></script>
	<script type="text/javascript" src="js/refjs/maintabs.js"></script>
	<script type="text/javascript" src="js/refjs/jquery-smartMenu-min.js"></script>
	<script type="text/javascript" src="js/refjs/jquery.nicescroll.min.js"></script>
	<script type="text/javascript" src="js/refjs/setDateTime.js"></script>
	<script type="text/javascript">
		$(function() {
			$(".ad-menu").niceScroll({
				cursorborder : "0 none",
				cursorcolor : "#1a1a19",
				cursoropacitymin : "0",
				boxzoom : false
			});
		});
	</script>
</body>
</html>