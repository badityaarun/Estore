<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Status</title>

<link rel="stylesheet" href="css/style.css">

</head>

<body>

<%
String data = (String)request.getAttribute("data");
%>

<div class="card">

    <h1>Registration Status</h1>

    <p class="subtitle">
        Customer Registration
    </p>

    <div class="status-box success">
        <%=data%>
    </div>

    <a href="CustomerLogin.html" class="btn customer-btn">
        Customer Login
    </a>

</div>

</body>
</html>