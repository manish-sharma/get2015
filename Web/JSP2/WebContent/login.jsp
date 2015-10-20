<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log in</title>
<link rel="stylesheet" href="registration.css" type="text/css">
</head>
<body>
	<div class = "container">
	<form action="loginController" method="post">
	<label>${message}</label> 
	<table>
	<thead><h2>Log in</h2></thead>
		<tr><td>Email :</td> <td><input type="email" name="userName" required></td></tr>
		<tr><td>Password :</td> <td><input type="password" name="password" required></td></tr>
		<tr><td><input type="submit" value="Log in" />
		</td></tr>
	</table>
	
	</form>
	</div>
</body>
</html>