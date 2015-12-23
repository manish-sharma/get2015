<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page errorPage="Error.jsp" %>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="login.css" />
<title>Login</title>
</head>
<body>
<form action="login" method="get" id="mainform"> 
  <table>  
  <caption>USER LOGIN</caption>
     <tr> <td>User Name :</td><td><input type="text" name="username" required/></td> </tr>   
     <tr> <td>Password :</td><td><input type="password" name="password"/ required></td> </tr>  
       <tr><th colspan=2><input type="submit" value="LOGIN"/>  </th></tr>
    </table>   
     
</form>  
</body>
</html>