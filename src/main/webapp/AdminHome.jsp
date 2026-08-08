<%@page import="com.estore.bean.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>

<link rel="stylesheet" href="css/style.css">

</head>

<body>

<%
AdminBean abean=(AdminBean)session.getAttribute("adminbean");
%>

<div class="dashboard">

    <h1>Admin Dashboard</h1>

    <p class="welcome">
        Welcome <strong><%=abean.getFname()%></strong>
    </p>

    <div class="dashboard-menu">

        <a href="AddProduct.html" class="menu-card">
            <h2>➕</h2>
            <h3>Add Product</h3>
            <p>Create a new product.</p>
        </a>

        <a href="view1" class="menu-card">
            <h2>📦</h2>
            <h3>View Products</h3>
            <p>View all available products.</p>
        </a>

        <a href="logout" class="menu-card logout-card">
            <h2>🚪</h2>
            <h3>Logout</h3>
            <p>Exit from dashboard.</p>
        </a>

    </div>

</div>

</body>
</html>