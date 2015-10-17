<%@page import="com.sun.org.apache.bcel.internal.generic.INSTANCEOF"%>
<%@page import="com.modal.Employee"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title> Edit Employee Details </title>
		<link rel="stylesheet" type="text/css" href="view/css/Employee-CSS.css">
	</head>

<body>

	<header>
		
		<div id="logo"> <h2> MetaCube Softwares Pvt. Ltd. </h2> </div>
		
		<nav>
			<ul>
				<li> <% out.write("<a href=\"/mvc/EmployeeDataFetchAndSend\"> List of Employees </a>"); %> </li>
				<li> <% out.write("<a href=\"/mvc/RegistrationPage?id="+(-1)+"\" style=\"margin: 0 10px 0 10px\"> Register Here </a>"); %> </li>
			</ul>
		</nav>
		
	</header>
	
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
		
			<table id="registration_form">
			
				<tr>
					<td> Employee ID: </td>
					<td> <input type=text value="<%=employeeId%>" name="id" readonly="readonly" class="input_field"/> </td>
				</tr>
				
				<tr>
					<td> Employee Name: </td>
					<td> <input type=text value="<%=name%>" name="employeeName" class="input_field"/> </td>
				</tr>
				
				<tr>
					<td> Age: </td>
					<td> <input type=text value="<%=age%>" name="age" class="input_field"/> </td>
				</tr>
				
				<tr>
					<td> Date of Registration: </td>
					<td> <input type=text value="<%=date%>" disabled="disabled" name="doR" class="input_field"/> </td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
						<input type=submit formaction="/mvc/RegistrationUpdate?id="+(e.getEmployeeID()-1) value="Submit Details" class="submit_button">
					</td>
				</tr>
				
			</table>
			
		</form>
		
	</div>

</body>

</html>