<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Edit/Register</title>
		<link rel="stylesheet" href="../MVCAssignment1/css/home.css" type="text/css">
		<link rel="stylesheet" href="../MVCAssignment1/css/editDetails.css" type="text/css">
		<link rel="stylesheet" href="../MVCAssignment1/css/register.css" type="text/css">
		<script type="text/javascript" src="../MVCAssignment1/js/register.js"></script>
	</head>
	<body>
		<header>
			<h1>Edit/Register Employee Details</h1>
		</header>
		<nav>
			<center>
				<ul>
					<li><a href="http://localhost:8080/MVCAssignment1/view/Home.jsp">Home</a></li>
					<li><a href="http://localhost:8080/MVCAssignment1/MainController?page=register">Register</a></li>
					<li><a href="http://localhost:8080/MVCAssignment1/MainController?page=listOfEmployees">List Employees</a></li>
				</ul>
			</center>
		</nav>
		<section>
		<%
			String actionOfForm = "";
			EmployeeBean objOfEmployee = null;
			String pageLink = request.getAttribute("page").toString();
			if(pageLink.equals("register"))
			{
				actionOfForm = "http://localhost:8080/MVCAssignment1/RegistrationController";
				objOfEmployee = null;
			}
			else if(pageLink.equals("edit"))
			{
				actionOfForm = "http://localhost:8080/MVCAssignment1/UpdateDetailsController";
				objOfEmployee = (EmployeeBean) request.getAttribute("employeeDetails");
			}
			
		%>
			<center>
				<form action=<%= actionOfForm%> method='get'>
					<table>
						<tr>
							<% 					
								if(objOfEmployee!=null)
								{
									out.write("<td>Employee ID :</td><td>");
									out.write("<input type='text' readonly='readonly' name='empID' value="+objOfEmployee.getEmployeeId()+">");
									out.write("</td>");
								}	
							%>	
						</tr>
			
						<tr>
							<td>Name :</td>
							<td><input type='text' required name='empName'
								value=<%=(objOfEmployee!=null)?objOfEmployee.getName():""%>></td>
						</tr>
			
						<tr>
							<td>Email :</td>
							<td><input type='text' required name='empEmail'
								value=<%=(objOfEmployee!=null)?objOfEmployee.getEmail():""%>></td>
						</tr>
			
						<tr>
							<td>Age :</td>
							<td><input type='text' required name='empAge'
								value=<%=(objOfEmployee!=null)?objOfEmployee.getAge():""%>></td>
						</tr>
			
						<tr>
							<td>Date Of Registration :</td>
							<td><input type='text' required name='empDate'
								value=<%=(objOfEmployee!=null)?objOfEmployee.getDateOfRegistration():""%>></td>
						</tr>
					</table><br/><br/>
					<%
						if(objOfEmployee!=null)
							out.write("<input type='submit' value='Update' id='updateBtn'/>");
						else
							out.write("<input type='submit' value='Register' id='register' onclick='return validate();'/>");
					%>
				</form>
			</center>
		</section>
	</body>
</html>