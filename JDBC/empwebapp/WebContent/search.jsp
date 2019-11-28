<%@page import="com.ustglobal.empwebapp.dto.EmployeeInfo" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	EmployeeInfo info =(EmployeeInfo)request.getAttribute("info");										

%>
<%-- <jsp:useBean id="info" class="com.ustglobal.empwebapp.dto.EmployeeInfo" scope ="request"></jsp:useBean> --%>
<body>
	<a href='./home'>Home</a>
	<a style='float: right' href='./logout'>Logout</a>
	
	<%if(info!=null){ %>
	<fieldset>
		<legend>Employee Info</legend>
		<table align="center" border=1>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
			</tr>

			<tr>
				<td><%=info.getId() %></td>
				<td><%=info.getName() %></td>
				<td><%=info.getEmail() %></td>
			</tr>



		</table>
	</fieldset>
	<%}else{ %>
	<h1>no data found</h1>
	<%} %>
</body>
</html>