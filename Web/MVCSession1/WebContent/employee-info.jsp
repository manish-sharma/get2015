<%@page import="com.model.Employee"%>
<%@page import="com.helper.EmployeeCache"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
  <head>
  

    <title>Metacube</title>

    
    <link href="css/bootstrap.min.css" rel="stylesheet">

   
   
  <style type="text/css">
  	
  
  </style>
  </head>

  <body >

    <nav class="navbar navbar-default">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Metacube</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="HomeServlet">Home</a></li>
            <li><a href="RegistrationFormServlet">Registration</a></li>
            <li><a href="ListController">Employee List</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

	<div class = "container">
		<div class = "row">
			<div class="col-md-8 col-md-offset-2">
			  <h2>Employee Info</h2>
			  <p>Info of employee who are the part of metacube.</p>            
			  <table class="table table-bordered table-hover">
			    <thead>
			      <tr>
			        <th>Id</th>
			        <th>Name</th>
			        <th>Email</th>
			        <th>Date Of Registration</th>
			      </tr>
			    </thead>
			    <tbody>
					<%			
						Employee employee =(Employee)request.getAttribute("employee");
						out.println("<tr>");
						out.println("<td>" + employee.getId() + "</td>" );
						out.println("<td>" + employee.getName() + "</td>" );
						out.println("<td" + employee.getEmail() + "</td>" );
						out.println("<td>"+employee.getAge()+"</td>");
						out.println("<td>"+employee.getDateOfRegistration()+"</td>");
						 %>
				</tbody>
			  </table>
			</div>
		</div>
	</div>





	<script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
   
</html>
