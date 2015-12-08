var customerApp = angular.module('customerApp', [
  'ngRoute',
  'customersControllers'
]);


customerApp.config(['$routeProvider',
                    function($routeProvider) {
                      $routeProvider.
                        when('/', {
                          templateUrl: 'gridView.html',
                          controller: 'customerListCtrl'
                        }).
                        when('/customers', {
                          templateUrl: 'listView.html',
                          controller: 'customerListCtrl'
                        }).
                        otherwise({
                          redirectTo: '/'
                        });
                    }]);



