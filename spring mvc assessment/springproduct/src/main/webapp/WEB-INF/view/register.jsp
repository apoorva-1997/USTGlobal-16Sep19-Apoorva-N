<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h3>registration</h3>
		<form action="./register" method="post">
			<table>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>

				<tr>
					<td>Email:</td>
					<td><input type="text" name="email"></td>
				</tr>

				<tr>
					<td>Password:</td>
					<td><input type="text" name="password"></td>
				</tr>

				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" value="Register"></td>
				</tr>

			</table>
		</form>
	</center>
	<a href="./login">Click here to Login</a>
</body>
</html>