<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="/CaseStudyPhase4/CSS/istyle.css" type="text/css"/>
		<title>Create Car</title>
		<style>
			
  			
		</style>
	</head>
	<body>
		<main>
			<header>
				<img  src="/CaseStudyPhase4/images/logo.png" alt="car dekho logo" width="200px" height="58px" />
			</header>
			<section>
				<p>Add New Car</p>
				<center>
				<div id="message">
					<% 
						String message = (String)request.getAttribute("message"); 
						if(message != null) {
							out.println(message);
						}
					%>
		        </div>
		        </center>

				<form name="createCarForm"  action="/CaseStudyPhase4/CreateCarController" method="post">
 	
					<label class="left">Make*</label> 
					<input class="input" type="text" placeholder="Company Name" pattern="[a-zA-Z ]+" name="make" required="required"><br><br><br> 
			
					<label class="left">Model*</label> 
					<input class="input" type="text" name="model" placeholder="Model_Name" pattern="[a-zA-Z_]+" required="required"><br><br><br>
		
			 		<label class="left">EngineInCC*</label> 
			 		<input class="input" type="number" name="engineInCC" placeholder="engineInCc" min="500" max="4000" required="required"><br><br> <br>
			 
			 		<label class="left">FuelCapacity*</label>
			  		<input class="input" type="number" name="fuelCapacity" placeholder="fuelCapacity" min="25" max="200" required="required"><br><br><br>
			 
			 		<label class="left">Mileage*</label>
			 		<input class="input" type="number" name="milage" placeholder="mileage" min="1" max="100" required="required"><br><br><br>
			 
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
			 
			 		<label class="left">Ex-Showroom Price*</label>
			 		<input class="input" type="number"  name="price" placeholder="exShowroomPrice" min="100000" max="100000000" required="required"><br><br><br>
			
			 		<input class="submit" type="submit" name="submit" >
				</form>
			</section>
			<footer><label>Copyright &copy 2015.&nbsp All rights reserved.</label></footer>
		</main>
	</body>
</html>