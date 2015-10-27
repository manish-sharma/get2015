<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><html>
<html>
	<head>
		<title>
			Home
		</title>
		<link rel="stylesheet" href="carDekho.css" type="text/css">
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
			<a class = "button" href = "ContactUsController">Contact Us</a>
			</div>
		</div>
		<div class = "leftContainer">
		<div id = "ContactUs">
		</div>
		<h2>Latest Cars</h2>
		<h3>1.Datsun GO  </h3>  <h3>   Rs.-3.8 - 4.9  Lac*</h3><br>
		<h3>2.Volkswagen Vento  </h3>  <h3>   Rs.7.8 - 11.9  Lac*</h3><br>
		<h3>3.Volkswagen Polo </h3>  <h3>   Rs.-5.3 - 9.4  Lac*</h3>
		</div>
	</body>
</html>