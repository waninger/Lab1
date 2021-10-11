<%@ page import="BO.Cart" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.Collection" %>
<%@ page import="BO.UIItem" %>
<%@ page import="BO.Item" %><%--
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
<% Iterator it = ((Collection)request.getSession().getAttribute("cart")).iterator();
        UIItem item;
        while(it.hasNext()){
            item = (UIItem) it.next(); %>
            <h5>Item: <%= item.name%></h5>
            <h5>Price: <%= item.price%></h5>
        <%}%>

</b><%= request.getSession().getAttribute("name")%>'s session</b>
<form action="Webshop" method="get">
    <input type=submit value="Back to shopping">
</form>
<form action="Logout" method="get">
    <input type=submit value="Logout">
</form>


</body>
</html>
