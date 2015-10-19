<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="model.Employee , java.util.* " %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration</title>
</head>
<body>
	<p>${heading}</p>
	<% Employee e = null; 
		e=  (Employee)request.getAttribute("employee");
	%>
	
	<form name="register" action="/EmployeeManagement/EmployeeRegistrationController?editId='"+request.getParameter("id")+"'">
		Name &nbsp; : <input type="text" name="name" 
		<%  
		if(e!=null) {
			out.println("value='"+e.getName()+"'");
			String id = request.getParameter("id");

			//request.setAttribute("editId", id);
			//System.out.println("jhvdah = "+url);
			
		}
			%>><br/>
		Email &nbsp; : <input type="email" name="email" 
		<% 
		if(e!=null) {
			out.println("value='"+e.getEmail()+"'");
		}
			%> /><br/>
		Age &nbsp; : <input type="number" name="age" min = "1" max = "100" step = "1" 
		<% 
		if(e!=null) {
			out.println("value='"+e.getAge()+"'");
		}
			%>  /><br/>
		Date Of Registration &nbsp; : <input type="text" name="dor"
		<%
		if(e!=null) {
			out.println("value='"+e.getDor()+"'");
		}
		%> /><br/>
		<input type="text" name="editId" <%
		if(e!=null) {
			out.println("value='"+e.getEmployeeId()+"'");
		}
		%>style="visibility: hidden;" />
		<input type="submit" name="submit" /><br/>
	</form>
</body>
</html>