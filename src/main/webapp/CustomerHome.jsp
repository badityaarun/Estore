<%@page import="com.estore.bean.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Dashboard</title>

<link rel="stylesheet" href="css/style.css">

</head>

<body>

<%
CustomerBean cbean=(CustomerBean)session.getAttribute("customerBean");
%>

<div class="dashboard">

    <h1>Customer Dashboard</h1>

    <p class="welcome">
        Welcome <strong><%=cbean.getFname()%></strong>
    </p>

    <div class="dashboard-menu">

        <a href="ViewCustomerProductsServlet" class="menu-card">

            <h2>🛍️</h2>

            <h3>View Products</h3>

            <p>Browse all available products.</p>

        </a>

        <a href="logout" class="menu-card logout-card">

            <h2>🚪</h2>

            <h3>Logout</h3>

            <p>Sign out from your account.</p>

        </a>

    </div>

</div>

</body>
</html>