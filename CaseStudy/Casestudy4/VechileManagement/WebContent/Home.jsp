<!DOCTYPE html>
<html>
<head>
<%@page session="false" %>
<link rel="stylesheet" type="text/css" href="Css/HomePage.css">
<script src="javaScript/CaseStudy.js"></script>
</head>

<%  HttpSession session = request.getSession(false);
  %>
<body class="homepage">
	<div class="navbar">
		<div class="menu">
			<div class="menu_items">
				<a class="anchor_menu_items" href="#">Home</a>
			</div>
			<div class="menu_items" id="Search">
				<a class="anchor_menu_items" href="SearchPageController">Search Car</a>
			</div>
			<%  if(session!=null){%>	 <div class = "menu_items"><a class = "anchor_menu_items" href = "CreatePageController">Create Car</a></div><%} %>
			<div class="menu_items">
				<a class="anchor_menu_items" href="#">About Us</a>
			</div>
			<div class="menu_items">
				<a class="anchor_menu_items" href="#">Contact Us</a>
			</div>
	     <%  if(session!=null){%>	     <div id= "logout" style="float:right" class = "menu_items"><a  href = "HomePageController?logout=logout">LogOut</a></div>
					    <div  class = "menu_items" style="float:right">Hi Nikhil </div><%} %>
		</div>
	</div>

<% 
    if(session==null){
%>
	<section class="container">
		<div class="login">
			<h1>Login to CarTrade</h1>
			<form method="post" action="HomePageController" class="form" onsubmit="return validationOfAdmin()">
				<p>${message}</p>
				<p>
					<input type="text" name="login" value=""
						placeholder="Username or Email" id="user_name"
						class="login_detail">
				</p>
				<p>
					<input type="password" name="password" value=""
						placeholder="Password" id="password" class="login_detail">
				</p>
				<p class="remember_me">
					<label> <input type="checkbox" name="remember_me"
						id="remember_me"> Remember me on this computer
					</label>
				</p>
				<div style="margin: 0 auto; text-align: center">
					<input style="width: 100%; height: 30px;" type="submit"
						value="Login" id="button" class="SearchButton" />
				</div>
			</form>
		</div>

	</section>
<% }%>
</body>
</html>