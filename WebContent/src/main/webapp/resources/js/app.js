/**
 * Contains all application related javascript sources.
 */
(function($) {
	'use strict';

	var apiUrl = "http://localhost:8090/TechnoMindsECom";

	if ($.session !== undefined && $.session.get('loginStat')) {
		var loginStatus = true;
		var userDetails = JSON.parse($.session.get('userDet'));
	} else {
		var loginStatus = false;
		var userDetails = {};
	}

	if (loginStatus) {
		$("#userDet").html(
				"Welcome " + userDetails.successVO.firstName + " "
						+ userDetails.successVO.lastName);
	} else {
		$("userDet")
				.html(
						"<a href=\"login.html\">Login</a>&nbsp;or&nbsp;<a href=\"register-account.html\">Create an account</a>");
	}

	$('#wishListHeader').on('click', function() {
		if (loginStatus) {
			window.location.href = "#";
		} else {
			window.location.href = "login.html";
		}
	});

	$('#myAccountHeader').on('click', function() {
		if (loginStatus) {
			window.location.href = "#";
		} else {
			window.location.href = "login.html";
		}
	});

	$("form").submit(function(e) {
		e.preventDefault();
		var currentFormId = $(this).attr('id');
		var requestData, relativeUrl, successCB, errorCB;

		switch (currentFormId) {
		case 'loginForm':
			requestData = getLoginRequest();
			relativeUrl = "/user/login";
			successCB = loginSuccess;
			errorCB = loginError;
			break;

		default:
			break;
		}

		callAjax(requestData, relativeUrl, successCB, errorCB);
		requestData = undefined;
	});

	function callAjax(requestData, relativeUrl, successCB, errorCB) {
		$("#loader").removeClass("noneDisplay");
		$.ajax({
			type : "POST",
			async : false,
			dataType : "json",
			data : requestData,
			url : apiUrl + relativeUrl,
			contentType : "application/json",
			accept : "application/json",
			success : function(response) {
				console.log(response);
				successCB(JSON.stringify(response));
			},
			error : function(response) {
				console.log(response);
				errorCB(response);
			},
			complete : function(response) {
				$("#loader").addClass("noneDisplay");
			}
		});
	}

	var loginSuccess = function(responseData) {
		loginStatus = true;
		userDetails = responseData;

		$.session.set('loginStat', true);
		$.session.set('userDet', userDetails);

		window.location.href = "index.html";
		console.log(responseData);
	};

	var loginError = function(errorData) {
		console.log(errorData);
	};

	function getLoginRequest() {

		var loginReqObject = {
			"LoginRequest" : {
				"username" : $("#username").val(),
				"password" : $("#pwd").val(),
			}
		};
		console.log("Login Request Objejct :::: ");
		console.log(loginReqObject);
		return loginReqObject;
	}

}(jQuery));

var sampleData = {
	"successVO" : {
		"eMail" : "Raj.Jena@gmail.com",
		"firstName" : "Raj Kumar",
		"lastName" : "Jena",
		"contactNo1" : "9999999999",
		"faxNo" : "09999999999",
		"companyName" : "Wipro",
		"address1" : "BBSR",
		"address2" : "BBSR",
		"city" : "BBSR",
		"postalCode" : "888888",
		"countryCode" : "India",
		"stateCode" : "Bhubaneswar",
		"customerType" : null,
		"passwd" : null,
		"userPhoto" : null,
		"itemDetails" : [ {
			"itemDetailId" : "1",
			"item" : "1",
			"diff1" : null,
			"diff2" : "TEST1",
			"itemDesc" : "ITEM DESCRIPTION HERE1",
			"itemShortDesc" : "ITEM SHORT DESC FOR ITEM 1",
			"itemCost" : 199.99,

			"itemRetail" : 99.99,
			"itemPic" : null
		}, {
			"itemDetailId" : "2",
			"item" : "1",
			"diff1" : null,
			"diff2" : "TEST2",
			"itemDesc" : "ITEM DESCRIPTION HERE2",
			"itemShortDesc" : "ITEM SHORT DESC FOR ITEM 2",
			"itemCost" : 299.99,
			"itemRetail" : 99.99,
			"itemPic" : null
		} ],
		"authenticated" : true
	},
	"failureVO" : null
};