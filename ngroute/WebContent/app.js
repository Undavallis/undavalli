var dynamicViewApp = angular.module('dynamicViews',['ngRoute']);

dynamicViewApp.config(function($routeProvider){
	$routeProvider
	
	.when('/Stocks',{templateUrl:'Stocks.html',controller:'stockscontroller'})
	.when('/Graph',{templateUrl:'graph.html',controller:'graphscontroller'})
	.when('/Order',{templateUrl:'order.html',controller:'ordercontroller'});
	
	
});


dynamicViewApp.controller('maincontroller', function($scope) {

});

dynamicViewApp.controller('stockscontroller', function($scope){
	$scope.message = "I am Stocks Controller"	;
});

dynamicViewApp.controller('graphscontroller', function($scope){
	$scope.message = "I am Graphs Controller"	;
});

dynamicViewApp.controller('ordercontroller', function($scope){
	$scope.message = "I am Orders Controller"	;
});