<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="register.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="header">
REGISTER
</div>
<center>
<form action="Register" method="post"  >
<table>
<tr>
<td>Name </td><td> <input type="text" name="userName" placeholder="Enter Name"><br/></td>
</tr>
<tr>
<td>password</td><td> <input type="password" name="userPass" placeholder="password"><br/></td>
</tr>

<tr>
<td>Email</td><td> <input type="text" name="userEmail" placeholder="Enter email id"><br/></td>
</tr>

</table>
<br/><br/> 
<input type="submit" value="register">
</center>

</form>

</body>
</html>