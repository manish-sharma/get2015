<!DOCTYPE html>

<html>

<head>
<meta charset="ISO-8859-1">
<title>index</title>
<link href="css/style.css" rel="stylesheet" />
</head>

<body>
	<h1 align="center">Registration Form</h1>

	<div id="wrapper">

		<form method="get" action="ValidateForm">

			<table align="center">
				<tr>
					<td>Full Name:</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Email Id:</td>
					<td><input type="email" name="email" /></td>
				</tr>
				<tr>
					<td>User Name:</td>
					<td><input type="text" name="userid" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="pwd" /></td>
				</tr>
				<tr>
					<td>Confirm Password:</td>
					<td><input type="password" name="cpwd" /></td>
				</tr>

			</table>
			<p align="center">
				<input type="submit" name="submit" value="Register" />
			</p>
		</form>
		<p align="center" class="error">${param.message}</p>
	</div>

</body>

</html>