<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加用户</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
  </head>
  
  <body>
    <form class="form-horizontal" role="form">
        <legend class="title">请输入用户信息</legend>
        <div class="form-group">
        <label for="UId" class="col-sm-2 control-label" >用户编号：</label>
          <div class="col-sm-2">
            <input type="text" class="form-control" id="UId" name="UId"
                   placeholder="请输入用户编号">
          </div>
        </div>
        <div class="form-group">
            <label for="UPassword" class="col-sm-2 control-label">用户密码：</label>
            <div class="col-sm-2">
                <input type="text" class="form-control" id="UPassword" name="UPassword"
                       placeholder="请输入用户密码">
            </div>
        </div>
        <div class="form-group">
            <label for="UName" class="col-sm-2 control-label">用户姓名：</label>
            <div class="col-sm-2">
                <input type="text" class="form-control" id="UName" name="UName"
                       placeholder="请输入用户姓名">
            </div>
        </div>

        <div class="form-group">
            <label for="UAge" class="col-sm-2 control-label">用户年龄：</label>
            <div class="col-sm-2">
                <input type="text" class="form-control" id="UAge" name="UAge"
                       placeholder="请输入用户年龄">
            </div>
        </div>
        <div class="form-group">
            <label  class="col-sm-2 control-label">性别：</label>
            <div class="col-sm-2">
                <input type="radio" value="male" name="USex" checked="checked" >男
                <input type="radio" value="female" name="USex" style="margin-left: 30px;">女
            </div>
        </div>
        <div class="form-group">
            <label for="UCreatetime" class="col-sm-2 control-label" >创建时间：</label>
            <div class="col-sm-2">
                <input type="text" class="easyui-datebox " id="UCreatetime" name="UCreatetime"
                       readonly="readonly">

            </div>
        </div>

        <div class="form-group">
            <label for="UTel" class="col-sm-2 control-label">联系电话：</label>
            <div class="col-sm-2">
                <input type="text" class="form-control" id="UTel" name="UTel"
                       placeholder="请输入联系电话">
            </div>
        </div>
        <div class="form-group">
            <label for="UEmail" class="col-sm-2 control-label">Email：</label>
            <div class="col-sm-2">
                <input type="text" class="form-control" id="UEmail" name="UEmail"
                       placeholder="请输入Email">
            </div>
        </div>

        <div class="form-group">
            <label for="UAddress" class="col-sm-2 control-label">详细住址：</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="UAddress" name="UAddress"
                       placeholder="请输入详细住址">
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
