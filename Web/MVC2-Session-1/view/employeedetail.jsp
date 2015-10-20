<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.helper.EmployeeCache"%>
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
       <li ><a href="index.jsp"><span>Home</span></a></li>
       <li><a href="registration.jsp"><span>Registration</span></a></li>
       <li><a href="employeelist.jsp"><span>Employee List</span></a></li>
       <li ><a href='#'><span>Contact</span></a></li>
    </ul>
</div>
  <h2 id="detailh2">Employees Detail</h2>
  <div>
     <%   EmployeeCache employeeCache = new EmployeeCache();
	      Map<Integer ,Employee>  employeeMap = employeeCache.getEmployeeCache();
	      int id = Integer.parseInt(request.getParameter("id"));
	      Employee employee = employeeCache.getEmployee(id);
	  %>
        <table id="detailtable">
         <tr>
          <td>EmployeeID :</td><td> <% out.println(employee.getId()); %></td>
         </tr>
         <tr>
             <td>Name :</td><td> <% out.println(employee.getName());%></td>
         </tr>
         <tr>
             <td>Email :</td><td>  <% out.println(employee.getEmail());%></td>
         </tr>
         <tr>
             <td>Age :</td><td>  <%out.println(employee.getAge());%></td>
         </tr>
         <tr>
             <td>Date Of Registration :</td><td>  <% out.println(employee.getDateOfRegistration()); %></td>
         </tr>
         <tr>
              <td colspan="2" style="text-align:center;">
                <%
               out.println("To Edit <a href=\"employeeupdate.jsp?id="+employee.getId()+"&name="+employee.getName()+"&email="+employee.getEmail()+"&age="+employee.getAge()+"\" >click here</a>  ");
                %> 
                </td>
         </tr>
   
	</table>
</div>
  </div>
  </div>
  <footer>&copy 2011 Metacube Software Pvt. Ltd. All rights reserved.
  </footer>
</body>
</html>