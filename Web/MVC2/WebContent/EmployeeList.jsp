<%@page import="com.model.Employee"%>
<%@page import="com.helper.EmployeeCache"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
	<head>
		
		<link href="StyleSheet.css" rel="stylesheet">
		<script src ="javascript.js" type="text/javascript" >
		</script>
		<title>
		Metacube Software Pvt. Ltd.
		</title>
	</head>
	<body>
		<header align="center" >
		<div id="header">
		<div class="MVC">
		
		</div>
		</div>
		<div id = "head">
			<h2>MetaCube</h2>
		</div>
		</header>
		<nav align="center">
			<ul>
				<li><a href="IndexController">Registration</a></li>
            <li><a href="HomeController">Home</a></li>
       		
			</ul>
		</nav>  
	
			<div id="maincontainer">
			<%			
			Map<Integer, Employee> employeeMap = (Map<Integer, Employee>)request.getAttribute("list");
			int count =1;
			
			for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
						Employee employee = entry.getValue();
						out.println("<form >");
					 out.println("<table  id=\"table1\">");	
					 out.println("<tr  >");
					 out.println("<td>" + employee.getId() + "</td>" );
					 out.println("<td>" + employee.getName() + "</td>" );
					 out.println("<td>" + employee.getEmail() + "</td>" );
					 out.println("<td><a href=\"/MVC2/EmployeeList?id="+employee.getId()+"\">View Detail</a></td>");
					 out.println("<td><a href=\"/MVC2/EditEmployee?id="+employee.getId()+"\">Edit Detail</a></td></tr>");
					 out.println("</table></form>");
						count++;

			}
			if(count == 1) {
				out.println("<table>");	
				 out.println("<tr style=\"text-align: center; padding-top: 100px;border:1px solid black;\">");
				 out.println("<td>There is no Employee </td></tr></table>" );
			}
				%>
		 
		</div>
			
			
		<footer>
		</footer>
	</body>
</html>