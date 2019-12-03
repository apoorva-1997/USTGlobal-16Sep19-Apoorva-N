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
		<legend>Update Password</legend>
		<form action="./changepassword" method="post">
			<table>
				<tr>
					<td>New Password:</td>
					<td><input type="text" name="password"></td>
				</tr>
				<tr>
					<td>Confirm Password:</td>
					<td><input type="text" name="password"></td>
				</tr>
				<tr>
					<td><input type="submit" value="update"></td>
				</tr>

			</table>
		</form>
	</center>
</body>
</html>