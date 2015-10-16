<%@page import="com.model.Employee"%>
<%@page import="com.helper.EmployeeCache"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
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
				<li ><a href="HomeController">Home</a></li>
            <li><a href="RegistrationForm">Registration</a></li>
            <li><a href="ListController">Employee List</a></li>
				
			</ul>
		</nav>  
	
		<div id="maincontainer">
		<%			
				Employee employee =(Employee)request.getAttribute("employee");
				out.println("<form>");
				out.println("<table id=\"table1\">");	
			 out.println("<tr >");
	
			 out.println("<td><input type=\"text\"  name = \"id1\" value='" + employee.getId() + "' readonly></td>" );
			 out.println("<td ><input type=\"text\" name = \"name1\"value='" + employee.getName() + "'></td>" );
			 out.println("<td ><input type=\"text\" name = \"email1\" value='" + employee.getEmail() + "'></td>" );
			 out.println("<td ><input type=\"number\" name = \"age1\" value='" + employee.getAge() + "'></td>");
			 out.println("<td ><input type=\"text\" name = \"dateOfRegistration1\" value='" + employee.getDateOfRegistration() + "'></td>");
			 out.println("<td ><input type = \"submit\" value= \"Submit\"formaction = \"InformationEditController\" ></td></tr></table>");

			 out.println("</form>");
			 %>
	
		</div>	
		<footer>
		</footer>
	</body>
</html>