<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.cardekho.model.Vehicle"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel ="stylesheet" href ="css/SearchResult.css">
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
	<div id = "logo2"><img src = "images/car logo.jpg" alt = "Car Logo" /></div>o" /></div>
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
	<% 
		List<Vehicle> vehicleList = (List<Vehicle>)request.getAttribute("vehicleList");
		Iterator vehicleListIterator = vehicleList.iterator();
		if(vehicleList.size() != 0) {
			while(vehicleListIterator.hasNext())
			{
				Vehicle vehicle = (Vehicle)vehicleListIterator.next();
		
 	%>
		<div id ="searchResult">
			<%System.out.println("1images/"+vehicle.getImagePath());%>
			<img src = 'images/<%=vehicle.getImagePath()%>' alt = <%=vehicle.getMake()+"-"+vehicle.getModel() %> width = "450" height = "250"/>
			<p><b> Make :</b><span id = "makeSearchResult"><%=vehicle.getMake() %></span></p>
			<p><b> Model :</b><span id = "modelSearchResult"><%= vehicle.getModel() %></span></p>
			<p><b> Ex ShowRoom Price :</b><span id = "priceSearchResult"><%=vehicle.getPrice()+"/-" %></span></p>	
			<p><b> Created Time :</b><span id = "timeSearchResult"><%=vehicle.getCreatedTime() %></span></p>	
			<a href = "FullSpecification?id=<%=vehicle.getId()%>">View Full Specification</a><br/>
		</div>
		<% }
		}
		else { %>
			<h3> No Result Found For given Search</h3>
			<% }
		%>
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