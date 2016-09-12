var angularApp=angular.module('angularAPP', ['ngRoute']);
angularApp.config(function($routeProvider){
	$routeProvider
	.when( '/', { controller: 'Controller', templateUrl: 'intro.html' } )
	.when( '/userlocation', { controller: 'Controller', templateUrl: 'user-location.html' } )
});		