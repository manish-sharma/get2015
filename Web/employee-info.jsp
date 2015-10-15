<%@page import="com.model.Employee"%>
<%@page import="com.helper.EmployeeCache"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
	<head>
		
		<link href="StyleSheet.css" rel="stylesheet">
		<script src ="javascript.js" type="text/javascript" >
		</script>
		<title>
		Metacube Software Pvt. Ltd.
		</title>
	</head>
	<body>
		<header align="center" >
		<div id="header">
		<div class="MVC">
		
		</div>
		</div>
		<div id = "head">
			<h2>MetaCube</h2>
		</div>
		</header>
		<nav align="center">
			<ul>
				<li><a href="IndexController">Registration</a></li>
            <li><a href="HomeController">Home</a></li>
       		
			</ul>
		</nav>  
	
			<div id="maincontainer">
			<%			
			Employee employee =(Employee)request.getAttribute("employee");
			out.println("<form>");
		out.println("<table id=\"table1\">");	
		 out.println("<tr >");
		 out.println("<td >" + employee.getId() + "</td>" );
		 out.println("<td>" + employee.getName() + "</td>" );
		 out.println("<td>" + employee.getEmail() +"</td>" );
		 out.println("<td>"+employee.getAge()+"</td>");
		 out.println("<td>"+employee.getDateOfRegistration()+"</td></tr></table>");
		 out.println("</form>");
		 %>
		</div>
			
			
		<footer>
		</footer>
	</body>
</html>
