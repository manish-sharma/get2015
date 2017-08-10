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
<!-- Page to view the details of the employees -->
<body>
	 <% Employee employeeDetails = (Employee)request.getAttribute("employeeDetails"); 
	 out.write("<br><br>");
	 out.println(employeeDetails.getEmployeeID() + "   " + employeeDetails.getName() + "   " + 
	 employeeDetails.getEmailID() + "     " + employeeDetails.getAge() + "    " + employeeDetails.getDateOfRegistration());
	 %>	 
</body>
</html>