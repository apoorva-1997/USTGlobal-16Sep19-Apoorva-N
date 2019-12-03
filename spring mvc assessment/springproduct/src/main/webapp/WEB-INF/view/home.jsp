<%@page import="com.ustglobal.springproduct.beans.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%> 
<%
	ProductBean bean = (ProductBean) session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changepassword">Change Password</a>
	<a href="./delete">Delete Product</a>
	<a href="./logout" style="float:right;">Logout</a>

	<center>
	
		<h2>
		Welcome
		<%=bean.getName()%></h2>
		<legend>Search Producta</legend>
		<form action="./search">

			<table>
				<tr>
					<td>ID</td>
					<td><input type="text" name="id"></td>
					<td><input type="submit" name="Search"></td>
				</tr>
			</table>
		</form><br>
		</center>

<h3>${msg}</h3>
</body>
</html>