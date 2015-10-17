<%@page import="java.util.List"%>
<%@page import="com.modal.Employee"%>
<%@page import="java.util.concurrent.ConcurrentHashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title> Employee List Page </title>
		<link rel="stylesheet" type="text/css" href="view/css/Employee-CSS.css">
	</head>

<body>

	<header>
		
		<div id="logo"> <h2> MetaCube Softwares Pvt. Ltd. </h2> </div>
		
		<nav>
			<ul>
				<li> <% out.write("<a href=\"/mvc/EmployeeDataFetchAndSend\"> List of Employees </a>"); %> </li>
				<li> <% out.write("<a href=\"/mvc/RegistrationPage?id="+(-1)+"\" style=\"margin: 0 10px 0 10px\"> Register Here </a>"); %> </li>
			</ul>
		</nav>
		
	</header>
	
	<div id="content">

		<%
			List<Employee> list1 = (List<Employee>) request.getAttribute("employeeList");
	
			for (Employee e : list1) {
				
				out.println("Employee ID: " + e.getEmployeeID());
				out.write("<br>");
				out.println("Emloyee Name: " + e.getName());
				out.write("<br>");
				out.println("Age: " + e.getAge());
				
				out.write("<a href=\"/mvc/ViewDetails?id=" + (e.getEmployeeID() - 1)
						+ "\" style=\"margin: 0 10px 0 10px\"> View Details </a>");
				
				out.write("<a href=\"/mvc/RegistrationPage?id=" + (e.getEmployeeID() - 1)
						+ "\" style=\"margin: 0 10px 0 10px\"> Edit Details </a>");
				
				out.write("<br>");
			}
		%>
		
	</div>

</body>

</html>