<%@ page language="java" import = "com.metacampus.vehiclemanagement.model.Vehicle" %>
<%@ page language="java" import = "java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
<%@page session="false" %>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/stylesheet.css" />
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css" />
<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css" />

<script type="text/javascript">
    window.onload = function() {

    	var ex1 = document.getElementById('brand');
    	var ex2 = document.getElementById('budget');

    	ex1.onclick = brandHandler;
    	ex2.onclick = budgetHandler;

    }

    function brandHandler() {
    	document.getElementById('search-by-brand').style.display = "block";
    	document.getElementById('search-by-budget').style.display = "none";
    }
	function budgetHandler() {
    	document.getElementById('search-by-price').style.display = "block";
    	document.getElementById('search-by-brand').style.display = "none";
    }
  </script>
</head>
<body>
<% HttpSession session=request.getSession(false); %>
<!-------------------------------------------image+nav-bar------------------------>
	<div class="container-fluid main-image" style="background-image:url(images/bmw51.jpg);">
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
							<li class = "active menu_search"><a href="indexController">Home <span class="sr-only">(current)</span></a></li>
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
		<div class="tag-line-search">
			<div class="tag-text">Wan't to Buy Car <span>Find Here</span></div>
			<div class="tag-text-caption">Best Place to search, Compare & Book Car</div>
		</div>
	</div>
	<div class="container-fluid search_body">
		<div class = "row">
			<div style = "text-align:center;">
				<form role="form">
					<label class="radio-inline">
					  <input id = "brand" type="radio" name="optradio">By Brand
					</label>
					<label class="radio-inline">
					  <input id = "budget" type="radio" name="optradio">By Budget
					</label>
				</form>
			</div>
		</div>
		<div class="row form-row" id = "search-by-brand">
			<div class="">
				<form class="navbar-form navbar-left" role="search" action = "searchCarController" method = "post">
					<div class="form-group">
						<span class="search_span">Brand</span><input id = "brand" name = "make" class = "form-control" placeholder="Brand" type="text" list="Brand-list" />
							<datalist id="Brand-list" >
							<% if(request.getAttribute("VehicleList") == null){
								RequestDispatcher requestDispatcher = request.getRequestDispatcher("dataListController");
								requestDispatcher.forward(request, response);
							}
							%>
							<% List<Vehicle> vehicleList = (List<Vehicle>)request.getAttribute("VehicleList"); 
							   if(vehicleList!=null)
							   {	   
								Iterator<Vehicle> vehicleListIterator = vehicleList.iterator();
								while(vehicleListIterator.hasNext()) {
							%>
							   <option value="<%=vehicleListIterator.next().getMake()%>">
							<% }} %>
							</datalist>
						<span class="search_span">Model</span><input id = "model" name = "model" class = "form-control" placeholder="Model" type="text" list="Model-list" />
							<datalist id="Model-list" >
							   <option value="i20">
							   <option value="City">
							   <option value="Verna">
							   <option value="mobilio">
							</datalist>
						<input name = "form-type" value = "bymodel" type="hidden"/>
					</div>
					<button type="submit" class="btn btn-default btn-search">Search</button>
					
				</form>
			</div>
		</div>
		<div class="row form-row" id = "search-by-price">
			<div class="">
				<form class="navbar-form navbar-left" role="search" action = "searchCarController" method = "post">
					<div class="form-group">
						<span class="search_span">Select Budget</span><select id = "budget" name = "budget" class = "form-control" >
						   <option value="price BETWEEN 100000 AND 500000">1 Lac - 5 Lac</option>
						   <option value="price BETWEEN 500000 AND 1000000">5 Lac - 10 Lac</option>
						   <option value="price BETWEEN 1000000 AND 2000000">10 Lac - 20 Lac</option>
						   <option value="price BETWEEN 2000000 AND 5000000">20 Lac - 50 Lac</option>
						   <option value="price > 10000000">50 Lac - 1 Crore</option>
						   <option value="">Above 1 Crore</option></select>
						<input name = "form-type" value = "bybudget" type="hidden"/>
					</div>
					<button type="submit" class="btn btn-default btn-search">Search</button>
				</form>
			</div>
		</div>
	</div>
	<div class = "container-fluid display-car-block">
		<div class = "row">
			<div class="col-md-12 upcoming-car"><h2>Upcoming cars in 2015</h2></div>
		</div>
		<div class="container">
			<div class="row">
				<div class = "gallery-tab col-md-12">
					<div class="row">
						<div class="tab-option" id="upcoming"><h4>UPCOMING</h2></div>
						<div class="tab-option" id="latest"><h4>LATEST</h2></div>
						<div class="tab-option" id="popular"><h4>POPULAR</h2></div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 gallery-container">
					<div class="row">
						<div class = "col-md-6 col-lg-6 col-sm-12 col-xs-12 main-car">
							<div class="main-car-image">
								<img src="images/ertiga.jpg" alt="Ertiga Car" >
							</div>
							<div class="main-car-details">
								<div class="car-name">
									<a href="#" title="Maruti Ertiga">Maruti Ertiga</a>
								</div>
								<div class="car-price">
									<span class="fontstyle pricecolorhomepage">Rs 7.5 Lac* </span>
								</div>
								<div class="car-launch-date">
									<span><span>Launch Date:&nbsp;</span><span class="fontstyle">Oct 2015</span></span>
								</div>
								<div class="notify-button">
									<button class="orgbutton" onclick="#">Alert me when Launched</button>
								</div>
							</div>
						</div>
						<div class="col-md-6 col-lg-6 col-sm-12 col-xs-12 side-tab-image">
							<div class="main-car-image">
								<img src="images/creta.jpg" alt="Creta Car" >
							</div>
							<div class="main-car-details">
								<div class="car-name">
									<a href="#" title="Maruti Ertiga">Hyundai Creta</a>
								</div>
								<div class="car-price">
									<span class="fontstyle pricecolorhomepage">Rs 8.6 - 13.6 Lac* </span>
								</div>
								<div class="car-launch-date">
									<span><span>Launch Date:&nbsp;</span><span class="fontstyle">Oct 2015</span></span>
								</div>
								<div class="notify-button">
									<button class="orgbutton" onclick="#">Alert me when Launched</button>
								</div>
							</div>
						</div>
					</div>
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