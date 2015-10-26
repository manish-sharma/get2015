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
	<div class="wrapper">

		<header>
			<img src="/CaseStudy4/images/logo.png" alt="car dekho logo" width="400px"
				height="100px" align="left">
			
		</header>
		<% 
				String message = (String)request.getAttribute("message"); 
				if(message != null) {
					out.println(message);
				}
		%>
		<aside>
			<ul>
				<li><a href="/CaseStudy4/CreateCarController">CREATE </a></li>
				<li><a href="/CaseStudy4/AdminSearchController">SEARCH</a></li>
				<li><a href="/CaseStudy4/LogOutController">LOGOUT</a></li>
			</ul>
		</aside>
		
		<section>
		 <img alt="car" src="/CaseStudy4/images/car.jpg" width="550px" height="400px">
		</section>
       <footer><label>Copyright &copy 2015.&nbsp; All rights reserved.</label></footer>
	</div>
</body>
</html>