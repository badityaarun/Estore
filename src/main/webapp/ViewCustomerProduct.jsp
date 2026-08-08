<%@page import="java.util.Iterator"%>
<%@page import="com.estore.bean.CustomerBean"%>
<%@page import="com.estore.bean.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Available Products</title>

<link rel="stylesheet" href="css/style.css">

</head>

<body>

<%
CustomerBean cbean=(CustomerBean)session.getAttribute("customerBean");
ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("productBean");
%>

<div class="table-card">

    <h1>Available Products</h1>

    <p class="welcome">
        Welcome <strong><%=cbean.getFname()%></strong>
    </p>

<%
if(al == null || al.isEmpty())
{
%>

    <p class="no-data">
        Product Data Not Available!!
    </p>

<%
}
else
{
%>

<table class="product-table">

<tr>

<th>Code</th>
<th>Name</th>
<th>Company</th>
<th>Price</th>
<th>Quantity</th>
<th>Action</th>

</tr>

<%

Iterator<ProductBean> i=al.iterator();

while(i.hasNext())
{
ProductBean pb=i.next();

%>

<tr>

<td><%=pb.getPcode()%></td>
<td><%=pb.getPname()%></td>
<td><%=pb.getPcompany()%></td>
<td><%=pb.getPprice()%></td>
<td><%=pb.getPqnt()%></td>

<td>

<a href="buy?pcode=<%=pb.getPcode()%>" class="buy-btn">
Buy
</a>

</td>

</tr>

<%
}
}
%>

</table>

<br>

<a href="logout" class="btn logout-btn">
Logout
</a>

</div>

</body>
</html>