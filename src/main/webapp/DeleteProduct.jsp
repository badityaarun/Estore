<%@page import="com.estore.bean.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Product</title>

<link rel="stylesheet" href="css/style.css">

</head>

<body>

<%
AdminBean abean=(AdminBean)session.getAttribute("adminbean");
String data=(String)request.getAttribute("data");
%>

<div class="card">

    <h1>Delete Product</h1>

    <p class="subtitle">
        Welcome <strong><%=abean.getFname()%></strong>
    </p>

    <h3 style="color:#dc2626; margin:20px 0;">
        <%=data%>
    </h3>

    <a href="AddProduct.html" class="btn admin-btn">
        Add Product
    </a>

    <a href="view1" class="btn customer-btn">
        View Products
    </a>

    <a href="logout" class="btn update-btn">
        Logout
    </a>

</div>

</body>
</html>