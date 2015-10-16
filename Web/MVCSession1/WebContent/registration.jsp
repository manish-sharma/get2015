<%@page import="com.model.Employee"%>
<%@page import="com.helper.EmployeeCache"%>
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

  <body>
 <%
 
 %>
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
            <li><a href="HomeServlet">Home</a></li>
            <li class="active"><a href="RegistrationFormServlet">Registration</a></li>
            <li><a href="ListController">Employee List</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

	<section style="margin-top: 100px;">
	<%! 
			String id = "";
			String name = "";
			String email = "";
			String idValue = "";
			String age = "";
			String readonly = "";
			String buttonValue= "";
	%>
	<%					
			id = (String)request.getAttribute("employeeId");
			if(id != "") {
				EmployeeCache employeeCache = EmployeeCache.getInstance();
				Employee employee = employeeCache.getEmployeeForId(Integer.parseInt(id));
				name = name + employee.getName();
				email = email + employee.getEmail();
				idValue = idValue + employee.getId();
				age = age + employee.getAge();
				readonly = "readonly";
				buttonValue = "Update";
			}
			else {
				id = "";
				name = "";
				email = "";
				idValue = "";
				age = "";
				readonly = "";
				buttonValue = "Register";
			}
	%>
	<div class="container" >
		<form action="RegistrationForm" >
		
		<div class="row" style="text-align: center">
			<div class="col-md-6">NAME</div>
			<div class="col-md-6"><input type="text" name="name" id="name" value = '<%=name%>'></div>
		</div>
		<div class="row" style="text-align: center">
			<div class="col-md-6">Email</div>
			<div class="col-md-6"><input type="email" name="email" id="email" value = '<%=email%>'></div>
		</div>
		<div class="row" style="text-align: center">
			<div class="col-md-6 ">Id</div>
			<div class="col-md-6 "><input type="number" name="Id" id="Id" value = '<%=idValue%>' <%=readonly%>></div>
		</div>
		<div class="row" style="text-align: center ">
			<div class="col-md-6 ">Age</div>
			<div class="col-md-6 "><input type="number" name="age" id="age" value = '<%=age%>'></div>
		</div>
		<div class="row" style="text-align: center">
			<div class="col-md-12 "><input type="submit" class="btn btn-lg btn-success" value='<%=buttonValue%>'></div>
			
		</div>
		
		</form>
	</div>
	</section>
	<script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
   
</html>
