<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="model.Employee , java.util.* " %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="Css/new.css" type="text/css" />
 <link rel="stylesheet" href="Css/HTMLAssignment2Style.css" type="text/css" />
<title>Employee Registration</title>
</head>
<body>
<div class = "title_block">
					<div class = "title_line"><p>${heading}</p></div>
					</div>
	
	<% Employee employee = null;
	    int employeeId=0;
		employee =  (Employee)request.getAttribute("employee");
		if(employee!=null)
		{
			employeeId=employee.getEmployeeId();
			
		}
	%>

	<form name="register" action="/EmployeeManagement/EmployeeRegistrationController?editId=<%=employeeId %>" method="post">
		<div class="ListTable">
		<table class="table1">
		<tr><td>Name</td><td><input type="text" name="name" required
		<%  
		if(employee!=null) {
			out.println("value='"+employee.getName()+"'");
			
		}
		%>/></td></tr><tr><td>Email</td><td><input type="email" name="email" required
		<% 
		if(employee!=null) {
			out.println("value='"+employee.getEmail()+"'");
		}
			%> /></td></tr><tr><td>Age</td><td><input type="number" name="age" min = "1" max = "100" step = "any" required
		<% 
		if(employee!=null) {
			out.println("value='"+employee.getAge()+"'");
		}
			%>  /></td>
		<tr><td colspan="2"><input type='submit' name='submit' value='Register' id='button' class='SearchButton' /></td></tr>
		</table>
	</div>
	</form>
</body>
</html>