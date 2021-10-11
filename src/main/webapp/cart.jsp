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
<form action="Webshop" method="get"> //ändrat till post----
    <% if(request.getSession().getAttribute("cart")!=null){
        Iterator it = ((Collection)request.getSession().getAttribute("cart")).iterator();
        UIItem item;
        while(it.hasNext()){
            item = (UIItem)it.next(); %>
    <table style="width: 50%; border: 1px solid black">
        <tr>
            <td style="border: 1px solid black">Name  </td>
            <td style="border: 1px solid black">Category  </td>
            <td style="border: 1px solid black">Price  </td>
            <td style="border: 1px solid black">Amount in stock  </td>
            <td style="border: 1px solid black">Item ID  </td>
        </tr>
        <tr style="border: 1px solid black">
            <td style="border: 1px solid black"><%= item.name%></td>
            <td style="border: 1px solid black"><%= item.category%></td>
            <td style="border: 1px solid black"><%= item.price%></td>
            <td style="border: 1px solid black"><%= item.amount%></td>
            <td style="border: 1px solid black"><%= item.itemID%></td>
        </tr>
    </table>
    <%}}else{%>
    No items added to cart
    <%}%>
    <input type=submit value="Back to shopping">
</form>

<form action="Logout" method="get">
    <input type=submit value="Logout">
</form>
</body>
</html>
