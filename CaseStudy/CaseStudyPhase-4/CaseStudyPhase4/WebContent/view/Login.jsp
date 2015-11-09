<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" href="/CaseStudyPhase4/CSS/login.css" type="text/css">
</head>
<body>


<div class="logo"></div>
<div class="login-block">
    <h1>Login</h1>
    <form name="login" action="/CaseStudyPhase4/LoginController" method="post">
    <input type="text" value="" placeholder="Username" id="username" name="username" />
    <input type="password" value="" placeholder="Password" id="password" name="password"/>
    <button>Submit</button>
    </form>
    <div id="alertmsg">

	<%
		String message = (String)request.getAttribute("message");
		
		if(message != null)
		{
			out.print(message);
		}
	%>
    </div>
</div>

</body>
</html>