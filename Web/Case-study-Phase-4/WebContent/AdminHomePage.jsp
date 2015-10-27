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
	<form action="AdminController">
			<div id="maincontainer">
		<div id="searchBox">
		<h1>Search</h1>
		<h3>Your new car at CarDekho</h3>
          <input type="submit" id="button" value="Search car" name = "SearchCar">
          <%if(!(session.getAttribute("user") == null) && ((String)session.getAttribute("user")).equals("admin")) {%>
          <div> <input type="submit" id="button" value="Create Car" name = "CreateCar"></div>
          <%} %>
			</div>
			<div id="slider"><h3>Up Coming Cars</h3></div>
			<div id="login"><h2 >Latest Cars</h2>
			<br>
			<h3>1.Datsun GO</h3>
			<br>
			<h5>3.2 - 4.2 Lac*</h5>
			<br>
			<h3>2.Volkswagen Polo</h3>
			<br>
			<h5>5.3 - 9.4 Lac*</h5>
			<h3>3.Maruti Swift</h3>
			<br>
			<h5>4.6 - 7.3 Lac*</h5>
			</div>
			</div>
			
			</form>
			
		<footer>
		</footer>
	</body>
</html>