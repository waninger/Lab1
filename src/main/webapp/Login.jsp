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
<% if(request.getAttribute("verify")==null || (boolean) request.getAttribute("verify") == false){%>
<h3>Login</h3>
<form action="Login" method="post">
    <table>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="Password" name="password"></td>
        </tr>
    </table>
    <input type="submit" value="Login">
</form>  <%}%>
<h3><% if(request.getAttribute("verify")!=null){
        if((boolean) request.getAttribute("verify") == false) {%>
            <%= "username or password is incorrect"%>
    <%}}%></h3>
</body>
</html>
