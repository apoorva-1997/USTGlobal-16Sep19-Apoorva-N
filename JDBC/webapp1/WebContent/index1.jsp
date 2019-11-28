<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@page session="false" %>
	
	<%@page is ThreadSafe="false" %>
	
	<%!
	public void jspInit(){
		System.out.println("this is init phase");
	}
	public void jspDestroy(){
		System.out.println("this is destroy phase");
	}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	Date date = new Date();
	m();
%>
<%!
public int i = 10;

	public void m() {
		System.out.println(i);
	}
	%>
<body>
	<h1 style="color: red;">Date and Time is<%=date%></h1>
	<h3><%=i %></h3>
</body>
</html>