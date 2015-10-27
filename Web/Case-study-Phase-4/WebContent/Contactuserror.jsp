
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error</title>
</head>
<body>
<p> </p>
<% response.sendRedirect("Contactus"); %> 
<% out.print(request.getAttribute("msg")); %>
   
</body>
</html>