var myApp = angular.module('assignmentApp', ['ngRoute', 'ngResource']);

myApp.config([
  '$routeProvider', '$locationProvider', function($routeProvider, $locationProvider) {
    $routeProvider.when('/todos',{
      templateUrl: '/todos/index.html',
      controller: 'todoController'
    });
    $routeProvider.when('/active',{
      templateUrl: '/todos/index.html',
      controller: 'todoController'
    });
    $routeProvider.otherwise({
   redirectTo: '/todos'
 });
  }]);

myApp.factory('Todos', ['$resource',function($resource){
  return $resource('/todos.json', {},{
    query: { method: 'GET', isArray: true },
    create: { method: 'POST'}
  })
}]);

myApp.factory('Todo', ['$resource', function($resource){
 return $resource('/todos/:id.json',{id: '@id'}, {
 update: { method: 'PUT', params: {id: '@id'} },
 delete: { method: 'DELETE', params:{id: '@id'}  }
 });
}]);


angular.module('assignmentApp').controller('todoController',['$scope','$routeParams', '$filter', '$http', '$resource', 'Todos','Todo', '$location', function($scope,$routeParams, $filter,$http,$resource,Todos,Todo,$location) {
    $scope.todoList = Todos.query();
    $scope.editedTodo = null;
   $scope.status = '';


   $scope.showAll =function(){

     $scope.status='';

   };

$scope.showActive =function(){

  $scope.status=false;

};

$scope.showCompleted =function(){

  $scope.status=true;

};

    $scope.addTodo = function() {
         Todos.create({todoText: $scope.newTodo, done:false});
         $scope.todoList = Todos.query();
        $scope.newTodo = "";
    };



      $scope.editTodo = function (todo) {
      			$scope.editedTodo = todo;
      			$scope.originalTodo = angular.extend({}, todo);
      		};



      	$scope.saveEdits = function (todo ) {

      			todo.todoText = todo.todoText.trim();

      			if (todo.todoText === $scope.originalTodo.todoText) {
      				$scope.editedTodo = null;
      				return;
      			}

            Todo.update({id: todo.id, todoText: todo.todoText, done:todo.done}, function(){
           $scope.todoList = Todos.query();

            })
            $scope.editedTodo = null;
      			$scope.originalTodo =null
            	$scope.reverted = true;
      		};

              $scope.toggleCompleted = function (todo) {
                Todo.update({id: todo.id, todoText: todo.todoText, done:todo.done});
                $scope.todoList = Todos.query();
                Flag  = false;
               };

               Flag  = false;

                 $scope.markAll = function () {
                     if(Flag == false){
                       angular.forEach($scope.todoList , function(todo) {
                         if(todo.done == false) {
                                   todo.done =true;
                                   Todo.update({id: todo.id, todoText: todo.todoText, done:todo.done});
                                 }
                                 $scope.todoList = Todos.query();

                 });
                 Flag = true;
               }else{
                 angular.forEach($scope.todoList , function(todo) {
                   if(todo.done == true) {
                             todo.done =false;
                             Todo.update({id: todo.id, todoText: todo.todoText, done:todo.done});
                           }
                           $scope.todoList = Todos.query();

               });
               Flag = false;
               }
               };



//    $scope.markAll = function () {
  //    $scope.todoList = Todos.query();
 		//	angular.forEach($scope.todoList , function(todo) {
  // if(!todo.done){
    //              Todo.update({id: todo.id, todoText: todo.todoText, done:!todo.done});
//}
//});
  //           $scope.todoList = Todos.query();
// };


$scope.remaining = function() {
    var count = 0;
    angular.forEach($scope.todoList, function(todo) {
      count += todo.done ? 0 : 1;
    });

    return count;
  };

  $scope.clearCompletedTodos = function() {
    if (confirm("Are you sure you want to clear all completed tasks?"))
      var oldTodos = $scope.todoList
      angular.forEach(oldTodos, function(todo) {
        if (todo.done) Todo.delete({id: todo.id });
      });
      $scope.todoList = Todos.query();
    };

    $scope.removeTodo = function(todo) {
        if (confirm("Are you sure you want to delete this task?"))
        Todo.delete({id: todo.id }, function(){
       $scope.todoList = Todos.query();
        });
    };
}]);
