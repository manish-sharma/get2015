<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Employee , java.util.* "%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="Css/new.css" type="text/css" />
<link rel="stylesheet" href="Css/HTMLAssignment2Style.css"
	type="text/css" />
<title>Employee Details</title>
</head>
<body>
	<div class="title_block">
		<div class="title_line">
			<p>${heading}</p>
		</div>
	</div>
	<div class="ListTable">
		<table class="table1">


			<%
				Employee employee = (Employee) request.getAttribute("employee");
				out.println("<tr><td>Employee ID</td><td>"
						+ employee.getEmployeeId()
						+ "</td></tr><tr><td>Name</td>"
						+ "<td>"
						+ employee.getName()
						+ "</td></tr><tr><td>Email</td><td>"
						+ employee.getEmail()
						+ "</td></tr><tr><td>Age</td><td>"
						+ employee.getAge()
						+ "</td></tr><tr><td>Date Of registration</td><td>"
						+ employee.getDor()
						+ "</td></tr><tr><td><a href='/EmployeeManagement/LandingController'><input type='submit' value='Langing Page' id='button' class='SearchButton' /></a></td>"
						+ "<td>"
						+ "<a href='/EmployeeManagement/EmployeeRegistrationController'>"
						+ "<input type='submit' value='Registration' id='button' class='SearchButton' /></a></td></tr>");
			%>
		</table>
	</div>

</body>
</html>