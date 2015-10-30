 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
  <head>
  

    <title>Metacube</title>

    
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <style type="text/css">
    	.login{
    	margin-top: 100px;
    	text-align: center;
    	
    	}
    	
    	
    </style>
  </head>

  <body>
<%@ include file="menu.jsp" %>

    <section class="login">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h3>Please Login</h3>
				</div>
			</div>
			<form action="LoginController" method="post">
			<div class="row">
				<div class="col-md-12">
					<input type="text" class="form-group" required="required" placeholder="User name" name="user-name">
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
				</div>			
			</div>
			
			</form>
			
			<div class="row">
				<div class="col-md-12">
					<label>${error_label}</label>
				</div>
			</div>
		</div>
	</section>
      
   


  
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
   
</html>
