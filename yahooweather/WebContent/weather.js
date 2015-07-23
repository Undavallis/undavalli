var myapp=angular.module('prudhviapp',[]);

myapp.controller('cvccontroller',function($scope,$http){
	
  $scope.zipcode="";
  $scope.weathers=[];
 $scope.changeIt=function(){
	 //localhost:8080/rest/getImageIds?=AlumbId
	  var url="http://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20location=" +$scope.zipcode+ "&format=json&diagnostics=true&callback=";
	$http.get(url).success(function(data){
	$scope.weathers.push(data);
	// $scope.zipcode="";
		
		
  });
	  
	  
  };
});