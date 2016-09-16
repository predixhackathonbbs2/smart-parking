technomindsApp.controller('loginController', ['$scope', '$http', function($scope,$http) {
	$scope.login={};
	$scope.loginStatus=false;
	$scope.validateLogin=function(user){
		console.log(user);
		$('#loginForm').attr('action','j_spring_security_check');
		$('#loginForm').attr('method','POST');
		$('#loginForm').submit();
	}
	
	
}]);

