<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Dekho</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a href="index.jsp" class="navbar-brand">myFirstCar</a>
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        			<span class="icon-bar"></span>
        			<span class="icon-bar"></span>
        			<span class="icon-bar"></span> 
      			</button>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="index.jsp">Home</a></li>
					<li><a href="#">About Us</a></li>
					<li><a href="#">Career</a></li>
					<li><a href="#">Contact Us</a></li>
				</ul>
				
				<ul class="nav navbar-nav navbar-right right">
					<li><a href="#" data-toggle="modal" data-target="#signup"><span	class="glyphicon glyphicon-user"></span> Sign Up</a></li>
					<li><a href="#" data-toggle="modal" data-target="#login"><span class="glyphicon glyphicon-log-in"></span>Login</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="row" style="margin-top: 50px;">
		<div class="col-md-12 text-center">
		<h1>${message}</h1>
		<h3>${email }</h3>
	</div>
	</div>
	
	<div id="signup" class="modal fade" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Sign Up</h4>
				</div>
				<form action="SignUpUser" method="post" class="form"role="form">
					<div class="modal-body">
						<div>
							Already have account <a href="#" data-toggle="modal" data-target="#login">Login Now</a>
						</div>
						<div class="form-group">
							<label for="firstname" class="control-label">Enter First Name</label>
							<input type="text" name="firstName" id="firstname" class="form-control" placeholder="Enter FirstName" required>
						</div>
							<div class="form-group">
							<label for="lastname" class="control-label">Enter Last Name</label>
							<input type="text" name="lastName" id="lastname" class="form-control" placeholder="Enter LastName" required>
						</div>
						<div class="form-group">
							<label for="password" class="control-label">Enter Password</label>
							<input type="password" name="password" id="password" class="form-control" placeholder = "Enter Password">
						</div>
						<div class="form-group">
							<label for="cpassword" class="control-label">Confirm Password</label>
							<input type="password" name="cPassword" id="cPassword" class="form-control" placeholder = "Confirm Password">
						</div>
						<div class="form-group">
							<label for="email" class="control-label">Enter Email</label>
							<input type="email" name="emailId" id="email" class="form-control" placeholder="Enter Email">
						</div>
						<div class="checkbox">
							<b>Gender</b>
							<label class="control-label checkbox-inline"><input type="radio" name="gender" value="MALE" id="male" required> 
							Male</label>
							<label class="control-label checkbox-inline"><input type="radio" name="gender" value="FEMALE" id="female" required> 
							Female</label>
						</div>
						<div class="form-group">
							<label for="pNumber" class="control-label">Enter Phone Number</label>
							<input type="text" name="phoneNo" id="pNumber" class="form-control" placeholder="Enter Phone Number" required>
						</div>
						<div class="form-group">
							<label for="address" class="control-label">Enter Address</label>
							<textarea name="address" class="form-control"id="address" placeholder="Enter Address" required></textarea>
						</div>
						<div class="row">
							<input type="Submit" class="btn btn-success col-lg-offset-2 col-lg-3"Value="Sign Up">
							<input type="reset" class="btn btn-danger col-lg-offset-2 col-lg-3"value="Reset">
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	
	<!--  Login Model Begin -->
	<div id="login" class="modal fade" role="model">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Login</h4>
				</div>
				<form action="Login" method="POST" class="form" role="form">
					<div class="modal-body">
						<div class="form-group">
							<label for="username" class="control-label">Username</label>
							<input type="text" name="emailId" class="form-control" placeholder="Enter Email" required>
						</div>
						<div class="form-group">
							<label for="password" class="form-label">Password</label>
							<input type="password" name="password" class="form-control" placeholder="Enter Password" required>
						</div>
						<div>
							Don't have account <a href="#" data-toggle="modal" data-target="#signup">Signup Now</a>
						</div>
						<div class="form-group row">
							<input type="submit" class="btn btn-success col-lg-offset-4 col-lg-3" value="Login">
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	
<div class="navbar navbar-inverse navbar-fixed-bottom"></div>
			
</body>
</html>