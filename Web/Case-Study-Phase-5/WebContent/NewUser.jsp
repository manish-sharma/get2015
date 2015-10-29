<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>
		Car Dekho
		</title>
		
		<link href="CSSOfHomePage.css" rel="stylesheet">
		<script src ="JSOfCarDekho.js" type="text/javascript" >
		</script>
	</head>
	<body>
	
		<header align="center" >
		<div id="header">
		<div class="car">
		
		</div>
		</div>
		<div id = "head">
			<h2>CAR DEKHO</h2>
		</div>
		</header>
		<nav align="center">
			<ul>
				<li ><a href="HomePageController">Home</a></li>
				<li ><a href="AboutUsController">About Us</a></li>
				<li ><a href="ContactusController">Contact Us</a></li>
				<li><a href="LoginController">Log In</a></li>
			</ul>
		</nav>  
		<form action="NewUserController" method="post">
		<div class="container">
			<div class="header">Registration</div>
			<div class="content">
				<table cellspacing="15" style="width:70%">
					<tr align="right">
						<td >*First Name :</td>
						<td><input type="text" id="firstName" name="firstName"
							placeholder="Enter First Name" style="width:70%"></td>
					</tr>
					<tr align="right">
						<td>*Last Name :</td>
						<td><input type="text" id="lastName" style="width:70%" name="lastName" placeholder="Enter Last Name"></td>
					</tr>
					<tr align="right">
						<td>*Password :</td>
						<td><input type="password" style="width:70%" id="password" name="password" placeholder="Enter password"></td>
					</tr>
					<tr align="right">
						<td>*Re-enter Password :</td>
						<td><input type="password" id="confirmPassword" style="width:70%" name="confirmPassword" placeholder="Re-Enter password"></td>
					</tr>
					
					<tr align="right">
						<td>*Select Your State :</td>
						<td><select style="width: 175px" onchange="setCities()" id="state"  style="width:70%" name="state">
								<option>Select State</option>
								<option value="Rajasthan">Rajasthan</option>
								<option value="MP">Madhya Pradesh</option>
								<option value="UP">Uttar Pradesh</option>
								<option value="Maharastra">Maharastra</option>
						</select></td>
					</tr>
					<tr align="right" >
						<td>*Choose Your City : </td>
						<td>
								<select style="width: 175px" id="cities" style="width:70%" name="cities">
								<option>Select City</option>
								</select>
						</td>
					</tr>
					<tr align="right">
						<td>Age :</td>
						<td><input type="number" id="age" name="age" style="width:70%" placeholder="Enter Your Age"></td>
					</tr>
					<tr align="right">
						<td>Address Line 1 : </td>
						<td><textarea id="address" name="address" style="width:70%" rows="3" cols="22" placeholder="Enter Address Here"></textarea></td>
					</tr>
					<tr align="center">
						<td colspan="2"><input type="checkbox"  style="width:5%" onchange="enable()" id="cb">I accept all terms and condition</td>
					</tr>
					<tr align="center">
						<td colspan="2"><input type="submit" disabled=true  style="width:70%" id="submit"  value="Click To Submit Form"/></td>
					</tr>
				</table>
				<% 
				String message = (String)request.getAttribute("message"); 
				if(message != null) {
					out.println(message);
				}
				
			%>
			</div>
		</div>
	</form>
</body>
</html>