<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel ="stylesheet" href ="css/index.css">
</head>
<%!
	String loginLogout = "";
	String create = "";
	String flag = "";
	String search = "";
%>
<%
	if(session.getAttribute("user") == null) {
		loginLogout = "Login";
		create = "";
		flag = "";
		search = "Search";
	}
	else {
		loginLogout = "Logout";
		create = "Create";
		flag = "/";
		search = "View";
	}
%>
<body>
<header>
	<div id = "logo"><img src = "images/car logo2.png" alt = "Car Logo" /></div>
	<div id = "logo2"><img src = "images/logo3.jpg" alt = "Car Logo" /></div>
	<div id = "login">
		<a href = "LoginServlet"><%=loginLogout%></a> /
		<a href = "Search"><%=search %></a> <%=flag%>
		<a href = "Create"><%=create %></a></div>
		<div id = "socialMedia">	
			<ul>
				<li class = "socialMediaLogo"><a href ="javascript:;"><img src = "images/facebook.png"/></a></li>
				<li class = "socialMediaLogo"><a href ="javascript:;"><img src = "images/twitter.png"/></a></li>
				<li class = "socialMediaLogo"><a href ="javascript:;"><img src = "images/linkedIn.png"/></a></li>
				<li class = "socialMediaLogo"><a href ="javascript:;"><img src = "images/googlePlus.png"/></a></li>
			</ul>
		</div>
	</header>
	<nav>	
		<ul>
			<li class = "navBar"><a href = "Home">Home</a></li>
			<li class = "navBar"><a href = "AboutUs">About Us</a></li>
			<li class = "navBar"><a href = "ContactUs">Contact Us</a></li>
			<li class = "navBar"><a href = "Careers">Careers</a></li>		
		</ul>
	</nav>
		<div class = "section">
		<div id ="Intro">
		<h1>
		It's Easy.
		<br>
		Let's Go..
		</h1>
	</div>
	<div id= "aboutUs">
		<h3>
			New Arrivals
		</h3>
		<marquee onmouseover="stop();"  onmouseout="start();">
			<div class ="newArrival"><img src="images/car1.jpg" width ="200" height="200"><br>Creta</a></div>
			<div class ="newArrival"><img src="images/car2.jpg" width ="200" height="200"><br>Porsche</a></div>
			<div class ="newArrival"><img src="images/car3.jpg" width ="200" height="200"><br>Benz2.3</a></div>
			<div class ="newArrival"><img src="images/logo3.jpg" width ="200" height="200"><br>Amaze</a></div>
		
		</marquee>
	</div>
	</div>
	
	<footer>
		<p> &copy Copyright 2015. All Rights Reserved.</p>
		<ul>
			<li class = "navBar"><a href = "Home">Home</a></li>
			<li class = "navBar"><a href = "AboutUs">About Us</a></li>
			<li class = "navBar"><a href = "ContactUs">Contact Us</a></li>
			<li class = "navBar"><a href = "Careers">Careers</a></li>		
		</ul>
	</footer>
</body>
</html>