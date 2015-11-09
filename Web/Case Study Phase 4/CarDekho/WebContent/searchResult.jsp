<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.cardekho.model.Vehicle"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Result</title>
<link rel="stylesheet" href="css/SearchResult.css">
</head>

<body>
	<%@ include file="Header.jsp"%>
	<div class="section">
		<%
			List<Vehicle> vehicleList = (List<Vehicle>) request.getAttribute("vehicleList");
			Iterator<Vehicle> vehicleListIterator = vehicleList.iterator();
			if (vehicleList.size() != 0) 
			{
				while (vehicleListIterator.hasNext()) 
				{
					Vehicle vehicle = (Vehicle) vehicleListIterator.next();
		%>
		<div id="searchResult">
			<img src='images/<%=vehicle.getImagePath()%>'
				alt=<%=vehicle.getMake() + "-" + vehicle.getModel()%> width="450"
				height="250" />
			<p>
				<b> Make :</b><span id="makeSearchResult"><%=vehicle.getMake()%></span>
			</p>
			<p>
				<b> Model :</b><span id="modelSearchResult"><%=vehicle.getModel()%></span>
			</p>
			<p>
				<b> Ex ShowRoom Price :</b><span id="priceSearchResult"><%=vehicle.getPrice() + "/-"%></span>
			</p>
			<p>
				<b> Created Time :</b><span id="timeSearchResult"><%=vehicle.getCreatedTime()%></span>
			</p>
			<a href="FullSpecification?id=<%=vehicle.getId()%>">View Full
				Specification</a><br />
		</div>
		<%
				}
			} 
			else {
		%>
		<h3>No Result Found For given Search</h3>
		<%
			}
		%>
	</div>

	<%@ include file="Footer.jsp"%>
</body>
</html>
