<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="model.Employee" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="view/css/custom.css" rel="stylesheet">
<title>Register Employee</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<% 
		String id = "";
		String name = "";
		String email = "";
		String age = "";
		Employee emp = null;
		boolean readonly = false;
		
		if(request.getAttribute("readonly") != null) {
			readonly = (boolean)request.getAttribute("readonly");
		}
		
		if((Employee) request.getAttribute("employee") != null) {
			emp = (Employee) request.getAttribute("employee");
			id = emp.getId()+"";
			name = emp.getName();
			email = emp.getEmail();
			age = emp.getAge()+"";
		} else {
			id = request.getAttribute("employeeId")+"";
		}
	%>
		<table>
			<form action="/MVC-Assignment-1/RegisterChangeUser" method="post">
				<legend><h2>Register</h3></legend><hr>
					<tr>
						<td>Employee ID:</td>
							<td><%=id%><input type="hidden" name="employeeId"value="<%=id%>"></td>
					</tr>
					<tr>
						<td>Enter Name:</td>
						<% if(!readonly){ %>
							<td><input type="text" name="name" placeholder="Enter Full Name" value=<%=name%> ></td>					
						<%} else {%>
							<td><%=name%></td>
						<%} %>
					</tr>
					<tr>
						<td>Email</td>
						<% if(!readonly){ %>
							<td><input type="email" name="email" placeholder ="Enter Email" value=<%=email%> ></td>
						<% } else {%>
							<td><%=email%></td>
						<%} %>
					</tr>
					<tr>
						<td>Age</td>
						<% if(!readonly){ %>
							<td><input type="number" name="age" placeholder="Enter Age" value=<%=age%>></td>
						<%} else {%>
							<td><%=age%></td>
						<%} %>
					</tr>
					<%if(!readonly) {%>
					<tr>
						<td> <input type="submit" value="Update / Create" name="registerUser"></td>
						<td> <input type="reset" value="Reset"></td>
					</tr>
					<% } request.setAttribute("readonly", null);%>
			</form>
			</table>
			<%@ include file="./master.jsp" %>	
</body>
</html>