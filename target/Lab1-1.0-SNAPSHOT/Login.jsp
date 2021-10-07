<%--
  Created by IntelliJ IDEA.
  User: mikae
  Date: 2021-10-06
  Time: 09:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Login</title>
</head>
<body>
<h1>Login Page</h1>
<form action="Login" method="post">
    <table>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name"></td>
            <td><%= request.getAttribute("name") %></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="Password" name="password"></td>
            <td> <%= request.getAttribute("password") %></td>
        </tr>
    </table>
    <input type="submit" value="Login">
</form>
<h1><%= request.getAttribute("verify") %></h1>
</body>
</html>
