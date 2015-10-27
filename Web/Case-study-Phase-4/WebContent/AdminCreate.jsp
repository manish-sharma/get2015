<!DOCTYPE HTML>
<%@page import="com.model.Vehicle"%>
<%@page import="com.model.Car"%>
<%@page import="java.util.*" %>
<html>
	<head>
		<title>
		Car Dekho
		</title>
		<link href="CSSOfHomePage.css" rel="stylesheet">
		<script src ="JSOfCarDekho.js" type="text/javascript" >
		</script>
	</head>
	<%!
	String loginLogout = "";
	String create = "";
	String flag = "";
	String search = "";
	String make = "";
	String model ="";
	int engineInCC = 0;
	int fuelCapacity = 0;
	int millage = 0;
	long price = 0;
	int roadTax = 0;
	String ac = "1";
	String powerSteering = "1";
	String accessoryKit = "";
	String buttonName = "";
	String type = "";
%>
	<%
	if(session.getAttribute("user") == null ) {
		request.getRequestDispatcher("Login").forward(request, response);
	}
	if(request.getAttribute("vehicle") == null)
	{
		make = "";
		model = "";
		engineInCC = 0;
		fuelCapacity = 0;
		millage = 0;
		price = 0;
		roadTax = 0;
		powerSteering ="1";
		ac = "1";
		accessoryKit = "";
		buttonName = "Create";
		type = "create";
	}
	else {
		
		List<Car>  list =new ArrayList<Car>();
		list = (List<Car>)request.getAttribute("vehicle");
		Car vehicle = list.get(0);
		make = vehicle.getMake();
		model = vehicle.getModel();
		engineInCC = vehicle.getEngineInCC();
		fuelCapacity = vehicle.getFuelCapacity();
		millage = vehicle.getMilage();
		price = vehicle.getPrice();
		roadTax = vehicle.getRoadTax();
		ac = vehicle.isAC()+"";
		powerSteering = vehicle.isPowerSteering()+"";
		accessoryKit = vehicle.getAccessoryKit();
		buttonName = "Update";
		type = "update";
		
	}
%>
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
				<li><a href="logoutController">Log Out</a></li>
			</ul>
		</nav>  
		<div id ="maincontainer">
		<form action = "AdminCreateController">
			<table style="border : 1px solid black;margin : auto;padding : 10px;cellspacing:20px; width:50%;height:60%;">
			<tr>
				<td class = "tdForCreate"><label>Make:</label></td><td><input class= "inputForCreate" id="make" name="make"type="text" value="<%=make %>" size="30" required <%if(!make.equals("")){ %> readonly <%} %> /></td>
			</tr>
			<tr>
				<td class = "tdForCreate"><label>Model:</label></td><td><input class= "inputForCreate" id="model" name="model" type="text" value="<%=model %>" size="30" required /></td>
			</tr>
			<tr>
				<td class = "tdForCreate"><label>Millage:</label></td><td><input class= "inputForCreate" id="millage" name="millage" type="text" value="<%=millage %>" size="30" required /></td>
			</tr>
			<tr>
				<td class = "tdForCreate"><label>EngineInCC </label></td><td><input class= "inputForCreate" id="engineInCC" name="engineInCC" type="number" value="<%=engineInCC %>" size="30" required /></td>
			</tr>
			<tr>
				<td class = "tdForCreate"><label>FuelCapacity:</label></td><td><input class= "inputForCreate" id="FuelCapacity"  name="FuelCapacity" type="number" value="<%=fuelCapacity %>" size="30" required /></td>
			</tr>
			<tr>
				<td class = "tdForCreate"><label>Price:</label></td><td><input class= "inputForCreate" id="price" type="number" name="price" value="<%=price %>" size="30" required /></td>
			</tr>
			<tr>
				<td class = "tdForCreate"><label>RoadTax:</label></td><td><input class= "inputForCreate" id="roadTax" type="number" name="roadTax" value="<%=roadTax%>" size="30" required /></td>
			</tr>
			<tr>
				<td class = "tdForCreate"><label>AC:</label></td><td><select style="width: 175px" id="AC"  name="AC" required >
				<option value = "1" <%if(ac.equals("1")) {%> selected<% } %>>Select IsAC</option>
				<option value= "true" <%if(ac.equalsIgnoreCase("true")) {%> selected<% } %>>True</option>
				<option value="false" <%if(ac.equalsIgnoreCase("false")) {%> selected<% } %>>False</option></select></td>
			</tr>
			<tr>
				<td class = "tdForCreate"><label>PowerSteering:</label></td><td><select style="width: 175px" id="powerSteering"  name="powerSteering"  required >
				<option value="1"<%if(powerSteering.equals("1")) {%> selected<% } %>>Select IsPowerSteering</option>
				<option value="true" <%if(powerSteering.equals("true")) {%> selected<% } %> >True</option>
				<option value="false" <%if(powerSteering.equals("false")) {%> selected<% } %> >False</option></select></td>
			</tr>
			<tr>
				<td class = "tdForCreate"><label>AccessoryKit:</label></td><td><input class= "inputForCreate" id="accessoryKit" name="accessoryKit"type="text" value="<%=accessoryKit %>" size="30" required /></td>
			</tr>
		<tr><td>
			<input id="button" type="submit" value="<%=buttonName %>" style = "margin-top : 5px; font-size : 15px;margin : auto;" onsubmit="isCreate()"/>
			<input type = "hidden" name = "type" value = "<%=type %>"/>
			<input type = "hidden" name = "id" value = "<%=request.getAttribute("id")%>"/>
			</td></tr>
				
	</table>
		</form>
		</div>
	</body>
</html>