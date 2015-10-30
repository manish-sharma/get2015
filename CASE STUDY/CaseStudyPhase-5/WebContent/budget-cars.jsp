 <%@page import="com.model.vehicle"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
  <head>
  

    <title>Metacube</title>

    
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <style type="text/css">
    	.login{
    	margin-top: 100px;
    	text-align: center;
    	
    	}
    	
    	
    </style>
  </head>

  <body>
<%@ include file="menu.jsp" %>

    <section class="login">
		<div class="container">
		<div class="row">
			<div class="col-md-3 col-xs-3"><h2>Make</h2></div>
			<div class="col-md-3 col-xs-3"><h2>Model</h2></div>
			<div class="col-md-3 col-xs-3"><h2>Price</h2></div>
			<div class="col-md-3 col-xs-3"><h2>Action</h2></div>
		</div>
			
			
					 <%
						List<vehicle> listOfCars = (List<vehicle>)request.getAttribute("listOfCars");
						
					 		int count = 1;
					 		for(vehicle car : listOfCars){
							%>
							<div class="row" style="padding-top: 10px;]">
							
					
							
							<div class="col-md-3 col-xs-3"><%=car.getMake() %></div>
							<div class="col-md-3 col-xs-3"><%=car.getModel() %></div>
							<div class="col-md-3 col-xs-3"><%=car.getPrice() %></div>
							<div class="col-md-3 col-xs-3"><a href="SearchCarByBudget?make=<%=car.getMake()%>&model=<%=car.getModel()%>" class="btn btn-success btn-sm">View</a></div>
							
							
							</div>
							
							
							
							<%
						}
					
					%>
				
			
			
			
		</div>
	</section>
      
   


  
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
   
</html>
