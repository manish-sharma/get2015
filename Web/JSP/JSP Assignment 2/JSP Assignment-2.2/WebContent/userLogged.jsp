<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  import="com.servlet.UserBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Use Login Successful</title>
</head>
<body>
	<center>
		<%
			UserBean currentUser = (UserBean) (session.getAttribute("currentSessionUser"));
		%>

		Welcome
		<%=currentUser.getFirstName() + " " + currentUser.getLastName()%>
	</center>

</body>
</html>