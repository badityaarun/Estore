<%@page import="com.estore.bean.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buy Product</title>

<link rel="stylesheet" href="css/style.css">

</head>

<body>

<%
ProductBean pb=(ProductBean)session.getAttribute("data");
%>

<div class="card">

    <h1>Buy Product</h1>

    <p class="subtitle">
        Verify the product details and enter the required quantity.
    </p>

    <form action="qntreq" method="post">

        <label>Product Code</label>
        <input type="text"
               name="pcode"
               value="<%=pb.getPcode()%>"
               class="input-box"
               readonly>

        <label>Product Name</label>
        <input type="text"
               name="pname"
               value="<%=pb.getPname()%>"
               class="input-box"
               readonly>

        <label>Product Company</label>
        <input type="text"
               name="pcompany"
               value="<%=pb.getPcompany()%>"
               class="input-box"
               readonly>

        <label>Product Price</label>
        <input type="text"
               name="pprice"
               value="<%=pb.getPprice()%>"
               class="input-box"
               readonly>

        <label>Available Quantity</label>
        <input type="text"
               name="pqnt"
               value="<%=pb.getPqnt()%>"
               class="input-box"
               readonly>

        <label>Required Quantity</label>
        <input type="text"
               name="reqno"
               placeholder="Enter required quantity"
               class="input-box">

        <input type="submit"
               value="Buy Now"
               class="btn customer-btn">

    </form>

</div>

</body>
</html>