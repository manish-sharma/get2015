<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="model.Employee , java.util.* " %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee List</title>
</head>
<body>
	<p>${heading}</p>
	<% List<Employee> list = (List<Employee>) request.getAttribute("employeeList");
		out.println("EmpId &nbsp&nbsp&nbsp Name &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Email<br/>");	
		for(Employee e : list) {
			out.println("&nbsp&nbsp&nbsp"+e.getEmployeeId()+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"+e.getName()
			+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"+e.getEmail()
			+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href='EmployeeDetailController?id="
			+e.getEmployeeId()+"'> Details</a> &nbsp&nbsp&nbsp"
			+"<a href='EmployeeRegistrationController?id="+e.getEmployeeId()+"'> Edit</a><br/>");
		}
	%>
</body>
</html>