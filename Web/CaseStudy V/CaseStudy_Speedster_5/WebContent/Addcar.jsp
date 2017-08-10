<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Car</title>
<link rel="stylesheet" href="css/addcar.css">
</head>
<body>
	<header class="head">
		<img id="logo" src="..\Homepage\image\logo.jpg" />
		<h1 id="websitename">Speedster</h1>
		<div id="container">
			<input id="toggle" type="checkbox"> <label id="menu_button"
				for="toggle">=</label>
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
		    </c:choose>
			<c:choose>
   			    <c:when test="${not empty currentSessionUser}">
					<li><a href="AdminSearchController">Search</a></li>
				  </c:when>
	            <c:otherwise>
			    	<li><a href="SearchPageController">Search</a></li>
			    </c:otherwise>	   
		    </c:choose>
			<c:choose>
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
		<div id=message>
			<%
	  String message = (String)request.getAttribute("message");
	  if(message!= null) {
		  out.println(message);
	  }
	 %>
		</div>
		<h2>Add new Car</h2>
		<form name="addCarForm" method="post" action="CreateCarServlet">
			<label class="left">Make*</label> <input class="input" type="text"
				placeholder="Company Name" pattern="[a-zA-Z ]+" name="make"
				required="required"><br> <br> <br> <label
				class="left">Model*</label> <input class="input" type="text"
				name="model" placeholder="Model_Name" pattern="[a-zA-Z_]+"
				required="required"><br> <br> <br> <label
				class="left">EngineInCC*</label> <input class="input" type="number"
				name="engineInCc" placeholder="engineInCc" min="500" max="4000"
				required="required"><br> <br> <br> <label
				class="left">FuelCapacity*</label> <input class="input"
				type="number" name="fuelCapacity" placeholder="fuelCapacity"
				min="25" max="200" required="required"><br> <br> <br>
			<label class="left">Mileage*</label> <input class="input"
				type="number" name="mileage" placeholder="mileage" min="1" max="100"
				required="required"><br> <br> <br> <label
				class="left">AC</label>
			<div class="input">
				<input type="radio" name="ac" value="true">available <input
					type="radio" name="ac" value="false">not available
			</div>
			<br> <br> <br> <label class="left">Accessory
				Kit</label> <input class="input" type="text" name="accessorykit"
				placeholder="Accessory Kit" pattern="[a-zA-Z_ ,]+"> <br>
			<br> <br> <label class="left">Power Steering</label>
			<div class="input">
				<input type="radio" name="powerSteering" value="true">available
				<input type="radio" name="powerSteering" value="false">not
				available
			</div>
			<br> <br> <br> <label class="left">Ex-Showroom
				Price*</label> <input class="input" type="number" name="price"
				placeholder="exShowroomPrice" min="100000" max="100000000"
				required="required"><br> <br> <br> <label
				class="left">Image<span id="span">*</span></label> <input
				class="input" type="file" name="imageURL" placeholder="Select Image"
				required="required"><br> <br> <br> <input
				class="submit" type="submit" name="submit">

		</form>
	</div>

</body>
</html>