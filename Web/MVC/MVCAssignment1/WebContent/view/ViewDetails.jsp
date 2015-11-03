<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.example.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>View Details</title>
		<link rel="stylesheet" href="../MVCAssignment1/css/home.css" type="text/css">
		<link rel="stylesheet" href="../MVCAssignment1/css/employeeListPage.css" type="text/css">
	</head>
	<body>
		<header>
			<h1>Details Of Employee</h1>
		</header>
		<nav>
			<center>
				<ul>
					<li><a href="http://localhost:8080/MVCAssignment1/view/Home.jsp">Home</a></li>
					<li><a href="http://localhost:8080/MVCAssignment1/MainController?page=register">Register</a></li>
					<li><a href="http://localhost:8080/MVCAssignment1/MainController?page=listOfEmployees">List Employees</a></li>
				</ul>
			</center>
		</nav>
		<section>
<% 
	EmployeeBean objOfEmployee = (EmployeeBean)request.getAttribute("employeeDetails");
	out.print(objOfEmployee.toString().replaceAll("\n","<br>"));
%>
		</section>
	</body>
</html>