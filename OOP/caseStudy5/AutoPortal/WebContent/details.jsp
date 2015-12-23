<!DOCTYPE html>
<%@page import="com.metacrm.model.Car"%>
<html>
<head>
<meta charset="UTF-8">
<title>Details</title>
<link rel="stylesheet" href="css/style.css" type="text/css">
<link rel="stylesheet" href="css/style2.css" type="text/css">
</head>
<body>
	<div id="header">
		<div>
			<div id="logo">
				<a href="home.jsp"><h1>CAR PORTAL</h1></a>
			</div>
			<span id="welcome">Hi, <%
				if (session.getAttribute("userName") == null)
					out.print("user");
				else
					out.print(session.getAttribute("userName"));
			%></span>
			<ul id="navigation">
				<li><a href="home.jsp">Home</a></li>
				<li>
					<%
						if (session.getAttribute("userName") != null)
							out.write("<a href='EditCarController?type=create'>Create</a>");
					%>
				</li>
				<li>
					<%
						if (session.getAttribute("userName") == null)
							out.write("<a href='LoginController'>Login</a>");
						else
							out.write("<a href='LogoutController'>Logout</a>");
					%>
				</li>
				<li><a href="contact.jsp">Contact</a></li>
			</ul>
		</div>
	</div>
	<div id="contents">
		<div id="abc"></div>
		<div id="contents1">
			<center>
			<%
					Car objCar = (Car)request.getAttribute("objOfCar");
					String actionUrl = "";
					if (session.getAttribute("userName") != null){
						session.setAttribute("objOfCar", objCar);
						actionUrl = "EditCarController";
					}
					
				%>
				<form action=<%=actionUrl%>>
				<div>
					<img src=<%=objCar.getImagePath()%> height="30%"
						width="20%" />
				</div>
				</br>
				<h3>Specifications</h3>
				<div>
					<table>
						<tr>
							<td>Make</td>
							<td><%=objCar.getMake()%></td>
						</tr>
						<tr>
							<td>Model</td>
							<td><%=objCar.getModel()%></td>
						</tr>
						<tr>
							<td>AC</td>
							<td><%=objCar.isAC()%></td>
						</tr>
						<tr>
							<td>Power Steering</td>
							<td><%=objCar.isPowerSteering()%></td>
						</tr>
						<tr>
							<td>Accessory Kit</td>
							<td><%=objCar.isAccessoryKit()%></td>
						</tr>
						<tr>
							<td>Engine In CC</td>
							<td><%=objCar.getEngineInCC()%></td>
						</tr>
						<tr>
							<td>Fuel Capacity</td>
							<td><%=objCar.getFuelCapacity()%></td>
						</tr>
						<tr>
							<td>Milage</td>
							<td><%=objCar.getMilage()%></td>
						</tr>
						<tr>
							<td>Price</td>
							<td><%=objCar.getPrice()%></td>
						</tr>
						<tr>
							<td>Road Tax</td>
							<td><%=objCar.getRoadTax()%></td>
						</tr>
					</table>
					<%
						if (session.getAttribute("userName") != null)
								out.write("<input type='submit' value='Edit'>");
					%>
					<br>
				</div>
				</form>
			</center>
		</div>
	</div>
	<div id="footer">
		<div id="articles">
			<div class="header">
				<div class="body">
					<div>
						<div class="section">
							<h3>About us</h3>

						</div>
						<div class="section">
							<h3>Latest Blog Posts</h3>
							<ul class="blog">
								<li></li>
								<li></li>
							</ul>
						</div>
						<div class="section">
							<h3>Contact Information</h3>
							<table class="info">
								<tbody>
									<tr>
										<td>Address:</td>
										<td>Sitapura</td>
									</tr>
									<tr>
										<td>Phone:</td>
										<td>540-754-4081</td>
									</tr>
									<tr>
										<td>Hours Open:</td>
										<td>Tues- Sundays: 10 am- 9pm</td>
									</tr>
								</tbody>
							</table>
							<h3>Follow us</h3>
							<div id="connect">
								<a href="http://facebook.com/" target="_blank" class="facebook"></a>
								<a href="http://twitter.com/" target="_blank" class="twitter"></a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="footer">
			<form action="index.html" method="post">
				<input type="text" value="Enter email address and get 10% off"
					class="txtfield" onMouseUp="return false;" onFocus="this.select();">
				<input type="submit" value="SIGNUP" class="btn">
			</form>
			<p>
				© 2015 Auto Portal. All Rights Reserved. <a href="index.html">Privacy
					Policy</a> <a href="index.html">Terms and Conditions</a>
			</p>
		</div>
	</div>
</body>
</html>