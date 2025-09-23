<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.uniq.HotelManagement.DTO.UpdateRoomRequestDTO"%>
<%
UpdateRoomRequestDTO room = (UpdateRoomRequestDTO) request.getAttribute("room");
%>

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
					<a href="/update">The River</a>
				</div>
				<div
					class="ml-auto d-flex flex-row align-items-center justify-content-start">
					<nav class="main_nav">
						<ul
							class="d-flex flex-row align-items-start justify-content-start">

						</ul>
					</nav>
					<!-- Hamburger Menu -->
					<div class="hamburger">
						<i class="fa fa-bars" aria-hidden="true"></i>
					</div>
				</div>
			</div>
		</header>

		<div class="home">
			<div class="background_image"
				style="background-image: url(images/index.jpg)"></div>

			<!-- Add top padding so form moves up -->

			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-6 col-md-8 col-sm-12">
						<div class="row justify-content-center">
							<div class="booking_form_container text-center"
								style="margin-top: 100px;">
								<form id="updateRoomForm">
									<!-- Hidden Room ID -->
									<input type="hidden" id="roomId" value="${room.roomId}">

									<!-- Room Number -->
									<div class="form-group">
										<input type="text" id="roomNumber" name="roomNumber"
											class="form-control text-center" value="${room.roomNumber}"
											required>
									</div>

									<!-- Type -->
									<div class="form-group">
										<input type="text" id="roomType" name="roomType"
											class="form-control text-center" value="${room.roomType}"
											required>
									</div>

									<!-- Price -->
									<div class="form-group">
										<input type="number" id="roomPrice" name="roomPrice"
											class="form-control text-center" value="${room.roomPrice}"
											required>
									</div>

									<!-- Capacity -->
									<div class="form-group">
										<input type="number" id="roomCapacity" name="roomCapacity"
											class="form-control text-center" value="${room.roomCapacity}"
											required>
									</div>

									<!-- Status -->
									<div class="form-group">
										<select id="roomStatus" name="roomStatus"
											class="form-control text-center" required>
											<option value="AVAILABLE"
												<c:if test="${room.roomStatus eq 'AVAILABLE'}">selected</c:if>>Available</option>
											<option value="BOOKED"
												<c:if test="${room.roomStatus eq 'BOOKED'}">selected</c:if>>Booked</option>
											<option value="MAINTENANCE"
												<c:if test="${room.roomStatus eq 'MAINTENANCE'}">selected</c:if>>Maintenance</option>
										</select>
									</div>


									<!-- Submit -->
									<div class="form-group text-center">
										<button type="submit" class="btn btn-primary">Update
											Room</button>
										<a href="/room/list" class="btn btn-secondary">Cancel</a>
									</div>
								</form>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>

		<!-- Footer -->
		<footer class="footer mt-auto">
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
										placeholder="Your email address" required>
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

			<div class="copyright text-center py-3">
				Copyright &copy;<%=java.time.Year.now().getValue()%>
				All rights reserved | This template is made with <i
					class="fa fa-heart-o" aria-hidden="true"></i> by <a
					href="https://colorlib.com" target="_blank">Colorlib</a>
			</div>
		</footer>
	</div>

	<script>
document.getElementById("updateRoomForm").addEventListener("submit", function(e) {
    e.preventDefault();

    const roomId = document.getElementById("roomId").value;
    const data = {
        roomNumber: document.getElementById("roomNumber").value,
        roomType: document.getElementById("roomType").value,
        roomPrice: parseInt(document.getElementById("roomPrice").value),
        roomCapacity: parseInt(document.getElementById("roomCapacity").value),
        roomStatus: document.getElementById("roomStatus").value
    };

    fetch(`/room/update/${roomId}`, {
        method: "PUT",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    })
    .then(res => {
        if (!res.ok) {
            throw new Error("Error: " + res.statusText);
        }
        return res.json();
    })
    .then(result => {
        alert(result.message);
        window.location.href = "/room/list"; // go back to room list page
    })
    .catch(err => {
        console.error(err);
        alert("Failed to update room!");
    });
});
</script>

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
