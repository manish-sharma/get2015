<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
<link rel="styleSheet" href="/CaseStudy4/css files/loginStyle.css">
</head>
<body>
	<div class="wrapper">	
		<div id="header">
			Car Dekho
		</div>
		<div id="header1">
			<ul>
				<li><a href="/CaseStudy4/view/vehicleHomePage.html">Back To Home Page</a></li>
			</ul>
		</div>
			<div class="message">${message}</div>
		<form name="adminLogin" action="/CaseStudy4/LoginController" method="post">
        <nav><h3>Please login</h3></nav>
        
      <label class="left">*Email-Id</label>
      <input class="input" name="email" type="email" required><br><br>
      
      <label class="left">*Password</label>
      <input class="input" name="password" type="password" required><br><br><br>
      
      <input class="button" type="submit" value="Login">
       </form>
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