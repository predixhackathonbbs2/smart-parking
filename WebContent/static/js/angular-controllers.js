angularApp.controller('Controller', ['$scope','$http',  function($scope,$http) {
	$scope.searchQuery={};
	angular.element(document).ready(function(){
		var sourceObject={};
		//searchCityLocation(sourceObject);
		
	});
	
	$scope.getUserCurrentLocationAndSearch=function(){
		console.log($scope.searchQuery);
		$scope.getAddress();
	}
	
	$scope.getAddress=function(){
        var lat = parseFloat($("txtLatitude").val());
        var lng = parseFloat($("txtLongitude").val());
        var latlng = new google.maps.LatLng(lat, lng);
        var geocoder = geocoder = new google.maps.Geocoder();
        geocoder.geocode({ 'latLng': latlng }, function (results, status) {
            if (status == google.maps.GeocoderStatus.OK) {
                if (results[1]) {
                    alert("Location: " + results[1].formatted_address);
                }
            }
        });
	}
	
	
	
	/*function searchCityLocation(sourceObject){
		var cities={};
		var result="";
		$.ajax({
			 url:"static/data/city-location.json",
			 type:"get",
			 async:false,
			 dataType:"json",
			 success:function(response){
				 result=response;
			 }
		});
		
		$.each(result,function(key,val){
			  var obj1={
					  key:val
			  };
			   var obj2={
						data:obj1.key
			          
				};
			   sourceObject[key]=obj2;
		});
		 
		 console.log(sourceObject);
		 var data=result;
		 console.log(data);
		 autoSearchTypeAhead(sourceObject);
	}
	function autoSearchTypeAhead(sourceObject){
		var category=$scope.searchQuery.categoryName;
		$.typeahead({
	        input: ".js-typeahead-input",
	        minLength: 1,
	        maxItem: 15,
	        order: "asc",
	        hint: true,
	        group: {
	            template: "{{group}} photographers!"
	        },
	        maxItemPerGroup: 5,
	        backdrop: {
	            "background-color": "#fff"
	        },
	        href: "/photographers/{{group}}/{{display}}/"+category,
	        dropdownFilter: "Area",
	        emptyTemplate: 'No result for "{{query}}"',
	        source: sourceObject,{
	        	Karnataka: {
	                data: data.Karnataka
	            },
	            Kerala: {
	            	data: data.Kerala
	            },
	            "Tamil Nadu": {
	                data: data.TamilNadu
	            },
	            "Andhra Pradesh":{
	            	data: data.AndhraPradesh
	            }
	            
	            
	        },
	        callback	: {
	            onClickAfter: function (node, a, item, event) {

	                // href key gets added inside item from options.href configuration
	                alert(item.href);

	            }
	        },
	        debug: true
	    });
	}*/
	
}])