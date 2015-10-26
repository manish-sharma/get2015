<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="styleSheet" href="/CaseStudy4/css files/CreateCarStyle.css">
<title>Create Car</title>
</head>
<body>
	<div class="wrapper">

		<header>
			<img src="/CaseStudy4/images/logo.png" alt="car dekho logo" width="400px"
				height="100px" align="left">
			
		</header>
		
		<aside>
			<ul>
				<li><a href="/CaseStudy4/view/AdminHome.jsp">HOME</a></li>
				<li><a href="/CaseStudy4/LogOutController">LOGOUT</a></li>
			</ul>
		</aside>
	<section>
		
		<div id="message">
			<% 
				String message = (String)request.getAttribute("message"); 
				if(message != null) {
					out.println(message);
				}
			%>
		</div>	
		<form name="createCarForm"  method="post" action="/CaseStudy4/CreateCarController">
			<div id="heading"><h2>CREATE CAR</h2></div>
		    <label class="left">Make<span id="span">*</span></label> 
			<input class="input" type="text" placeholder="Company Name" pattern="[a-zA-Z ]+" name="make" required="required"><br><br><br> 
	
			<label class="left">Model<span id="span">*</span></label> 
			<input class="input" type="text" name="model" placeholder="Model_Name" pattern="[a-zA-Z_]+" required="required"><br><br><br>

	 		<label class="left">EngineInCC<span id="span">*</span></label> 
	 		<input class="input" type="number" name="engineInCc" placeholder="engineInCc" min="500" max="4000" required="required"><br><br> <br>
	 
	 		<label class="left">FuelCapacity<span id="span">*</span></label>
	  		<input class="input" type="number" name="fuelCapacity" placeholder="fuelCapacity" min="25" max="200" required="required"><br><br><br>
	 
	 		<label class="left">Mileage<span id="span">*</span></label>
	 		<input class="input" type="number" name="mileage" placeholder="mileage" min="1" max="100" required="required"><br><br><br>
	 
	 		<label class="left">AC</label>
	 		<div class="input">
	   			<input type="radio" name="ac" value="true">available
	   			<input  type="radio" name="ac" value="false">not available
	 		</div><br><br><br>
	 
	 		<label class="left">Accessory Kit</label>
	  		<input class="input" type="text" name="accessorykit" placeholder="Accessory Kit" pattern="[a-zA-Z_ ,]+"> <br><br><br>
	 
		 	<label class="left">Power Steering</label>
	 		<div class="input">
	   			<input type="radio" name="powerSteering" value="true">available
	   			<input  type="radio" name="powerSteering" value="false">not available
	 		</div><br><br><br>
	 
	 		<label class="left">Ex-Showroom Price<span id="span">*</span></label>
	 		<input class="input" type="number"  name="price" placeholder="exShowroomPrice" min="100000" max="100000000" required="required"><br><br><br>
	 		
	 		<label class="left">Image<span id="span">*</span></label>
	 		<input class="input" type="file"  name="imageURL" placeholder="Select Image"  required="required"><br><br><br>
			 
			 <input class="button" type="submit" >
		</form>
	</section>
	<footer><label>Copyright &copy 2015.&nbsp; All rights reserved.</label></footer>
	</div>
	
</body>
</html>