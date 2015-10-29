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
				<li ><a href="ContactusController">Contact Us</a></li>
				
			</ul>
		</nav>  
	<form action="LoginController" method="post">
			<div id="maincontainer"  >
			<img src="images.jpg" style="width:65%;height:70%; margin:10px;">
			<div id="login" >
			<h2>Login
			</h2>
			<label>UserId:</label>
			<input type="text" id="userid" name ="userid">
			<br>
			<label>PassWord:</label>
			<input type="text" id="password" name ="password" >
			<br>
			<input type="submit" value="Log In" id="button" >
			<br>
			<label align ="center">New User</label>
			<br>
			<a href="NewUserController" align="center" >(Register here)</a>
			<div >
			<% 
				String message = (String)request.getAttribute("message"); 
				if(message != null) {
					out.println(message);
				}
				
			%>
			</div>
			</div>
			</div>
			</form>
			</body>