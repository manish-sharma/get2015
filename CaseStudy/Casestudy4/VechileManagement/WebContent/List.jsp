  <%@ page import="com.metacampus.model.Vehicle , java.util.* " %>
<!DOCTYPE html>
<html>
<%@page session="false" %>
	<head>
		<link rel="stylesheet" href="Css/HomePage.css" type="text\css"/>
		<title>User Search</title>
	<%HttpSession session = request.getSession(false);
   	 %>
	</head>
	<body class="carList">
		<div class = "navbar">
					<div class = "menu">
					    <div class = "menu_items"><a class = "anchor_menu_items" href = "HomePageController">Home</a></div>
						<div class = "menu_items"><a class = "anchor_menu_items" href = "SearchPageController">Search Car</a></div>
					<%  if(session!=null){%>	 <div class = "menu_items"><a class = "anchor_menu_items" href = "CreatePageController">Create Car</a></div><%} %>
					    <div class = "menu_items"><a class = "anchor_menu_items" href = "#">About Us</a></div>
						<div class = "menu_items"><a class = "anchor_menu_items" href = "#">Contact Us</a></div>
						
					 <%  if(session!=null){%>	     <div id= "logout" style="float:right" class = "menu_items"><a class = "anchor_menu_items" href = "HomePageController?logout=logout">LogOut</a></div>
					    <div  class = "menu_items" style="float:right">Hi Nikhil </div><%} %>
					</div>
				</div>
		         
			`	
				<div class="availableCar"><p class="availableCars">Available Cars</p></div>
				<aside>
				
					<table>
					<%  List<Vehicle> list = (List<Vehicle>) request.getAttribute("vechileLists");
					if(list!=null && !list.isEmpty())
					{ 
						if(session!=null)
						{		
					    for(Vehicle vehicle : list) {
				    	out.println("<tr><td>"+vehicle.getMake()+"<br><br><font color='red'>"+vehicle.getModel()+"<br><br>"
				    	+"<a href = 'DetailPageController?id="+vehicle.getVehicleId()+"'>View Specifications</a><br><br><a href='CreatePageController?id="+vehicle.getVehicleId()+"'>Edit</a><hr/></td></tr>");
					    }
						}
						else
						{
							 for(Vehicle vehicle : list) {
							    	out.println("<tr><td>"+vehicle.getMake()+"<br><br><font color='red'>"+vehicle.getModel()+"<font color='red'>"+vehicle.calculateOnRoadPrice()+"</font><br><br>"
							    	+"<a href = 'DetailPageController?id="+vehicle.getVehicleId()+"'>View Specifications</a><br><hr/></td></tr>");
								    }	
						}
					}
					else 
						out.print("<tr><td>Sorry no car found</td></tr>");
				     %>
					</table>
				</aside>
			<div style="margin-left: 20px; margin-top:100px;"><img  src="Images/swift.jpg"  width="550px" height="458px" /></div>
			
			
		
	</body>
</html>

