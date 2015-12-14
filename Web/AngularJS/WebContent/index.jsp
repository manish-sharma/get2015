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
	 <style type="text/css">
	 
	 input:focus {
    outline: none;
    border-color: #66b1ee;
    -webkit-box-shadow: 0 0 2px rgba(85, 168, 236, 0.9);
    -moz-box-shadow: 0 0 2px rgba(85, 168, 236, 0.9);
    -ms-box-shadow: 0 0 2px rgba(85, 168, 236, 0.9);
    -o-box-shadow: 0 0 2px rgba(85, 168, 236, 0.9);
    box-shadow: 0 0 2px rgba(85, 168, 236, 0.9);
}

input: focus + .results { display: block }

.results {
    display: none;
    position: absolute;
    } 
    
    
	 </style>
	 
	 <script type="text/javascript">
	 	function getValue() {
	 		var name= document.getElementById("customer");
	 		
	 		document.getElementById("customersAdded").innerHTML += name.value;
	 	}
	 </script>
<title>Customer application using angular JS</title>
</head>
<body ng-controller="customerListCtrl">
	<div class="container">
		<div class="row">
			<h2>Customers</h2>
		</div>
		<div class="row">
		<div class="col-lg-9">
			<button ng-click="cardview()"><span class="glyphicon glyphicon-th-large"></span>&nbsp;Card View</button>
			<button ng-click="listview()"><span class="glyphicon glyphicon-list"></span>&nbsp;List View</button>
			<button ng-click="showTable()"><span class="glyphicon glyphicon-plus-sign"></span>&nbsp;Add Customer</button>
		</div>
		<div class="col-lg-1 text-right">
			<label for="filter">Filter:</label>
		</div>
		
		<div class="col-lg-2 right">
		<input type="text" ng-model="query">
		</div>
		</div>
		<div class="row" id="myTable">
			<table>
			<tr>
				<td>First Name:</td>
				<td><input type="text" ng-model="cust.firstName" class="form-control" required></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" id="lName" ng-model="cust.lastName" class="form-control" required></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" id="email" ng-model="cust.email" class="form-control" required></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><input type="text" id="address" ng-model="cust.address" class="form-control" required></td>
			</tr>
			<tr>
				<td>Orders:</td>
				<td><input type="text" id="orders" ng-model="cust.orders" class="form-control" required></td>
			</tr>
			<tr>
				<td><input type="button" class="btn btn-primary" ng-click="addCustomer()" Value="ADD"></td>
			</tr>
			</table>
		</div>
		<!-- <div ng-view></div> -->
		<div class="container customerlist" style="margin-top: 20px;">
			<div class="panel" style="border: solid 1px black; padding-left: 0px; padding-right: 0px; margin-left: 10px;" id="panel{{$index}}" ng-class="viewtype ? 'col-lg-10' : 'col-lg-3'" 
				ng-repeat="customer in customers | filter : query">
			<button style="padding-right: 10px;" type="button" class="close" data-target="panel{{$index}}" data-dismiss="alert" ng-click="deletecustomer($index)">
				<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
			</button>
				<div class="panel-heading" style="background-color: #66b2ff;">
					<strong>{{customer.firstName}} {{customer.lastName}}</strong>
				</div>
				<div class="panel-body" id="mid">
					<!-- <strong>Customer Id :</strong> {{$index+1}}<br /> -->
					<div id="img"><img ng-src="{{customer.url}}"></div>
					<div id="add">{{customer.address}}<br />
					<a href="#">{{customer.orders}} Orders</a></div>
				</div>
			</div>
		</div>	
		
	</div>
</body>
</html>