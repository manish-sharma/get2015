<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="css/style1.css" type="text/css">
		<script type="text/javascript" src="js/js1.js"></script>
	</head>
	<body>
		<header><h2>Error</h2></header>
  		<section>
		<center>
  			<br/><br/>
			<%out.print(request.getAttribute("Message")); %>
			<br/><br/><a href="http://localhost:8080/JspAssignment2_a/view/index.jsp"><--Back to home page</a>
			</center>
  		</section>
	</body>
</html>