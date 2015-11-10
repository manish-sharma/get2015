<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import = "java.util.*,com.cardekho.model.*;"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="css/index.css">
</head>

<body>
	<%@ include file="Header.jsp"%>
	<div class="section">
		<div id="Intro">
			<h1>
				It's Easy. <br> Let's Go..
			</h1>
		</div>
		<div id="aboutUs">
			<h3>New Arrivals</h3>
			<marquee onmouseover="stop();" onmouseout="start();">
			<%
				if(request.getAttribute("carList") == null) {
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("Home");
					requestDispatcher.forward(request, response);
				}
			%>
			<% List<Vehicle> vehicleList = (List<Vehicle>)request.getAttribute("carList");
				Iterator<Vehicle> vehicleListIterator = vehicleList.iterator();
				if(vehicleList.size() != 0) {
					while(vehicleListIterator.hasNext()) {
						Vehicle vehicle = vehicleListIterator.next();
				%>
				<div class="newArrival">
					<img src="images/<%=vehicle.getImagePath()%>" width="200" height="200"><br><%=vehicle.getModel() %>
				</div>
				<% }} %>
			</marquee>
		</div>
	</div>
	<%@ include file="Footer.jsp"%>
</body>
</html>
