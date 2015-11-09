<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/Search.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<%@ include file="Header.jsp"%>
	<div class="section">
		<div id="loginWindow">
			<form action="LoginServlet" method="post">
				<table>
					<tr>
						<td colspan="2"><font size="5"><i><b>Login as
										Admin to create and Edit cars</i></b></font></td>
					</tr>
					<tr>
						<td>Username :</td>
						<td><input id="username" class="text" type="text"
							name="username" placeholder="Enter Username"
							oninput="activeLogin()" /><br /></td>
					</tr>
					<tr>
						<td>Password :</td>
						<td><input id="password" class="text" type="password"
							name="password" placeholder="Enter Password"
							oninput="activeLogin()" /></br></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input class="submit"
							id="submitLogin" type="submit" value="Login"
							onclick="return validateLogin()" /></td>
					</tr>
				</table>
			</form>
			<label color="White">${msg}</label>
		</div>

	</div>
	<%@ include file="Footer.jsp"%>
</body>
</html>
