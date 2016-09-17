smartParkingApp.controller('dashboardController', ['$scope', '$http','$interval', function($scope,$http,$interval) {
		
		$scope.location=['Jaydev Vihar','Saheed Nagar'];
		$scope.locationNameSelected="";
		$scope.searchValue="";
		angular.element(document).ready(function() { 
			
				
			
		});
		   
		
		$scope.getLocationInfo=function(locationame){
			console.log(locationame);
			$scope.locationNameSelected=locationame;
			$scope.getParkingLocationInformation();
			
			//"https://maps.googleapis.com/maps/api/geocode/json?key=AIzaSyCvrNnAQIUUP4vs_TGGn9VljJKZCv2k-q0&address="+$scope.locationNameSelected
		}
		
		$scope.parkingAreaDetails=[];
		$scope.getParkingLocationInformation=function(){
			
			/*$http.get("https://predix-smart-parking-latest.run.aws-usw02-pr.ice.predix.io/parkinginfo/"+locationSelected)*/
			$scope.getLocationStatus();
		}
		
		$scope.getLocationStatus=function(){
			var serviceUrl="";
			if($scope.locationNameSelected.toUpperCase()=="JAYDEV VIHAR"){
				$scope.searchValue=$scope.locationNameSelected;
				serviceUrl="https://predix-spark.run.aws-usw02-pr.ice.predix.io/parkinginfo/"+$scope.locationNameSelected;
				$http.get(serviceUrl)
				.success(function(response){
					$scope.parkingAreaDetails=[];
					console.log(response);
					if(response.length>0){
						$.each(response,function(key,val){
							console.log(val);
							
							$scope.parkingAreaDetails.push({
									slotsavailable:parseInt(val.avilableslots),
									name:val.locName,
									type:val.type
							});
						});
						
						console.log($scope.parkingAreaDetails);
				   }
					setInterval(function(){
						$scope.getLocationStatus()
					}, 15000);
				});
			}else if($scope.locationNameSelected.toUpperCase()=="SAHEED NAGAR"){
				$scope.searchValue=$scope.locationNameSelected;
				serviceUrl="https://predix-smart-parking.run.aws-usw02-pr.ice.predix.io/eventinfo/"+$scope.locationNameSelected;
				$http.get(serviceUrl)
				.success(function(response){
					console.log(response);
				});
			}
		
		}
		
		$scope.modalTitle="";
		$scope.bookParkingSpace=function(area){
			//$scope.modalTitle=area.name;
			//$('#bookingModal').modal('show');
			
		}
	
}]);

