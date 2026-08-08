<%@page import="com.estore.bean.AdminBean"%>
<%@page import="com.estore.bean.ProductBean"%>
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
AdminBean abean=(AdminBean)session.getAttribute("adminbean");
ProductBean pb=(ProductBean)request.getAttribute("pbean");
%>

<div class="card">

    <h1>Update Product</h1>

    <p class="subtitle">
        Hello <strong><%=abean.getFname()%></strong>, update the product details below.
    </p>

    <form action="update" method="post">

        <label>Product Price</label>
        <input type="text"
               name="pprice"
               value="<%=pb.getPprice()%>"
               class="input-box">

        <label>Product Quantity</label>
        <input type="text"
               name="pqnt"
               value="<%=pb.getPqnt()%>"
               class="input-box">

        <input type="hidden"
               name="pcode"
               value="<%=pb.getPcode()%>">

        <input type="submit"
               value="Update Product"
               class="btn update-btn">

    </form>

</div>

</body>
</html>