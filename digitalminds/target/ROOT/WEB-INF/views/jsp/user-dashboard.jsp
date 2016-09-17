<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Digital Minds | Smart Parking</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.6 -->
  <link rel="stylesheet" href="/resources/bootstrap/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="/resources/dist/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link rel="stylesheet" href="/resources/dist/css/skins/_all-skins.min.css">
  
  
<!-- jQuery 2.2.3 -->
<script src="/resources/plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="/resources/bootstrap/js/bootstrap.min.js"></script>


  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
  <script async defer
	src="https://maps.google.com/maps/api/js?key=AIzaSyCvrNnAQIUUP4vs_TGGn9VljJKZCv2k-q0"></script>
 <script src="/resources/js/angular.min.js"></script> 
 <script src="/resources/js/angular-main.js"></script>
 <script src="/resources/js/angular-controller.js"></script>
 <script>


	function initialize() {
		var myLatlng =new google.maps.LatLng(20.296059, 85.824540);
		var mapOptions = {
			zoom : 12,
			center : myLatlng,
			mapTypeId : google.maps.MapTypeId.ROADMAP
		};
		map = new google.maps.Map(document.getElementById('map_canvas'),mapOptions);
		
		var marker = new google.maps.Marker({
		      position: myLatlng,
		      map: map,
		      draggable: true,
		      title: "Your Location"
		    });  
		
		var circle = new google.maps.Circle({
			  map: map,
			  radius: 500,    // metres
			  fillColor: '#AA0000'
			});
		
		
		
		google.maps.event.addListener(marker, 'click', function(event) {
			var latLong=event.latLng.lat()+","+event.latLng.lng();
			var addressDetails=getAddressFromLatLong(latLong);
			var addressLocation=addressDetails.results;
			console.log(addressLocation[0].geometry);
			alert(addressLocation[0].geometry.location.lat+","+addressLocation[0].geometry.location.lng);
			document.getElementById('latMap').value = event.latLng.lat();
			document.getElementById('lngMap').value = event.latLng.lng();
			circle.bindTo('center', marker, 'position');
			//infowindow.setContent(contentString); 
		    //infowindow.open(map,marker);
		});
		
				

	}
	
	
	
	var infowindow = new google.maps.InfoWindow(
	  { 
	    size: new google.maps.Size(150,50)
	  });


	function mapDivClicked(event) {
		var target = document.getElementById('map_canvas'), posx = event.pageX
				- target.offsetLeft, posy = event.pageY - target.offsetTop, bounds = map
				.getBounds(), neLatlng = bounds.getNorthEast(), swLatlng = bounds
				.getSouthWest(), startLat = neLatlng.lat(), endLng = neLatlng
				.lng(), endLat = swLatlng.lat(), startLng = swLatlng.lng();

		document.getElementById('posX').value = posx;
		document.getElementById('posY').value = posy;
		document.getElementById('lat').value = startLat
				+ ((posy / 350) * (endLat - startLat));
		document.getElementById('lng').value = startLng
				+ ((posx / 500) * (endLng - startLng));
	}
	google.maps.event.addDomListener(window, 'load', initialize); 
 </script>
 
  
</head>
<body class="hold-transition skin-blue sidebar-mini" ng-app="smartParkingApp">
<div class="wrapper" ng-controller="dashboardController">

  <header class="main-header">

    <!-- Logo -->
    <a href="index2.html" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>DM</b>SP</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>Smart Parking</b></span>
    </a>

    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
      <!-- Navbar Right Menu -->
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          
          <li>
            <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
          </li>
        </ul>
      </div>

    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">
    <section class="sidebar">
    
      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="Search...">
              <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
        </div>
      </form>
      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu">
        <li class="header">MAIN NAVIGATION</li>
        <li class="active treeview">
          <a href="#">
            <i class="fa fa-dashboard"></i> <span>Dashboard</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
        <!--     <li><a href="index.html"><i class="fa fa-circle-o"></i> Admin Dashboard</a></li> -->
            <li class="active"><a href="user"><i class="fa fa-circle-o"></i> User Dashboard</a></li>
          </ul>
        </li>
      
      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper" >
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Dashboard
        <small>Version 2.0</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active">Dashboard</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row" >
        <div class="col-md-12">
          <div class="box">
            <div class="box-header with-border">
              <h3 class="box-title">Where are you going today?</h3>
				 <div class="box-tools pull-left">
					
				</div>
            </div>
            <div class="box-body">
              <div class="row">
                <div class="col-md-12">
                	<!-- <select name="location" class="form-control" ng-change="getLocationInfo()">
                	  <option ng-repeat="l in location" >{{l}}</option>
					</select> -->
					
					<select name="location" class="form-control" ng-model="locationSelected"
					ng-change="getLocationInfo(locationSelected)" ng-options="o as o for o in location">
					</select>
                </div>
                <!-- /.col -->
                <div class="col-md-12">
                </div>
                <!-- /.col -->
              </div>
              <!-- /.row -->
            </div>
        
          </div>
          <!-- /.box -->
        </div>
        <!-- /.col -->
      </div>

     	<div class="row" ng-if="searchValue=='Jaydev Vihar'">
     	 <div class="col-md-12">
          <div class="box box-info">
            <div class="box-header with-border">
              <h3 class="box-title">Parking Space Available in {{searchValue}}</h3>

              <div class="box-tools pull-right">
                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                </button>
                <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
              </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <div class="table-responsive">
                <table class="table no-margin">
                  <thead>
                  <tr>
                    <th>Parking Location</th>
                    <th>Space Available</th>
                    <th>Type</th>
                    <th>Book/Reserve</th>
                   
                  </tr>
                  </thead>
                  <tbody>
                  <tr ng-repeat="area in parkingAreaDetails">
                    <td><a href>{{area.name}}</a></td>
                    <td>{{area.slotsavailable}}</td>
                    <td><span class="label label-success">{{area.type}}</span></td>
                    <td><a href ng-click="bookParkingSpace(area);"><span class="label label-success">BOOK</span></a>
                    </td>
                   
                  </tr>
                  </tbody>
                </table>
										
										<!-- /.modal -->
			</div>
          
            </div>
            
            <!-- /.box-body -->
            <div class="box-footer clearfix">
            </div>
          </div>
          </div>
        </div>
        
        
        <div class="row" ng-if="searchValue=='Saheed Nagar'">
     	 <div class="col-md-12">
          <div class="box box-info">
            <div class="box-header with-border">
              <h3 class="box-title">Event Information {{searchValue}}</h3>

              <div class="box-tools pull-right">
                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                </button>
                <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
              </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
             There will be a heavy rush in the area you are visiting today.
             We recommend you to avail Public transport or Car Pooling.
             Event Name : Honorable Prime Minister Mr. Narendra Modi Visiting to Tech Mahindra of inaguaration of GE Predix Hackathan.
             Event Location : Tech Mahindra Ltd. Jaydev Vihar.
          
            </div>
            <!-- /.box-body -->
            <div class="box-footer clearfix">
            </div>
          </div>
          </div>
        </div>
        
        </section>
       
        </div>
        <!-- /.col -->
</div>

  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Version</b> 2.3.6
    </div>
    <strong>Copyright &copy; 2014-2016 <a href>Predix Hackathon Studio- Techmahindra</a>.</strong> All rights
    reserved.
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Create the tabs -->
    <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
      <li><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>
      <li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
    </ul>
   
<!-- ./wrapper -->


</body>
</html>
