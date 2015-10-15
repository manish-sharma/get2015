<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Register Here</title>
<link href="./css/custom.css" rel="stylesheet">
</head>
<body>
	<header> <span class="brand"><a href="index.jsp">Howdy, Visitor</a></span>
	<a href="#" onClick="showLogin()">Login</a> <a href="#"	onClick="showSignup()">Sign Up</a> </header>
	
	<div class="form" id="loginForm" >
		<table>
			<form action="FormHandler" method="post" onsubmit="return validateLogin()">
				<legend><h2>Login</h2></legend><hr>
				<tr>
					<td>Enter UserId:</td>
					<td><input type="text" id="loginUser" name="user"	placeholder="Enter User Id"></td>
				</tr>
				<tr>
					<td></td>
					<td align="center"><label id="loginUserError"></label></td>
				</tr>
				<tr>
					<td>Enter Password</td>
					<td><input type="password" id="loginPassword" name="password" placeholder="Enter Password"></td>
				</tr>
				<tr>
					<td></td>
					<td align="center"><label id="loginPasswordError"></label></td>
				</tr>
				<tr>
					<td colspan="2" align="center" id="loginError"><%if(session.getAttribute("loginError") != null) out.println(session.getAttribute("loginError"));%></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login" name="login"></td>
					<td><input type="reset" value="Close"></td>
				</tr>
			</form>
		</table>
	</div>
	
	<div class="form" id="signUpForm" >
		<table>
			<form action="./FormHandler" method="post" onsubmit="return validate()">
				<legend><h2>New User! Register Here</h2></legend><hr>
				<tr>
					<td>Enter Name:</td>
					<td><input type="text" id="name" name="name" placeholder="Enter Full Name"></td>
				</tr>
				<tr>
					<td></td>
					<td align="center"><label id="nameError"> <%if(session.getAttribute("message") != null) out.println(session.getAttribute("message"));%>
					</label></td>
				</tr>
				<tr>
					<td>Enter Password</td>
					<td><input type="password" id="password" name="password"placeholder="Enter Password"></td>
				</tr>
				<tr>
					<td></td>
					<td align="center"><label id="passwordError"></label></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><input type="password" id="cPassword" name="cPassword"placeholder="Confirm Password"></td>
				<tr>
					<td></td>
					<td align="center"><label id="cPasswordError"></label></td>
				</tr>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="email" id="email"placeholder="Enter Email"></td>
				</tr>
				<tr>
					<td></td>
					<td align="center"><label id="emailError"></label></td>
				</tr>
				<tr>
					<td>Phone Number</td>
					<td><input type="number" name="pNumber" id="pNumber"placeholder="Primary Phone Number"></td>
				</tr>
				<tr>
					<td></td>
					<td align="center"><label id="phoneNumberError"></label></td>
				</tr>
				<tr>
					<td><input type="submit" value="Signup" name="signup"></td>
					<td><input type="reset" value="Reset Form"></td>
				</tr>
			</form>
		</table>
	</div>
	<%
		session.setAttribute("message", "");
		session.setAttribute("loginError","");
	%>
</body>
<script src="./js/script.js"></script>
</html>