<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>The River</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="The River template project">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css"
	href="styles/bootstrap-4.1.2/bootstrap.min.css">
<link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css"
	href="plugins/OwlCarousel2-2.3.4/owl.carousel.css">
<link rel="stylesheet" type="text/css"
	href="plugins/OwlCarousel2-2.3.4/owl.theme.default.css">
<link rel="stylesheet" type="text/css"
	href="plugins/OwlCarousel2-2.3.4/animate.css">
<link href="plugins/jquery-datepicker/jquery-ui.css" rel="stylesheet"
	type="text/css">
<link href="plugins/colorbox/colorbox.css" rel="stylesheet"
	type="text/css">
<link rel="stylesheet" type="text/css" href="styles/main_styles.css">
<link rel="stylesheet" type="text/css" href="styles/responsive.css">
</head>
<body>

	<div class="super_container">

		<!-- Header -->

		<header class="header">
			<div
				class="header_content d-flex flex-row align-items-center justify-content-start">
				<div class="logo">
					<a href="/index">The River</a>
				</div>
				<div
					class="ml-auto d-flex flex-row align-items-center justify-content-start">
					<nav class="main_nav">
						<ul
							class="d-flex flex-row align-items-start justify-content-start">
							<li class="active"><a href="/">Home</a></li>
							<li><a href="/register">Register</a></li>
							<li><a href="/login">Login</a></li>

						</ul>
					</nav>

					<div
						class="header_phone d-flex flex-row align-items-center justify-content-center">
						<img src="images/phone.png" alt=""> <span><%="0183-12345678"%></span>
					</div>

					<!-- Hamburger Menu -->
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
						<li><a href="/">Home</a></li>
						<li><a href="/register">register</a></li>
						<li><a href="login.jsp">Login</a></li>
					</ul>
				</nav>
			</div>
			<div class="menu_extra">

				<div
					class="menu_phone d-flex flex-row align-items-center justify-content-center">
					<img src="images/phone-2.png" alt=""> <span><%="0183-12345678"%></span>
				</div>
			</div>
		</div>

		<!-- Home -->

		<div class="home">
			<div class="home_slider_container">
				<div class="owl-carousel owl-theme home_slider">

					<!-- Slide -->
					<div class="slide">
						<div class="background_image"
							style="background-image: url(images/index_1.jpg)"></div>
						<div class="home_container">
							<div class="container">
								<div class="row">
									<div class="col">
										<div class="home_content text-center">
											<div class="home_title"><%="A Luxury Stay"%></div>

										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<!-- Slide -->
					<div class="slide">
						<div class="background_image"
							style="background-image: url(images/index_1.jpg)"></div>
						<div class="home_container">
							<div class="container">
								<div class="row">
									<div class="col">
										<div class="home_content text-center">
											<div class="home_title"><%="A Luxury Stay"%></div>

										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<!-- Slide -->
					<div class="slide">
						<div class="background_image"
							style="background-image: url(images/index_1.jpg)"></div>
						<div class="home_container">
							<div class="container">
								<div class="row">
									<div class="col">
										<div class="home_content text-center">
											<div class="home_title"><%="A Luxury Stay"%></div>

										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>

				<!-- Home Slider Dots -->
				<div class="home_slider_dots_container">
					<div class="home_slider_dots">
						<ul id="home_slider_custom_dots"
							class="home_slider_custom_dots d-flex flex-row align-items-start justify-content-start">
							<li class="home_slider_custom_dot active">01.</li>
							<li class="home_slider_custom_dot">02.</li>
							<li class="home_slider_custom_dot">03.</li>
						</ul>
					</div>
				</div>

			</div>
		</div>
		<!-- Footer -->

		<footer class="footer">
			<div class="footer_content">
				<div class="container">
					<div class="row">
						<div class="col">
							<div class="footer_logo_container text-center">
								<div class="footer_logo">
									<a href="#"></a>
									<div>The River</div>
									<div>since 1945</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row footer_row">

						<!-- Address -->
						<div class="col-lg-3">
							<div class="footer_title">Our Address</div>
							<div class="footer_list">
								<ul>
									<li>Beach Str. 345</li>
									<li>67559 Miami</li>
									<li>USA</li>
								</ul>
							</div>
						</div>

						<!-- Reservations -->
						<div class="col-lg-3">
							<div class="footer_title">Reservations</div>
							<div class="footer_list">
								<ul>
									<li>Tel: 345 5667 889</li>
									<li>Fax; 6783 4567 889</li>
									<li>reservations@hotelriver.com</li>
								</ul>
							</div>
						</div>

						<!-- Newsletter -->
						<div class="col-lg-3">
							<div class="footer_title">Newsletter</div>
							<div class="newsletter_container">
								<form action="NewsletterServlet" method="post"
									class="newsletter_form" id="newsletter_form">
									<input type="email" name="email" class="newsletter_input"
										placeholder="Your email address" required="required">
									<button type="submit" class="newsletter_button">Subscribe</button>
								</form>
							</div>
						</div>

						<!-- Footer images -->
						<div class="col-lg-3">
							<div
								class="certificates d-flex flex-row align-items-start justify-content-lg-between justify-content-start flex-lg-nowrap flex-wrap">
								<div class="cert">
									<img src="images/cert_1.png" alt="">
								</div>
								<div class="cert">
									<img src="images/cert_2.png" alt="">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="copyright">
				<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
				Copyright &copy;<%=java.time.Year.now().getValue()%>
				All rights reserved | This template is made with <i
					class="fa fa-heart-o" aria-hidden="true"></i> by <a
					href="https://colorlib.com" target="_blank">Colorlib</a>
				<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
			</div>
		</footer>
	</div>

	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="styles/bootstrap-4.1.2/popper.js"></script>
	<script src="styles/bootstrap-4.1.2/bootstrap.min.js"></script>
	<script src="plugins/greensock/TweenMax.min.js"></script>
	<script src="plugins/greensock/TimelineMax.min.js"></script>
	<script src="plugins/scrollmagic/ScrollMagic.min.js"></script>
	<script src="plugins/greensock/animation.gsap.min.js"></script>
	<script src="plugins/greensock/ScrollToPlugin.min.js"></script>
	<script src="plugins/OwlCarousel2-2.3.4/owl.carousel.js"></script>
	<script src="plugins/easing/easing.js"></script>
	<script src="plugins/progressbar/progressbar.min.js"></script>
	<script src="plugins/parallax-js-master/parallax.min.js"></script>
	<script src="plugins/jquery-datepicker/jquery-ui.js"></script>
	<script src="plugins/colorbox/jquery.colorbox-min.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>
