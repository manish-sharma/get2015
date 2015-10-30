<!DOCTYPE html>
<%@page import="com.metacampus.model.Vehicle,com.metacampus.model.Car"%>
<%@page session="false"%>
<html>
<head>
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="Css/HomePage.css">
<script src="CaseStudy.js"></script>
</head>
<body class="createCar">
	<div id="wrapper">
		<div class="navbar">
			<div class="menu">
				<div class="menu_items">
					<a class="anchor_menu_items" href="HomePageController">Home</a>
				</div>
				<div class="menu_items">
					<a class="anchor_menu_items" href="SearchPageController">Search
						Car</a>
				</div>
				<div class="menu_items">
					<a class="anchor_menu_items" href="CreatePageController">Create
						Car</a>
				</div>
				<div class="menu_items">
					<a class="anchor_menu_items" href="#">About Us</a>
				</div>
				<div class="menu_items">
					<a class="anchor_menu_items" href="#">Contact Us</a>
				</div>

				<div id="logout" style="float: right" class="menu_items">
					<a class="anchor_menu_items"
						href="HomePageController?logout=logout">LogOut</a>
				</div>
				<div class="menu_items" style="float: right">Hi Nikhil</div>
			</div>
		</div>
		<div id="detail">
			<br>
			<%
				Car vehicle = (Car) request.getAttribute("vechile");
				int vehicleId;
				String url = "";
				if (vehicle != null) {
					vehicleId = vehicle.getVehicleId();
					url = "?id=" + vehicleId;
				}
			%>
			<form action="CreatePageController<%=url%>"
				onsubmit="CreateSuccess()" method="post">
				<table class="CreateCarTable" align="left">

					<tr>
						<td><h3>Company :</h3></td>
						<td><input type="text" id="company" name="company" pattern="[A-Za-z]+" maxlength="20"
							<%if (vehicle != null) {
				out.print("value=" + vehicle.getMake());
			}%>
							required></td>
					</tr>
					<tr>
						<td><h3>Model :</h3></td>
						<td><input type="text" id="model" name="model"  maxlength="20" pattern="[A-Za-z0-9]+"
							<%if (vehicle != null) {
				out.print("value=" + vehicle.getModel());
			}%>
							required></td>
					</tr>
					<tr>
						<td><h3>EngineInCC :</h3></td>
						<td><input type="number" id="engine" name="engine"  min="800" max="4000" step="any"
							<%if (vehicle != null) {
				out.print("value=" + vehicle.getEngineInCC());
			}%>
							required></td>
					</tr>
					<tr>
						<td><h3>FuelCapacity :</h3></td>
						<td><input type="number" id="fuel" name="fuel"  min="20" max="40" step="any"
							<%if (vehicle != null) {
				out.print("value=" + vehicle.getFuelCapacity());
			}%>
							required></td>
					</tr>
					<tr>
						<td><h3>Milage :</h3></td>
						<td><input type="number" id="milage" name="milage"  min="10" max="25" step="any"
							<%if (vehicle != null) {
				out.print("value=" + vehicle.getMileage());
			}%>
							required></td>
					</tr>
					<tr>
						<td><h3>RoadTax :</h3></td>
						<td><input type="number" id="roadtax" name="roadtax" min="20000" max="2000000" step="any"
							onclick="setroadTax()"
							<%if (vehicle != null) {
				out.print("value=" + vehicle.getRoadTax());
			}%>
							required></td>
					</tr>
					<tr>
						<td><h3>ExShow Room Price :</h3></td>
						<td><input type="number" id="roadprice" name="showroomprice" min="200000" max="20000000" step="any"
							required onclick="roadPrice() "
							<%if (vehicle != null) {
				out.print("value=" + vehicle.getPrice());
			}%>
							required></td>
					</tr>
					<tr>
						<td><input type="checkbox" name="features" value="Ac"
							<%if (vehicle != null) {
				if (vehicle.isAC())
					out.print("checked");
			}%>>
						<h3>
								AC
								<h3></td>
						<td><input type="checkbox" name="features"
							value="PowerSteering"
							<%if (vehicle != null) {
				if (vehicle.isPowerSteering())
					out.print("checked");
			}%>>
						<h3>
								PowerSteering
								<h3></td>
						<td><input type="checkbox" name="Assessory_kit" value="yes"
							<%if (vehicle != null) {
				if (vehicle.getAccessoryKit().equalsIgnoreCase("yes"))
					out.print("checked");
			}%>>
						<h3>
								Assessory Kit
								<h3></td>

					</tr>
					<tr>
						<td colspan=3>
							<div style="margin: 0 auto; text-align: center">
								<input style="width: 100%; height: 30px;"
									<%if (vehicle != null) {
				out.print("value=Edit Car");
			} else {
				out.print("value=Create Car");
			}%>
									value="Create  Car" type="submit"
									onclick="setroadTax(); roadPrice(); " id="button"
									class="SearchButton" />
							</div>
						</td>
					</tr>

				</table>


			</form>



		</div>



	</div>

</body>
</html>