<%@ page import="BO.UIItem" %><%--
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
<% String s = (String)request.getSession().getAttribute("user");
        out.print("Session for: " + s);
%>
<form>
    //plocka ut information från request
</form>
</body>
</html>
