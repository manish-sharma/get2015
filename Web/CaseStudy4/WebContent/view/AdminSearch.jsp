<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List,com.cardekho.model.Vehicle"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Search</title>
<link rel="styleSheet" href="/CaseStudy4/css files/SearchStyle.css"/>
<script src="javaScript/Search.js"></script>
</head>
<body>
	<div id="wrapper">

		<div id="header">
			Car Dekho
		</div>

		<div id="header1">
			<ul>
				<li><a href="/CaseStudy4/view/vehicleHomePage.html">Back To Home Page</a></li>
				<li><a href="/CaseStudy4/view/AdminHome.jsp">Admin Home</a></li>				
				<li><a href="/CaseStudy4/LogOutController">LOGOUT</a></li>
		</div>
		<section>
   <form action="/CaseStudy4/AdminSearchController" method="post">
	    <div class="heading">
	   <h2>Search</h2>
	   <h3>your new car at CarDekho</h3>
	   </div>
   <table>
   	<tr>
   		<td><input type="radio" id="filter" name="filter" value="byBudget" onclick=search(this.value)> By Budget</td>
   		<td><input type="radio" id="filter" name="filter" value="byBrand" onclick=search(this.value)> By Brand </td>
   	</tr>
   	   	<tr>
   		<td colspan="2">
   		<select id="budget" name="budget" disabled style="width: 294px; ">
   			<option selected value = "Below 20 lac">Below 20 lac</option>
   			<option value = "Above 20 lac">Above 20 lac</option>
   		</select>
   	</tr>
   		<tr>
   		<td colspan="2">
   		<select id="brand"  name="brand" disabled style="width: 296px; ">
   		<% List<Vehicle> vehicleList = (List)request.getAttribute("brandList"); 
			if(vehicleList != null){
				for(Vehicle vehicle : vehicleList){
					out.println("<option value='"+vehicle.getMake()+"'>"+vehicle.getMake()+"</option>");
				}
			}
		%>
   		</select>
   	</tr>
   	<tr>
   		<td colspan="2">
   		<input id="button" type="submit" value="SEARCH">
   	</tr>
   </table>
  </form>
  </section>
 <div id="footer">
			<p>Posted by: Hege Refsnes</p>
			<p>
				Contact information: <a href="mailto:someone@example.com">
					Someone@CarDekho.com</a>.
			</p>
		</div>
	</div>
	
</body>
</html>