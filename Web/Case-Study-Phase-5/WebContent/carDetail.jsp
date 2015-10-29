<%@page import="com.model.*"%>
<%@page import="com.helper.*"%>
<%@page import="java.util.*"%>
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
				<li ><a href="ContactusController">Contact Us</a></li>
				<li><a href="LogoutController">Log out</a></li>
			</ul>
		</nav>  
		<div id="maincontainer">
			<%			
			Car car = (Car)request.getAttribute("vehicle");
			int count =1;
			 out.println("<table id=\"table\" >");	
			
					 out.println("<tr>");
					 out.println("<td>" + car.getMake() + "</td>" );
					 out.println("<td>" + car.getModel() + "</td>" );
					 out.println("<td>" + car.getEngineInCC() + "</td>" );
					 out.println("<td>" + car.getFuelCapacity() + "</td>" );
					 out.println("<td>" + car.getMilage() + "</td>" );
					 out.println("<td>" + car.getPrice() + "( Rs.)</td>" );
					 out.println("<td>" + car.getOnRoadPrice() + "</td>" );
					 out.println("<td>" + car.getCreateDTime() + "</td>" );
					 out.println("<td>" + car.getRoadTax() + "</td>" );

						count++;

			
			
				%>
		 
		</div>
			
			
		<footer>
		</footer>
	</body>
</html>