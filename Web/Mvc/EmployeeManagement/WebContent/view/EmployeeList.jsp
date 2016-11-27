<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="model.Employee , java.util.* " %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee List</title>
 <link rel="stylesheet" href="Css/new.css" type="text/css" />
 <link rel="stylesheet" href="Css/HTMLAssignment2Style.css" type="text/css" />
</head>
<body>
<div class = "title_block">
					<div class = "title_line"><p>${heading}</p></div>
					</div>
          <div class="ListTable">
         <table class="table1">
                   <tr>
                        <th >Employee ID</th>
                        <th >Name</th>
                        <th >Email</th>
                        <th >Detail</th>
						<th >Edit</th>
                    </tr>
	

	<% List<Employee> list = (List<Employee>) request.getAttribute("employeeList");
			for(Employee employee : list) {
	    	out.println("<tr><td>"+employee.getEmployeeId()+"</td><td>"+employee.getName()+"</td><td>"+employee.getEmail()+
					"</td><td><a href='EmployeeDetailController?id="+employee.getEmployeeId()+
					"'> Details</a></td><td><a href='EmployeeRegistrationController?id="+employee.getEmployeeId()+"'> Edit</a></td></tr>");
		}
	
	%>
	 </table>
	 </div>
</body>
</html>