<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Product</title>

<link rel="stylesheet" href="css/style.css">

</head>

<body>

<%
String data = (String)request.getAttribute("data");
%>

<div class="card">

    <h1>Update Product</h1>

    <p class="subtitle">
        Product Update Status
    </p>

    <div class="status-box success">

        <%=data%>

    </div>

    <a href="AddProduct.html" class="btn admin-btn">
        Add Product
    </a>

    <a href="view1" class="btn customer-btn">
        View Products
    </a>

    <a href="logout" class="btn logout-btn">
        Logout
    </a>

</div>

</body>
</html>