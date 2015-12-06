module.config( function($routeProvider) {
	$routeProvider
		.when('/addcustomer',
							{
								templateUrl : "create.html",
								controller : 'customer'
							}
			)
		}
)