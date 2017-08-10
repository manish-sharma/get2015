<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.speedster.model.Vehicle, com.speedster.model.Car"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Car</title>
<link rel="stylesheet" href="css/CarEdit.css" />
</head>
<body>
<% Car vehicle = (Car)request.getAttribute("vehicle");%>
	<header class="head"> <img id="logo" src="image/logo.jpg" />
	<h1 id="websitename">Speedster</h1>
	<div id="container">
		<input id="toggle" type="checkbox"> <label for="toggle">=</label>
		<div class="slide-menu">
			<nav class="menu">
			<li><a href="HomepageController">Home</a></li>
			<c:choose>
				<c:when test="${not empty currentSessionUser}">
					<li><a href="LogoutController">Log Out</a>
				</c:when>
				<c:otherwise>
					<li><a href="LoginServlet">Login</a></li>
				</c:otherwise>
			</c:choose> <c:choose>
				<c:when test="${not empty currentSessionUser}">
					<li><a href="AdminSearchController">Search</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="SearchPageController">Search</a></li>
				</c:otherwise>
			</c:choose> <c:choose>
				<c:when test="${not empty currentSessionUser}">
					<li><a href="Addcar.jsp">Add Car</a></li>
				</c:when>
				<c:otherwise>
				</c:otherwise>
			</c:choose>
			<li><a href="#">About US</a></li>
			</nav>
		</div>
	</div>
	</header>
	<div class="availabel_car">
	 <h2><%out.println( vehicle.getModel()); %></h2>
	 <% System.out.println(vehicle.getId());%>
	 
				<form method="post" action="AdminCarEdit?vehicleId=<%out.println(vehicle.getId());%>">
 	
					<label class="left">Make*</label> 
					<input class="input" type="text" value='<%out.println(vehicle.getMake());%>' pattern="[a-zA-Z ]+" name="make" required="required"><br><br><br> 
			
					<label class="left">Model*</label> 
					<input class="input" type="text" name="model" value='<%out.println(vehicle.getModel());%>' pattern="[a-zA-Z1-9 ]+" required="required"><br><br><br>
		
			 		<label class="left">EngineInCC*</label> 
			 		<input class="input" type="number" name="engineInCc" value=<%out.println(vehicle.getEngineInCC());%> min="500" max="4000" required="required"><br><br> <br>
			 
			 		<label class="left">FuelCapacity*</label>
			  		<input class="input" type="number" name="fuelCapacity" value=<%out.println(vehicle.getFuelCapacity());%> min="25" max="200" required="required"><br><br><br>
			 
			 		<label class="left">Mileage*</label>
			 		<input class="input" type="number" name="mileage" value=<%out.println(vehicle.getMilage());%> min="1" max="100" required="required"><br><br><br>
			 
			 		 <label class="left">Accessory Kit<span id="span">*</span></label> 
	  				 <input class="input" type="text" name="accessorykit" value='<%out.println(vehicle.getAccessoryKit());%>' pattern="[a-zA-Z_ ,]+" required="required"> <br><br><br>
			
			 		<label class="left">Ex-Showroom Price<span id="span">*</span></label>
			        <input class="input" type="number"  name="price" value=<%out.println(vehicle.getPrice());%> min="100000" max="100000000" required="required"><br><br><br>
			 
			         <label class="left">Image<span id="span">*</span></label> 
			         <input class="input" type="file" name="imageUrl" value='<%out.println(vehicle.getImageUrl());%>' required="required"  ><br><br><br>
			  		
			  		<input class="submit" type="submit" name="submit" value="Submit" onclick="goBack()" >
				</form>
		</div>
</body>
</html>