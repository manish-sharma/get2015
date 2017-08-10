<%@page import="java.util.List"%>
<%@page import="model.Employee"%>
<%@page import="java.util.concurrent.ConcurrentHashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<!-- Registration page with some pre filled filed and option to edit the value -->
<body>
<% Employee employeeDetails = (Employee)request.getAttribute("employeeDetails"); %>
	<form action="http://localhost:8080/MVC_ASsignment-1/EditDetailsController" method="get">
	    <input type="text" name="Name" value = "<%= employeeDetails.getName()%>"/><br>
		<input type="email" name="Email" value = "<%= employeeDetails.getEmailID()%>"/><br>
		<input type="number" name="Age"  value="<%= employeeDetails.getAge()%>"/><br>
		<input type="number" name="EmployeeID" value="<%= employeeDetails.getEmployeeID()%>"/><br>
		<label><%=employeeDetails.getDateOfRegistration()%></label>
		<br>
		<input type="submit" value="Update"/> 
	</form>
</body>
</html>