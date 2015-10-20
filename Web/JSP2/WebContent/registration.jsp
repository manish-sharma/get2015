<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="registration.css" type="text/css">
</head>
<body>
<div class = "container">
	<form action="RegistrationController" method="post">
	<label>${message}</label> 
	<table>
	<thead><h2>Registration</h2></thead>
		<tr><td>Email :</td> <td><input type="email" name="email" required></td></tr>
		<tr><td>Password :</td> <td><input type="password" name="password" required></td></tr>
		<tr><td>First Name :</td> <td><input type="text" name="firstName" required></td></tr>
		<tr><td>Last Name :</td> <td><input type="text" name="lastName" required></td></tr>
		<tr><td><input type="submit" />
		</td></tr>
	</table>
	
	</form>
	</div>
</body>
</html>