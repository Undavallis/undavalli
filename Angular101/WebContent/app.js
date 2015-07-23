var myapp=angular.module('rajapp',[]);

myapp.controller('xyzcontroller',function($scope,$http){
	$scope.moviename="lkjhgfgcjk";
	
	$scope.movies=[];
//	$scope.addMovie = function(){
//		alert("kjhg");
//		var url = "http://www.omdbapi.com/?t="+$scope.moviename+"&y=&plot=short&r=json";
//		
//		$http.get(url).success(function(raj){
//			
//		$scope.movies.push(raj);
//		
//		$scope.moviename=" ";
//		});
//		
//	};
	
});