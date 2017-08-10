<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Speedster</title>
<link rel="stylesheet" href="css/homepage.css" />
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
	<section id="one" class="sectionstyle">
	<div id="outer" class="slideshow">
		<img class="photo" src="image/1.jpg" alt="" /> <img class="photo"
			src="image/2.jpg" alt="" /> <img class="photo" src="image/3.jpg"
			alt="" />
	</div>
	<div class="inner">
		<header class="major">
		<h2 id="sectionheading">For those whom Speed is the way to live
			life</h2>
		<p id="details">
			Love adrenaline rush & Speed? Well we here at Speedster are here for
			you only.<br>Providing you the world's finest and meanest
			machine under one single place just to appreciate your love for
			Speed.<br>So get set ready and let the Speed be with you
		</p>
		</header>
	</div>
	</section>
</body>

</body>
</html>