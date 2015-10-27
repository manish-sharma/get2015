<%@page import="com.metacube.carDekho.model.UserAuthenticator"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>
			Search
		</title>
		<link rel="stylesheet" href="carDekho.css" type="text/css">
		<script>
			function searchNewCar(){
				var type= document.getElementById("dropDown").value;

				if(type == "1"){
				window.open("AllCars.html","_self");
				}else if(type == "Hetchback"){
				window.open("Hetchback.html","_self");
				}else if(type == "Sedans"){ 
				window.open("Sedans.html","_self");
				}else if(type == "SUV"){
				window.open("SUV.html","_self");
				}
			}
		</script>
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
		<div class="contactUs">
		<form action="SearchPageController">
				<select id = "dropDown" name = "dropdown">
					<option selected value = '1' id = 'AllCars' >All Cars</option>
		
		<%
		List<String> makes = (ArrayList<String>) request.getAttribute("makes");
		Iterator<String> iterator = makes.iterator();
		while(iterator.hasNext()) {
			String make = iterator.next();
			out.println("<option value = '"+make+"' id = '"+make+"'>"+make+"</option>");
		}
		
		%>
				</select>
				<input type="submit">
				</form>
				<br>
				<br>
				<%
				if(!(session == null)) {
					if(!(session.getAttribute("user") == null)) {
						String isValidUser = UserAuthenticator.isUserValid(session.getAttribute("user").toString(), session.getAttribute("password").toString());
						if(isValidUser.equals("success")) {
							out.print("<a class = 'button' href = 'CreatePageController'>Create</a>");
						}
					}
				}
				%>
			</div>
		</div>
	</body>
</html>