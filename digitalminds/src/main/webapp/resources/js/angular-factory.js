angularApp.factory('MathService', function() {
   var factory = {};
   
   factory.multiply = function(a, b) {
      return a * b
   };
   
    factory.division = function(a, b) {
    	 if(a>b)
	      return a / b;
    	 else{
    		return b/a;
    	 }
	};
   
   return factory;
})