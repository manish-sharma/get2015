<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="model.Employee" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="master.jsp"  %> 
<%Employee employee = (Employee)request.getAttribute("employee");
if(employee!=null)
{
	int id = employee.getID();
}

%>
<form action="/assignmentMVC-one/EmployeeRegistrationController" > 

<table>
<tr>
<td>Name </td><td> <input type="text" name="name" 
<% if(employee!=null)
{
	out.println("value = '"+employee.getName()+"'");
	int id = employee.getID();

}
%>

></td>
</tr>

<tr>
<td>Age </td><td> <input type ="text" name ="age"
<% if(employee!=null)
{
	out.print("value = '"+employee.getAge()+"'");
}
%>
> </td>
</tr>
<tr>
<td>Email</td><td> <input type ="text" name = "email"
<% if(employee!=null)
{
	out.print("value = '"+employee.getMail()+"'");
}
%>
> </td>
</tr>
<tr>
<td>Date of Registration</td><td><input type ="text" name="dateOfRegistration"
<% if(employee!=null)
{
	out.print("value = '"+employee.getDateOfRegistration()+"'");
}
%>
 ></td>
</tr>

</table>
<input type="text" name="editId" <%
		if(employee!=null) {
			out.println("value='"+employee.getID()+"'");
		}
		%>style="visibility: hidden;" />
<input type="submit" name="submit" /><br/>
</form>

</body>
</html>