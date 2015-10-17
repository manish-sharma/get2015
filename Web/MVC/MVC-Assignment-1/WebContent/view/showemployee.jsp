<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="model.Employee" %>
<%@page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Employees</title>
<link href="view/css/custom.css" rel="stylesheet">
</head>
<body>
<%@ include file = "header.jsp" %>
<table>
<tr>
	<th>Employee Id</th>
	<th>Employee Name</th>
	<th>Employee Email</th>
	<th>Age</th>
	<th>View</th>
	<th>Edit</th>
</tr>
<%
	List<Employee> employeeList = (List<Employee>)request.getAttribute("tableData");
	for(Employee employee : employeeList) { %>
	<tr>
		<td><%=employee.getId()%></td>
		<td><%=employee.getName()%></td>
		<td><%=employee.getEmail()%></td>
		<td><%=employee.getAge()%></td>
		<td><a href="/MVC-Assignment-1/ViewDetails?id=<%=employee.getId()%>">View Details</a></td>
		<td><a href="/MVC-Assignment-1/RegisterChangeUser?id=<%=employee.getId()%>">Edit Details</a></td>
	</tr>
<% } %>
</table>
<%@ include file="./master.jsp" %>	
</body>
<script src="./view/js/script.js"></script>
</html>