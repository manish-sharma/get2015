 <%@page import="java.util.List"%>
<%@page import="com.model.User"%>
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
  <% 

 
 
  if(session.getAttribute("user") == null){
	  String error = "Please login to view this page";
		request.setAttribute("error_label", error);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
		requestDispatcher.forward(request, response);
  }
 
  %>

    <%@ include file="menu.jsp" %>

    <section class="login">
		<div class="container">
			
			
					 <%
						List<User> displayList = (List<User>)session.getAttribute("list");
					 	
						for(User user : displayList){
							%>
							<div class="row">
							<div class="col-md-6"><%=user.getUserName() %></div>
							<div class="col-md-6"><%=user.getEmail() %></div>
							</div>
							
							
							<%
						}
					
					%>
				
			
			
			
		</div>
	</section>
      
   


  
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
   
</html>
