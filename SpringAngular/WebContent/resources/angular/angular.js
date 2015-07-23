var myapp=angular.module("rajapp",[]);

rajapp.controller("mycontroller",function($scope,$http){
	
	$scope.display=[];
	$scope.headlines="";
	$scope.mainStory="";
	$scope.changeIT=function(){
		
		var url="/SpringAngular/home.jsp";
		
		$http.get(url).success(function(data){
			
		$scope.display.push(data);	
			
			
		})
		
		
	}
		
	
});
