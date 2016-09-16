technomindsApp.controller('registerController', ['$scope', '$http', function($scope,$http) {
	$scope.user={};
	$scope.registrationStatus="";
	$scope.statusMessage="";
	$scope.registerCustomer=function(user){
		console.log(user);
		var requestURL=webContextPath + "/savecustomer";
		var customerObj=JSON.stringify(user);
		$.ajax({
			url:requestURL,
			type:"POST",
			contentType:"application/JSON",
			data:customerObj,
			async:false,
			success:function(response){
				console.log(response);
				if(response.statusCode==200){
					console.log(response.message);
					$scope.registrationStatus="true";
					$scope.statusMessage=response.message;
					setTimeout(function(){
						window.location.href=webContextPath + "/login"
					}, 2000);
					
					
				}
				else if(response.statusCode==201){
					console.log(response.message);
					$scope.registrationStatus="false";
					$scope.statusMessage=response.message;
				
				}
				else if(response.statusCode==500){
					console.log(response.message);
					$scope.registrationStatus="false";
					$scope.statusMessage=response.message;
				
				}
			}
		});
	}
	
	
}]);

