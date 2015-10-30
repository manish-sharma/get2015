<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Car Dekho</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="css/font-awesome.css" rel="stylesheet">
 <link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
	
	
	
</head>
<body style="background-color: black">
  
  <%@ include file="menu.jsp" %>
	


	<section id="admin" class="admin" style="margin-bottom: 100px">
		<div class="row" style="margin: 0;">
			<a href="add-new.jsp">
			<div class="col-md-6 admin-item ">
					<i class="fa fa-plus fa-5x"></i>
					<h1 class="about-title">Add a car</h1>

			</div>
			</a> 
				<a href="EditCar">
				<div class="col-md-6 admin-item ">
					<i class="fa fa-pencil-square-o fa-5x"></i>
					<h1 class="about-title">Edit a Car</h1>

				</div></a>
		</div>


	</section>



	<footer class="footer">
		<div class="container">
			<p>Copyright @ 2015 : Made By Sanjay Nainani</p>
		</div>
	</footer>


	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>