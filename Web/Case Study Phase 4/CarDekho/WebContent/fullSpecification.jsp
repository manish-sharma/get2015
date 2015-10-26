<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import = "com.cardekho.model.Car"
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
	<h1 id = "siteTitle">Car Dekho</h1>
	<div id = "logo"><img src = "images/logo1.png" alt = "Car Logo" /></div>
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
			Car vehicle = (Car)request.getAttribute("Vehicle");
		%>
		<div id = "fullSpecificationGrid">
		<label color = "White">${msg}</label>
		<img src = "images/<%=vehicle.getImagePath() %>" alt = "verna" width = "450" height = "250"/>
		<table id = "tableSpecification" border = "2" align = "center">
		<caption><h3>Specifications</h3></caption>
				<tr>
					<th><label>Make : </label></th>
					<td><label id = "fullSpecificationMake"><%=vehicle.getMake() %></label></td>
				</tr>
				<tr class = "rowSpecification">
					<th><label>Model : </label></th>
					<td><label id = "fullSpecificationModel"><%=vehicle.getModel() %></label></td>
				</tr>
				<tr class = "rowSpecification">
					<th><label>EngineCC : </label></th>
					<td><label id = "fullSpecificationEngineCC"><%=vehicle.getEngineCC()+"CC" %></label></td>
				</tr>
				<tr class = "rowSpecification">
					<th><label>Fuel Capacity : </label></th>
					<td><label id = "fullSpecificationFuelCapacity"><%=vehicle.getFuelCapacity()+"L" %></label></td>
				</tr>
				<tr class = "rowSpecification">
					<th><label>Milegae : </label></th>
					<td><label id = "fullSpecificationMileage"><%=vehicle.getMileage()+"km/L" %></label></td>
				</tr>
				<tr class = "rowSpecification">
					<th><label>Ex ShowRoom Price : </label></th>
					<td><label id = "fullSpecificationPrice"><%=vehicle.getPrice()+"/-" %></label></td>
				</tr>
				<tr class = "rowSpecification">
					<th><label>RoadTax : </label></th>
					<td><label id = "fullSpecificationRoadTax"><%=vehicle.getRoadTax()+"%" %></label></td>
				</tr>
				<tr class = "rowSpecification">
					<th><label>AC : </label></th>
					<td><label id = "fullSpecificationRoadTax"><%=vehicle.getAC() %></label></td>
				</tr>
				<tr class = "rowSpecification">
					<th><label>Power Steering : </label></th>
					<td><label id = "fullSpecificationRoadTax"><%=vehicle.getPowerSteering() %></label></td>
				</tr>
				<tr class = "rowSpecification">
					<th><label>Accessory Kit : </label></th>
					<td><label id = "fullSpecificationRoadTax"><%=vehicle.getAccessoryKit() %></label></td>
				</tr>
				<tr class = "rowSpecification">
					<th><label>OnRoad Price : </label></th>
					<td><label id = "fullSpecificationOnRoadPrice"><%=vehicle.calculateOnRoadPrice() %></label></td>
				</tr>
				<%if(session.getAttribute("user") == null) { }else {%>
				<tr>
					<td colspan = "2"><a href = "UpdateCar?id=<%=vehicle.getId()%>" style = "color: black">Edit</a>
				</tr>
				<% } %>
			<table>
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