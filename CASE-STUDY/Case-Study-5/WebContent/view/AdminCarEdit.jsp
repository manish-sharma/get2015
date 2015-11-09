<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.cardekho.model.Vehicle, com.cardekho.model.Car"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Car Edit</title>
<link rel="styleSheet" href="/Case-Study-5/css files/Edit.css">
</head>
<body>
	<% Car vehicle = (Car)request.getAttribute("vehicle");%>
	<div class="wrapper">
		<header>
			<img src="images/logo.png" alt="car dekho logo" width="400px"
				height="100px" align="left">
			
		</header>
		<aside>
			<ul>
				<li><a href="/Case-Study-5/CreateCarController">CREATE </a></li>
				<li><a href="/Case-Study-5/AdminSearchController">SEARCH</a></li>
				<li><a href="/Case-Study-5/LogOutController">LOGOUT</a></li>
			</ul>
		</aside>
			<div id="heading"><h2><%out.println( vehicle.getModel()); %></h2></div>
	<section>
	<form method="post" action="/Case-Study-5/AdminEditController?vehicleId=<%out.println(vehicle.getId());%>">
		
		   <label class="left">Make<span id="span">*</span></label> 
			<input class="input" type="text" value='<%out.println(vehicle.getMake());%>'  pattern="[a-zA-Z ]+" name="make" required="required"><br><br><br> 
		
			<label class="left">Model<span id="span">*</span></label> 
			<input class="input" type="text" name="model" value='<%out.println(vehicle.getModel());%>' disabled="disabled"><br><br><br>
		
	 		<label class="left">EngineInCC<span id="span">*</span></label> 
	 		<input class="input" type="number" name="engineInCc" value=<%out.println(vehicle.getEngineInCC());%> min="500" max="4000" required="required"><br><br> <br>
			 
	 		<label class="left">FuelCapacity<span id="span">*</span></label>
	  		<input class="input" type="number" name="fuelCapacity" value=<%out.println(vehicle.getFuelCapacity());%> min="25" max="200" required="required"><br><br><br>
			 
	 		<label class="left">Mileage<span id="span">*</span></label>
	 		<input class="input" type="number" name="mileage" value=<%out.println(vehicle.getMilage());%> min="1" max="100" required="required"><br><br><br>
			 
			 <label class="left">Accessory Kit<span id="span">*</span></label> 
	  		<input class="input" type="text" name="accessorykit" value='<%out.println(vehicle.getAccessoryKit());%>' pattern="[a-zA-Z_ ,]+" required="required"> <br><br><br>
			 
			<label class="left">Ex-Showroom Price<span id="span">*</span></label>
			<input class="input" type="number"  name="price" value=<%out.println(vehicle.getPrice());%> min="100000" max="100000000" required="required"><br><br><br>
			
			<label class="left">Image<span id="span">*</span></label> 
			<input class="input" type="file" name="imageUrl" value='<%out.println(vehicle.getImageUrl());%>' required="required"  ><br><br><br>
		 	 
		 	 <input class="button" type="submit" value="submit">
		</form>
		</section>

	
	<footer><label>Copyright &copy 2015.&nbsp; All rights reserved.</label></footer>
	</div>
</body>
</html>