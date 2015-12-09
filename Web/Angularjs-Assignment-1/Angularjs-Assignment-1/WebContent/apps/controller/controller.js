module.controller('customermanagement', function($scope) {
		$scope.listview = false;
		$scope.customers = [];

		$scope.newcustomer = function() {
			$scope.customers.push($scope.customer);
			$scope.customer = null;
		}
		$scope.deletecustomer = function(index) {
			$scope.customers.splice(index, 1);
		}
		$scope.listview = function() {
			$scope.listview = true;
		}
		$scope.cardview = function() {
			$scope.listview = false;
		}

		$scope.filtering = function(customer) {
			fullname = customer.fname+' '+customer.lname;
			if(fullname.indexOf($scope.searchFilter) != -1) return true;
			return false;
		}
		$scope.setDetails = function(index) {
		$scope.detail = $scope.customers[index];
		}
});