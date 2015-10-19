<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="model.Employee , java.util.* " %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<p>${heading}</p>
		<% Employee emp = (Employee) request.getAttribute("employee");
			out.println("EmpId = "+emp.getEmployeeId()+"<br/>");
			out.println("Name = "+emp.getName()+"<br/>");
			out.println("Email = "+emp.getEmail()+"<br/>");
			out.println("Age = "+emp.getAge()+"<br/>");
			out.println("Date Of Registration = "+emp.getDor()+"<br/>");
		%>
	<a href="/EmployeeManagement/LandingController">Landing Page</a><br/><br/>
</body>
</html>