<%--
  Created by IntelliJ IDEA.
  User: jh
  Date: 2017/6/14
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的测试登录页面</title>
</head>
<body>
<form align="center" method="GET" action="/aiyayo/myservletc">
    <div>
        <input type="text" id="username" name="username" size="20">
        <label for="username">用户名：</label>
    </div>
    <div>
        <input type="password" id="pwd" name="pwd" size="20">
        <label for="pwd">口令：</label>
    </div>
    <input type="submit" name="submit"  id="submit" value="登录">
<label for="submit"></label>
</form>
</body>
</html>
