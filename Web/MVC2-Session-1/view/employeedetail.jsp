<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.model.EmployeeCache"%>
    <%@page import="com.model.Employee"%>
    <%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="metacube.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Metacube</title>
</head>
<body>
  <div id="wrapper">
  <header>
    METACUBE SOFTWARE
   </header>
  <div id="container">
  <div id='cssmenu'>
    <ul>
       <li class='active'><a href="index.jsp"><span>Home</span></a></li>
       <li><a href="registration.jsp"><span>Registration</span></a></li>
       <li><a href="employeelist.jsp"><span>Employee List</span></a></li>
       <li class='last'><a href='#'><span>Contact</span></a></li>
    </ul>
</div>
  <h2>Employees Detail</h2>
  <div class="CSS_Table_Example">
        <table>
         <tr>
          <td>EmployeeID</td><td>Name</td><td>Email</td><td>age</td><td>Date Of Registration</td><td>Update</td>
         </tr>
    <%
      EmployeeCache employeeCache = new EmployeeCache();
	  Map<Integer ,Employee>  employeeMap = employeeCache.getEmployeeCache();
	   int id = Integer.parseInt(request.getParameter("id"));
	     Employee employee = employeeCache.getEmployee(id);
	     out.print("<tr>");
	             out.print(" <td>"+employee.getId()+"</td> <td>"+employee.getName()+"</td><td>"+employee.getEmail()+
	        "</td><td>"+employee.getAge()+"</td><td>"+employee.getDateOfRegistration()+
	        "</td><td><a href=\"employeeupdate.jsp?id="+employee.getId()+"&name="+employee.getName()+"&email="+employee.getEmail()+"&age="+employee.getAge()+"\" >click here</a></td>" );
	     out.print("</tr>");

	%>
	</table>
</div>
  </div>
  </div>
  <footer>&copy 2011 Metacube Software Pvt. Ltd. All rights reserved.
  </footer>
</body>
</html>