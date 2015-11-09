<%!
	String loginLogout = "";
	String create = "";
	String flag = "";
	String search = "";
%>
<%
	if(session.getAttribute("user") == null) {
		loginLogout = "Login";
		create = "";
		flag = "";
		search = "Search";
	}
	else {
		loginLogout = "Logout";
		create = "Create";
		flag = "/";
		search = "View";
	}
%>
<header>
	<h1 id="siteTitle">Car Dekho</h1>
	<div id="logo">
		<img src="images/logo1.png" alt="Car Logo" />
	</div>
	<div id="login">
		<a href="LoginServlet"><%=loginLogout%></a> / <a href="Search"><%=search %></a>
		<%=flag%>
		<a href="Create"><%=create %></a>
	</div>
	<div id="socialMedia">
		<ul>
			<li class="socialMediaLogo"><a href="javascript:;"><img
					src="images/facebook.png" /></a></li>
			<li class="socialMediaLogo"><a href="javascript:;"><img
					src="images/twitter.png" /></a></li>
			<li class="socialMediaLogo"><a href="javascript:;"><img
					src="images/linkedIn.png" /></a></li>
			<li class="socialMediaLogo"><a href="javascript:;"><img
					src="images/googlePlus.png" /></a></li>
		</ul>
	</div>
</header>

<nav>
	<ul>
		<li class="navBar"><a href="Home">Home</a></li>
		<li class="navBar"><a href="AboutUs">About Us</a></li>
		<li class="navBar"><a href="ContactUs">Contact Us</a></li>
		<li class="navBar"><a href="Careers">Careers</a></li>
	</ul>
</nav>