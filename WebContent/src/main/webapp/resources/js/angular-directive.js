angularApp.directive('myAttribute', function() {
  return {
	 restrict: 'A',
     template: 'Name: {{customer.firstName}} Lastname: {{customer.lastName}}'
  };
	
})
angularApp.directive('myElement', function() {
	return {
	    restrict: 'E',
	    templateUrl: 'my-page.html'
	  };
})