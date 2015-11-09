<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="com.cardekho.model.Car" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Full Specification</title>
<link rel="stylesheet" href="css/SearchResult.css">
</head>

<body>
	<%@ include file="Header.jsp"%>
	<div class="section">
		<%
			Car vehicle = (Car) request.getAttribute("Vehicle");
		%>
		<div id="fullSpecificationGrid">
			<label color="White">${msg}</label> <img
				src="images/<%=vehicle.getImagePath()%>" alt="verna" width="450"
				height="250" />
			<table id="tableSpecification" border="2" align="center">
				<caption>
					<h3>Specifications</h3>
				</caption>
				<tr>
					<th>Make :</th>
					<td><%=vehicle.getMake()%></td>
				</tr>
				<tr class="rowSpecification">
					<th>Model :</th>
					<td><%=vehicle.getModel()%></td>
				</tr>
				<tr class="rowSpecification">
					<th>EngineCC :</th>
					<td><%=vehicle.getEngineCC() + "CC"%></td>
				</tr>
				<tr class="rowSpecification">
					<th>Fuel Capacity :</th>
					<td><%=vehicle.getFuelCapacity() + "L"%></td>
				</tr>
				<tr class="rowSpecification">
					<th>Mileage :</th>
					<td><%=vehicle.getMileage() + "km/L"%></td>
				</tr>
				<tr class="rowSpecification">
					<th>Ex ShowRoom Price :</th>
					<td><%=vehicle.getPrice() + "/-"%></td>
				</tr>
				<tr class="rowSpecification">
					<th>RoadTax :</th>
					<td><%=vehicle.getRoadTax() + "%"%></td>
				</tr>
				<tr class="rowSpecification">
					<th>AC :</th>
					<td><%=vehicle.getAC()%></td>
				</tr>
				<tr class="rowSpecification">
					<th>Power Steering :</th>
					<td><%=vehicle.getPowerSteering()%></td>
				</tr>
				<tr class="rowSpecification">
					<th>Accessory Kit :</th>
					<td><%=vehicle.getAccessoryKit()%></td>
				</tr>
				<tr class="rowSpecification">
					<th>OnRoad Price :</th>
					<td><%=vehicle.calculateOnRoadPrice()%></td>
				</tr>
				<%
					if (session.getAttribute("user") == null) {
					} else {
				%>
				<tr>
					<td colspan="2"><a href="UpdateCar?id=<%=vehicle.getId()%>"
						style="color: black">Edit</a>
				</tr>
				<%
					}
				%>
			</table>
		</div>
	</div>
	<%@ include file="Footer.jsp"%>
</body>
</html>
