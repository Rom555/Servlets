<%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 25.02.2020
  Time: 18:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    <p>Hello, ${u_login}</p>
    <p>Your password: ${cookie.get("u_password").value}</p>
    <form action="login" method="post">
        <input type="submit" value="Exit">
    </form>
</body>
</html>
