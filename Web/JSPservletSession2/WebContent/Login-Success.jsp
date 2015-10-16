<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logged In</title>
</head>
<body>
<%@page import="Assignment2.Validation"%>  
  
<p>You are successfully logged in!</p>  
<%  
Validation validation=(Validation)request.getAttribute("validation");  
out.print("Welcome, "+request.getParameter("userid"));  
%>  
</body>
</html>