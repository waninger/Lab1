<%@ page import="BO.UIItem" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.Collection" %><%--
  Created by IntelliJ IDEA.
  User: mikae
  Date: 2021-10-06
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Webshop</title>
</head>
<body>
<h1>Webshop</h1>
<form action="Login" method="post">

    <input type="submit" value="Login">
</form>
<form action="Webshop" method="get">
    <% if(request.getAttribute("items")!=null){
        Iterator it = ((Collection)request.getAttribute("items")).iterator();
        UIItem item;
    while(it.hasNext()){
        item = (UIItem)it.next(); %>
        <%= item.name%>
        <%= item.itemID%>
    <%}}%>
    <input type="submit" value="null">
</form>
<form action="cart.jsp" method="post">
    <input type=submit value="View cart">
</form>
<h3><%= request.getSession().getAttribute("name")%>'s session </h3>

</body>
</html>
