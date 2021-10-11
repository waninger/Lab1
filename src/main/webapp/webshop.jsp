<%@ page import="BO.UIItem" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.Collection" %>
<%@ page import="java.util.ArrayList" %><%--
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
<form action="Webshop" method="Post">
    <% if(request.getAttribute("items")!=null){
        Iterator it = ((Collection)request.getAttribute("items")).iterator();
        UIItem item;
    while(it.hasNext()){
        item = (UIItem)it.next(); %>
    <table style="width: 50%; table-layout: fixed; border: 1px solid black">
        <tr>
            <td style="border: 1px solid black">Name  </td>
            <td style="border: 1px solid black">Category  </td>
            <td style="border: 1px solid black">Price  </td>
            <td style="border: 1px solid black">Amount in stock  </td>
            <td style="border: 1px solid black">Item ID  </td>
            <td style="border: 1px solid black">Action  </td>
        </tr>
        <tr style="border: 1px solid black">
            <td style="border: 1px solid black"><%= item.name%></td>
            <td style="border: 1px solid black"><%= item.category%></td>
            <td style="border: 1px solid black"><%= item.price%></td>
            <td style="border: 1px solid black"><%= item.amount%></td>
            <td style="border: 1px solid black"><%= item.itemID%></td>
            <td style="border: 1px solid black"><a class="btn btn-dark" href="AddtoCart?id=<%=item.itemID%>">Add to Cart</a></td>

        </tr>
    </table>
    <%}}else{%>
     <%}%>
    <input type="text" name="search">
    <input type="submit" value="search Items">
</form>
<form action="cart.jsp" method="post">
    <input type=submit value="View cart">
</form>
</body>
</html>
