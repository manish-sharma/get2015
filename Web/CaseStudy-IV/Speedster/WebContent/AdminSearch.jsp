<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="com.speedster.model.Vehicle"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>
<link rel="stylesheet" href="css/search.css" />
<script src="javascript/Search.js"></script>
</head>
<body>
	<header class="head"> <img id="logo" src="image/logo.jpg" />
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
	<form action="AdminSearchController" method="post">
		<div class='search'>
			<h2>Search</h2>
			<div class="searchOptions">
				<input id='filter' name="filter" type="radio" value="byBudget"
					onclick=search(this.value)>&nbsp;&nbsp;&nbsp;&nbsp;By
				Budget&nbsp;&nbsp;&nbsp;&nbsp; <input id='filter' name="filter"
					type='radio' value="byBrand" onclick=search(this.value)>&nbsp;&nbsp;&nbsp;&nbsp;By
				Brand
			</div>
			<br> <br> <select id="budget" name="budget" disabled>
				<option selected value="Below 20 lac">Below 20 lac</option>
				<option value="Above 20 lac">Above 20 lac</option>
			</select> <br> <br> <br> <select id="brand" name="brand"
				disabled>
				<%
					List<Vehicle> vehicleList = (List) request.getAttribute("brandList");
					if (vehicleList != null) {
						for (Vehicle vehicle : vehicleList) {
							out.println("<option value='" + vehicle.getMake() + "'>"
									+ vehicle.getMake() + "</option>");
						}
					}
				%>
			</select>
			<div class='agree'>
				<input class='animated' type='submit' value='Search'> <a
					class='forgot' href='#'></a>
			</div>
		</div>
	</form>
</body>
</html>