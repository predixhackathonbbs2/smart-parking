technomindsApp.controller('productController', ['$scope', '$http', function($scope,$http) {
	$scope.product={};
	
	$scope.saveProduct=function(product){
		console.log(product);
		var requestURL="/product/registration";
		
		
	    var largeImage = $('#largeImageByte').val();
	    var thumbnailImage = $('#thumbnailImageByte').val();;
	    var smallImage = $('#smallImageByte').val();;;

	    if(largeImage==undefined || largeImage==""){
	    	$scope.product.largePicture="";	
	    }else{
	    	$scope.product.largePicture=largeImage;
	    }
	    if(thumbnailImage==undefined || thumbnailImage==""){
	    	$scope.product.thumbnailPicture="";	
	    }else{
	    	$scope.product.thumbnailPicture=thumbnailImage;
	    }
	    if(smallImage==undefined || smallImage==""){
	    	$scope.product.smallPicture="";	
	    }else{
	    	$scope.product.smallPicture=smallImage;
	    }
		
	    var productObj=JSON.stringify($scope.product);
		$.ajax({
			url:requestURL,
			type:"POST",
			contentType:"application/JSON",
			data:productObj,
			async:false,
			success:function(response){
				console.log(response);
			}
		});
	
	}
	
	
}]);

