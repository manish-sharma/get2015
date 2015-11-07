<!DOCTYPE html>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/stylesheet.css" />
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css" />
<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css" />

<%@page session="false" %>
<% HttpSession session=request.getSession(false); %>
</head>
<body>
<!-------------------------------------------image+nav-bar------------------------>
	<div class="container main-image" style="height:auto;">
		<div class="nav_bar">
			<nav class="navbar navbar-default nav_bar_search">
				<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="indexController">
							<span class="brand1">CAR</span>
							<span class="brand2">dekho</span>
						</a>
					</div>

					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav navbar-right">
							<li class = "menu_search"><a href="indexController">Home </a></li>
							<li class = "active menu_search"><a href="#">Login <span class="sr-only">(current)</span></a></li>
								<%if(session!=null){%><li class = "menu_search"><a href="createCar">Create Car</a></li><% }%>
						</ul>
					</div><!-- /.navbar-collapse -->
				</div><!-- /.container-fluid -->
			</nav>
		</div>
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="js/bootstrap.min.js"></script>
	</div>
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="js/bootstrap.min.js"></script>
	<div class="intro">
	<div class="wrapper-outer">
			<div class="row" align="center" style="margin-top:50px;">
				<div class="col-md-12 logo-spell">
					<span style="color:black;">CAR</span><span style="color: rgb(157,211,175);">dekho</span>
				</div>
			</div>
			<div class="row" style="margin-top:30px;">
				<div class="col-md-offset-3 col-md-6" style="padding:25px;">
					<form class="form-horizontal" action = "LoginController" method="post">
						
						<div class="form-group">
						<div>${message}</div>
							<label for="inputEmail3" class="col-md-3 control-label form-label">Email</label>
							<div class="col-md-9">
								<input type="email" class="form-control form-input" name="user_name"id="inputEmail3" placeholder="Email">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-md-3 control-label form-label">Password</label>
							<div class="col-md-9">
								<input type="password" class="form-control form-input" name="password" id="inputPassword3" placeholder="Password">
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-3"></div>
							<div class="col-md-9">
								<div class="checkbox" style="float:left;">
									<label>
										<input type="checkbox"> Remember me
									</label>
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<div class="col-md-offset-3 col-md-9">
								<button type="submit" class="btn btn-default form-input col-md-3 col-sm-3 col-xs-3" style="float:right;">Login</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div class="container-fluid footer">
		<div class="container" style="margin-top:2%; text-align:center;">
			<div class = "row" style="margin-top:1%;">
				<div class="col-md-3">About Us</div>
				<div class="col-md-3">FAQs</div>
				<div class="col-md-3">Advertise with Us</div>
				<div class="col-md-3">Careers</div>
			</div>
			<div class = "row" style="margin-top:1%;">
				<div class="col-md-3">Feedback</div>
				<div class="col-md-3">Customer Care</div>
				<div class="col-md-3">Privacy Policy</div>
				<div class="col-md-3">Tips And Advice</div>
			</div>
			<div class = "row" style="margin-top:1%;">
				<div class="col-md-3">Contact Us</div>
				<div class="col-md-3">Terms and Conditions</div>
				<div class="col-md-3">Car Accessories</div>
				<div class="col-md-3">Forum</div>
			</div>
		</div>
	</div>
	<div class="container-fluid footer-line">
		<div class="container">
			<div class="copyright">Copyright 2015 Powered By Metacube Software Pvt. Ltd. All Rights Reserved.</div>
		</div>
	</div>
</body>
</html>