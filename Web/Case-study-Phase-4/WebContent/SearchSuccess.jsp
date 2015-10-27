<%@page import="com.model.*"%>
<%@page import="com.helper.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>
		Car Dekho
		</title>
		
		<link href="CSSOfHomePage.css" rel="stylesheet">
		<script src ="JSOfCarDekho.js" type="text/javascript" >
		</script>
	</head>
	<body>
		<header align="center" >
		<div id="header">
		<div class="car">
		
		</div>
		</div>
		<div id = "head">
			<h2>CAR DEKHO</h2>
		</div>
		</header>
		<nav align="center">
			<ul>
				<li ><a href="HomePageController">Home</a></li>
				<li ><a href="AboutUsController">About Us</a></li>
				<li ><a href="Contactus">Contact Us</a></li>
				<li><a href="LogoutController">Log out</a></li>
			</ul>
		</nav>  
			<div id="maincontainer">
			<%			
			List<Vehicle> vehicleList = (List< Vehicle>)request.getAttribute("list");
			int count =1;
			 out.println("<table id=\"table\">");	
			for (int i = 0; i< vehicleList.size(); i++) {
				Vehicle vehicle = vehicleList.get(i);
					 out.println("<tr  >");
					 out.println("<td>" + vehicle.getMake() + "</td>" );
					 out.println("<td>" + vehicle.getModel() + "</td>" );
					 out.println("<td>" + vehicle.getPrice() + "( Rs.)</td>" );
					 out.println("<td><a href=\"CarList?id="+vehicle.getVehicleId()+"\">View Detail</a></td>");%>
					 <%if(!(session.getAttribute("user") == null) && ((String)session.getAttribute("user")).equals("admin")) {
			           out.println("<td><a href=\"AdminController?id="+vehicle.getVehicleId()+"\">Edit Detail</a></td></tr>");
			          } %>
					
					 <% 
						count++;

			}
			out.println("</table>");
			if(count == 1) {
				out.println("<table>");	
				 out.println("<tr style=\"text-align: center; padding-top: 100px;border:1px solid black;\">");
				 out.println("<td>There is no vehicle </td></tr></table>" );
			}
				%>
		 
		</div>
			
			
		<footer>
		</footer>
	</body>
</html>
 