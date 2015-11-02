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
							<li class="active menu_search"><a href="indexController">Home <span class="sr-only">(current)</span></a></li>
							<li class = "menu_search"><a href="LoginController?logout=logout">Logout</a></li>
							<li class = "menu_search"><a href="createCar">Create Car</a></li>
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
					Add Car Details
				</div>
			</div>
			<%! 
				String make = "";
				String model = "";
				String engineInCC = "";
				String fuelCapacity = "";
				String Mileage = "";
				String AC = "";
				String powerSteering = "";
				String accessoryKit = "";
				Float price;
				Float roadTax;
				Float onRoadPrice;
				String submitValue = "create";
				String url = "";
			%>
			<% 
				List<Vehicle> vehicleList = (List<Vehicle>)request.getAttribute("vehicleList");
			 	System.out.print("vehicle list is "+vehicleList);
				if(vehicleList != null){
					System.out.println("inif");
					System.out.println(vehicleList);
			
					System.out.println(vehicleList);
					for(Vehicle vehicle : vehicleList) {
						Car car = (Car)vehicle;
						url = "createCar?id=" + car.getId();
						make = car.getMake();
						model = car.getModel();
						engineInCC = car.getEngineiInCC();
						fuelCapacity = "" + car.getFuelCapacity();
						Mileage = car.getMileage();
						if(car.isAC()){
							AC = "Yes";
						}
						else {
							AC = "No";
						}
						if(car.isPowerSteering()){
							powerSteering = "Yes";
						}
						else {
							powerSteering = "No";
						}
						if(car.isAccessoryKit()){
							accessoryKit = "Yes";
						}
						else {
							accessoryKit = "No";
						}
						price = car.getPrice();
						roadTax = car.getRoadTax();
						onRoadPrice = price + (price*roadTax)/100;
						submitValue = "update";
					}
				}
				else {
					url = "createCar";
					make = "";
					model = "";
					engineInCC = "";
					fuelCapacity = "";
					Mileage = "";
					AC = "";
					powerSteering = "";
					accessoryKit = "";
					price = 0f;
					roadTax = 0f;
					onRoadPrice = 0f;
					submitValue = "create";
				}
				%>
			<div class="row" style="margin-top:30px;">
				<div class="col-md-offset-3 col-md-6" style="padding:25px;">
					<form class="form-horizontal" action = "<%= url%>" method = "post">
						<div class="form-group">
							<label for="exampleInputName2" class="col-md-3 control-label form-label">Make</label>
							<div class="col-md-9">
								<input type="text" class="form-control form-input" id="make" name="make" placeholder="Make" required value = "<%= make%>">
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-md-3 control-label form-label">Model</label>
							<div class="col-md-9">
								<input type="text" class="form-control form-input" id="model" name="model" placeholder="Model" required value = "<%= model%>">
							</div>
						</div>
						<div class="form-group">
							<label for="date" class="col-md-3 control-label form-label">EngineInCC</label>
							<div class="col-md-9">
								<input type="text" class="form-control form-input" id="engineInCC" name="engineInCC" placeholder="engineInCC" required value = "<%= engineInCC%>">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-md-3 control-label form-label">Fuel Capacity</label>
							<div class="col-md-9">
								<input type="number" class="form-control form-input" id="fuelCapacity" name="fuelCapacity" placeholder="fuelCapacity" required value = "<%= fuelCapacity%>">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-md-3 control-label form-label">Mileage</label>
							<div class="col-md-9">
								<input type="text" class="form-control form-input" id="mileage" name="mileage" placeholder="mileage" required value = "<%= Mileage%>">
							</div>
						</div>
						<div class="form-group">
							<label for="number" class="col-md-3 control-label form-label">AC</label>
							<div class="col-md-9">
								<input type="text" class="form-control form-input" id="AC"  name="AC" placeholder="AC" list="AC-list" required value = "<%= AC %>" />
									<datalist id="AC-list" >
									   <option value="Yes">
									   <option value="No">
									</datalist>
							</div>
						</div>
						<div class="form-group">
							<label for="number" class="col-md-3 control-label form-label">Power Steering</label>
							<div class="col-md-9">
								<input type="text" class="form-control form-input" id="power-steering" name="power-steering" placeholder="Power Steering" list="PS-list"  required value = "<%= powerSteering%>"/>
									<datalist id="PS-list" >
									   <option value="Yes">
									   <option value="No">
									</datalist>
							</div>
						</div>
						<div class="form-group">
							<label for="number" class="col-md-3 control-label form-label">Accessory Kit</label>
							<div class="col-md-9">
								<input type="text" class="form-control form-input" id="accessory-kit" name="accessory-kit" placeholder="Accessory Kit" list="AK-list" required value = "<%= accessoryKit%>" />
									<datalist id="AK-list" >
									   <option value="Yes">
									   <option value="No">
									</datalist>
							</div>
						</div>
						<div class="form-group">
							<label for="number" class="col-md-3 control-label form-label">X-showroom price</label>
							<div class="col-md-9">
								<input type="number" class="form-control form-input" id="ex-showroom-price" name="ex-showroom-price" placeholder="ex-showroom price" required value = "<%= price%>">
							</div>
						</div>
						<div class="form-group">
							<label for="number" class="col-md-3 control-label form-label">Road Tax</label>
							<div class="col-md-9">
								<input type="number" class="form-control form-input" id="roadTax" name="roadTax" placeholder="roadTax" required value = "<%= roadTax%>">
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-offset-3 col-md-9"> 
								<button type="submit" class="btn btn-default col-md-3 form-input" style="float:right;"> <%= submitValue%></button>
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