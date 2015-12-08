<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="customerApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular-route.min.js"></script>
    <script src="Js/app.js"></script>
	 <script src="Js/controller.js"></script>
	 <link rel="stylesheet" href="css/style.css" type="text/css">
<title>Customer application using angular JS</title>
</head>
<body ng-controller="customerListCtrl">
	<div class="container">
		<div class="row">
			<h2>Customers</h2>
		</div>
		<div class="row">
		<div class="col-lg-9">
			<button onClick="parent.location='#/'"><span class="glyphicon glyphicon-th-large"></span>&nbsp;Card View</button>
			<button onClick="parent.location='#/customers'"><span class="glyphicon glyphicon-list"></span>&nbsp;List View</button>
			<button ng-click="addCustomer()"><span class="glyphicon glyphicon-plus-sign"></span>&nbsp;Add Customer</button>
		</div>
		<div class="col-lg-1 text-right">
			<label for="filter">Filter:</label>
		</div>
		<div class="col-lg-2 right">
			<input type="text" ng-model="query">
		</div>
		</div>
		<div>
		<input type="text" ng-model="customer.firstName">
		</div>
		
		<div ng-view></div>
		
	</div>
</body>
</html>