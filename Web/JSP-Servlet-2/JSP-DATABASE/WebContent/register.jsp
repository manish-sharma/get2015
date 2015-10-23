 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
  <head>
  

    <title>Metacube</title>

    
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <style type="text/css">
    	.register{
    	margin-top: 100px;
    	text-align: center;
    	
    	}
    	
    	
    </style>
  </head>

  <body>

   <%@ include file="menu.jsp" %>

    <section class="rogin">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h3>Please Login</h3>
				</div>
			</div>
			<form action="RegistrationController" method="post">
			<div class="row">
				<div class="col-md-12">
					<input type="text" class="form-group" required="required" placeholder="Name" name="user-name">
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<input type="Email" class="form-group" required="required" placeholder="Email" name="email">
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<input type="password" class="form-group" required="required" placeholder="Password" name="password">
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<input type="submit" class="btn btn-success btn-sm" value="Submit">
					<a href="index.jsp" class="btn btn-warning btn-sm">Login</a>
				</div>			
			</div>
			<label>${error_label}</label>
			
			</form>
		</div>
	</section>
      
   


  
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
   
</html>
