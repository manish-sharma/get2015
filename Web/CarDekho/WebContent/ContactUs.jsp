<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><html>
	<head>
		<title>
			Contact Us
		</title>
		<link rel="stylesheet" href="carDekho.css" type="text/css">
		<script
			src="http://maps.googleapis.com/maps/api/js">
		</script>

		<script>
		function initialize() {
		  var mapProp = {
			center:new google.maps.LatLng(26.4877643, 75.2034173),
			zoom:17,
			mapTypeId:google.maps.MapTypeId.ROADMAP
		  };
		  var map=new google.maps.Map(document.getElementById("googleMap"), mapProp);
		}
		google.maps.event.addDomListener(window, 'load', initialize);
		</script>
	</head>
	<%!
	String loginLogout = "";
	
	%>
	<%
	if(session.getAttribute("user") == null) {
		loginLogout = "Login";	
	}
	else {
		loginLogout = "Logout";		
	}%>
	<body>
		<div class = "header">
			<div class = "logo">
			CarDekho
			</div>
			<div class = "nav">
					<a class = "button" href = "HomeController">Home</a>
					<a class = "button" href = "AboutUsController">About Us</a>
					<a class = "button" href = "LoginPageController"><%=loginLogout %></a>
					<a class = "button" href = "#">Contact Us</a>
			</div>
		</div>
		<div class = "contactUsLeft">
			<div class ="right">
				<h2>Postal address</h2>
				<div id="googleMap" style="width:500px;height:380px;"></div>
					
						<h2>Metacube Software Pvt. Ltd.,<br> Sitapura, Jaipur, Rajasthan</h2>
					
			</div>
           <div class="contactUs">
            	<form id="contact_form" action="" method="POST" >
				<label style = "font-size : 20px;"><b>Mail Us:</b></label><br /><br>
				<label for="name" style = "font-size : 20px;"><b>Your name:</b></label><br />
				<input id="name" class="input" name="name" type="text" value="" size="30" required /><br />
				<label for="email"style = "font-size : 20px;"><b>Your email:</b></label><br />
				<input id="email" class="email" name="email" type="text" value="" size="30" required/><br />
				<label for="message"style = "font-size : 20px;"><b>Your message:</b></label><br />
				<textarea id="message" class="input" name="message" rows="7" cols="30" required></textarea><br />
				<input id="submit_button" type="submit" value="Send email" style = "margin-top : 5px; size=30;font-size : 15px;"/>
           </form>
			</div>
		</div>
	</body>
</html>