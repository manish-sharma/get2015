<%@page import="com.sun.org.apache.bcel.internal.generic.INSTANCEOF"%>
<%@page import="com.modal.Employee"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Employee Details</title>
<link rel="stylesheet" type="text/css" href="view/css/Employee-CSS.css">
</head>

<body>

	<header>

	<div id="logo">
		<h2>MetaCube Softwares Pvt. Ltd.</h2>
	</div>

	<nav>
	<ul>
		<li>
			<% out.write("<a href=\"/mvc/HomePageController\"> Home </a>"); %>
		</li>
		<li>
			<% out.write("<a href=\"/mvc/EmployeeDataFetchAndSend\"> List of Employees </a>"); %>
		</li>
		<li>
			<% out.write("<a href=\"/mvc/RegistrationPage?id="+(-1)+"\" style=\"margin: 0 10px 0 10px\"> Register Here </a>"); %>
		</li>
	</ul>
	</nav> </header>

	<div id="content">
		<%
			Object e = request.getAttribute("employeeDetails");
			int employeeId = 0;
			String name = "";
			int age = 0;
			java.util.Date date = new Date();
			if (e instanceof Employee) {
				Employee e1 = (Employee) e;
				employeeId = e1.getEmployeeID();
				name = e1.getName();
				age = e1.getAge();
				date = e1.getDateOfRegistration();
			} else {
				employeeId = (Integer)request.getAttribute("newUser");
			}
		%>

		<form>
			<label> Employee Id:</label> <input type=text value="<%=employeeId%>"
				name="id" readonly="readonly" /> <br> <label> Name:</label> <input
				type=text required value="<%=name%>" name="employeeName" /> </br> <label>
				Age:</label> <input type=number required value="<%=age%>" name="age" min=20 max=80 /> </br> <label>
				Date oF Registration:</label> <input type=text required value="<%=date%>"
				disabled="disabled" name="doR" /> <br> <input type=submit
				formaction="/mvc/RegistrationUpdate?id="+(e.getEmployeeID()-1)>
		</form>

	</div>
	<footer>

	<div class="footer_part">
		<h3>Contact Us:</h3>
		<ul>
			<li>Support: <a href=#> support@metacube.com </a>
			</li>
			<li>Customer Care: <a href=#> +91-9636332472 </a>
			</li>
			<li>Toll free:<a href=#> 1800-100-1010 </a>
			</li>
		</ul>
	</div>

	<div class="footer_part">
		<h3>Find us on:</h3>
		<ul>
			<li><a href=#> Facebook </a></li>
			<li><a href=#> Google+ </a></li>
			<li><a href=#> Twitter </a></li>
		</ul>
	</div>

	<div class="footer_part">
		Copyright &copy <a href=#> Metacube Softwares Pvt. Ltd. </a> 2015. All
		rights reserved. <br> Designed & Developed by <a href=#>
			Ankur Gupta </a>.
		<hr>
		<a href=#> Privacy Policy. </a> <br> <a href=#> T & C </a>
	</div>

	</footer>

</body>

</html>