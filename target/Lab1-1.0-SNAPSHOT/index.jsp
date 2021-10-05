<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="Login">Hello Servlet</a>
<form action="Login" method="post">
    <table>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name"></td>
            <td><%=request.getParameter("name") %></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="Password" name="password"></td>
            <td> <%=request.getParameter("password")%></td>
        </tr>
    </table>
    <input type="submit" value="Login">
</form>
</body>
</html>