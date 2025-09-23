<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Blog</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="The River template project">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- CSS -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/styles/bootstrap-4.1.2/bootstrap.min.css">
<link
	href="${pageContext.request.contextPath}/plugins/font-awesome-4.7.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/plugins/OwlCarousel2-2.3.4/owl.carousel.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/plugins/OwlCarousel2-2.3.4/owl.theme.default.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/plugins/OwlCarousel2-2.3.4/animate.css">
<link
	href="${pageContext.request.contextPath}/plugins/jquery-datepicker/jquery-ui.css"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/styles/blog.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/styles/blog_responsive.css">
</head>
<body>

	<div class="super_container">

		<!-- Header -->
		<header class="header">
			<div
				class="header_content d-flex flex-row align-items-center justify-content-start">
				<div class="logo">
					<a href="/home">The River</a>
				</div>
				<div
					class="ml-auto d-flex flex-row align-items-center justify-content-start">
					<nav class="main_nav">
						<ul
							class="d-flex flex-row align-items-start justify-content-start">
							<li><a href="/home">Home</a></li>
							<li><a href="/about">About us</a></li>
							<li><a href="/booking">Rooms</a></li>
							<li class="active"><a href="/blog">Blog</a></li>
							<li><a href="/contact">Contact</a></li>
						</ul>
					</nav>

					<div
						class="header_phone d-flex flex-row align-items-center justify-content-center">
						<img src="${pageContext.request.contextPath}/images/phone.png"
							alt=""> <span><%="0183-12345678"%></span>
					</div>
					<div class="hamburger">
						<i class="fa fa-bars" aria-hidden="true"></i>
					</div>
				</div>
			</div>
		</header>

		<!-- Menu -->
		<div
			class="menu trans_400 d-flex flex-column align-items-end justify-content-start">
			<div class="menu_close">
				<i class="fa fa-times" aria-hidden="true"></i>
			</div>
			<div class="menu_content">
				<nav class="menu_nav text-right">
					<ul>
						<li><a href="index.jsp">Home</a></li>
						<li><a href="about.jsp">About us</a></li>
						<li><a href="#">Rooms</a></li>
						<li><a href="blog.jsp">Blog</a></li>
						<li><a href="contact.jsp">Contact</a></li>
					</ul>
				</nav>
			</div>
			<div class="menu_extra">
				<div class="menu_book text-right">
					<a href="booking.jsp">Book online</a>
				</div>
				<div
					class="menu_phone d-flex flex-row align-items-center justify-content-center">
					<img src="${pageContext.request.contextPath}/images/phone-2.png"
						alt=""> <span><%="0183-12345678"%></span>
				</div>
			</div>
		</div>

		<!-- Home -->
		<div class="home">
			<div class="background_image"
				style="background-image:url('${pageContext.request.contextPath}/images/booking.jpg')"></div>
			<div class="home_container">
				<div class="container">
					<div class="row">
						<div class="col">
							<div class="home_content text-center">
								<div class="home_title">Blog</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- Blog -->
		<div class="blog">
			<div class="container">
				<div class="row">

					<!-- Blog Posts -->
					<div class="col-lg-9">
						<div class="blog_posts">

							<!-- Blog Post 1 -->
							<div class="blog_post">
								<div class="blog_post_image">
									<img src="${pageContext.request.contextPath}/images/blog_1.jpg"
										alt="">
									<div class="blog_post_date">
										<a href="#">Oct 20, 2018</a>
									</div>
								</div>
								<div class="blog_post_content">
									<div class="blog_post_title">
										<a href="#">Top dream destinations</a>
									</div>
									<div class="blog_post_info">
										<ul
											class="d-flex flex-row align-items-start justify-content-start flex-wrap">
											<li><img
												src="${pageContext.request.contextPath}/images/icon_4.png"
												alt=""><a href="#">News</a></li>
											<li><img
												src="${pageContext.request.contextPath}/images/icon_5.png"
												alt=""><a href="#">21 Likes</a></li>
											<li><img
												src="${pageContext.request.contextPath}/images/icon_6.png"
												alt=""><a href="#">602 views</a></li>
											<li><img
												src="${pageContext.request.contextPath}/images/icon_7.png"
												alt=""><a href="#">1 min</a></li>
											<li><img
												src="${pageContext.request.contextPath}/images/icon_8.png"
												alt=""><a href="#">3 comments</a></li>
										</ul>
									</div>
									<div class="blog_post_text">
										<p>Vivamus auctor mi eget odio feugiat...</p>
									</div>
									<div class="button blog_post_button">
										<a href="#">Read More</a>
									</div>
								</div>
							</div>

							<!-- Blog Post 2 -->
							<div class="blog_post">
								<div class="blog_post_image">
									<img src="${pageContext.request.contextPath}/images/blog_2.jpg"
										alt="">
									<div class="blog_post_date">
										<a href="#">Oct 20, 2018</a>
									</div>
								</div>
								<div class="blog_post_content">
									<div class="blog_post_title">
										<a href="#">How to book your stay</a>
									</div>
									<div class="blog_post_info">
										<ul
											class="d-flex flex-row align-items-start justify-content-start flex-wrap">
											<li><img
												src="${pageContext.request.contextPath}/images/icon_4.png"
												alt=""><a href="#">News</a></li>
											<li><img
												src="${pageContext.request.contextPath}/images/icon_5.png"
												alt=""><a href="#">21 Likes</a></li>
											<li><img
												src="${pageContext.request.contextPath}/images/icon_6.png"
												alt=""><a href="#">602 views</a></li>
											<li><img
												src="${pageContext.request.contextPath}/images/icon_7.png"
												alt=""><a href="#">1 min</a></li>
											<li><img
												src="${pageContext.request.contextPath}/images/icon_8.png"
												alt=""><a href="#">3 comments</a></li>
										</ul>
									</div>
									<div class="blog_post_text">
										<p>Integer egestas sit amet neque sed elementum...</p>
									</div>
									<div class="button blog_post_button">
										<a href="#">Read More</a>
									</div>
								</div>
							</div>

							<!-- Blog Post 3 -->
							<div class="blog_post">
								<div class="blog_post_image">
									<img src="${pageContext.request.contextPath}/images/blog_3.jpg"
										alt="">
									<div class="blog_post_date">
										<a href="#">Oct 20, 2018</a>
									</div>
								</div>
								<div class="blog_post_content">
									<div class="blog_post_title">
										<a href="#">Perfect beach wedding</a>
									</div>
									<div class="blog_post_info">
										<ul
											class="d-flex flex-row align-items-start justify-content-start flex-wrap">
											<li><img
												src="${pageContext.request.contextPath}/images/icon_4.png"
												alt=""><a href="#">News</a></li>
											<li><img
												src="${pageContext.request.contextPath}/images/icon_5.png"
												alt=""><a href="#">21 Likes</a></li>
											<li><img
												src="${pageContext.request.contextPath}/images/icon_6.png"
												alt=""><a href="#">602 views</a></li>
											<li><img
												src="${pageContext.request.contextPath}/images/icon_7.png"
												alt=""><a href="#">1 min</a></li>
											<li><img
												src="${pageContext.request.contextPath}/images/icon_8.png"
												alt=""><a href="#">3 comments</a></li>
										</ul>
									</div>
									<div class="blog_post_text">
										<p>Fusce ut turpis felis. Etiam pretium pharetra augue...</p>
									</div>
									<div class="button blog_post_button">
										<a href="#">Read More</a>
									</div>
								</div>
							</div>

							<!-- Page Nav -->
							<div class="page_nav">
								<ul
									class="d-flex flex-row align-items-start justify-content-start">
									<li class="active"><a href="#">01.</a></li>
									<li><a href="#">02.</a></li>
									<li><a href="#">03.</a></li>
								</ul>
							</div>
						</div>
					</div>

					<!-- Sidebar -->
					<div class="col-lg-3">
						<div class="sidebar">
							<!-- Search -->
							<div class="sidebar_search">
								<form action="#" class="sidebar_search_form"
									id="sidebar_search_form">
									<input type="text" class="sidebar_search_input"
										placeholder="Keyword" required>
									<button class="sidebar_search_button">Search</button>
								</form>
							</div>

							<!-- Recent Posts -->
							<div class="recent_posts">
								<div class="sidebar_title">
									<h4>Recent Posts</h4>
								</div>
								<ul>
									<li><a href="#">Featured Product</a></li>
									<li><a href="#">Standard Post</a></li>
									<li><a href="#">Gallery Post</a></li>
									<li><a href="#">Video Post</a></li>
									<li><a href="#">Audio Post</a></li>
								</ul>
							</div>

							<!-- Categories -->
							<div class="categories">
								<div class="sidebar_title">
									<h4>Categories</h4>
								</div>
								<ul>
									<li><a href="#">News</a></li>
									<li><a href="#">Hotel</a></li>
									<li><a href="#">Vacation</a></li>
								</ul>
							</div>

							<!-- Tags -->
							<div class="tags">
								<div class="sidebar_title">
									<h4>Tags</h4>
								</div>
								<ul class="d-flex flex-row flex-wrap">
									<li><a href="#">news</a></li>
									<li><a href="#">hotel</a></li>
									<li><a href="#">vacation</a></li>
									<li><a href="#">reservation</a></li>
									<li><a href="#">booking</a></li>
									<li><a href="#">video</a></li>
									<li><a href="#">clients</a></li>
									<li><a href="#">reviews</a></li>
									<li><a href="#">destinations</a></li>
									<li><a href="#">swimming pool</a></li>
								</ul>
							</div>

							<!-- Special Offer -->
							<div class="special_offer">
								<div class="background_image"
									style="background-image:url('${pageContext.request.contextPath}/images/special_offer.jpg')"></div>
								<div class="special_offer_container text-center">
									<div class="special_offer_title">Special Offer</div>
									<div class="special_offer_subtitle">Family Room</div>
									<div class="button special_offer_button">
										<a href="#">Book now</a>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>

		<!-- Footer -->
		<footer class="footer">
			<div class="footer_content">
				<div class="container">
					<div class="row">
						<div class="col text-center">
							<div class="footer_logo">
								<div>The River</div>
								<div>since 1945</div>
							</div>
						</div>
					</div>
					<div class="row footer_row">
						<div class="col-lg-3">
							<div class="footer_title">Our Address</div>
							<ul>
								<li>Beach Str. 345</li>
								<li>67559 Miami</li>
								<li>USA</li>
							</ul>
						</div>
						<div class="col-lg-3">
							<div class="footer_title">Reservations</div>
							<ul>
								<li>Tel: 345 5667 889</li>
								<li>Fax: 6783 4567 889</li>
								<li>reservations@hotelriver.com</li>
							</ul>
						</div>
						<div class="col-lg-3">
							<div class="footer_title">Newsletter</div>
							<form action="#" class="newsletter_form">
								<input type="email" class="newsletter_input"
									placeholder="Your email address" required>
								<button class="newsletter_button">Subscribe</button>
							</form>
						</div>
						<div class="col-lg-3">
							<div class="certificates d-flex flex-wrap">
								<div class="cert">
									<img src="${pageContext.request.contextPath}/images/cert_1.png"
										alt="">
								</div>
								<div class="cert">
									<img src="${pageContext.request.contextPath}/images/cert_2.png"
										alt="">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="copyright">
				Copyright &copy;
				<script>document.write(new Date().getFullYear());</script>
				All rights reserved | This template is made with <i
					class="fa fa-heart-o"></i> by <a href="https://colorlib.com"
					target="_blank">Colorlib</a>
			</div>
		</footer>
	</div>

	<!-- JS -->
	<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/styles/bootstrap-4.1.2/popper.js"></script>
	<script
		src="${pageContext.request.contextPath}/styles/bootstrap-4.1.2/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/greensock/TweenMax.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/greensock/TimelineMax.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/scrollmagic/ScrollMagic.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/greensock/animation.gsap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/greensock/ScrollToPlugin.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/OwlCarousel2-2.3.4/owl.carousel.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/easing/easing.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/progressbar/progressbar.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/parallax-js-master/parallax.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/plugins/jquery-datepicker/jquery-ui.js"></script>
	<script src="${pageContext.request.contextPath}/js/blog.js"></script>
</body>
</html>
