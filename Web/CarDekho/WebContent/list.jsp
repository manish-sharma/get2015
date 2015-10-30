<%@page import="com.metacube.carDekho.model.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
	<head>
	<link href="StyleSheet.css" rel="stylesheet">
		<title>
			Home
		</title>
		<link rel="stylesheet" href="carDekho.css" type="text/css">
	</head>
	<%!
	String loginLogout = "";
	
	%>
	<%
	if(session.getAttribute("user") == null) {
		loginLogout = "Login";	
	}
	else {
		loginLogout = "Logout";		
	}%>
	<body>
		<div class = "header">
			<div class = "logo">
			CarDekho
			</div>
			<div class = "nav">
			<a class = "button" href = "HomeController">Home</a>
			<a class = "button" href = "AboutUsController">About Us</a>
			<a class = "button" href = "LoginPageController"><%=loginLogout %></a>
			<a class = "button" href = "ContactUsController">Contact Us</a>
			</div>
		</div>
		<div class = "leftContainerStatic">
			<%			
			List<Vehicle> list = (ArrayList<Vehicle>) request.getAttribute("list");
			Iterator<Vehicle> lIterator = list.iterator();
			int count =1;
			out.println("<table  id=\"table1\">");	
			while(lIterator.hasNext()) {
					Vehicle vehicle = lIterator.next();
					out.println("<tr >");
					out.println("<td>" + vehicle.getModel() + "</td>" );
					out.println("<td>" + vehicle.getMake() + "</td>" );
					out.println("<td>" + vehicle.getMilage() + "</td>" );
					out.println("<td><a href=\"/CarDekho/CarDetails?id="+vehicle.getModel()+"\">View Detail</a></td>");
					if(!(session.getAttribute("user") == null)){
						out.println("<td><a href=\"/CarDekho/EditPageController?id="+vehicle.getModel()+"\">Edit Detail</a></td></tr>");
					}
					count++;

			}					out.println("</table>");

			if(count == 1) {
				out.println("<table>");	
				 out.println("<tr style=\"text-align: center; padding-top: 100px;border:1px solid black;\">");
				 out.println("<td>There is no Car </td></tr></table>" );
			}
				%>
		 
		</div>
			
			
		<footer>
		</footer>
	</body>
</html>