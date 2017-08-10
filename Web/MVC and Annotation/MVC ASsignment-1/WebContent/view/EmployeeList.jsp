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
<body>

<!-- JSP Page to view the list of all the employee and links to view their all details and edit the details  -->
   <% 
     List<Employee> list1=(List<Employee>)request.getAttribute("employeeList");
     out.write("<br><br>");
     for(Employee str:list1){
     out.println(str.getName() + "   " + str.getEmailID() + "   " + str.getEmployeeID());
 	 out.write("<a href=http://localhost:8080/MVC_ASsignment-1/ViewDetailsController?id=" + str.getEmployeeID() + " style=\"margin: 0 10px 0 10px\"> view details </a>");
 	 out.write("<a href=http://localhost:8080/MVC_ASsignment-1/ForwardController?id=" + str.getEmployeeID() + " style=\"margin: 0 10px 0 10px\"> edit details </a>");
 	 out.write("<br>"); 
     }
 	 %>
</body>
</html>