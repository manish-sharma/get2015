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
			</ul>
			</nav> 
			<form id="contact_form" action="ContactusController" method="POST" enctype="multipart/form-data" align="center" style="border:2px solid black; width:30% ;margin-left:35%;margin-top:7%;">
	<div class="row">
		<label for="name">*Your name:</label>
		<input id="name" class="input" name="name" type="text" value="" size="30" /><br />
	</div>
	<div class="row">
		<label for="email">*Your email:</label>
		<input id="email" class="input" name="email" type="email" value="" size="30" /><br />
	</div>
	<div class="row">
		<label for="message">*Your message:</label><br />
		<textarea id="message" class="input" name="message" rows="7" cols="30"></textarea><br />
	</div>
	<input id="button" type="submit" value="Send email" onclick="sendMail()" />
</form>		
<footer>
		</footer>
	</body>
</html>