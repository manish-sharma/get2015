<%@page import="java.util.List,com.cardekho.model.Vehicle"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Search Result</title>
<link rel="styleSheet" href="css files/UserStyle.css">
</head>
<body>
	<div class="wrapper">
		<header>
			<img src="images/logo.png" alt="car dekho logo" width="400px"
				height="100px" align="left">
		</header>
		<nav>
		<table >
			<% List<Vehicle> vehicleList = (List)request.getAttribute("vehicleList"); 
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
				   out.println("<a href='/CaseStudy4/UserSearchResultController?vehicleId="+vehicle.getId()+"'> View Specifications </a>");
				   out.println("</td>");
				   out.println("</tr>");
				}
			}
			else{
				out.println("<tr><font size='20px' color='red'>Oops there is not any car in this category</font></tr>");
			}
			%>

		</table>
	</nav>
	<footer><label>Copyright &copy 2015.&nbsp; All rights reserved.</label></footer>
	</div>
</body>
</html>