<!-- Assignment-2 -->
<!DOCTYPE>
<html>
<head>
<title>Registration Form</title>
<link rel="stylesheet" href="StyleSheet.css" />
</head>
<body>
	<p align="center" style="color: red;">${result}</p>
	<form action="Login" class="login"
		style="margin-left: 600px; margin-top: 100px; width: 400px; height: 300px; border: 1px solid black;">
		<h1 style="text-align: center;">Log-in</h1>
		<table style="margin-left: 50px; width: 400px; height: 200px;">
			<tr>
				<td><label>User Name * </label></td>
				<td><input id="userName" name="userName" type="text" placeholder="User Name" /></td>
			</tr>
			<tr>
				<td><label>Password* </label></td>
				<td><input id="password" name="password" type="password" placeholder="Enter password here" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" id="button" class="button" value="login"></td>
		</table>
	</form>
</body>
</html>





