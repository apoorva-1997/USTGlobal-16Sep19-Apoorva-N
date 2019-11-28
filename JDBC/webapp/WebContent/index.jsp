<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
	 <%@page errorPage ="error.jsp" %>
	 
<%-- <%@page session="true %>  // true means creates cookie before login......false means dosnt create session--%>
 	<%@page isThreadSafe ="true" %> 
 
 <!-- if true include 2 inerfaces or if false includes 3 interfaces --> 
 	<%@page session = "true" %>
    
   
    
    <%!
    public void jspInit(){
    	System.out.println("this is init");
    }
    
    public void jspDestroy(){
    	System.out.println("this is destroy");
    }    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%									/*Sricptlet tag  */

Date date = new Date();
int i = 10/0;
m();
%>

<%!									/* decleration tag */
	public int i = 10;
	public void m(){
	System.out.println(i);
}

%>
<body>
Object o = new Object();
<h1 style ='color:black;'>Date and Time is <%=date %></h1>
<h1><%=i %></h1>					<!-- Expression tag -->
</body>
</html>