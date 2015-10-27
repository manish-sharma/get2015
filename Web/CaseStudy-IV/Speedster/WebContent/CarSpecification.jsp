<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.speedster.model.Vehicle"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/ciaz.css" />
<title>Car Specification</title>
</head>
<body>
	<header class="head"> <img id="logo"
		src="C:\Users\.hp\workspace\Seedster\WebContent\Homepage\image\logo.jpg" />
	<h1 id="websitename">Speedster</h1>
	<div id="container">
		<input id="toggle" type="checkbox"> <label id="menu_button"
			for="toggle">=</label>
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
		<h2>Specification</h2>
	<form name="createCarForm"  action="#">
 	<table>
     <% Vehicle vehicle = (Vehicle)request.getAttribute("vehicle");%>
      <tr>
      <td>Make :</td>
      <td><%out.println(vehicle.getMake()); %></td>
     </tr>
     
      <tr>
      <td>Model :</td>
      <td><%out.println(vehicle.getModel()); %></td>
     </tr>
     
     <tr>
      <td>Engine In Cc :</td>
      <td><%out.println(vehicle.getEngineInCC()); %></td>
     </tr>
     
     <tr>
      <td>Fuel Capacity :</td>
      <td><%out.println(vehicle.getFuelCapacity()); %></td>
     </tr>
     
     <tr>
      <td>Mileage :</td>
      <td><%out.println(vehicle.getMilage()); %></td>
     </tr>
     
      <tr>
      <td>Ex-Showroom Price :</td>
      <td><%out.println(vehicle.getPrice()); %></td>
     </tr>
     
     <tr>
      <td>roadTax :</td>
      <td><%out.println(vehicle.getRoadTax()); %></td>
     </tr>
     
      <tr>
      <td>onRoadPrice :</td>
      <td><%out.println(vehicle.getOnRoadPrice()); %></td>
     </tr>
     
    </table>
					
				</form>
		</div>
	</div>
</body>
</html>