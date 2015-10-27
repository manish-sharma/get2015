<%@page import="com.metacube.carDekho.model.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<link href="StyleSheet.css" rel="stylesheet">
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
		<div class = "leftContainerStatic">
			<%			
			Car vehicle = (Car) request.getAttribute("vehicle");
					out.println("<form >");
					out.println("<table  id=\"table1\">");	
					out.println("<tr  >");
					out.println("<td>" + vehicle.getModel() + "</td>" );
					out.println("<td>" + vehicle.getMake() + "</td>" );			
					out.println("<td>" + vehicle.getPrice() + "*Lac</td>" );
					out.println("<td>" + vehicle.getMilage() + "kmpl</td>" );
					out.println("<td>" + vehicle.getEngineInCC() + "CC</td>" );
					out.println("<td>" + vehicle.getFuelCapacity() + "</td>" );
					out.println("<td>" + vehicle.getRoadTax() + "</td>" );
					out.println("<td>" + vehicle.getAccessoryKit() + "</td>" );
					out.println("<td>" + vehicle.isAC() + "</td>" );
					out.println("<td>" + vehicle.isPowerSteering() + "</td>" );
					out.println("</table></form>");			
				%>
		 
		</div>
			
			
		<footer>
		</footer>
	</body>
</html>