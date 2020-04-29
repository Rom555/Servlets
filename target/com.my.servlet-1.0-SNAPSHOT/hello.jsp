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
    <a href="image">Get image</a>
    <form method="post" action="HelloServlet" >
        <input type="submit" value="Exit">
    </form>
    <h3>File Upload:</h3>
    Select a file to upload: <br />
    <form action = "UploadServlet" method = "post" enctype = "multipart/form-data">
        <input type="file" name="file" />
        <br />
        <input type = "submit" value = "Upload File" />
    </form>
</body>
</html>
