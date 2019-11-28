<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<jsp:useBean id="obj" class="com.ustglobal.webapp.servlets.Employee" scope="application"></jsp:useBean>

<html>
<body>
<h1><%=obj.getId() %></h1>
<h2><%=obj.getName() %></h2>
</body>
</html>