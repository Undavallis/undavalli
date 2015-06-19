var myapp=angular.module('myapp',[]);

myapp.controller('cvccontroller',function($scope,$http){
	
	$scope.movies=[];
	$scope.changeIt=function(){
	
	var url="http://www.omdbapi.com/?t="+$scope.moviename+"&y=&plot=short&r=json";
	$http.get(url).success(function(data){
		$scope.movies.push(data);
		$scope.moviename="";
	
	
	});
	};

});