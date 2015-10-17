<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title> Employee Home Page </title>
	<link rel="stylesheet" type="text/css" href="view/css/Employee-CSS.css">
</head>

<body>

	<header>
		
		<div id="logo"> <h2> MetaCube Softwares Pvt. Ltd. </h2> </div>
		
		<nav>
			<ul>
				<li> <% out.write("<a href=\"/mvc/EmployeeDataFetchAndSend\"> List of Employees </a>"); %> </li>
				<li> <% out.write("<a href=\"/mvc/RegistrationPage?id="+(-1)+"\" style=\"margin: 0 10px 0 10px\"> Register Here </a>"); %> </li>
			</ul>
		</nav>
		
	</header>
	
	<div id="content">

		<div id="description">
			<p>
				Metacube is a software engineering services company that 
				has deep experience in developing enterprise level produc
				ts and applications for a wide spectrum of domains includi
				ng global trade management, supply chain analytics, manuf
				acturing analytics, business continuity planning, CRM, pub
				lishing and eCommerce. These applications have been devel
				oped on a variety of platforms. The common denominator in 
				all our services has been our total customer focus, ensuri
				ng that each engagement is a success and provides the desired
				value to the customer.
			</p>
			
			<div id="image">
				<img alt="aimage logo" src="view/css/logo.png">
			</div>
			
		</div>
	
	</div>
	<footer>

	<div class="footer_part">
		<h3>Contact Us:</h3>
		<ul>
			<li>Support: <a href=#> support@metacube.com </a>
			</li>
			<li>Customer Care: <a href=#> +91-9636332472 </a>
			</li>
			<li>Toll free:<a href=#> 1800-100-1010 </a>
			</li>
		</ul>
	</div>

	<div class="footer_part">
		<h3>Find us on:</h3>
		<ul>
			<li><a href=#> Facebook </a></li>
			<li><a href=#> Google+ </a></li>
			<li><a href=#> Twitter </a></li>
		</ul>
	</div>

	<div class="footer_part">
		Copyright &copy <a href=#> Metacube Softwares Pvt. Ltd. </a> 2015. All
		rights reserved. <br> Designed & Developed by <a href=#>
			Ankur Gupta </a>.
		<hr>
		<a href=#> Privacy Policy. </a> <br> <a href=#> T & C </a>
	</div>

	</footer>
	
</body>

</html>