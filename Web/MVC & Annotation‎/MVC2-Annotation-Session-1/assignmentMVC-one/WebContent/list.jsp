<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.*" %>
<%@page import="model.Employee" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="master.jsp"  %> 
<%
  List <Employee> list = (List<Employee>)request.getAttribute("employeeList");
out.println("EmpId &nbsp&nbsp&nbsp Name &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Email<br/>");	
for(Employee e : list) {
	out.println("&nbsp&nbsp&nbsp"+e.getID()+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"+e.getName()
	+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"+e.getMail()
	+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href='EmployeeDetailController?id="
	+e.getID()+"'> Details</a> &nbsp&nbsp&nbsp"
	+"<a href='EmployeeRegistrationController?id="+e.getID()+"'> Edit</a><br/>");
}
%>

</body>
</html>