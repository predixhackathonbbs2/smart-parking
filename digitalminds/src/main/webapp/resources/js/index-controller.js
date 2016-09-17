technomindsApp.controller('indexController', ['$scope', '$http', function($scope,$http) {
	$scope.productList=[];

	setTimeout(function(){
		$scope.getAllProducts();
	}, 5000);
	
	$scope.getAllProducts=function(){
		$.ajax({
			url:webContextPath + "/product/list",
			type:"GET",
			async:false,
			success:function(data){
				console.log(data);
				$.each(data,function(key,val){
					$scope.productList.push(val);
				});
				
			}
		});
	}
	
	$scope.getAllProductLargeImages=function(){
		$.ajax({
			url:webContextPath + "/product/large/images",
			type:"GET",
			async:false,
			success:function(data){
				console.log(data);
			}
		
		});
	}
	
}]);

