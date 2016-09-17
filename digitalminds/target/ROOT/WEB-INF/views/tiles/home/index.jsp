<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>

<script>

</script>
<script src="<c:url value="/resources/js/angular-main.js"></c:url>"></script>
<script
	src="<c:url value="/resources/js/index-controller.js"></c:url>"></script>

</head>

<body ng-app="technomindsApp">
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
	<section id="">
			<div id="slider-rev-container" ng-controller="indexController">
				<div id="slider-rev">
					<ul ng-repeat="product in productList">
						<li data-transition="curtain-1" data-slotamount="15"
							data-masterspeed="400"><img
							src="${contextPath}/resources/images/homeslider/slide1.jpg" alt="slide1">
							<div class="tp-caption rev-title skewfromleft stt" data-x="700"
								data-y="220" data-speed="800" data-start="900"
								data-easing="Power3.easeIn" data-endspeed="300">
								Bags start at <span>{{product.retailPrice}}.00</span>
							</div>
							<div class="tp-caption rev-text sfl stl" data-x="700"
								data-y="270" data-speed="800" data-start="1300"
								data-easing="Power3.easeIn" data-endspeed="300">{{product.brand}}</div>

							<div class="tp-caption sfb stb" data-x="700" data-y="400"
								data-speed="1200" data-start="1800" data-easing="Power3.easeIn"
								data-endspeed="300">
								<a href="#" class="btn btn-custom-2">Discover Now</a>
							</div>
							<div class="tp-caption lfb ltb" data-x="50" data-y="50"
								data-speed="1200" data-start="600" data-easing="Expo.easeOut"
								data-end="2500" data-endspeed="800">
								<a href="#"><img ng-src="{{product.largePicture}}" id="product$index" alt="bag1"></a>
							</div>
							<div class="tp-caption lfb ltb rev-price" data-x="370"
								data-y="180" data-speed="1200" data-start="900"
								data-easing="Expo.easeOut" data-end="2800" data-endspeed="800">
								$135</div>
							<div class="tp-caption lfb ltb" data-x="50" data-y="140"
								data-speed="1200" data-start="3400" data-easing="Expo.easeOut"
								data-end="5500" data-endspeed="500">
								<a href="#"><img src="${contextPath}/resources/images/homeslider/bag3.png" alt="bag3"></a>
							</div>
							<div class="tp-caption lfb ltb rev-price" data-x="400"
								data-y="110" data-speed="1200" data-start="3600"
								data-easing="Expo.easeOut" data-end="5700" data-endspeed="800">
								$364</div>
							<div class="tp-caption lfb ltb" data-x="80" data-y="70"
								data-speed="800" data-start="6100" data-easing="Expo.easeOut"
								data-endspeed="500">
								<a href="#"><img src="${contextPath}/resources/images/homeslider/bag2.png" alt="bag2"></a>
							</div>
							<div class="tp-caption lfb ltb rev-price" data-x="320"
								data-y="200" data-speed="1200" data-start="6300"
								data-easing="Expo.easeOut" data-endspeed="500">$364</div>
						</li>
						

					</div>
					<!-- End .col-md-12 -->
				</div>
				<!-- End .row -->
			<!-- End .container -->

		</section>
		<!-- End #content -->
	
</body>
</html>