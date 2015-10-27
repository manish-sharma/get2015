<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
<link rel="styleSheet" href="/CaseStudy4/css files/style1.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			Car Dekho
		</div>

		<div id="header1">
			<ul>
				<li><a href="/CaseStudy4/view/vehicleHomePage.html">Back To Home Page</a></li>
				<li><a href="/CaseStudy4/LogOutController">LOGOUT</a></li>
			</ul>
		</div>
		<div id="mid">
		<% 
				String message = (String)request.getAttribute("message"); 
				if(message != null) {
					out.println("<font size='5px'>"+message+"</font>");
				}
		%>
			<div id="nav1">
				<ul>
					<li><a href="/CaseStudy4/CreateCarController">Create</a></li>
					<li><a href="/CaseStudy4/AdminSearchController">Search</a></li>
				</ul>
			</div>
			<div id="image">
				<img src="/CaseStudy4/images/vernaCar.jpg" style="height: 239px; width: 524px">
			</div>
		</div>
		<div id="footer">
			<p>Posted by: Hege Refsnes</p>
			<p>
				Contact information: <a href="mailto:someone@example.com">
					Someone@CarDekho.com</a>.
			</p>
		</div>
	</div>
</body>
</html>