<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="com.cardekho.model.Vehicle"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Specification</title>
<link rel="styleSheet" href="css files/Specification.css">
</head>
<body>
	<div class="wrapper">

		<header>
			<img src="images/logo.png" alt="car dekho logo" width="400px"
				height="100px" align="left">
			
		</header>
  <section>
  <div id="heading"><h3>Specifications</h3></div>
    <table>
     <% Vehicle vehicle = (Vehicle)request.getAttribute("vehicle");%>
      <tr>
      <td>Make :</td>
      <td><%out.println(vehicle.getMake()); %></td>
     </tr>
     
      <tr>
      <td>Model :</td>
      <td><%out.println(vehicle.getModel()); %></td>
     </tr>
     
     <tr>
      <td>Engine In Cc :</td>
      <td><%out.println(vehicle.getEngineInCC()); %></td>
     </tr>
     
     <tr>
      <td>Fuel Capacity :</td>
      <td><%out.println(vehicle.getFuelCapacity()); %></td>
     </tr>
     
     <tr>
      <td>Mileage :</td>
      <td><%out.println(vehicle.getMilage()); %></td>
     </tr>
     
      <tr>
      <td>Ex-Showroom Price :</td>
      <td><%out.println(vehicle.getPrice()); %></td>
     </tr>
     
     <tr>
      <td>roadTax :</td>
      <td><%out.println(vehicle.getRoadTax()); %></td>
     </tr>
     
      <tr>
      <td>onRoadPrice :</td>
      <td><%out.println(vehicle.getOnRoadPrice()); %></td>
     </tr>
     
    </table>		
  </section>
  <footer><label>Copyright &copy 2015.&nbsp; All rights reserved.</label></footer>
	</div>
</body>
</html>