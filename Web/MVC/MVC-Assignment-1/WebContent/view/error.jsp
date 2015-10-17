<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aw, Error</title>
</head>
<body>
	<% if(request.getParameter("error").equals("400")) {%>
		<h1>You had changed the type of fields</h1>
	<%} else { %><h1>An unexpacted Error Occured</h1>
	<h3>Please try after sometime</h3>
	<%} %>
</body>
</html>