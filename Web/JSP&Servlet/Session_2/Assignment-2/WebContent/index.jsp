<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
</head>
<body>
	<p align="center" style="color: red"> ${result}</p>
	<form action="Validate" name="form" method="post">
		<table align="center">
			<tr> <td>User Name: <input type="text" name="name" placeholder="Enter Name" /></td> </tr>
			<tr><td>Password: <input type="password" name="password" placeholder="Enter password"></td></tr>
			<tr><td><input type="submit" id="submitButton" value="submit"></td></tr>
		</table>
	</form>
</body>
</html>