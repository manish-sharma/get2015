<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.jqueryassignment.model.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home-Employee List</title>
<link rel="stylesheet" href="css/Index.css" />
<script type="text/javascript" src="js/jquery-1.11.3.js"></script>
<script type="text/javascript" src="js/assignment2_2.js"></script>
</head>
<body>
    	 	<select id=employeelist">
    	 		<option id="employee" value="" disabled selected>Select Employee</option>
    	 		<%
    	 		if(request.getAttribute("employeeList")==null)
    	 		{
    	 			RequestDispatcher requestDispatcher = request.getRequestDispatcher("indexpagecontroller");
    	 		   requestDispatcher.forward(request ,response);
    	 		}
    	         List<Employee> employeeList = (List<Employee>) (request.getAttribute("employeeList"));
    	 	     Iterator<Employee> employeeListIterator = employeeList.iterator();
    	 	     while(employeeListIterator.hasNext()){
    	 	     Employee employee = employeeListIterator.next();
    	 		%>
    	 		<option value = "<%=employee.getId()%>"><%=employee.getName()%></option>
    	 		<%
    	 	     }
    	 		%>
    	 	</select>
    	<div id=demo></div>
    </section>
</body>
</html>