<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="StyleSheet.css" />

</head>
<body>
	<form action="Login" method="get">
		<div>
			<h2>Login</h2>
			<div id="login">
				<table>
					<tr>
						<td><label id="lable">UserName:</label></td>
						<td><input type="text" id="userid" name="userid" /></td>
					</tr>
					<tr>
						<td><label id="lable">Password:</label></td>
						<td><input type="password" id="password" name="password" /></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Log In" id="button" /></td>
					</tr>
					<tr>
						<td></td>
						<td><label id="lable">New User</label></td>
					</tr>
					<tr>
						<td></td>
						<td><a href="#">(Register here)</a></td>
					</tr>
				</table>
			</div>
		</div>
	</form>
</body>
</html>