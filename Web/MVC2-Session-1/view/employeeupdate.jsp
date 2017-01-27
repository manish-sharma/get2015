<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
       <li><a href="index.jsp"><span>Home</span></a></li>
       <li><a href="registration.jsp"><span>Registration</span></a></li>
       <li><a href="employeelist.jsp"><span>Employee List</span></a></li>
       <li class='last'><a href='#'><span>Contact</span></a></li>
    </ul>
    
    <h2 style="margin-left:30%;">Employee Registration Form</h2>
     <div>
        <form  action="/MVC2/update">
        <table style="margin-left:30%;">
        <tr>
        <%
           Integer id = Integer.parseInt(request.getParameter("id"));
           out.print(  "  <td>EmployeeId:</td><td><input type=\"number\" name=\"id\" value=\""+id+"\" readonly></td> "  );
          %>
         </tr>
         <tr>
          <%
           String name = request.getParameter("name");
           out.print(  "  <td>Name:</td><td><input type=\"text\" name=\"name\" value=\""+name+"\"></td> "  );
          %>
         </tr>
          <tr>
          <%
           String email = request.getParameter("email");
           out.print(  "  <td>Email:</td><td><input type=\"text\" name=\"email\" value=\""+email+"\"></td> "  );
          %>
         </tr>
         <tr>
           <%
           Integer age = Integer.parseInt(request.getParameter("age"));
           out.print(  "  <td>Age:</td><td><input type=\"text\" name=\"age\" value=\""+age+"\"></td> "  );
          %>
         </tr>
       </table>
       <input  style="margin-left:40%;" type="submit" value="Update">
	  </form>
	
</div>
</div>
  </div>
  <footer>&copy 2011 Metacube Software Pvt. Ltd. All rights reserved.
  </footer>
</body>
</html>