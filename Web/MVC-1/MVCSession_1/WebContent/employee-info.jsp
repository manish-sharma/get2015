<%@page import="com.model.Employee"%>
<%@page import="com.helper.EmployeeCache"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
  <head>
  

    <title>Metacube</title>

    
    <link href="css/bootstrap.min.css" rel="stylesheet">

   
   
  <style type="text/css">
  	
  
  </style>
  </head>

  <body >

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="HomeServlet">Metacube</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="HomeServlet">Home</a></li>
            <li><a href="RegistrationFormServlet">Registration</a></li>
            <li><a href="ListController">Employee List</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

	<section>
	
	
	<%			
				Employee employee =(Employee)request.getAttribute("employee");
			out.println(request.getRequestURL());
			out.println("<div class=\"container\">");	
			 out.println("<div class=\"row\" style=\"text-align: center; padding-top: 100px;\">");
			 out.println("<div class=\"col-md-2 col-xs-2 table-field\" name = \"Id\">" + employee.getId() + "</div>" );
			 out.println("<div class=\"col-md-2 col-xs-2 table-field\">" + employee.getName() + "</div>" );
			 out.println("<div class=\"col-md-2 col-xs-2 table-field\">" + employee.getEmail() + "</div>" );
			 out.println("<div class=\"col-md-2 col-xs-2 table-field\">"+employee.getAge()+"</div>");
			 out.println("<div class=\"col-md-2 col-xs-2 table-field\">"+employee.getDateOfRegistration()+"</div></div>");
			 %>
	<div class="row" style="text-align: center;padding-top: 100px;">
		<div class="col-md-12">
			<a href="HomeServlet" class="btn btn-success btn-lg">Home</a>
		</div>
	</div>	
	</section>






	<script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
   
</html>
