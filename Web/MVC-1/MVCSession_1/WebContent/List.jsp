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
  
  	.btn{
  		margin-top: 10px;
  		margin-bottom: 10px;
  	}
  	
  	.col-xs-6{
  		padding-top: 20px;
  		padding-bottom: 20px;
  	}
  
  </style>
  </head>

  <body>

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

	<section style="margin-top: 100px;">
	
	
	<%
	Map<Integer, Employee> employeeMap = (Map<Integer, Employee>)request.getAttribute("list");
	int count=1;
	for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
				Employee employee = entry.getValue();
			out.println("<div class=\"container\">");	
			 out.println("<div class=\"row\" style=\"text-align: center;padding-top:20px;border:1px solid black;\">");
			 out.println("<div class=\"col-md-2 col-sm-2 col-xs-4 table-field\" name = \"Id\">" + employee.getId() + "</div>" );
			 out.println("<div class=\"col-md-2 col-sm-2 col-xs-4 table-field\">" + employee.getName() + "</div>" );
			 out.println("<div class=\"col-md-2 col-sm-2 col-xs-4 table-field\">" + employee.getEmail() + "</div>" );
			 out.println("<div class=\"col-md-3 col-sm-3 col-xs-6 table-field\"><a href='/MVCSession_1/EmployeeDetail?id="+employee.getId()+"' class=\"btn btn-sm btn-success\">VIEW</a></div>");
			 out.println("<div class=\"col-md-3 col-sm-3 col-xs-6 table-field\"><a href='/MVCSession_1/EditEmployee?id="+employee.getId()+"' class=\"btn btn-sm btn-success\">EDIT</a></div></div></div>");
			 count++;
		
	}
		%>
	</section>






	<script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
   
</html>
