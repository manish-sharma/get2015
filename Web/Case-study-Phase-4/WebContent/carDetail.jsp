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
				<li ><a href="Contactus">Contact Us</a></li>
				<li><a href="LogoutController">Log out</a></li>
			</ul>
		</nav>  
		<div id="maincontainer">
			<%			
			List<Vehicle> vehicleList = (List< Vehicle>)request.getAttribute("vehicle");
			int count =1;
			 out.println("<table id=\"table\" >");	
			for (int i = 0; i< vehicleList.size(); i++) {
				Vehicle vehicle = vehicleList.get(i);
					 out.println("<tr>");
					 out.println("<td>" + vehicle.getMake() + "</td>" );
					 out.println("<td>" + vehicle.getModel() + "</td>" );
					 out.println("<td>" + vehicle.getEngineInCC() + "</td>" );
					 out.println("<td>" + vehicle.getFuelCapacity() + "</td>" );
					 out.println("<td>" + vehicle.getMilage() + "</td>" );
					 out.println("<td>" + vehicle.getPrice() + "( Rs.)</td>" );
					 out.println("<td>" + vehicle.getOnRoadPrice() + "</td>" );
					 out.println("<td>" + vehicle.getCreateDTime() + "</td>" );
					 out.println("<td>" + vehicle.getRoadTax() + "</td>" );

						count++;

			}
			
				%>
		 
		</div>
			
			
		<footer>
		</footer>
	</body>
</html>