<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.Collection" %>
<%@ page import="BO.UIItem" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart</title>
</head>
<body>
<h1>Shopping cart</h1>

<% if(session.getAttribute("name") != null) {%>
<h4> <%= request.getSession().getAttribute("name")%>'s cart</h4>
    <table style="width: 50%; table-layout: fixed; border: 1px solid black">
        <tr>
            <td style="border: 1px solid black">Name  </td>
            <td style="border: 1px solid black">Category  </td>
            <td style="border: 1px solid black">Price  </td>
            <td style="border: 1px solid black">Item ID  </td>
        </tr>
    </table>
    <% if(request.getSession().getAttribute("cart")!=null){
        Iterator it = ((Collection)request.getSession().getAttribute("cart")).iterator();
        UIItem item;
        while(it.hasNext()){
            item = (UIItem)it.next(); %>

        <table style="width: 50%; table-layout: fixed; border: 1px solid black">
        <tr style="border: 1px solid black">
            <td style="border: 1px solid black"><%= item.name%></td>
            <td style="border: 1px solid black"><%= item.category%></td>
            <td style="border: 1px solid black"><%= item.price%></td>
            <td style="border: 1px solid black"><%= item.itemID%></td>
        </tr>
    </table>
    <%}}else{%>
    No items added to cart
    <%}}else{%>
    Please log in to buy products
    <%}%>
<h4>Total cost: <% if(request.getSession().getAttribute("sum") == null) { %>
    0 <%} else {
        out.println(request.getSession().getAttribute("sum"));
    };%> SEK</h4>
</br>
</br>
<form action="Webshop" method="post">
    <input type=submit value="Back to shopping">
</form>

<form action="Logout" method="get">
    <input type=submit value="Logout">
</form>
</body>
</html>
