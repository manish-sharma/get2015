<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/style.css" />
<title>Login Page</title>
</head>
<body>
	<div id="wrapper">
		<header>
		<h1>Login Page</h1>
		</header>

		<form action="/Servlet-JSP-Assignment-2/LoginController" name="form" method="get">
			<section>
			<table>
				<tr class="spaceUnder">
					<td class="text">USER NAME :</td>
					<td><input type="text" name="username"
						 class="inputbox" placeholder="Enter user name" /></td>

				</tr>

				<tr class="spaceUnder">
					<td class="text">Password :</td>
					<td><input type="password" name="password" size="100"
						width="100%" class="inputbox" placeholder="Enter password" />
					</td>

				</tr>
			</table>

			</section>
			<button type="submit" class="button">Submit</button>

		</form>


	</div>

</body>
</html>
</html>