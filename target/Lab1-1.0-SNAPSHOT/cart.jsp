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
<h3><%= request.getSession().getAttribute("name")%>'s session </h3>
</body>
</html>
