'use strict';


var customersControllers = angular.module('customersControllers', []);

customersControllers.controller('customerListCtrl', function ($scope, $http) {
	$http.get('customers/customer.json').success(function(data) {
	    $scope.customers = data;
	  });
  
	
	$scope.deletecustomer = function(index) {
		$scope.customers.splice(index,1);
	}
	
	$scope.addCustomer = function() {
		 $scope.customers.push(
				 {
					 firstName: $scope.customer.firstName,
					 
				 }); 
	};
	
	customersControllers.controller('customerListCtrl', function ($scope) {
			
	});
	
  $scope.orderProp = 'name';
});
