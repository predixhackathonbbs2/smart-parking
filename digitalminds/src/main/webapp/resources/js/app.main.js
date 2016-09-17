var angularApp=angular.module('angularAPP', ['ngRoute']);
angularApp.config(function($routeProvider){
	$routeProvider
		.when( '/intro', { controller: 'Controller', templateUrl: 'views/intro.html' } )
		.when( '/mvcarchitecture', { controller: 'Controller', templateUrl: 'views/mvcarchitecture.html' } )
		.when( '/tutorial', { controller: 'Controller', templateUrl: 'views/tutorial.html' } )
		.when( '/directive', { controller: 'Controller', templateUrl: 'views/directive.html' } )
		.when( '/binding', { controller: 'Controller', templateUrl: 'views/binding.html' } )
		.when( '/tabledata', { controller: 'Controller', templateUrl: 'views/tabledata.html' } )
		.when( '/services', { controller: 'Controller', templateUrl: 'views/services.html' } )
		.when( '/formdata', { controller: 'Controller', templateUrl: 'views/formdata.html' } )
		.when( '/controllers', { controller: 'Controller', templateUrl: 'views/controllers.html' } )
		.when( '/expressions', { controller: 'Controller', templateUrl: 'views/expressions.html' } )
		.when( '/templates', { controller: 'Controller', templateUrl: 'views/templates.html' } )
		.when( '/dependency', { controller: 'Controller', templateUrl: 'views/dependency.html' } )
		.otherwise( { redirectTo: '/' } );
});		