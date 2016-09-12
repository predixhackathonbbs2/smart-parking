angular.module('angularAPP', [])
.controller('Controller', ['$scope','$http', 'CalcService', function($scope,$http,CalcService) {
	 
	$scope.customer = {
	    firstName: 'Swadhin',
	    lastName: 'Mohanta',
	    }
	 $scope.updatedObject;
	  $scope.users = {
			  selected:'',
			  values:["Raj",'Joy','Test','Jack','Ritesh','Eknath','Siddharth']
	  };
	  
	  $scope.checkForm=false;
		$scope.getSelectedUser=function(selectedUser){
			console.log("This is called on ng-change: " +  selectedUser);
			$.ajax({
				url:'',
				type:"get",
				async:false,
				success:function(data){
				
					$scope.checkForm=true;
				}
			});
		}
		
		$scope.getAllUsers=function(selectedUser){
			console.log("This is called on ng-change: " +  selectedUser);
			$.ajax({
				
			});
		}
		
		$scope.checkForm=false;
		$scope.getSelectedData=function(){
			var selectedUser=$scope.users.selected;
			console.log("This is called on ng-click: " +selectedUser);
			$scope.checkForm=true;
			$.ajax({
				//  get the selected user details from Rest Call 
			})
		}
			  
	  $scope.master = {};

      $scope.update = function(user) {
        $scope.master = angular.copy(user);
      };

      $scope.reset = function() {
        $scope.user = {}
      };

      $scope.reset();
      $scope.user;
      $scope.submitForm = function() {
			if ($scope.userForm.$valid) {
				console.log( $scope.user);
				$http({
					url:'HomeServlet?operation=save',
					method:'Post',
					data:JSON.stringify($scope.user),
					success:function(response){
						console.log(response);
					}
				});
				
			}

		};
		
		$scope.getAllUsers=function(){
			$http.get('HomeServlet?operation=all')
			.success(function(response){
				$scope.users.values=[];
				console.log(response);
				$.each(response,function(key,val){
					console.log(val);
					 $scope.users.values.push(val.firstName+"-"+val.lastName);
				});
				
			})
		}
		
		$scope.square = function() {
            $scope.result = CalcService.square($scope.number);
         }
		
		$scope.divide=function(number1,number2){
			  $scope.result = CalcService.divide(number1,number2);
		}
	  
}]);

	
	


