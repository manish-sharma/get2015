<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Car</title>
<link rel="stylesheet" href="css/S	earch.css">
<script type="text/javascript" src="js/Script.js"></script>
</head>

<body>
	<%@ include file="Header.jsp"%>
	<div class="section">
		<div id="searchWindow">
			<form action="Search" method="post">
				<table cellspacing="15">
					<!-- <caption style="font-size:40px">
						FIND THE RIGHT CAR..<br>
					</caption>-->
					<tr>
						<th colspan="2">Find The Right Car..</th>
					</tr>
					<tr>
						<td><label id="searchCar">Car :</label></td>
						<td><select id="searchList" name="selectCar" class="text"
							onchange="activeSearch()">
								<option value="">- - Select Car - -</option>
								<% 
								List<String> carList = (List<String>)request.getAttribute("carList");
								Iterator<String> carListIterator = carList.iterator();
								while(carListIterator.hasNext()) 
								{
									String car = (String)carListIterator.next();
							%>
								<option value=<%=car%>><%=car%></option>
								<% } %>
						</select>
						</td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input class="submit"
							id="submitSearch" type="submit" value="Search"
							onclick="validateSearch()" disabled /></td>
					</tr>
				</table>

			</form>
		</div>
	</div>

	<%@ include file="Footer.jsp"%>
</body>
</html>
