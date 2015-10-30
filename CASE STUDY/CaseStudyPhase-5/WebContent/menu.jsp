<!DOCTYPE html>
<html lang="en">
<head>

<title>Car Dekho</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="css/font-awesome.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">



</head>

<body>

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.jsp">CAR DEKHO</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="index.jsp">HOME</a></li>
					<li><a href="index.jsp#about">ABOUT</a></li>
					<li><a href="index.jsp#new-car">NEW CARS</a></li>
					<li><a href="Search">SEARCH</a></li>
					
					<%!String value;%>
					<%
						 System.out.println(session.getAttribute("user"));
						if (session.getAttribute("user") == null) {
							value = "login";
						} else {
							value = "logout";
						}
					%>
					 <li class="active"><a href='<%=value%>'><%=value%></a></li>
				</ul>
			</div>
		</div>
	</nav>

	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>

</body>
</html>