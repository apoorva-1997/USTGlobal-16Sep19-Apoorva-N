<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page session="false" %>												//to not to go to home page without login when we type home
 <%
 String id ="";
	Cookie[] cookies = request.getCookies();
	if(cookies!=null) {
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals("alwaysRemember")) {				//check cookie is present or not if present paste in id
			
				id =cookie.getValue();
			}
		}
	}
%>
<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4><%=msg %></h4>
<fieldset align='center'>
<legend>Login</legend>
<form action='./login' method='post' >
Id : <input name = 'id' type= 'number' value = '<%=id%>'><br><br>
Password : <input name = 'password' type= 'password'><br><br>
<input name = 'Rembember Me' type= 'checkbox' value = 'check'> Remember me<br><br>
<input name = 'Reset' type= 'reset' value='reset'>
<input name='login' type='submit' value ='login' class='btn float-right'><br><br>
</form>
</fieldset>
<a href = './register.html' >register</a>

</body>
</html>