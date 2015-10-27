<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="com.speedster.model.Vehicle" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search-Result</title>
<link rel="stylesheet" href="css/carsearchlist.css">
</head>
<body>
	<header class="head"> <img id="logo" src="image/logo.jpg" />
	<h1 id="websitename">Speedster</h1>
	<div id="container">
		<input id="toggle" type="checkbox"> <label for="toggle">=</label>
		<div class="slide-menu">
			<nav class="menu">
			<li><a href="HomepageController">Home</a></li>
			<c:choose>
   			    <c:when test="${not empty currentSessionUser}">
   			    	<li><a href="LogoutController">Log Out</a>
   			    </c:when>
   			    <c:otherwise>
			    	<li><a href="LoginServlet">Login</a></li>
			    </c:otherwise>
			 </c:choose>
			<c:choose>
   			    <c:when test="${not empty currentSessionUser}">
					<li><a href="AdminSearchController">Search</a></li>
				  </c:when>
	            <c:otherwise>
			    	<li><a href="SearchPageController">Search</a></li>
			    </c:otherwise>	 
			</c:choose>
			<c:choose>
   			    <c:when test="${not empty currentSessionUser}">
        			<li><a href="Addcar.jsp">Add Car</a></li>
    			</c:when>
  		  		<c:otherwise>
   		 		</c:otherwise>
			</c:choose>
			<li><a href="#">About US</a></li>
			</nav>
		</div>
	</div>
	</header>
	
	<div class="availabel_car">
		<h2 id="heading">Availabel Cars</h2>
		<br>
		<aside>
		<table>
			<%
			List<Vehicle> vehicleList = (List)request.getAttribute("vehicleList");
			if(vehicleList != null){
				for(Vehicle vehicle:vehicleList){
				   out.println("<tr>");
				  out.println("<td><img src='images/"+vehicle.getImageUrl()+"' alt='car image' width='300px' height='200px'></td>");
				   out.println("<td>");
				   out.println(vehicle.getMake());
				   out.println("<br/><br/>"); 
				   out.println(vehicle.getModel());
				   out.println("<br/><br/>");
				   out.println(vehicle.getPrice());
				   out.println("<br/><br/>");
				   out.println("<a href='SearchResultController?vehicleId="+vehicle.getId()+"'> View Specifications </a>");
				   out.println("<br/><br/>");
	               out.println("</td>");
				   out.println("</tr>");
				}
			}
			else{
				out.println("<tr><font size='20px' color='red'>Oops there is not any car in this category</font></tr>");
			}
			%>
		</table>
		</aside>
	</div>
</body>
</html>