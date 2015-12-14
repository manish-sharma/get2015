'use strict';


var customersControllers = angular.module('customersControllers', []);

$(document).ready(changeDisplay);

function changeDisplay() {
	$( "#myTable" ).hide();
}

customersControllers.controller('customerListCtrl', function ($scope, $http) {
	$scope.customers = [];
	$http.get('customers/customer.json').success(function(data) {
	    $scope.customers = data;
	  });
  
	
	$scope.deletecustomer = function(index) {
		$scope.customers.splice(index,1);
	}
	
	
	$scope.showTable = function() {
		$('#myTable').toggle();
	}
	
	$scope.addCustomer = function() {
		
		 $scope.customers.push(
				 {
					 firstName: $scope.cust.firstName,
					 lastName: $scope.cust.lastName,
					 email: $scope.cust.email,
					 imageUrl: "images/user1.jpg",
					 address: $scope.cust.address,
					 orders: $scope.cust.orders 
				 }); 
		 
		 $('#myTable').toggle();
	};
	
	$scope.listview = function() {
		$scope.viewtype = true;
	}
	$scope.cardview = function() {
		$scope.viewtype = false;
	}
	
  $scope.orderProp = 'name';
});
