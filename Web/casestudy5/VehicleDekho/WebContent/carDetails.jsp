<%@ page language="java" import = "com.metacampus.vehiclemanagement.model.Vehicle" %>
<%@ page language="java" import = "com.metacampus.vehiclemanagement.model.Car" %>
<%@ page language="java" import = "java.util.*" %>
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
</head>
<% HttpSession session=request.getSession(false); %>
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
							<li class = "menu_search"><a href="indexController">Home</a></li>
						<%if(session==null){ %><li class = "menu_search"><a href="LoginController">Login</a></li><%}else{ %>
							<li class = "menu_search"><a href="LoginController?logout=logout">Logout</a></li><%} %>
							<%if(session!=null){ %><li class = "menu_search"><a href="createCar">Create Car</a></li><% }%>
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
						<div class="col-md-12" style="font-size:35px;">
							Car Details
						</div>
					</div>
					<% List<Vehicle> vehicleList = (List<Vehicle>)request.getAttribute("vehicleList");
					System.out.println("if"+vehicleList);
						if(vehicleList.isEmpty()){
							System.out.println("Injsp"+vehicleList);
							%>
							<div class = "row" style = "margin-top:50px;">
								<div class = "col-md-6 col-md-offset-3">
									<div class = "row vehicle-name">
										Sorry, No Car Found!!!
									</div>
								</div>
							</div>
						<%}  else{
							System.out.println("else"+vehicleList);
							for(Vehicle vehicle:vehicleList)
							{
								Car car = (Car)vehicle;
								Float onRoadPrice = car.getPrice() + (car.getPrice()*car.getRoadTax())/100;
						%>
					<div class = "row" style = "margin-top:50px;">
						<div class = "col-md-6 col-md-offset-3">
							<div class = "row vehicle-name">
								<%=vehicle.getMake()%> <%=car.getModel()%>
							</div>
							<div class = "row specification">
								<div class = "col-md-3 vehicle-attribute">EngineInCC</div>
								<div class = "col-md-6"><%=car.getMake()%></div>
							</div>
							<div class = "row specification">
								<div class = "col-md-3 vehicle-attribute">Fuel Capacity</div>
								<div class = "col-md-6"><%=car.getFuelCapacity()%></div>
							</div>
							<div class = "row specification">
								<div class = "col-md-3 vehicle-attribute">Mileage</div>
								<div class = "col-md-6"><%=car.getMileage()%></div>
							</div>
							<div class = "row specification">
								<div class = "col-md-3 vehicle-attribute">AC</div>
								<div class = "col-md-6"><%=car.isAC()%></div>
							</div>
							<div class = "row specification">
								<div class = "col-md-3 vehicle-attribute">Power Steering</div>
								<div class = "col-md-6"><%=car.isPowerSteering()%></div>
							</div>
							<div class = "row specification">
								<div class = "col-md-3 vehicle-attribute">Accessory Kit</div>
								<div class = "col-md-6"><%=car.isAccessoryKit()%></div>
							</div>
							<div class = "row specification">
								<div class = "col-md-3 vehicle-attribute">X-showroom price</div>
								<div class = "col-md-6"><%=car.getPrice()%></div>
							</div>
							<div class = "row specification">
								<div class = "col-md-3 vehicle-attribute">Road Tax</div>
								<div class = "col-md-6"><%=car.getRoadTax()%></div>
							</div>
							<div class = "row specification">
								<div class = "col-md-3 vehicle-attribute">On Road Price</div>
								<div class = "col-md-6"><%= onRoadPrice%></div>
							</div>
							<div class = "row">
								<div class="col-md-offset-3 col-md-9"> 
									<a href = "createCar?id=<%= car.getId()%>"><button class="btn btn-default col-md-3 form-input" style="float:left;">Edit</button></a>
								</div>
							</div>
						</div>
					</div>
					<% }
					}%>
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