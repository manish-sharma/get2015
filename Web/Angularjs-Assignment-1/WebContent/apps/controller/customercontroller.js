module.controller('customer', function($scope) {
	$scope.customers = {};
	
	customer = {
		'fname' : 	$scope.fname,
		'lname'	: 	$scope.lname,
		'email'	:	$scope.email,
		'address' : $scope.address,
		'orders':	$scope.noOfOrder
	}
	$scope.customers.push(customer);
	
})