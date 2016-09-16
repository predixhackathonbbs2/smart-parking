angularApp.service('CalcService', function(MathService) {
	this.square = function(a) {
		return MathService.multiply(a, a);
	}

}).service('DivideService', function(MathService) {
	this.divide = function(a, b) {
		return MathService.division(a, b);
	}
});