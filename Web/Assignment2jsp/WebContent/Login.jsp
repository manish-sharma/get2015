<%@page import="com.servlets.CheckLoginDetails"%>
<html>
<head>
<title>Login Page</title>
<link rel="stylesheet" href="StyleSheet.css" />
<script type="text/javascript" src="JavaScript.js"></script>
</head>
<body>
	<form action="CheckLoginDetails" class="register" onSubmit="return validate">
		<fieldset class="row1">
			<legend>Login Details</legend>
			<p>
				<label>User Name * </label> <input id="userName" name="userName"
					type="text" placeholder="Enter USERiD here" required /><span id = "uName"> </span><div>${valid}</div>
			</p>
			<p>
				<label>Password* </label> <input id="password" name="password"
					type="password" placeholder="Enter password here" required/> <span
					id="passwordValue"></span>
			</p>
			<div>${failure}</div>
		</fieldset>
		<div>
			<input type="submit" id="button" class="button" value="Log IN" >
		</div>
		
	</form>
</body>
</html>
>
