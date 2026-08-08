<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Status</title>

<link rel="stylesheet" href="css/style.css">

</head>

<body>

<div class="message-card">

    <h1>Product Status</h1>

    <%
        String data=(String)request.getAttribute("msg");
    %>

    <p class="success-msg">
        <%=data%>
    </p>

    <div class="action-buttons">

        <a href="AddProduct.html" class="btn admin-btn">
            Add Another Product
        </a>

        <a href="view1" class="btn customer-btn">
            View Products
        </a>

        <a href="logout" class="btn logout-btn">
            Logout
        </a>

    </div>

</div>

</body>
</html>