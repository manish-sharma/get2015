<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/login.css" />
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<header class="head">
		<img id="logo" src="image\logo.jpg" />
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
			</div>
		</div>
	</header>
	<form action="LoginServlet" method="post">
		<div class="login">
			<h2>Login</h2>
			<input name='username' placeholder='Username' type='text'> <input
				id='pw' name='password' placeholder='Password' type='password'>
			<input class='animated' type='submit' value='Login'>
		</div>
	</form>
	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
</body>
</html>