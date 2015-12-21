 <%@ page import="com.metacampus.model.Vehicle , java.util.*,com.metacampus.model.Car " %>
<!DOCTYPE html>
<html>
<%@page session="false" %>
<head>
<script>
function goBack() {
    window.history.back();
}
</script>
<title>Insert title here</title>
<link rel = "stylesheet" type = "text/css" href = "Css/HomePage.css">
</head>
<%HttpSession session = request.getSession(false);
   	 %>
<body class="createCar">
	<div id="wrapper">
<div class = "navbar">
					<div class = "menu">
					    <div class = "menu_items"><a class = "anchor_menu_items" href = "HomePageController">Home</a></div>
						<div class = "menu_items"><a class = "anchor_menu_items" href = "SearchPageController">Search Car</a></div>
						<%  if(session!=null){%> <div class = "menu_items"><a class = "anchor_menu_items" href = "CreatePageController">Create Car</a></div><%} %>
					   <div class = "menu_items"><a class = "anchor_menu_items" href = "#">About Us</a></div>
						<div class = "menu_items"><a class = "anchor_menu_items" href = "#">Contact Us</a></div>
						
					<%  if(session!=null){%>	<div id= "logout" style="float:right" class = "menu_items"><a class = "anchor_menu_items" href = "HomePageController?logout=logout">LogOut</a></div>
					    <div  class = "menu_items" style="float:right">Hi Nikhil </div><%} %>
					</div>
				</div>
		<div id="detail">
			<br>
			<form action="goBack()">
				<table class="CreateCarTable" align="left" >
					 <% Car vehicle = (Car) request.getAttribute("vechile");
					     String ac="No";
					     String power="No";
					if(vehicle!=null)
					{   if(vehicle.isAC())
					       ac="Yes";
					    if(vehicle.isPowerSteering())
					       power="Yes";
					 out.print("<tr><td><h3>Company  :<h3></td><td><h3>"+vehicle.getMake()+"<h3></td></tr><tr><td><h3>Model :</h3></td><td><h3>"+vehicle.getModel()
					+"<h3></td>	</tr><tr><td><h3>EngineInCC :</h3></td><td><h3>"+vehicle.getEngineInCC()+"<h3></td>	</tr><tr><td><h3>FuelCapacity :</h3></td><td><h3>"
					+vehicle.getFuelCapacity()+"<h3></td></tr><tr><td><h3>Milage :</h3></td><td><h3>"+vehicle.getMileage()+
					"<h3></td>	</tr><tr><td><h3>OnRoadPrice :</h3></td><td><h3>"+vehicle.getPrice()+"<h3></td>	</tr><tr><td><h3>RoadTax :</h3></td><td><h3>"
					+vehicle.getRoadTax()+"<h3></td></tr><tr><td><h3>Ac :</h3></td><td><h3>"+ac+"<h3></td></tr><tr><td><h3>PowerSteering :</h3></td><td><h3>"+power+"<h3></td></tr><tr><td><h3>Accessory Kit :</h3></td><td><h3>"+vehicle.getAccessoryKit()+"<h3></td></tr>");
						
					}%>
				
				
					<td colspan=3> <div style="margin: 0 auto; text-align:center">	
				     <input  style="width:100%;height:30px;" type="submit" value="Back" id="button" class="SearchButton" onclick="goBack()"/>
                 </div>
					 </td>
                  </tr>
				</table>
				

				</form>



		</div>



	</div>

</body>
</html>