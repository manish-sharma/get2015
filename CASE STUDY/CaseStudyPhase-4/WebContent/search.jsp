<!DOCTYPE html>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<html lang="en">
  <head>
    
    <title>Car Dekho</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    


   
  </head>
  
  

  <body style="background-color: black">
  
 
  
  <%@ include file="menu.jsp" %>

    
    <section class="search-section">
		<div class="container">
			<div class="row" style="margin: 0;">
				<div class="col-md-12 car-title">
				
					<div class="search-box-admin" id="blk-1">


						

						<h2>SEARCH A CAR BY
						<div id="myRadioGroup">
							Make<input type="radio" name="cars"
								value="twoCarDiv" /> Budget<input type="radio" name="cars"
								value="threeCarDiv" />
							
							
						</div>
						</h2>
						
						<div id="twoCarDiv" class="desc" style="display:block">
							<h3>Select a Car Make</h3>
						
						<form action="Search" method="post">	
						<select name="make">
							<option>SELECT MAKE</option>
							<%
							List<String> makes = (ArrayList<String>) request.getAttribute("makes");
							Iterator<String> iterator = makes.iterator();
							while(iterator.hasNext()) {
							String make = iterator.next();
							out.println("<option value = '"+make+"' id = '"+make+"'>"+make+"</option>");
							}

							%>

						</select>
						<h3>Select a Car Model</h3>
						<select name="model">
							<option>SELECT MAKE</option>
							<%
							List<String> models = (ArrayList<String>) request.getAttribute("model");
							Iterator<String> modelIterator = models.iterator();
							while(modelIterator.hasNext()) {
							String model = modelIterator.next();
							out.println("<option value = '"+model+"' id = '"+model+"'>"+model+"</option>");
							}

							%>

						</select>
						<p>
							<input type="submit" class="btn btn-success btn-lg" value="Search"></input>
						</p>
						
						</form>
						
						</div>
						<div id="threeCarDiv" class="desc">
						
							
						
						<form action="SearchCarByBudget" method="post">	
						<h3>Enter Starting Range</h3>
						 <input type="number" name="start" min="<%=request.getAttribute("minPrice") %>" max="<%=request.getAttribute("maxPrice") %>" value="<%=request.getAttribute("minPrice") %>">
						<h3>Enter Ending Range</h3>
						 <input type="number" name="end" min="<%=request.getAttribute("minPrice") %>" max="<%=request.getAttribute("maxPrice") %>"  value="<%=request.getAttribute("maxPrice") %>">
						<p>
							<input type="submit" class="btn btn-success btn-lg" value="Search"></input>
						</p>
						
						</form>
						
						</div>
						<p>${message} </p>
					</div>
					</div>
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
  	<script>
  	$(document).ready(function() {
  	    $("div.desc").hide();
  	    $("input[name$='cars']").click(function() {
  	        var test = $(this).val();
  	        $("div.desc").hide();
  	        $("#" + test).show();
  	    });
  	});
  	</script>
    </body>
    </html>