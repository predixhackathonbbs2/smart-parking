<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
<link rel="stylesheet"	href='<c:url value="/resources/css/bootstrap.min.css"></c:url>'/>
<!-- Font Awesome -->
<link rel="stylesheet"	href='<c:url value="/resources/css/font-awesome-4.4.0/css/font-awesome.css"></c:url>'/>
<!-- Ionicons -->
<link rel="stylesheet" 	href='<c:url value="/resources/css/prettyPhoto.css"></c:url>'/>
<!-- Theme style -->
<link rel="stylesheet" 	href='<c:url value="/resources/css/colpick.css"></c:url>'/>
<link rel="stylesheet" href='<c:url value="/resources/css/revslider.css"></c:url>'/>
<link rel="stylesheet" href='<c:url value="/resources/css/owl.carousel.css"></c:url>'/>

<link rel="stylesheet" href='<c:url value="/resources/css/style.css"></c:url>'/>
<link rel="stylesheet" href='<c:url value="/resources/css/responsive.css"></c:url>'/>


<script src='<c:url value="/resources/js/jquery-1.11.0.min.js"></c:url>'></script>
<script src="<c:url value="/resources/js/angular.js"></c:url>"></script>
<script	src="<c:url value="/resources/js/angular-main.js"></c:url>"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js"></c:url>"></script>
<script src="<c:url value="/resources/js/smoothscroll.js"></c:url>"></script>
<script src="<c:url value="/resources/js/retina-1.1.0.min.js"></c:url>"></script>
<script src="<c:url value="/resources/js/jquery.placeholder.js"></c:url>"></script>
<script src="<c:url value="/resources/js/jquery.hoverIntent.min.js"></c:url>"></script>
<script src="<c:url value="/resources/js/twitter/jquery.tweet.min.js"></c:url>"></script>
<script src="<c:url value="/resources/js/jquery.flexslider-min.js"></c:url>"></script>
<script src="<c:url value="/resources/js/owl.carousel.min.js"></c:url>"></script>
<script src="<c:url value="/resources/js/jflickrfeed.min.js"></c:url>"></script>
<script src="<c:url value="/resources/js/jquery.prettyPhoto.js"></c:url>"></script>
<script src="<c:url value="/resources/js/jquery.themepunch.plugins.min.js"></c:url>"></script>

<script src="<c:url value="/resources/js/colpick.js"></c:url>"></script>
<script src="<c:url value="/resources/js/jquery.session.js"></c:url>"></script>
<script src="<c:url value="/resources/js/main.js"></c:url>"></script>
<script src="<c:url value="/resources/js/app.js"></c:url>"></script>
<script src="<c:url value="/resources/js/modules/login.js"></c:url>"></script>

<script>

var webContextPath="${pageContext.request.contextPath}";
</script>

  
</head>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
	<body>
		<header id="header">
			<div id="header-top">
				<div class="container">
					<div class="">
						<div class="col-md-12">
							<div class="header-top-left">
								<ul id="top-links" class="inlineDisplay">
									<li><a id="wishListHeader" title="My Wishlist"
										class="pointer"><span class="top-icon top-icon-pencil"></span><span
											class="hide-for-xs">My Wishlist</span></a></li>
									<li><a id="myAccountHeader" title="My Account"
										class="pointer"><span class="top-icon top-icon-user"></span><span
											class="hide-for-xs">My Account</span></a></li>
									<!-- <li><a href="checkout.html" title="Checkout"><span
											class="top-icon top-icon-check"></span><span
											class="hide-for-xs">Checkout</span></a></li> -->
								</ul>

								<div
									class="dropdown-cart-menu-container pull-right inlineDisplay">
									<div class="btn-group dropdown-cart">
										<button type="button" class="btn btn-custom dropdown-toggle"
											data-toggle="dropdown">
											<span class="cart-menu-icon"></span> 0 item(s) <span
												class="drop-price">- $0.00</span>
										</button>

										<div
											class="dropdown-menu dropdown-cart-menu pull-right clearfix"
											role="menu">
											<p class="dropdown-cart-description">Recently added
												item(s).</p>
											<ul class="dropdown-cart-product-list">
												<li class="item clearfix"><a href="#"
													title="Delete item" class="delete-item"><i
														class="fa fa-times"></i></a> <a href="#" title="Edit item"
													class="edit-item"><i class="fa fa-pencil"></i></a>
													<figure>
														<a href="product.html"><img
															src="${contextPath}/resources/images/products/thumbnails/jacket4.jpg"
															alt="jacket 4"></a>
													</figure>
													<div class="dropdown-cart-details">
														<p class="item-name">
															<a href="product.html">Cam Optia AF Webcam </a>
														</p>
														<p>
															1x <span class="item-price">$499</span>
														</p>
													</div> <!-- End .dropdown-cart-details --></li>
												<li class="item clearfix"><a href="#"
													title="Delete item" class="delete-item"><i
														class="fa fa-times"></i></a> <a href="#" title="Edit item"
													class="edit-item"><i class="fa fa-pencil"></i></a>
													<figure>
														<a href="product.html"><img
															src="${contextPath}/resources/images/products/thumbnails/jacket3.jpg"
															alt="jacket 3"></a>
													</figure>
													<div class="dropdown-cart-details">
														<p class="item-name">
															<a href="product.html">Iphone Case Cover Original</a>
														</p>
														<p>
															1x <span class="item-price">$499<span
																class="sub-price">.99</span></span>
														</p>
													</div> <!-- End .dropdown-cart-details --></li>
											</ul>

											<ul class="dropdown-cart-total">
												<li><span class="dropdown-cart-total-title">Shipping:</span>$7</li>
												<li><span class="dropdown-cart-total-title">Total:</span>$1005<span
													class="sub-price">.99</span></li>
											</ul>
											<!-- .dropdown-cart-total -->
											<div class="dropdown-cart-action">
												<p>
													<a href="cart.html" class="btn btn-custom-2 btn-block">Cart</a>
												</p>
												<p>
													<a href="checkout.html" class="btn btn-custom btn-block">Checkout</a>
												</p>
											</div>
											<!-- End .dropdown-cart-action -->

										</div>
										<!-- End .dropdown-cart -->
									</div>
									<!-- End .btn-group -->
								</div>
								<!-- End .dropdown-cart-menu-container -->
							</div>
							<!-- End .header-top-left -->
							<div class="header-top-right">
								<div class="header-top-dropdowns pull-right inlineDisplay">
									<!-- <div class="btn-group dropdown-money">
										<button type="button" class="btn btn-custom dropdown-toggle"
											data-toggle="dropdown">
											<span class="hide-for-xs hide-for-sm">US Dollar</span><span
												class="hide-for-lg show-for-sm">$</span>
										</button>
										<ul class="dropdown-menu pull-right" role="menu">
											<li><a href="#"><span
													class="hide-for-xs hide-for-sm">Euro</span><span
													class="hide-for-lg show-for-sm">&euro;</span></a></li>
											<li><a href="#"><span
													class="hide-for-xs hide-for-sm">Pound</span><span
													class="hide-for-lg show-for-sm">&pound;</span></a></li>
										</ul>
									</div>
									End .btn-group
									<div class="btn-group dropdown-language">
										<button type="button" class="btn btn-custom dropdown-toggle"
											data-toggle="dropdown">
											<span class="flag-container"><img
												src="${contextPath}/resources/images/england-flag.png" alt="flag of england"></span> <span
												class="hide-for-xs hide-for-sm">English</span>
										</button>
										<ul class="dropdown-menu pull-right" role="menu">
											<li><a href="#"><span class="flag-container"><img
														src="${contextPath}/resources/images/italy-flag.png" alt="flag of england"></span><span
													class="hide-for-xs hide-for-sm">Italian</span></a></li>
											<li><a href="#"><span class="flag-container"><img
														src="${contextPath}/resources/images/spain-flag.png" alt="flag of italy"></span><span
													class="hide-for-xs hide-for-sm">Spanish</span></a></li>
											<li><a href="#"><span class="flag-container"><img
														src="${contextPath}/resources/images/france-flag.png" alt="flag of france"></span><span
													class="hide-for-xs hide-for-sm">French</span></a></li>
											<li><a href="#"><span class="sm-separator"><img
														src="${contextPath}/resources/images/germany-flag.png" alt="flag of germany"></span><span
													class="hide-for-xs hide-for-sm">German</span></a></li>
										</ul>
									</div> -->
									<!-- End .btn-group -->
									<c:set var="user" value="${userInfo}" scope="session"  />
									<c:if test="${userInfo eq null }">
									 <p class="header-link" id="loginheader">
										 <a href="${contextPath}/login/page">Login</a>&nbsp;or&nbsp;
										 <a	href="${contextPath}/register/page">Create an account</a>&nbsp;&nbsp;&nbsp;&nbsp;
									 </p>
									 </c:if>
									 <c:if test="${userInfo ne null }">
									 	Welcome ${userInfo.customer.firstName} ${userInfo.customer.lastName}
									 </c:if>
									<!-- <button class="header-link pull-right" id="logout-btn"></button> -->
								</div>
								<!-- End .header-top-dropdowns -->
							</div>
							<!-- End .header-top-right -->
						</div>
						<!-- End .col-md-12 -->
					</div>
					<!-- End .row -->
				</div>
				<!-- End .container -->
			</div>
			<!-- End #header-top -->

			<div id="inner-header">

				<div id="main-nav-container">
					<div class="container">
						<div class="row">
							<div class="col-md-12 clearfix">
								<div id="menu-wrapper" class="clearfix">
									<div class="logo-container">
										<div class="logo clearfix">
											<a href="index.html" title="Wego eCommerce"><img
												src="${contextPath}/resources/images/logo.png" alt="Wego eCommerce" width="184"
												height="60"></a>
										</div>
									</div>
									<!-- End .logo-container -->
									<div id="menu-right-side" class="clerfix">
										<div id="quick-access">
											<form class="form-inline quick-search-form" role="form"
												action="#">
												<div class="form-group">
													<input type="text" class="form-control"
														placeholder="Search here">
												</div>
												<!-- End .form-inline -->
												<button type="submit" id="quick-search"
													class="btn btn-custom"></button>
											</form>
										</div>
										<!-- End #quick-access -->
										<nav id="main-nav">
											<div id="responsive-nav">
												<div id="responsive-nav-button">
													Menu <span id="responsive-nav-button-icon"></span>
												</div>
												<!-- responsive-nav-button -->
											</div>
											 <div id="navbar" class="navbar-collapse collapse">
											<ul class="nav navbar-nav clearfix">
												<li><a class="active mega-menu-txt-color" href="${contextPath}/">HOME</a></li>
												<li class="dropdown"><a href class="dropdown-toggle mega-menu-txt-color" data-toggle="dropdown" >MENU</a>
													<ul class="dropdown-menu">
														<li><a href="#">Sandwiches</a></li>
														<li><a href="#">Salads</a></li>
														<li><a href="#">Soups</a></li>
														<li><a href="#">Pizza</a></li>
														<li><a href="#">Pasta</a></li>
													</ul>
												</li>
												<li class="dropdown">
												  <a href="#" class="dropdown-toggle mega-menu-txt-color" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">PRODUCT<span class="caret"></span></a>
													<ul class="dropdown-menu" >
														<li><a  href="${contextPath}/product/page">Registration</a></li>
													</ul>
												</li>
												<li><a class="dropdown-toggle mega-menu-txt-color" href="contact.html">CONTACT US</a></li>
											</ul>
											</div>

										</nav>
									</div>
									<!-- End #menu-right-side -->
								</div>
								<!-- End #menu-wrapper -->

							</div>
							<!-- End .col-md-12 -->
						</div>
						<!-- End .row -->
					</div>
					<!-- End .container -->

				</div>
				<!-- End #nav -->
			</div>
			<!-- End #inner-header -->
		</header>
		<!-- End #header -->
