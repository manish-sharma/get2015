<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page errorPage="Error.jsp" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="formcss.css" />
<title>Registration Form</title>
</head>
<body>
  <form action="registration" method="get" id="mainform"> 
  <table id="miantable" > 
  <caption>REGISTRATION FORM</caption>
     <tr> <td>Name :</td><td><input type="text" name="name" required/> </td> </tr>  
     <tr> <td>User Name :</td><td><input type="text" name="username" required/></td> </tr>  
     <tr> <td>E-Mail Id :</td><td><input type="email" name="email" required/></td> </tr>  
     <tr> <td>Password :</td><td><input type="password" name="password" required/></td> </tr> 
          <%                
   				Object msg = "";
   				if(request.getAttribute("msg") != null) {
   					msg = request.getAttribute("msg");
   					out.print("<tr><td></td><th style=\"color:red;\">"+msg+"</th></tr>");
   				}
           %>     				
     <tr> <td>Re-Enter Password :</td><td><input type="password" name="password1" required/></td> </tr>  
     <tr><th colspan=2><input type="submit" value="register"/>  </th></tr>
    </table>   
</form>  
</body>
</html>