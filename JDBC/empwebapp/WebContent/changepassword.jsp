<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>

<body>
<a href="./home" class="float-left">Home</a>
<a href="./logout" class="float-right">Logout</a>

<h4><%=msg %></h4>

<fieldset align="center">
<legend>Change Password</legend>
<form action="./changepassword"  method="post">
New Password : <input name="newpassword" type="password" ><br>
Confirm : <input name="confirmpassword" type="password" ><br>
<input name="change" type="submit" value=" change" class="btn float-right"><br>
</form>
</fieldset>
</body>
</html>