<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset >
<form action="./form" method ="post">
<table >

<h2>Register Form</h2>
	<tr>
	<td>
		<label>Id </label>
	</td>
	<td>
		<input type="text" name ="id" >
	</td>
	</tr>

	<tr>
	<td>
		<label>Name</label>
	</td>
	<td>
		<input type="text" name ="name" > 
	</td>
	</tr>

	<tr>
	<td>
		<label>Password</label>
	</td>
	<td>
		<input type="text" name ="password" > 
	</td>
	</tr>

	<tr>
	<td>
		<label>Gender</label>
	</td>
	<td>
		<input type="text" name ="gender" >
	</td>
	</tr>
	
	<tr>
	<td>Date</td>
	<td>
		<input type="date" name ="doj" >
	</td>
	</tr>
	
	<tr>
	<td>
		<input type="submit" value="Submit">
	</td>
	<td>
		<input type="reset" value="Reset">
	</td>
	</tr>
</form>

</table>
</fieldset>
</body>
</html>