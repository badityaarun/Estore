<%@page import="com.estore.bean.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Confirmation</title>

<link rel="stylesheet" href="css/style.css">

</head>

<body>

<%
Integer total = (Integer)request.getAttribute("total");
CustomerBean cb = (CustomerBean)session.getAttribute("customerBean");
%>

<div class="card">

    <h1>Order Confirmation</h1>

    <p class="subtitle">
        Thank you for shopping with us.
    </p>

    <h2 style="color:#2563eb; margin-bottom:20px;">
        Hello <%=cb.getFname()%>
    </h2>

<%
if(total != null)
{
%>

    <h3 style="color:#16a34a; margin:20px 0;">
        🎉 Your Order has been Placed Successfully!
    </h3>

    <p style="font-size:20px; margin-bottom:30px;">
        <strong>Total Amount:</strong> ₹ <%=total%>
    </p>

<%
}
%>

    <a href="ViewCustomerProductsServlet" class="btn customer-btn">
        Continue Shopping
    </a>

    <a href="logout" class="btn logout-btn">
        Logout
    </a>

</div>

</body>
</html>