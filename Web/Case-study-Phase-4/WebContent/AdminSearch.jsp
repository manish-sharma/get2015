<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>
		Car Dekho
		</title>
		
		<link href="CSSOfHomePage.css" rel="stylesheet">
		<script src ="JSOfCarDekho.js" type="text/javascript" >
		</script>
	</head>
	<body>
		<header align="center" >
		<div id="header">
		<div class="car">
		</div>
		</div>
		<div id = "head">
			<h2>CAR DEKHO</h2>
		</div>
		</header>
		<nav align="center">
			<ul>
				<li ><a href="HomePageController">Home</a></li>
				<li ><a href="AboutUsController">About Us</a></li>
				<li ><a href="Contactus">Contact Us</a></li>
				<li><a href="LogoutController">Log Out</a></li>
			</ul>
		</nav>  
	<form action="AdminSearchController">
			<div id="maincontainer">
		<div id="searchBox">
		<h1>Search</h1>
		<h3>Your new car at CarDekho</h3>
		<nav align="left">
			<ul>
				<li ><a href="#">New Car</a></li>
				<li ><a href="#">Used Car</a></li>
			</ul>
		</nav> 
		
      <label>Make:</label>
      <input class= "inputForCreate" id="make" name="make"type="text" value="" size="30" required />
      <br>
	 <label>Model:</label>
     <input class= "inputForCreate" id="model" name="model" type="text" value="" size="30" required />
	   <br>
	   <input type="submit" id="button" value="Search" name = "SearchCar">
			</div>
			<footer>
		</footer>
	</body>
</html>