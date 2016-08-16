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

<title>My JSP 'Computer_add.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

</head>

<body>
	 <form class="form-horizontal" role="form" action="addcomputRoomAction">
        <legend class="title">请输入机房信息</legend>

        <div class="form-group">
            <label for="crName" class="col-sm-2 control-label">机房名称：</label>
            <div class="col-sm-2">
                <input type="text" class="form-control" id="crName" name="c.crName"
                       placeholder="请输入机房名称">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">所属区域：</label>
            <div class="col-sm-2">
               <select style="width: 70px" id="AId">
                   <option value="0" name="c.AId">请选择</option>
                   <option value="11" name="c.AId">福州</option>
                   <option value="12" name="c.AId">厦门</option>
                   <option value="13" name="c.AId">漳州</option>
                   <option value="14" name="c.AId">宁德</option>
                   <option value="15" name="c.AId">三明</option>
                   <option value="16" name="c.AId">莆田</option>
                   <option value="17" name="c.AId">泉州</option>
                   <option value="18" name="c.AId">龙岩</option>
                   <option value="19" name="c.AId">南平</option>
               </select>
            </div>
        </div>
        <div class="form-group">
            <label for="crAddr" class="col-sm-2 control-label">机房地址：</label>
            <div class="col-sm-2">
                <input type="text" class="form-control" id="crAddr" name="c.crAddr"
                       placeholder="请输入机房地址">
            </div>
        </div>
        <div class="form-group">
            <label for="crCtname" class="col-sm-2 control-label">机房联系人：</label>
            <div class="col-sm-2">
                <input type="text" class="form-control" id="crCtname" name="c.crCtname"
                       placeholder="请输入机房联系人">
            </div>
        </div>
        <div class="form-group">
            <label for="crCttel" class="col-sm-2 control-label">联系人手机：</label>
            <div class="col-sm-2">
                <input type="text" class="form-control" id="crCttel" name="c.crCttel"
                       placeholder="请输入联系人手机">
            </div>
        </div>
        <div class="form-group">
            <label for="crCtemall" class="col-sm-2 control-label">联系人邮箱：</label>
            <div class="col-sm-2">
                <input type="text" class="form-control" id="crCtemall" name="c.crCtemall"
                       placeholder="请输入Email">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">是否有效：</label>
            <div class="col-sm-2">
                <input type="radio" value="male" id="crStatus1" name="crStatus" checked="checked" ><label for="crStatus1">是</label>
                <input type="radio" value="female" id="crStatus2" name="crStatus" style="margin-left: 30px;"><label for="crStatus2">否</label>
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
