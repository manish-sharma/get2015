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
	<section style="margin-top: 100px;">
		<%					
			Employee employee =(Employee)request.getAttribute("employee");
			%>
		<div class="container" >
			<form action="RegistrationForm" >
			
			<div class="row" style="text-align: center">
				<div class="col-md-6">NAME</div>
				<div class="col-md-6"><input type="text" name="name" id="name" value = "<% out.println(employee.getName()); %>"></div>
			</div>
			<div class="row" style="text-align: center">
				<div class="col-md-6">Email</div>
				<div class="col-md-6"><input type="email" name="email" id="email" value = "<% out.println(employee.getEmail()); %>"></div>
			</div>
			<div class="row" style="text-align: center">
				<div class="col-md-6 ">Id</div>
				<div class="col-md-6 "><input type="number" name="Id" id="Id" disabled value = "<%= employee.getId() %>"></div>
			</div>
			<div class="row" style="text-align: center ">
				<div class="col-md-6 ">Age</div>
				<div class="col-md-6 "><input type="number" name="age" id="age" value = "<%= employee.getAge() %>"></div>
			</div>
			<div class="row" style="text-align: center">
				<div class="col-md-12 "><input type="submit" class="btn btn-lg btn-success" value="Register"></div>
				
			</div>
			
			</form>
		</div>
	</section>
	
	





	<script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
   
</html>
