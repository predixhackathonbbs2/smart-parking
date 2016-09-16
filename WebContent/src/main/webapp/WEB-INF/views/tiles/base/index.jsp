<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
<script src="<c:url value="/resources/js/jquery.themepunch.revolution.min.js"></c:url>"></script>
<script>
$(function() {
	// Slider Revolution
	jQuery('#slider-rev').revolution({
		delay : 8000,
		startwidth : 1170,
		startheight : 600,
		onHoverStop : "true",
		hideThumbs : 250,
		navigationHAlign : "center",
		navigationVAlign : "bottom",
		navigationHOffset : 0,
		navigationVOffset : 12,
		soloArrowLeftHalign : "left",
		soloArrowLeftValign : "center",
		soloArrowLeftHOffset : 0,
		soloArrowLeftVOffset : 0,
		soloArrowRightHalign : "right",
		soloArrowRightValign : "center",
		soloArrowRightHOffset : 0,
		soloArrowRightVOffset : 0,
		touchenabled : "on",
		stopAtSlide : -1,
		stopAfterLoops : -1,
		dottedOverlay : "none",
		fullWidth : "on",
		shadow : 0

	});

});
</script>

</head>

<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
	<section id="">
			<div id="slider-rev-container">
				<div id="slider-rev">
					<ul>
						<li data-transition="curtain-1" data-slotamount="15"
							data-masterspeed="400"><img
							src="${contextPath}/resources/images/homeslider/slide1.jpg" alt="slide1">
							<div class="tp-caption rev-title skewfromleft stt" data-x="700"
								data-y="220" data-speed="800" data-start="900"
								data-easing="Power3.easeIn" data-endspeed="300">
								Bags start at <span>$25.00</span>
							</div>
							<div class="tp-caption rev-text sfl stl" data-x="700"
								data-y="270" data-speed="800" data-start="1300"
								data-easing="Power3.easeIn" data-endspeed="300">Pellentesque
								accumsan vitae ante ac vulputate. Interdum et malesuada fames ac
								ante ipsum primis in faucibus. Aenean ut mi mauris. Quisque
								ultrices pretium dolor, a lacinia ante mollis eget.</div>

							<div class="tp-caption sfb stb" data-x="700" data-y="400"
								data-speed="1200" data-start="1800" data-easing="Power3.easeIn"
								data-endspeed="300">
								<a href="#" class="btn btn-custom-2">Discover Now</a>
							</div>
							<div class="tp-caption lfb ltb" data-x="50" data-y="50"
								data-speed="1200" data-start="600" data-easing="Expo.easeOut"
								data-end="2500" data-endspeed="800">
								<a href="#"><img src="${contextPath}/resources/images/homeslider/bag1.png" alt="bag1"></a>
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
						<li data-transition="curtain-1" data-slotamount="15"
							data-masterspeed="400"><img
							src="${contextPath}/resources/images/homeslider/slide2.jpg" alt="slide2">
							<div class="tp-caption lfb ltb" data-x="50" data-y="40"
								data-speed="1600" data-start="1800" data-easing="Expo.easeOut">
								<a href="#"><img src="${contextPath}/resources/images/homeslider/girl1.png"
									alt="girl1"></a>
							</div>
							<div class="tp-caption lfb ltb" data-x="220" data-y="60"
								data-speed="1800" data-start="2500" data-easing="Expo.easeOut">
								<a href="#"><img src="${contextPath}/resources/images/homeslider/girl2.png"
									alt="girl2"></a>
							</div>
							<div class="tp-caption lfb ltb" data-x="470" data-y="50"
								data-speed="2000" data-start="3200" data-easing="Expo.easeOut">
								<a href="#"><img src="${contextPath}/resources/images/homeslider/girl3.png"
									alt="girl3"></a>
							</div>
							<div class="tp-caption rev-title skewfromright skewtoright"
								data-x="720" data-y="220" data-speed="800" data-start="900"
								data-easing="Power3.easeIn" data-endspeed="300">What’s
								New?</div>
							<div class="tp-caption rev-text sfl stl" data-x="720"
								data-y="270" data-speed="800" data-start="1300"
								data-easing="Power3.easeIn" data-endspeed="300">Sed
								volutpat vel massa id euismod. Nullam et nulla pulvinar,
								consequat massa sit amet, molestie nisl. Aenean sagittis diam
								consectetur augue viverra, at interdum elit blandit.</div>

							<div class="tp-caption sfb stb" data-x="720" data-y="400"
								data-speed="1200" data-start="2000" data-easing="Power3.easeIn"
								data-endspeed="300">
								<a href="#" class="btn btn-custom-2">Take a Look</a>
							</div></li>
						<li data-transition="curtain-1" data-slotamount="15"
							data-masterspeed="400"><img
							src="${contextPath}/resources/images/homeslider/slide3.jpg" alt="slide3">
							<div class="tp-caption sfl stl" data-x="40" data-y="30"
								data-speed="1600" data-start="1200" data-easing="Expo.easeOut">
								<a href="#"><img src="${contextPath}/resources/images/homeslider/girl4.png"
									alt="girl4"></a>
							</div>
							<div class="tp-caption sfl stl" data-x="170" data-y="25"
								data-speed="1800" data-start="1800" data-easing="Expo.easeOut">
								<a href="#"><img src="${contextPath}/resources/images/homeslider/girl5.png"
									alt="girl5"></a>
							</div>

							<div class="tp-caption rev-title big lft ltt" data-x="460"
								data-y="210" data-speed="800" data-start="1200"
								data-easing="Power3.easeIn" data-endspeed="300">Back In
								Black</div>
							<div class="tp-caption rev-text2 lfb ltb" data-x="450"
								data-y="270" data-speed="1200" data-start="1800"
								data-easing="Power3.easeIn" data-endspeed="300">Wide-brimmed
								hats, tomboy touches and witchy black lace will leave you
								spellbound.</div>

							<div class="tp-caption lfb ltb" data-x="540" data-y="368"
								data-speed="1200" data-start="2400" data-easing="Power3.easeIn"
								data-endspeed="300">
								<a href="#" class="btn btn-custom-2">Shop Now</a>
							</div>

							<div class="tp-caption sfr str" data-x="760" data-y="20"
								data-speed="2000" data-start="3200" data-easing="Expo.easeOut">
								<a href="#"><img src="${contextPath}/resources/images/homeslider/girl6.png"
									alt="girl6"></a>
							</div>

							<div class="tp-caption sfr str" data-x="920" data-y="30"
								data-speed="2000" data-start="3800" data-easing="Expo.easeOut">
								<a href="#"><img src="${contextPath}/resources/images/homeslider/girl7.png"
									alt="girl7"></a>
							</div></li>
					</ul>
				</div>
				<!-- End #slider-rev -->
			</div>
			<!-- End #slider-rev-container -->

			<div class="xlg-margin"></div>
			<!-- Space -->
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="row home-banners">
							<div class="col-md-4 col-sm-4 col-xs-12">
								<a href="#"><img src="${contextPath}/resources/images/middle-banner-1.jpg"
									alt="Home Big Banner 1" class="img-responsive bannerShadow"></a>
							</div>
							<!-- End .col-md-4 -->

							<div class="col-md-4 col-sm-4 col-xs-12">
								<a href="#"><img src="${contextPath}/resources/images/middle-banner-2.jpg"
									alt="Home Big Banner 2" class="img-responsive bannerShadow"></a>
							</div>
							<!-- End .col-md-4 -->

							<div class="col-md-4 col-sm-4 col-xs-12">
								<a href="#"><img src="${contextPath}/resources/images/middle-banner-3.jpg"
									alt="Home Big Banner 2" class="img-responsive bannerShadow"></a>
							</div>
							<!-- End .col-md-4 -->
						</div>
						<!-- End .home-banners -->

						<div class="md-margin2x"></div>
						<!-- Space -->
						<div class="row">

							<div class="col-md-12 col-sm-12 col-xs-12 main-content">
								<div class="latest-items carousel-wrapper">
									<header class="content-title">
										<div class="title-bg">
											<h2 class="title">Latest</h2>
										</div>
										<!-- End .title-bg -->
										<p class="title-desc">Only with us you can get a new model
											with a discount.</p>
									</header>

									<div class="carousel-controls">
										<div id="latest-items-slider-prev"
											class="carousel-btn carousel-btn-prev"></div>
										<!-- End .carousel-prev -->
										<div id="latest-items-slider-next"
											class="carousel-btn carousel-btn-next carousel-space">
										</div>
										<!-- End .carousel-next -->
									</div>
									<!-- End .carousel-controls -->
									<div class="latest-items-slider owl-carousel">
										<div class="item">

											<div class="item-image-container">
												<figure>
													<a href="product.html"> <img
														src="${contextPath}/resources/images/products/item3.jpg" alt="item3"
														class="item-image"> <img
														src="${contextPath}/resources/images/products/item3-hover.jpg" alt="item3 Hover"
														class="item-image-hover">
													</a>
												</figure>
												<div class="item-price-container">
													<span class="item-price">$160<span class="sub-price">.99</span></span>
												</div>
												<span class="new-rect">New</span> <span
													class="discount-rect">-10%</span>
											</div>
											<!-- End .item-image -->
											<div class="item-meta-container">
												<div class="ratings-container">
													<div class="ratings">
														<div class="ratings-result" data-result="95"></div>
													</div>
													<!-- End .ratings -->
													<span class="ratings-amount"> 1 Reviews </span>
												</div>
												<!-- End .rating-container -->
												<h3 class="item-name">
													<a href="product.html">Lorem Ipsum Dolla</a>
												</h3>
												<div class="item-action">
													<a href="#" class="item-add-btn"> <span
														class="icon-cart-text">Add to Cart</span>
													</a>
													<div class="item-action-inner">
														<a href="#" class="icon-button icon-like">Favourite</a> <a
															href="#" class="icon-button icon-compare">Checkout</a>
													</div>
													<!-- End .item-action-inner -->
												</div>
												<!-- End .item-action -->
											</div>
											<!-- End .item-meta-container -->
										</div>
										<!-- End .item -->

										<div class="item">

											<div class="item-image-container">
												<figure>
													<a href="product.html"> <img
														src="${contextPath}/resources/images/products/phone3.jpg" alt="Phone 3"
														class="item-image"> <img
														src="${contextPath}/resources/images/products/phone3-hover.jpg" alt="Phone 3 Hover"
														class="item-image-hover">
													</a>
												</figure>
												<div class="item-price-container">
													<span class="item-price">$99<span class="sub-price">.75</span></span>
												</div>
											</div>
											<!-- End .item-image -->
											<div class="item-meta-container">
												<div class="ratings-container"></div>
												<!-- End .rating-container -->
												<h3 class="item-name">
													<a href="product.html">Lorem Ipsum Dolla</a>
												</h3>
												<div class="item-action">
													<a href="#" class="item-add-btn"> <span
														class="icon-cart-text">Add to Cart</span>
													</a>
													<div class="item-action-inner">
														<a href="#" class="icon-button icon-like">Favourite</a> <a
															href="#" class="icon-button icon-compare">Checkout</a>
													</div>
													<!-- End .item-action-inner -->
												</div>
												<!-- End .item-action -->
											</div>
											<!-- End .item-meta-container -->
										</div>
										<!-- End .item -->
										<div class="item">

											<div class="item-image-container">
												<figure>
													<a href="product.html"> <img
														src="${contextPath}/resources/images/products/headphones1.jpg" alt="Headphones 1"
														class="item-image"> <img
														src="${contextPath}/resources/images/products/headphones1-hover.jpg"
														alt="Headphones 1 Hover" class="item-image-hover">
													</a>
												</figure>
												<div class="item-price-container">
													<span class="item-price">$79<span class="sub-price">.99</span></span>
												</div>
												<span class="new-rect">New</span>
											</div>
											<!-- End .item-image -->
											<div class="item-meta-container">
												<div class="ratings-container"></div>
												<!-- End .rating-container -->
												<h3 class="item-name">
													<a href="product.html">Lorem Ipsum Dolla</a>
												</h3>
												<div class="item-action">
													<a href="#" class="item-add-btn"> <span
														class="icon-cart-text">Add to Cart</span>
													</a>
													<div class="item-action-inner">
														<a href="#" class="icon-button icon-like">Favourite</a> <a
															href="#" class="icon-button icon-compare">Checkout</a>
													</div>
													<!-- End .item-action-inner -->
												</div>
												<!-- End .item-action -->
											</div>
											<!-- End .item-meta-container -->
										</div>
										<!-- End .item -->

										<div class="item">

											<div class="item-image-container">
												<figure>
													<a href="product.html"> <img
														src="${contextPath}/resources/images/products/item2.jpg" alt="item3"
														class="item-image"> <img
														src="${contextPath}/resources/images/products/item2-hover.jpg" alt="item3 Hover"
														class="item-image-hover">
													</a>
												</figure>
												<div class="item-price-container">
													<span class="old-price">$100</span> <span
														class="item-price">$75</span>
												</div>
												<span class="new-rect">New</span> <span
													class="discount-rect">-25%</span>
											</div>
											<!-- End .item-image -->
											<div class="item-meta-container">
												<div class="ratings-container">
													<div class="ratings">
														<div class="ratings-result" data-result="90"></div>
													</div>
													<!-- End .ratings -->
													<span class="ratings-amount"> 3 Reviews </span>
												</div>
												<!-- End .rating-container -->
												<h3 class="item-name">
													<a href="product.html">Lorem Ipsum Dolla</a>
												</h3>
												<div class="item-action">
													<a href="#" class="item-add-btn"> <span
														class="icon-cart-text">Add to Cart</span>
													</a>
													<div class="item-action-inner">
														<a href="#" class="icon-button icon-like">Favourite</a> <a
															href="#" class="icon-button icon-compare">Checkout</a>
													</div>
													<!-- End .item-action-inner -->
												</div>
												<!-- End .item-action -->
											</div>
											<!-- End .item-meta-container -->
										</div>
										<!-- End .item -->

										<div class="item">

											<div class="item-image-container">
												<figure>
													<a href="product.html"> <img
														src="${contextPath}/resources/images/products/item1.jpg" alt="item3"
														class="item-image"> <img
														src="${contextPath}/resources/images/products/item1-hover.jpg" alt="item3 Hover"
														class="item-image-hover">
													</a>
												</figure>
												<div class="item-price-container">
													<span class="item-price">$180<span class="sub-price">.99</span></span>
												</div>
												<span class="new-rect">New</span>
											</div>
											<!-- End .item-image -->
											<div class="item-meta-container">
												<div class="ratings-container">
													<div class="ratings">
														<div class="ratings-result" data-result="95"></div>
													</div>
													<!-- End .ratings -->
													<span class="ratings-amount"> 2 Reviews </span>
												</div>
												<!-- End .rating-container -->
												<h3 class="item-name">
													<a href="product.html">Lorem Ipsum Dolla</a>
												</h3>
												<div class="item-action">
													<a href="#" class="item-add-btn"> <span
														class="icon-cart-text">Add to Cart</span>
													</a>
													<div class="item-action-inner">
														<a href="#" class="icon-button icon-like">Favourite</a> <a
															href="#" class="icon-button icon-compare">Checkout</a>
													</div>
													<!-- End .item-action-inner -->
												</div>
												<!-- End .item-action -->
											</div>
											<!-- End .item-meta-container -->
										</div>
										<!-- End .item -->
										<div class="item">

											<div class="item-image-container">
												<figure>
													<a href="product.html"> <img
														src="${contextPath}/resources/images/products/item4.jpg" alt="item3"
														class="item-image"> <img
														src="${contextPath}/resources/images/products/item4-hover.jpg" alt="item3 Hover"
														class="item-image-hover">
													</a>
												</figure>
												<div class="item-price-container">
													<span class="item-price">$180<span class="sub-price">.99</span></span>
												</div>
												<span class="new-rect">New</span>
											</div>
											<!-- End .item-image -->
											<div class="item-meta-container">
												<div class="ratings-container">
													<div class="ratings">
														<div class="ratings-result" data-result="95"></div>
													</div>
													<!-- End .ratings -->
													<span class="ratings-amount"> 2 Reviews </span>
												</div>
												<!-- End .rating-container -->
												<h3 class="item-name">
													<a href="product.html">Lorem Ipsum Dolla</a>
												</h3>
												<div class="item-action">
													<a href="#" class="item-add-btn"> <span
														class="icon-cart-text">Add to Cart</span>
													</a>
													<div class="item-action-inner">
														<a href="#" class="icon-button icon-like">Favourite</a> <a
															href="#" class="icon-button icon-compare">Checkout</a>
													</div>
													<!-- End .item-action-inner -->
												</div>
												<!-- End .item-action -->
											</div>
											<!-- End .item-meta-container -->
										</div>
										<!-- End .item -->
									</div>
									<!--latest-items-slider -->
								</div>
								<!-- End .latest-items -->
								<div class="md-margin2x"></div>
								<!-- Space -->
								<!-- <div class="row">
									<div class="col-md-6 col-sm-6 col-xs-12">
										<header class="content-title">
											<h2 class="title">Welcome to Venedor</h2>
										</header>
										<p class="alignJustify">Venedor is a fully responsive
											Magento theme with advanced admin module. Based on
											Bootstrap’s 12 column 1200px responsive grid Theme. Great
											looks on desktops, tablets and mobiles.</p>

										<div class="form-group">
											<div class="clearfix"></div>
										</div>

										<p class="alignJustify">
											Venedor is extremely customizable, easy to use and fully
											responsive. Suitable for every type of store. Great as a
											starting point for your custom projects. This theme includes
											several extensions including ajax price slider that will help
											you improve your sales. We supply a full help with our
											products and after purchase support to all our customers. <a
												href="#">Buy Venedor Theme!</a>
										</p>
									</div>
									End .col-md-7
									<div class="col-md-6 col-sm-6 col-xs-12">
										<div class="sm-margin visible-xs"></div>
										space
										<img src="${contextPath}/resources/images/showcase.png" alt="Showcase Venedor"
											class="img-responsive">
									</div>
									End .col-md-5
								</div>
								End .row
								<div class="md-margin2x"></div>
								Space

								<div class="hot-items carousel-wrapper">
									<header class="content-title">
										<div class="title-bg">
											<h2 class="title">On Sale</h2>
										</div>
										End .title-bg
										<p class="title-desc">Only with us you can get a new model
											with a discount.</p>
									</header>

									<div class="carousel-controls">
										<div id="hot-items-slider-prev"
											class="carousel-btn carousel-btn-prev"></div>
										End .carousel-prev
										<div id="hot-items-slider-next"
											class="carousel-btn carousel-btn-next carousel-space">
										</div>
										End .carousel-next
									</div>
									End .carousel-controls
									<div class="hot-items-slider owl-carousel">
										<div class="item">

											<div class="item-image-container">
												<figure>
													<a href="product.html"> <img
														src="${contextPath}/resources/images/products/item3.jpg" alt="item3"
														class="item-image"> <img
														src="${contextPath}/resources/images/products/item3-hover.jpg" alt="item3 Hover"
														class="item-image-hover">
													</a>
												</figure>
												<div class="item-price-container">
													<span class="item-price">$160<span class="sub-price">.99</span></span>
												</div>
												<span class="new-rect">New</span> <span
													class="discount-rect">-10%</span>
											</div>
											End .item-image
											<div class="item-meta-container">
												<div class="ratings-container">
													<div class="ratings">
														<div class="ratings-result" data-result="95"></div>
													</div>
													End .ratings
													<span class="ratings-amount"> 1 Reviews </span>
												</div>
												End .rating-container
												<h3 class="item-name">
													<a href="product.html">Lorem Ipsum Dolla</a>
												</h3>
												<div class="item-action">
													<a href="#" class="item-add-btn"> <span
														class="icon-cart-text">Add to Cart</span>
													</a>
													<div class="item-action-inner">
														<a href="#" class="icon-button icon-like">Favourite</a> <a
															href="#" class="icon-button icon-compare">Checkout</a>
													</div>
													End .item-action-inner
												</div>
												End .item-action
											</div>
											End .item-meta-container
										</div>
										End .item

										<div class="item">

											<div class="item-image-container">
												<figure>
													<a href="product.html"> <img
														src="${contextPath}/resources/images/products/phone3.jpg" alt="Phone 3"
														class="item-image"> <img
														src="${contextPath}/resources/images/products/phone3-hover.jpg" alt="Phone 3 Hover"
														class="item-image-hover">
													</a>
												</figure>
												<div class="item-price-container">
													<span class="item-price">$99<span class="sub-price">.75</span></span>
												</div>
											</div>
											End .item-image
											<div class="item-meta-container">
												<div class="ratings-container"></div>
												End .rating-container
												<h3 class="item-name">
													<a href="product.html">Lorem Ipsum Dolla</a>
												</h3>
												<div class="item-action">
													<a href="#" class="item-add-btn"> <span
														class="icon-cart-text">Add to Cart</span>
													</a>
													<div class="item-action-inner">
														<a href="#" class="icon-button icon-like">Favourite</a> <a
															href="#" class="icon-button icon-compare">Checkout</a>
													</div>
													End .item-action-inner
												</div>
												End .item-action
											</div>
											End .item-meta-container
										</div>
										End .item
										<div class="item">

											<div class="item-image-container">
												<figure>
													<a href="product.html"> <img
														src="${contextPath}/resources/images/products/headphones1.jpg" alt="Headphones 1"
														class="item-image"> <img
														src="${contextPath}/resources/images/products/headphones1-hover.jpg"
														alt="Headphones 1 Hover" class="item-image-hover">
													</a>
												</figure>
												<div class="item-price-container">
													<span class="item-price">$79<span class="sub-price">.99</span></span>
												</div>
												<span class="new-rect">New</span>
											</div>
											End .item-image
											<div class="item-meta-container">
												<div class="ratings-container"></div>
												End .rating-container
												<h3 class="item-name">
													<a href="product.html">Lorem Ipsum Dolla</a>
												</h3>
												<div class="item-action">
													<a href="#" class="item-add-btn"> <span
														class="icon-cart-text">Add to Cart</span>
													</a>
													<div class="item-action-inner">
														<a href="#" class="icon-button icon-like">Favourite</a> <a
															href="#" class="icon-button icon-compare">Checkout</a>
													</div>
													End .item-action-inner
												</div>
												End .item-action
											</div>
											End .item-meta-container
										</div>
										End .item

										<div class="item">

											<div class="item-image-container">
												<figure>
													<a href="product.html"> <img
														src="${contextPath}/resources/images/products/phone3.jpg" alt="item3"
														class="item-image"> <img
														src="${contextPath}/resources/images/products/phone3-hover.jpg" alt="item3 Hover"
														class="item-image-hover">
													</a>
												</figure>
												<div class="item-price-container">
													<span class="old-price">$100</span> <span
														class="item-price">$75</span>
												</div>
												<span class="new-rect">New</span> <span
													class="discount-rect">-25%</span>
											</div>
											End .item-image
											<div class="item-meta-container">
												<div class="ratings-container">
													<div class="ratings">
														<div class="ratings-result" data-result="90"></div>
													</div>
													End .ratings
													<span class="ratings-amount"> 3 Reviews </span>
												</div>
												End .rating-container
												<h3 class="item-name">
													<a href="product.html">Lorem Ipsum Dolla</a>
												</h3>
												<div class="item-action">
													<a href="#" class="item-add-btn"> <span
														class="icon-cart-text">Add to Cart</span>
													</a>
													<div class="item-action-inner">
														<a href="#" class="icon-button icon-like">Favourite</a> <a
															href="#" class="icon-button icon-compare">Checkout</a>
													</div>
													End .item-action-inner
												</div>
												End .item-action
											</div>
											End .item-meta-container
										</div>
										End .item

										<div class="item">

											<div class="item-image-container">
												<figure>
													<a href="product.html"> <img
														src="${contextPath}/resources/images/products/phone4.jpg" alt="item3"
														class="item-image"> <img
														src="${contextPath}/resources/images/products/phone4-hover.jpg" alt="item3 Hover"
														class="item-image-hover">
													</a>
												</figure>
												<div class="item-price-container">
													<span class="item-price">$180<span class="sub-price">.99</span></span>
												</div>
												<span class="new-rect">New</span>
											</div>
											End .item-image
											<div class="item-meta-container">
												<div class="ratings-container">
													<div class="ratings">
														<div class="ratings-result" data-result="95"></div>
													</div>
													End .ratings
													<span class="ratings-amount"> 2 Reviews </span>
												</div>
												End .rating-container
												<h3 class="item-name">
													<a href="product.html">Lorem Ipsum Dolla</a>
												</h3>
												<div class="item-action">
													<a href="#" class="item-add-btn"> <span
														class="icon-cart-text">Add to Cart</span>
													</a>
													<div class="item-action-inner">
														<a href="#" class="icon-button icon-like">Favourite</a> <a
															href="#" class="icon-button icon-compare">Checkout</a>
													</div>
													End .item-action-inner
												</div>
												End .item-action
											</div>
											End .item-meta-container
										</div>
										End .item
										<div class="item">

											<div class="item-image-container">
												<figure>
													<a href="product.html"> <img
														src="${contextPath}/resources/images/products/phone5.jpg" alt="item3"
														class="item-image"> <img
														src="${contextPath}/resources/images/products/phone5-hover.jpg" alt="item3 Hover"
														class="item-image-hover">
													</a>
												</figure>
												<div class="item-price-container">
													<span class="item-price">$210<span class="sub-price">.99</span></span>
												</div>
												<span class="new-rect">New</span>
											</div>
											End .item-image
											<div class="item-meta-container">
												<div class="ratings-container">
													<div class="ratings">
														<div class="ratings-result" data-result="65"></div>
													</div>
													End .ratings
													<span class="ratings-amount"> 2 Reviews </span>
												</div>
												End .rating-container
												<h3 class="item-name">
													<a href="product.html">Lorem Ipsum Dolla</a>
												</h3>
												<div class="item-action">
													<a href="#" class="item-add-btn"> <span
														class="icon-cart-text">Add to Cart</span>
													</a>
													<div class="item-action-inner">
														<a href="#" class="icon-button icon-like">Favourite</a> <a
															href="#" class="icon-button icon-compare">Checkout</a>
													</div>
													End .item-action-inner
												</div>
												End .item-action
											</div>
											End .item-meta-container
										</div>
										End .item

									</div>
									hot-items-slider
									<div class="lg-margin"></div>
									Space
								</div> -->
								<!-- End .hot-items -->
							</div>
							<!-- End .col-md-12 -->

						</div>
						<!-- End .row -->

						<!-- <div id="brand-slider-container" class="carousel-wrapper">
							<header class="content-title">
								<div class="title-bg">
									<h2 class="title">Manufacturers</h2>
								</div>
								End .title-bg
							</header>
							<div class="carousel-controls">
								<div id="brand-slider-prev"
									class="carousel-btn carousel-btn-prev"></div>
								End .carousel-prev
								<div id="brand-slider-next"
									class="carousel-btn carousel-btn-next carousel-space"></div>
								End .carousel-next
							</div>
							End .carousel-controllers
							<div class="sm-margin"></div>
							space
							<div class="brand-slider owl-carousel">
								<a href="#"><img src="${contextPath}/resources/images/brands/brand-logo.png"
									alt="Brand Logo 1"></a> <a href="#"><img
									src="${contextPath}/resources/images/brands/brand-logo.png" alt="Brand Logo 2"></a> <a
									href="#"><img src="${contextPath}/resources/images/brands/brand-logo.png"
									alt="Brand Logo 3"></a> <a href="#"><img
									src="${contextPath}/resources/images/brands/brand-logo.png" alt="Brand Logo 4"></a> <a
									href="#"><img src="${contextPath}/resources/images/brands/brand-logo.png"
									alt="Brand Logo 5"></a> <a href="#"><img
									src="${contextPath}/resources/images/brands/brand-logo.png" alt="Brand Logo 6"></a> <a
									href="#"><img src="${contextPath}/resources/images/brands/brand-logo.png"
									alt="Brand Logo 7"></a> <a href="#"><img
									src="${contextPath}/resources/images/brands/brand-logo.png" alt="Brand Logo 8"></a> <a
									href="#"><img src="${contextPath}/resources/images/brands/brand-logo.png"
									alt="Brand Logo 9"></a> <a href="#"><img
									src="${contextPath}/resources/images/brands/brand-logo.png" alt="Brand Logo 10"></a> <a
									href="#"><img src="${contextPath}/resources/images/brands/brand-logo.png"
									alt="Brand Logo 11"></a> <a href="#"><img
									src="${contextPath}/resources/images/brands/brand-logo.png" alt="Brand Logo 12"></a> <a
									href="#"><img src="${contextPath}/resources/images/brands/brand-logo.png"
									alt="Brand Logo 13"></a> <a href="#"><img
									src="${contextPath}/resources/images/brands/brand-logo.png" alt="Brand Logo 14"></a> <a
									href="#"><img src="${contextPath}/resources/images/brands/brand-logo.png"
									alt="Brand Logo 15"></a>
							</div>
							End .brand-slider
						</div> -->
						<!-- End #brand-slider-container -->

					</div>
					<!-- End .col-md-12 -->
				</div>
				<!-- End .row -->
			</div>
			<!-- End .container -->

		</section>
		<!-- End #content -->
	
</body>
</html>