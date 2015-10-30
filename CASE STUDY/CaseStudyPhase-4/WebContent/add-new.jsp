<!DOCTYPE html>
<html lang="en">
  <head>
    
    <title>Car Dekho</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">


   
  </head>
	
	
	
  <body style="background-color: black">

  <%@ include file="menu.jsp" %>
  
  <% StringBuffer url = request.getRequestURL();
  	request.setAttribute("url", url);
  %>

   
    <section class="search-section">
		<div class="container">
		<form action="AddNewCar" method="post">
			<div class="row" style="margin: 0;">
				<div class="col-md-6 car-title">
					<h1>Enter Car Make</h1>
				</div>
				<div class="col-md-6 car-title">	
					<h1><input type="text" placeholder="Car Name" name="make" style="margin-left:100px;background-color: transparent;"></h1>
				</div>
			</div>
			<div class="row" style="margin: 0;">
				<div class="col-md-6 car-title">
					<h1>Enter Car Model</h1>
				</div>
				<div class="col-md-6 car-title">	
					<h1><input type="text" placeholder="Car Name" name="model" style="margin-left:100px;background-color: transparent;"></h1>
				</div>
			</div>
			<div class="row" style="margin: 0;">
				<div class="col-md-2 car-spec">
					<h3>KMPL</h3>
					<p><input type="number" name="mileage" placeholder="Milage"></p>
				</div>
				<div class="col-md-2 car-spec">
				<h3>ENGINE</h3>
					<p><input type="number" name="engine_cc" placeholder="Engine CC"></p>
				</div>
				<div class="col-md-2 car-spec">
				<h3>Road tax</h3>
					<p><input name="road_tax" type="number" placeholder="BHP"></p>
				</div>
				<div class="col-md-2 car-spec">
				<h3>Price</h3>
					<p><input type="number" name="price" placeholder="Seats"></p>
				</div>
				<div class="col-md-2 car-spec">
				<h3>FUEL</h3>
					<p><input name="fuel_capacity" type="number" placeholder="Fuel Type"></p>
				</div>
				<div class="col-md-2 car-spec">
				<h3>EMI</h3>
					<p><input name="emi" type="number" placeholder="EMI"></p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12" style="text-align: center;">
					 <input type="submit" class="btn btn-success btn-lg" value="Add New Car"></input>
				</div>
			</div>
			</form>
		</div>
	</section>
    <footer class="footer">
      <div class="container">
        <p>Copyright @ 2015 : Made By Sanjay Nainani</p>
      </div>
    </footer>
	<script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
   
    </body>
    </html>