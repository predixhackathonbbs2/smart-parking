var rootURL = "http://localhost:8090/TechnoMindsECom/rest";

$('#save-product').click(function(){ 
		alert('hello ...........');
       saveItem();
       //window.location.href = "index.html";
 });

function saveItem() {
	console.log('validateLogin');
	$.ajax({
		type : 'POST',
		contentType : 'application/json',
		url : rootURL + "/newitem",
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

function readJsonData(data) {
	alert("I am executed..............");
	//$("#loginheader").html("<b>Hello </b>" + data.successVO.firstName.bold());
	return false;
}

function formToJSON() {
	alert("hello i am in formtojson");
	
	var fileInput = document.getElementById('userphoto1');
    var file = fileInput.files[0];
	
	return JSON.stringify({
		"item_qty" : $('#prod-qty').val(),
		"item_code" : $('#prod-code').val(),
		"item_brand" : $('#prod-brand').val(),
		"item_cost" : $('#costprice').val(),
		"item_retail" : $('#retailprice').val(),
		"item_overview" : $('#product_overview').val(),
		"item_desc" : $('#product_desc').val(),
		"item_review" : $('#product_review').val(),
		"item_additional" : $('#product_additional').val(),
		"item_pic" : file
	});
}