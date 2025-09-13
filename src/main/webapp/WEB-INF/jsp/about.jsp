<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>About us</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="The River template project">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- CSS -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/bootstrap-4.1.2/bootstrap.min.css">
<link href="${pageContext.request.contextPath}/plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plugins/OwlCarousel2-2.3.4/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plugins/OwlCarousel2-2.3.4/owl.theme.default.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plugins/OwlCarousel2-2.3.4/animate.css">
<link href="${pageContext.request.contextPath}/plugins/jquery-datepicker/jquery-ui.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/about.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/about_responsive.css">
</head>
<body>

<div class="super_container">
	
	<!-- Header -->
	<header class="header">
		<div class="header_content d-flex flex-row align-items-center justify-content-start">
			<div class="logo"><a href="#">The River</a></div>
			<div class="ml-auto d-flex flex-row align-items-center justify-content-start">
				<nav class="main_nav">
					<ul class="d-flex flex-row align-items-start justify-content-start">
						<li><a href="/home">Home</a></li>
						<li class="active"><a href="/about">About us</a></li>
						<li><a href="/booking">Rooms</a></li>
						<li><a href="/blog">Blog</a></li>
						<li><a href="/contact">Contact</a></li>
					</ul>
				</nav>
				
				<div class="header_phone d-flex flex-row align-items-center justify-content-center">
					<img src="${pageContext.request.contextPath}/images/phone.png" alt="">
					<span><%= "0183-12345678" %></span>
				</div>
				<div class="hamburger"><i class="fa fa-bars" aria-hidden="true"></i></div>
			</div>
		</div>
	</header>

	<!-- Menu -->
	<div class="menu trans_400 d-flex flex-column align-items-end justify-content-start">
		<div class="menu_close"><i class="fa fa-times" aria-hidden="true"></i></div>
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
			<div class="menu_book text-right"><a href="booking.jsp">Book online</a></div>
			<div class="menu_phone d-flex flex-row align-items-center justify-content-center">
				<img src="${pageContext.request.contextPath}/images/phone-2.png" alt="">
				<span><%= "0183-12345678" %></span>
			</div>
		</div>
	</div>

	<!-- Home -->
	<div class="home">
		<div class="background_image" style="background-image:url('${pageContext.request.contextPath}/images/about.jpg')"></div>
		<div class="home_container">
			<div class="container">
				<div class="row">
					<div class="col">
						<div class="home_content text-center">
							<div class="home_title">About us</div>
							<div class="booking_form_container">
								<form action="BookingServlet" method="post" class="booking_form" id="booking_form">
									<div class="d-flex flex-xl-row flex-column align-items-start justify-content-start">
										<div class="booking_input_container d-flex flex-row align-items-start justify-content-start flex-wrap">
											<div><input type="text" name="checkin" class="datepicker booking_input booking_input_a booking_in" placeholder="Check in" required></div>
											<div><input type="text" name="checkout" class="datepicker booking_input booking_input_a booking_out" placeholder="Check out" required></div>
											<div><input type="number" name="children" class="booking_input booking_input_b" placeholder="Children" required></div>
											<div><input type="number" name="room" class="booking_input booking_input_b" placeholder="Room" required></div>
										</div>
										<div><button type="submit" class="booking_button trans_200">Book Now</button></div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- About -->
	<div class="about">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="about_title"><h2>The River / 10 years of excellence</h2></div>
				</div>
			</div>
			<div class="row about_row">
				<div class="col-lg-6">
					<div class="about_content">
						<div class="about_text">
							<p>Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Suspendisse nec faucibus velit. Quisque eleifend orci ipsum, a bibendum lacus suscipit sit...</p>
						</div>
						<div class="about_sig"><img src="${pageContext.request.contextPath}/images/sig.png" alt=""></div>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="about_images d-flex flex-row align-items-start justify-content-between flex-wrap">
						<img src="${pageContext.request.contextPath}/images/about_1.png" alt="">
						<img src="${pageContext.request.contextPath}/images/about_2.png" alt="">
						<img src="${pageContext.request.contextPath}/images/about_3.png" alt="">
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Split Section Right -->
	<div class="split_section_right container_custom">
		<div class="container">
			<div class="row row-xl-eq-height">
				<div class="col-xl-6 order-xl-1 order-2">
					<div class="split_section_image">
						<div class="background_image" style="background-image:url('${pageContext.request.contextPath}/images/milestones.jpg')"></div>
					</div>
				</div>
				<div class="col-xl-6 order-xl-2 order-1">
					<div class="split_section_right_content">
						<div class="split_section_title"><h1>Luxury Resort</h1></div>
						<div class="split_section_text">
							<p>Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae...</p>
						</div>
						<div class="milestones_container d-flex flex-row align-items-start justify-content-start flex-wrap">
							<div class="milestone d-flex flex-row align-items-start justify-content-start">
								<div class="milestone_content">
									<div class="milestone_counter" data-end-value="45">0</div>
									<div class="milestone_title">Rooms available</div>
								</div>
							</div>
							<div class="milestone d-flex flex-row align-items-start justify-content-start">
								<div class="milestone_content">
									<div class="milestone_counter" data-end-value="21" data-sign-after="K">0</div>
									<div class="milestone_title">Tourists this year</div>
								</div>
							</div>
							<div class="milestone d-flex flex-row align-items-start justify-content-start">
								<div class="milestone_content">
									<div class="milestone_counter" data-end-value="2">0</div>
									<div class="milestone_title">Swimming pools</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Split Section Left -->
	<div class="split_section_left container_custom">
		<div class="container">
			<div class="row">
				<div class="col-xl-6">
					<div class="split_section_left_content">
						<div class="split_section_title"><h1>Wedding venue</h1></div>
						<div class="split_section_text">
							<p>Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae...</p>
						</div>
						<div class="loaders_container d-flex flex-row align-items-start justify-content-start flex-wrap">
							<div class="loader_container text-center"><div class="loader" data-perc="0.9"><div class="loader_content"><div class="loader_title">Good Services</div></div></div></div>
							<div class="loader_container text-center"><div class="loader" data-perc="0.8"><div class="loader_content"><div class="loader_title">Tourists</div></div></div></div>
							<div class="loader_container text-center"><div class="loader" data-perc="1.0"><div class="loader_content"><div class="loader_title">Satisfaction</div></div></div></div>
						</div>
					</div>
				</div>
				<div class="col-xl-6">
					<div class="split_section_image split_section_left_image">
						<div class="background_image" style="background-image:url('${pageContext.request.contextPath}/images/loaders.jpg')"></div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Testimonials -->
	<div class="testimonials">
		<div class="parallax_background parallax-window" data-parallax="scroll" data-image-src="${pageContext.request.contextPath}/images/testimonials.jpg" data-speed="0.8"></div>
		<div class="testimonials_overlay"></div>
		<div class="container">
			<div class="row">
				<div class="col">
					<div class="testimonials_slider_container">
						<div class="owl-carousel owl-theme test_slider">
							<div class="test_slider_item text-center">
								<div class="rating rating_5 d-flex flex-row align-items-start justify-content-center"><i></i><i></i><i></i><i></i><i></i></div>
								<div class="testimonial_title"><a href="#">Perfect Stay</a></div>
								<div class="testimonial_text"><p>Etiam nec odio vestibulum est mattis effic...</p></div>
								<div class="testimonial_image"><img src="${pageContext.request.contextPath}/images/user_1.jpg" alt=""></div>
								<div class="testimonial_author"><a href="#">Samantha Smith</a>, Greece</div>
							</div>
							<div class="test_slider_item text-center">
								<div class="rating rating_5 d-flex flex-row align-items-start justify-content-center"><i></i><i></i><i></i><i></i><i></i></div>
								<div class="testimonial_title"><a href="#">Nice place</a></div>
								<div class="testimonial_text"><p>Etiam nec odio vestibulum est mattis effic...</p></div>
								<div class="testimonial_image"><img src="${pageContext.request.contextPath}/images/user_2.jpg" alt=""></div>
								<div class="testimonial_author"><a href="#">Michael Doe</a>, Italy</div>
							</div>
							<div class="test_slider_item text-center">
								<div class="rating rating_5 d-flex flex-row align-items-start justify-content-center"><i></i><i></i><i></i><i></i><i></i></div>
								<div class="testimonial_title"><a href="#">We loved it</a></div>
								<div class="testimonial_text"><p>Etiam nec odio vestibulum est mattis effic...</p></div>
								<div class="testimonial_image"><img src="${pageContext.request.contextPath}/images/user_3.jpg" alt=""></div>
								<div class="testimonial_author"><a href="#">Luis Garcia</a>, Spain</div>
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
					<div class="col">
						<div class="footer_logo_container text-center">
							<div class="footer_logo"><div>The River</div><div>since 1945</div></div>
						</div>
					</div>
				</div>
				<div class="row footer_row">
					<div class="col-lg-3">
						<div class="footer_title">Our Address</div>
						<div class="footer_list"><ul><li>Beach Str. 345</li><li>67559 Miami</li><li>USA</li></ul></div>
					</div>
					<div class="col-lg-3">
						<div class="footer_title">Reservations</div>
						<div class="footer_list"><ul><li>Tel: 345 5667 889</li><li>Fax: 6783 4567 889</li><li>reservations@hotelriver.com</li></ul></div>
					</div>
					<div class="col-lg-3">
						<div class="footer_title">Newsletter</div>
						<div class="newsletter_container">
							<form action="#" class="newsletter_form" id="newsletter_form">
								<input type="email" class="newsletter_input" placeholder="Your email address" required>
								<button class="newsletter_button">Subscribe</button>
							</form>
						</div>
					</div>
					<div class="col-lg-3">
						<div class="certificates d-flex flex-row align-items-start justify-content-lg-between justify-content-start flex-lg-nowrap flex-wrap">
							<div class="cert"><img src="${pageContext.request.contextPath}/images/cert_1.png" alt=""></div>
							<div class="cert"><img src="${pageContext.request.contextPath}/images/cert_2.png" alt=""></div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="copyright">
			Copyright &copy;<script>document.write(new Date().getFullYear());</script> 
			All rights reserved | Made with <i class="fa fa-heart-o"></i> by 
			<a href="https://colorlib.com" target="_blank">Colorlib</a>
		</div>
	</footer>
</div>

<!-- JS -->
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath}/styles/bootstrap-4.1.2/popper.js"></script>
<script src="${pageContext.request.contextPath}/styles/bootstrap-4.1.2/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/greensock/TweenMax.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/greensock/TimelineMax.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/scrollmagic/ScrollMagic.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/greensock/animation.gsap.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/greensock/ScrollToPlugin.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/OwlCarousel2-2.3.4/owl.carousel.js"></script>
<script src="${pageContext.request.contextPath}/plugins/easing/easing.js"></script>
<script src="${pageContext.request.contextPath}/plugins/progressbar/progressbar.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/parallax-js-master/parallax.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/jquery-datepicker/jquery-ui.js"></script>
<script src="${pageContext.request.contextPath}/js/about.js"></script>
</body>
</html>
