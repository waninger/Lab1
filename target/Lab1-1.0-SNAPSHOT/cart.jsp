<%--
  Created by IntelliJ IDEA.
  User: sofia
  Date: 2021-10-08
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart</title>
</head>
<body>
<h1>Shopping cart</h1>
<h3> <% int s[] = (int[]) request.getSession().getAttribute("cart");
    for(int i:s) {
        out.print(" " + i);
    }
%>
</b><%= request.getSession().getAttribute("name")%>'s session</b></h3>
<form action="Logout" method="get">
    <input type=submit value="Logout">
</form>
<form action="Webshop" method="get">
    <input type=submit value="Back to shopping">
</form>
</body>
</html>
