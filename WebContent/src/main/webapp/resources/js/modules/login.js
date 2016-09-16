var rootURL = "http://localhost:8090/TechnoMindsECom/rest";
findUser();

function findUser() {
	console.log('Get Session');
	$.ajax({
		type : 'GET',
		contentType : 'application/json',
		url : rootURL + "/userinfo",
		dataType : "json",
		success : function(data, textStatus, jqXHR) {
			readJsonDataOther(data);
		},
		error : function(jqXHR, textStatus, errorThrown) {
			console.log('Could not find Data....: ' + textStatus);
			// alert('Could not find Data....: ' + textStatus);
		}
	});

}

$('#login-button').click(function() {
	validateLogin();
	// window.location.href = "index.html";
});

function validateLogin() {
	console.log('validateLogin');
	$.ajax({
		type : 'POST',
		contentType : 'application/json',
		url : rootURL + "/user/login",
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

$('#logout-btn').click(function() {
	logout();
	window.location.href = "index.html";
});

function logout() {
	console.log('Get Session');
	$.ajax({
		type : 'GET',
		contentType : 'application/json',
		url : rootURL + "/logout",
		dataType : "json",
		success : function(data, textStatus, jqXHR) {
			readJsonDataOther(data);
		},
		error : function(jqXHR, textStatus, errorThrown) {
			console.log('Could not find Data....: ' + textStatus);
			// alert('Could not find Data....: ' + textStatus);
		}
	});
}

function readJsonData(data) {
	$("#loginheader").html("<b>Hello </b>" + data.successVO.firstName.bold());
	window.location.href = "index.html";
	return false;
}

function readJsonDataOther(data) {
	$("#loginheader").html("<b>Hello </b>" + data.successVO.firstName.bold());
	return false;
}

function formToJSON() {
	var name = null;
	return JSON.stringify({
		"userId" : $('#emailid').val(),
		"username" : name,
		"password" : $('#pwd').val()
	});
}

function readURL(imgId,input) {
	console.log(imgId);
	if (input.files && input.files[0]) {
		var reader = new FileReader();

		reader.onload = function(e) {
			$('#'+imgId).attr('src', e.target.result);
			$('#'+imgId+"Byte").val(e.target.result);
		};
		var imageSize=input.files[0].size;
		
		$('#'+imgId+'Size').text("Size :"+formatBytes(imageSize));
		$('#'+imgId+'Size').show();
		reader.readAsDataURL(input.files[0]);
	}
}

function formatBytes(bytes,decimals) {
	   if(bytes == 0) return '0 Byte';
	   var k = 1024;
	   var dm = decimals + 1 || 3;
	   var sizes = ['Bytes', 'KB', 'MB', 'GB', 'TB', 'PB', 'EB', 'ZB', 'YB'];
	   var i = Math.floor(Math.log(bytes) / Math.log(k));
	   return parseFloat((bytes / Math.pow(k, i)).toFixed(dm)) + ' ' + sizes[i];
	}



// New product registration -- Start
function textAreaResizing(text_area_id) {
	document.getElementById(text_area_id).addEventListener('keyup', function() {
		this.style.height = 1; // this is necessary to make it shrink when
		// deleting
		this.style.height = this.scrollHeight + 'px';
		if (this.scrollHeight < 22)
			this.style.height = this.scrollHeight + 22 + 'px';
	}, false);
}

$('#btn_save_product').click(function() {
	alert('Save Product');
	alert($('#prod_picture').val());
	// window.location.href = "index.html";
});

// New product registration -- End

