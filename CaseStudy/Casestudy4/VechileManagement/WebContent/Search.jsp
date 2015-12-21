<!DOCTYPE html>
<html>
<%@page session="false" %>
	<head>
		<link rel = "stylesheet" type = "text/css" href = "Css/HomePage.css">
		<script src="JavaScript/CaseStudy.js"></script>
	</head>
	<%HttpSession session = request.getSession(false);
   	 %>
   
          <body class="Search">
                <div class = "navbar">
					<div class = "menu">
					    <div class = "menu_items"><a class = "anchor_menu_items" href = "HomePageController">Home</a></div>
						<div class = "menu_items" id="Search"><a class = "anchor_menu_items" href = "#">Search Car</a></div>
						<%  if(session!=null){%>	 <div class = "menu_items"><a class = "anchor_menu_items" href = "CreatePageController">Create Car</a></div><%} %>
						<div class = "menu_items"><a class = "anchor_menu_items" href = "#">About Us</a></div>
						<div class = "menu_items"><a class = "anchor_menu_items" href = "#">Contact Us</a></div>
						 <%  if(session!=null){%>	     <div id= "logout" style="float:right" class = "menu_items"><a class = "anchor_menu_items" href = "HomePageController?logout=logout">LogOut</a></div>
					    <div  class = "menu_items" style="float:right">Hi Nikhil </div><%} %>
					</div>
				</div>

</select>
<div class="SearchContainer">
				<form name="searchform" action="SearchPageController" method="post">
			<div> <h1>Search cars</h1></div>
								
					<select  class="selectMenue" step="any" name="budget" required>
							<option selected disabled>Select Budget</option>
							<option value="Price<300000">Less than 3 lac</option>
							<option value="Price BETWEEN 300000 AND 700000">3 lac-7 lac</option>
							<option value="Price BETWEEN 700000 AND 2000000">7 lac-20 lac</option>
							<option value="Price>2000000">more than 20 lac</option>
					</select>
				
				
				
				<div>
				<select  class="selectMenue"   name="brand" required>
							<option selected disabled>Select Brand</option>
							<option>Ferrari</option>
							<option>Hyundai</option>
							<option>Ford</option>
							<option>Tata</option>
							<option>Volkswagen</option>
							<option>Audi</option>
					</select>
	              </div>
              	  <div style="margin: 0 auto; text-align:center">	
				     <input  style="width:100%;height:30px;" type="submit" value="Search" id="button" class="SearchButton" />
                 </div>
		</form>
		</div>



</body>
</html>