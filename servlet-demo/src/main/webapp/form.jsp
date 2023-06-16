<%--
  Created by IntelliJ IDEA.
  User: yuanqixu
  Date: 2021/9/29
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="http://localhost:8080/ServletRequestServlet" method="get">
        用户名：<input type="text" name="username" value="${cookie.username.value}"> <br>
        密码：<input type="password" name="password"> <br>
        兴趣爱好：<input type="checkbox" name="hobby" value="cpp">C++
        <input type="checkbox" name="hobby" value="JAVA">JAVA
        <input type="checkbox" name="hobby" value="JS">JS <br>
        <input type="submit" value="登录">
    </form>
</body>
</html>
