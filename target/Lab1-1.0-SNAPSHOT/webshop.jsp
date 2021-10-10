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
<h3>You are logged in as <%= request.getSession().getAttribute("name")%></h3>
<form action="Login" method="post">
    <input type="submit" value="Login">
</form>
<form action="UIItemHandler" method="get">
    <% if(request.getAttribute("items")!=null){
        Iterator it = ((Collection)request.getAttribute("items")).iterator();
        UIItem item;
    while(it.hasNext()){
        item = (UIItem)it.next(); %>
        <%= item.name%>
        <%= item.category%>
        <%= item.price%>
        <%= item.amount%>
        <%= item.itemID%>
    <%}}else{%>
     <%
        // request.setAttribute("search","blueHat");
        //funkar inte request.getRequestDispatcher("/UIItemhandler").forward(request,response); %>
    <%}%>
    <input type="text" name="search">
    <input type="submit" value="serach Items">
</form>
</body>
</html>
