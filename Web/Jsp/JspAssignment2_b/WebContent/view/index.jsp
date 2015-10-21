<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Home</title>
		<link rel="stylesheet" href="../css/style1.css" type="text/css">
		<script type="text/javascript" src="../js/js1.js"></script>
	</head>
	<body>
		<header><h2>Login</h2></header>
  		<section>
		<center>
  			<br/><br/>
			<form action="../Login" name="myform">
				<table>
					<tr>
						<td><span>*</span> Username : </td>
						<td><input type="text" placeholder="Enter username" id="username" name="userName"/></td>
					</tr>
					<tr>
						<td><span>*</span> Password : </td>
						<td><input type="password" placeholder="Enter password" id="passwd" name="password"/></td>
					</tr>
				</table>
				<input id="submitButton" type="submit" value="Create" disabled onsubmit="validate();" />
			</form>
			</center>
  		</section>
	</body>
</html>