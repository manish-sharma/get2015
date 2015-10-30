<!DOCTYPE html>
<%@page import="com.model.vehicle"%>
<html lang="en">
  <head>
    
    <title>Car Dekho</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">


   
  </head>

  <body>

   
  
  <%@ include file="menu.jsp" %>
  
  <%vehicle newcar =  (vehicle)request.getAttribute("newObject"); %>
    <section class="search-section">
		<div class="container">
		
		<%
			if(session.getAttribute("user")!=null){
				out.println("<a href=\"UpdateCar?id="+newcar.getId()+"\"><button type=\"submit\" class=\"btn btn-success btn-lg\">Edit</button></a>");
			}
		%>
			<div class="row" style="margin: 0;">
				<div class="col-md-12 car-title">
					<h1><%=newcar.getMake()%></h1>
					<h2><%=newcar.getModel()%></h2>
					<img alt="" src="images/search-1.jpg" width="100%" height="600px;">
				</div>
			</div>
			
			<div class="row" style="margin: 0;">
				<div class="col-md-2 car-spec">
					<h3>KMPL</h3>
					<p><i class="fa fa-car fa-2x"></i>&nbsp;<%=newcar.getMileage() %></p>
				</div>
				<div class="col-md-2 car-spec">
				<h3>ENGINE</h3>
					<p><i class="fa fa-fire fa-2x"></i>&nbsp;<%=newcar.getEngine_cc()%></p>
				</div>
				<div class="col-md-2 car-spec">
				<h3>Road Tax</h3>
					<p><i class="fa fa-long-arrow-right fa-2x"></i>&nbsp;<%=newcar.getRoad_tax() %></p>
				</div>
				<div class="col-md-2 car-spec">
				<h3>Price</h3>
					<p><i class="fa fa-user fa-2x"></i>&nbsp;<%=newcar.getPrice() %></p>
				</div>
				<div class="col-md-2 car-spec">
				<h3>FUEL</h3>
					<p><i class="fa fa-car fa-2x"></i>&nbsp;<%=newcar.getFuel_capacity() %></p>
				</div>
				<div class="col-md-2 car-spec">
				<h3>EMI</h3>
					<p><i class="fa fa-line-chart fa-2x"></i>&nbsp;<%=newcar.getEmi()%></p>
				</div>
			</div>
		</div>
	</section>
    <footer class="footer">
      <div class="container">
        <p>Copyright @ 2015 : Made By Sanjay Nainani</p>
      </div>
    </footer>
	<script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
   
    </body>
    </html>