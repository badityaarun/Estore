<%@page import="java.util.Iterator"%>
<%@page import="com.estore.bean.AdminBean"%>
<%@page import="com.estore.bean.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Products</title>

<link rel="stylesheet" href="css/style.css">

</head>

<body>

<div class="table-card">

<h1>Product List</h1>

<%
AdminBean abean=(AdminBean)session.getAttribute("adminbean");
ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("productBean");

if(al.size()==0)
{
%>

<p class="no-data">No Product Available.</p>

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
<th>Edit</th>
<th>Delete</th>

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
<a href="edit?pcode=<%=pb.getPcode()%>" class="edit-btn">
Edit
</a>
</td>

<td>
<a href="delete?pcode=<%=pb.getPcode()%>" class="delete-btn">
Delete
</a>
</td>

</tr>

<%
}
}
%>

</table>

</div>

</body>
</html>