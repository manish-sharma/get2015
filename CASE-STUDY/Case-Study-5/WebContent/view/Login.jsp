<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
<link rel="styleSheet" href="/Case-Study-5/css files/loginStyle.css">
</head>
<body>
	<div class="wrapper">

		<header> <img src="/Case-Study-5/images/logo.png"
			alt="car dekho logo" width="400px" height="100px" align="left">
		<aside>
		<ul>
			<li><a href="/Case-Study-5/UserSearchController">SEARCH</a></li>
		</ul>
		</aside> </header>
		<div class="message">${message}</div>
		<form name="adminLogin" action="/Case-Study-5/LoginController"
			method="post">
			<nav>
			<h3>Please login</h3>
			</nav>

			<label class="left">*Email-Id</label> <input class="input"
				name="email" type="email" required><br>
			<br> <label class="left">*Password</label> <input class="input"
				name="password" type="password" required><br>
			<br>
			<br> <input class="button" type="submit" value="Login">
		</form>
		<footer>
		<label>Copyright &copy 2015.&nbsp; All rights reserved.</label></footer>
	</div>
</body>
</html>