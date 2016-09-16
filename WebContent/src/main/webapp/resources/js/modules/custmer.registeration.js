var rootURL = "http://localhost:8090/TechnoMindsECom/rest";

$('#create-my-acct-btn').click(function() {
	saveCustomer();
});

function saveCustomer() {
	console.log('validateLogin');
	$.ajax({
		type : 'POST',
		contentType : 'application/json',
		url : rootURL + "/savecustomer",
		dataType : "json",
		data : formToJSON(),
		success : function(data, textStatus, jqXHR) {
			readJsonData(data);
		},
		error : function(jqXHR, textStatus, errorThrown) {
			console.log('Could not find Data....: ' + textStatus);
			// alert('Could not find Data....: ' + textStatus);
		}
	});
}

function formToJSON() {
	return JSON.stringify({
		"firstName" : $('#firstName').val(),
		"lastName" : $('#lastName').val(),
		"email" : $('#email').val(),
		"telephone" : $('#telephone').val(),
		"fax" : $('#fax').val(),
		"password1" : $('#password1').val(),
		"password2" : $('#password2').val(),
		"company" : $('#company').val(),
		"address1" : $('#address1').val(),
		"address2" : $('#address2').val(),
		"city" : $('#city').val(),
		"postcode" : $('#postcode').val(),
		"country" : $('#country').val(),
		"state" : $('#state').val()
	});
}

function readJsonData(data) {
	$("#loginheader").html("<b>Hello </b>" + data.successVO.firstName.bold());
	window.location.href = "index.html";
	return true;
}