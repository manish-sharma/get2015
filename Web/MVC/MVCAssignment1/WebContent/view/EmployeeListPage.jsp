<%@page import="com.example.model.EmployeeBean"%>
<%@page import="java.util.List"%>
<%@page import="java.util.concurrent.ConcurrentHashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Employee List Page</title>
		<link rel="stylesheet" href="../MVCAssignment1/css/home.css" type="text/css">
		<link rel="stylesheet" href="../MVCAssignment1/css/employeeListPage.css" type="text/css">
	</head>

	<body>
		<header>
			<h1>List Of Employees</h1>
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
List<EmployeeBean> list1 = (List<EmployeeBean>)request.getAttribute("employeeList");
for (EmployeeBean str : list1 ) {
	out.write("<center><table>");
	out.write("<tr>");
	out.write("<td>"+str.getName()+"</td>");
	out.write("<td><a href='http://localhost:8080/MVCAssignment1/ViewDetailsController?id="+str.getEmployeeId()+"'> View details</a></td>");
	out.write("<td><a href='http://localhost:8080/MVCAssignment1/EditDetailsController?id="+str.getEmployeeId()+"'> Edit details </a></td>");
	out.write("</tr>");
	out.write("</table></center>"); 
}
%>
		</section>
	</body>
</html>