<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><html>
	<head>
		<title>
			Log in
		</title>
		<link rel="stylesheet" href="carDekho.css" type="text/css">
		<script>
		function isValid() {
		var id = document.getElementById("email").value;
		var password = document.getElementById("password").value;
	
		if(id == "" ){
			alert("Enter user id" );
			}else if ( password == "" ){
			alert("Enter password");
			}else if(id != "admin" ){
			alert("User ID not valid only admin can login");
			}else if(password != "1234"){
			alert("PassWord Incorrect");
			   }
			else{
			window.open("Search1.html","_self");
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
			<a class = "button" href = "#"><%=loginLogout %></a>
			<a class = "button" href = "ContactUsController">Contact Us</a>
			</div>
		</div>
		<div class = "leftContainerStatic">
			<div class = "container">
			<form action = "loginController" method = "post">
			<label>${message}</label> 
			<label style = "font-size : 2em;color : white;background-color : black;">Log in As :</label><br><br>
			<label for="email"style = "font-size : 20px;padding-left:40px;"><b>User:</b></label>
				<input  id = "email" type="text" value="" name = "userName"size="20" /><br>
				<label for="email"style = "font-size : 20px;"><b>Password:</b></label>
				<input  id = "password" type="password" value="" name = "password" size="20" /><br><br>
			<input id="submit_button" type="submit" value="Log in" style = "margin-top : 5px; size=30;font-size : 15px;margin : auto;"/>
			
			<br>
			<br>
			<br>
			<br>
			<a class = "button" href = "SearchController">Search</a><br><br><br>
			</form>
			</div>
		</div>
	</body>
</html>