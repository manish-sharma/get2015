<%@page import="com.metacube.carDekho.model.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>
			Create
		</title>
		<link rel="stylesheet" href="carDekho.css" type="text/css">
	</head>
	<%!
	String loginLogout = "";
	String create = "";
	String flag = "";
	String search = "";
	String make = "";
	String model ="";
	int engineCC = 0;
	int fuelCapacity = 0;
	int mileage = 0;
	long price = 0;
	int roadTax = 0;
	boolean ac = true;
	boolean powerSteering = true;
	String accessoryKit = "";
	String buttonName = "";
	String type = "";
%>
<%

	if(session.getAttribute("user") == null) {
		loginLogout = "Login";	
		request.setAttribute("loginLogout", loginLogout);
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
	else {
		loginLogout = "Logout";		
	}

	if(request.getAttribute("vehicle") == null)
	{
		make = "";
		model = "";
		engineCC = 0;
		fuelCapacity = 0;
		mileage = 0;
		price = 0;
		roadTax = 0;
		powerSteering = true;
		ac = true;
		accessoryKit = "";
		buttonName = "Create";
		type = "create";
	}
	else {
		Car car = (Car)request.getAttribute("vehicle");
		make = car.getMake();
		model = car.getModel();
		engineCC = car.getEngineInCC();
		fuelCapacity = car.getFuelCapacity();
		mileage = car.getMilage();
		price = car.getPrice();
		roadTax = car.getRoadTax();
		ac = car.isAC();
		powerSteering = car.isPowerSteering();
		accessoryKit = car.getAccessoryKit();
		buttonName = "Update";
		type = "update";
	}
%>
	<body>
		<div class = "header">
			<div class = "logo">
			CarDekho
			</div>
			<div class = "nav">
			<a class = "button" href = "HomeController">Home</a>
			<a class = "button" href = "AboutUsController">About Us</a>
			<a class = "button" href = "LoginPageController"><%=loginLogout %></a>
			<a class = "button" href = "ContactUsController">Contact Us</a>
			</div>
		</div>
		<div class = "leftContainerStatic1">
		<form action = "CreateCarController?type ="<%=type %>>
		
		<label> ${message} </label>
			<table style="border : 1px solid black;margin : auto;padding : 10px;cellspacing:20px;">
			<tr>
				<td class = "tdForCreate"><label>Make:</label></td><td><input class= "inputForCreate" id="make" name = "make" type="text" value="<%=make %>" size="30" required <%if(!make.equals("")){ %> readonly <%} %>/></td>
			</tr>
			<tr>
				<td class = "tdForCreate"><label>Model:</label></td><td><input class= "inputForCreate" id="model" name = "model" type="text" value="<%=model %>" size="30" required <%if(!model.equals("")){ %> readonly <%} %>/></td>
			</tr>
			<tr>
				<td class = "tdForCreate"><label>Millage:</label></td><td><input class= "inputForCreate" id="millage" name = "millage" type="number" value="<%=mileage %>" size="30" required /></td>
			</tr>
			<tr>
				<td class = "tdForCreate"><label>EngineInCC </label></td><td><input class= "inputForCreate" id="engineInCC" name = "engineInCC" type="number" value="<%=engineCC %>" size="30" required /></td>
			</tr>
			<tr>
				<td class = "tdForCreate"><label>FuelCapacity:</label></td><td><input class= "inputForCreate" id="FuelCapacity" name = "fuelCapacity" type="number" value="<%=fuelCapacity %>" size="30" required /></td>
			</tr>
			<tr>
				<td class = "tdForCreate"><label>Price:</label></td><td><input class= "inputForCreate" id="price" name = "price" type="number" value="<%=price %>" size="30" required /></td>
			</tr>
			<tr>
				<td class = "tdForCreate"><label>RoadTax:</label></td><td><input class= "inputForCreate" id="roadTax" name = "roadTax" type="number" value="<%=roadTax %>" size="30" required /></td>
			</tr>
			<tr>
				<td class = "tdForCreate"><label>AC:</label></td><td><input type="radio" name="ac" value="<%=ac %>" <%if(ac){ %> checked <%} %>> True<input type="radio" name="ac" value="<%=!ac %>" <%if(!ac){ %> checked <%} %>> False</td>
			</tr>
			<tr>
				<td class = "tdForCreate"><label>PowerSteering:</label></td><td><input type="radio" name="powerSteering" value="<%=powerSteering %>" <%if(powerSteering){ %> checked <%} %> > True<input type="radio" name="powerSteering" value="<%=!powerSteering %>" <%if(!powerSteering){ %> checked <%} %>> False</td>
			</tr>
			<tr>
				<td class = "tdForCreate"><label>AccessoryKit:</label></td><td><input class= "inputForCreate" name = "accessoryKit" id="accessoryKit" type="text" value="<%=accessoryKit %>" size="30" required /></td>
			</tr>
		<tr><td><input type = "hidden" name = "type" value = "<%=type %>"/>	
					<input type = "hidden" name = "id" value = "<%=request.getAttribute("id")%>"/>
			<input id="submit_button" type="submit" value="<%=buttonName %>" style = "margin-top : 5px; size=30;font-size : 15px;margin : auto;"/>
			</td></tr>
	</table>
		</form>
		</div>
	</body>
</html>