<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.uniq.HotelManagement.Entity.Room" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>The River</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="The River template project">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap & CSS -->
<link rel="stylesheet" type="text/css" href="styles/bootstrap-4.1.2/bootstrap.min.css">
<link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.3.4/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.3.4/owl.theme.default.css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.3.4/animate.css">
<link href="plugins/jquery-datepicker/jquery-ui.css" rel="stylesheet" type="text/css">
<link href="plugins/colorbox/colorbox.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="styles/main_styles.css">
<link rel="stylesheet" type="text/css" href="styles/responsive.css">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>

<div class="super_container">
    <!-- Header -->
    <header class="header">
        <div class="header_content d-flex flex-row align-items-center justify-content-start">
            <div class="logo">
                <a href="#">The River</a>
            </div>
            <div class="ml-auto d-flex flex-row align-items-center justify-content-start">
                <nav class="main_nav">
                    <ul class="d-flex flex-row align-items-start justify-content-start">
                        <li><a href="/room add">Rooms Add</a></li>
                    </ul>
                </nav>

                <div class="header_phone d-flex flex-row align-items-center justify-content-center">
                    <img src="images/phone.png" alt=""> 
                    <span><%="0183-12345678"%></span>
                </div>

                <!-- Hamburger Menu -->
                <div class="hamburger">
                    <i class="fa fa-bars" aria-hidden="true"></i>
                </div>
            </div>
        </div>
    </header>

    <!-- Home Background -->
    <div class="home">
        <div class="background_image" style="background-image: url(images/index.jpg)"></div>

        <div class="container mt-4">
    <h2 class="mb-4 text-center">Room Details</h2>
    
    <table class="table table-bordered table-striped text-center">
        <thead class="table-dark">
             <tr>
                <th>Room ID</th>
                <th>Room Number</th>
                <th>Type</th>
                <th>Price</th>
                <th>Capacity</th>
                <th>Status</th>
                <th>Created At</th>
                <th>Admin ID</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody id="roomData">
            <!-- Data will be dynamically inserted here -->
        </tbody>
    </table>
</div>

<script>
    $(document).ready(function () {
        // Fetch all rooms from controller
        $.ajax({
            url: "/room/rooms",  
            type: "GET",
            dataType: "json",
            success: function (rooms) {
                let rows = "";
                if(!rooms || rooms.length === 0){
                    rows = "<tr><td colspan='9'>No Rooms Found</td></tr>";
                } else {
                    $.each(rooms, function (index, room) {
                        rows += "<tr>" +
                            "<td>" + room.roomId + "</td>" +
                            "<td>" + room.roomNumber + "</td>" +
                            "<td>" + room.roomType + "</td>" +
                            "<td>" + room.roomPrice + "</td>" +
                            "<td>" + room.roomCapacity + "</td>" +
                            "<td>" + room.roomStatus + "</td>" +
                            "<td>" + (room.createdAt ? room.createdAt : '') + "</td>" +
                            "<td>" + (room.adminId ? room.adminId : '') + "</td>" +
                            "<td>" +
                                "<a href='/update room?id=" + room.roomId + "' class='btn btn-sm btn-primary'>Update</a> " +
                                "<a href='deleteRoom?id=" + room.roomId + "' class='btn btn-sm btn-danger' " +
                                "onclick=\"return confirm('Are you sure you want to delete this room?');\">Delete</a>" +
                            "</td>" +
                            "</tr>";
                    });
                }
                $("#roomData").html(rows);
            },
            error: function (xhr, status, error) {
                console.error("Error fetching room data:", error);
                $("#roomData").html("<tr><td colspan='9' class='text-danger'>Failed to load rooms</td></tr>");
            }
        });
    });
</script>
                    <!-- End Room Table -->

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
                        <div class="certificates d-flex flex-row align-items-start justify-content-lg-between justify-content-start flex-lg-nowrap flex-wrap">
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
            Copyright &copy;<%= java.time.Year.now().getValue() %>
            All rights reserved | This template is made with 
            <i class="fa fa-heart-o" aria-hidden="true"></i> 
            by <a href="https://colorlib.com" target="_blank">Colorlib</a>
        </div>
    </footer>

<!-- JS Dependencies -->
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
