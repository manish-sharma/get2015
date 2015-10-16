<%@page import="com.model.Employee"%>
<%@page import="com.helper.EmployeeCache"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="StyleSheet.css" rel="stylesheet">
		<script src ="javascript.js" type="text/javascript" >
		</script>
		<title>
		Metacube Software Pvt. Ltd.
		</title>
	</head>
	<body>
		<header align="center" >
		<div id="header">
		<div class="MVC">
		
		</div>
		</div>
		<div id = "head">
			<h2>MetaCube</h2>
		</div>
		</header>
		<nav align="center">
			<ul>
				 <li class="active"><a href="HomeController">Home</a></li>
            <li><a href="ListController">Employee List</a></li>
				
			</ul>
		</nav>  
	
			<div id="maincontainer">
			<form action="RegistrationForm" >
		
		<table style="text-align: center; border:1px solid black; margin : 50px auto ;width : 20%;height : 60%; ">
		<tr>
		<td><label>Name</label></td>
		<td><input type="text" name="name"></td>
		</tr>
		<tr>
		<td><label>Email</label></td>
		<td><input type="email" name="email"></td>
		</tr>
		<tr>
		<td><label>Id</label></td>
		<td><input type="number" name="Id"></td>
		</tr>
		<tr>
		<td><label>Age</label></td>
		<td><input type="number" name="age"></td>
		</tr>
		<tr>
		<td></td>
		<td><input type="submit" value="Register" name="submit"></td>
		</tr>
		</table></form>
				</div>
			
			
		<footer>
		</footer>
	</body>
</html>
