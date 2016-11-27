<%@page import="com.sun.org.glassfish.gmbal.IncludeSubclass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel = "stylesheet" type = "text/css" href = "Css/HTMLAssignment2Style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Landing</title>
</head>
<body>
	<div class = "header">
				<div class = "title_block">
					<div class = "title_line">Metacube</div>
					<div class = "slogan_line">Programmed For Excellence</div>
				</div>
				<div class = "navbar">
					<div class = "menu">
						<div class = "menu_items"><a class = "anchor_menu_items" href = "/EmployeeManagement/EmployeeListController">Employee List</a></div>
						<div class = "menu_items"><a class = "anchor_menu_items" href = "/EmployeeManagement/EmployeeRegistrationController">Employee Registration</a></div>
					</div>
				</div>
			</div>
	<p>${heading}</p>
	
</body>
</html>