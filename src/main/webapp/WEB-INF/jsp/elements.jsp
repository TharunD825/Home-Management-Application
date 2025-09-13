<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Elements</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="The River template project">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/bootstrap-4.1.2/bootstrap.min.css">

    <!-- Font Awesome -->
    <link href="${pageContext.request.contextPath}/plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- Owl Carousel -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plugins/OwlCarousel2-2.3.4/owl.carousel.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plugins/OwlCarousel2-2.3.4/owl.theme.default.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/plugins/OwlCarousel2-2.3.4/animate.css">

    <!-- jQuery Datepicker -->
    <link href="${pageContext.request.contextPath}/plugins/jquery-datepicker/jquery-ui.css" rel="stylesheet" type="text/css">

    <!-- Custom Styles -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/elements.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/elements_responsive.css">
</head>
<body>

<div class="super_container">

    <!-- ======================== HEADER ========================= -->
    <header class="header">
        <div class="header_content d-flex flex-row align-items-center justify-content-start">
            <div class="logo">
                <a href="${pageContext.request.contextPath}/index.jsp">The River</a>
            </div>

            <div class="ml-auto d-flex flex-row align-items-center justify-content-start">

                <!-- Navigation -->
                <nav class="main_nav">
                    <ul class="d-flex flex-row align-items-start justify-content-start">
                        <li><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
                        <li><a href="${pageContext.request.contextPath}/about.jsp">About us</a></li>
                        <li><a href="/booking">Rooms</a></li>
                        <li><a href="${pageContext.request.contextPath}/blog.jsp">Blog</a></li>
                        <li><a href="${pageContext.request.contextPath}/contact.jsp">Contact</a></li>
                    </ul>
                </nav>

                <!-- Book Button -->
                <div class="book_button">
                </div>

                <!-- Header Phone -->
                <div class="header_phone d-flex flex-row align-items-center justify-content-center">
                    <img src="${pageContext.request.contextPath}/images/phone.png" alt="Phone">
                    <span>0183-12345678</span>
                </div>

                <!-- Hamburger Menu Icon -->
                <div class="hamburger">
                    <i class="fa fa-bars" aria-hidden="true"></i>
                </div>
            </div>
        </div>
    </header>
    <!-- ======================== END HEADER ========================= -->


    <!-- ======================== MOBILE MENU ========================= -->
    <div class="menu trans_400 d-flex flex-column align-items-end justify-content-start">
        <div class="menu_close"><i class="fa fa-times" aria-hidden="true"></i></div>
        <div class="menu_content">
            <nav class="menu_nav text-right">
                <ul>
                    <li><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
                    <li><a href="${pageContext.request.contextPath}/about.jsp">About us</a></li>
                    <li><a href="#">Rooms</a></li>
                    <li><a href="${pageContext.request.contextPath}/blog.jsp">Blog</a></li>
                    <li><a href="${pageContext.request.contextPath}/contact.jsp">Contact</a></li>
                </ul>
            </nav>
        </div>
        <div class="menu_extra">
            <div class="menu_book text-right"><a href="${pageContext.request.contextPath}/booking.jsp">Book online</a></div>
            <div class="menu_phone d-flex flex-row align-items-center justify-content-center">
                <img src="${pageContext.request.contextPath}/images/phone-2.png" alt="">
                <span>0183-12345678</span>
            </div>
        </div>
    </div>
    <!-- ======================== END MOBILE MENU ========================= -->


    <!-- ======================== HOME SECTION ========================= -->
    <div class="home">
        <div class="background_image" style="background-image:url(${pageContext.request.contextPath}/images/contact.jpg)"></div>
        <div class="home_container">
            <div class="container">
                <div class="row">
                    <div class="col">
                        <div class="home_content text-center">
                            <div class="home_title">Elements</div>
                            <div class="booking_form_container">

                                <!-- Booking Form -->
                                <form action="#" class="booking_form" id="booking_form">
                                    <div class="d-flex flex-xl-row flex-column align-items-start justify-content-start">
                                        <div class="booking_input_container d-flex flex-row align-items-start justify-content-start flex-wrap">
                                            <div><input type="text" class="datepicker booking_input booking_input_a booking_in" placeholder="Check in" required="required"></div>
                                            <div><input type="text" class="datepicker booking_input booking_input_a booking_out" placeholder="Check out" required="required"></div>
                                            <div><input type="number" class="booking_input booking_input_b" placeholder="Children" required="required"></div>
                                            <div><input type="number" class="booking_input booking_input_b" placeholder="Room" required="required"></div>
                                        </div>
                                        <div><button class="booking_button trans_200">Book Now</button></div>
                                    </div>
                                </form>
                                <!-- End Booking Form -->

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- ======================== ELEMENTS SECTION ========================= -->
    <div class="elements">
        <div class="container">
            <div class="row">
                <div class="col">

                    <!-- Buttons -->
                    <div class="buttons">
                        <div class="elements_title"><h2>Buttons</h2></div>
                        <div class="buttons_container d-flex flex-row align-items-start justify-content-start flex-wrap">
                            <div class="button button_1"><a href="#">Subscribe</a></div>
                            <div class="button button_2"><a href="#">Subscribe</a></div>
                            <div class="button button_3"><a href="#">Subscribe</a></div>
                            <div class="button button_4"><a href="#">Subscribe</a></div>
                        </div>
                    </div>

                    <!-- Accordions & Tabs -->
                    <div class="acc_tabs">
                        <div class="elements_title"><h2>Accordions & Tabs</h2></div>
                        <div class="row acc_tabs_row">

                            <!-- Accordions -->
                            <div class="col-lg-6">
                                <div class="accordions">

                                    <!-- Accordion Item -->
                                    <div class="accordion_container">
                                        <div class="accordion d-flex flex-row align-items-center">
                                            <div>Vivamus auctor mi eget odio feugiat, quis aliquet velit ornare</div>
                                        </div>
                                        <div class="accordion_panel">
                                            <div>
                                                <p>Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae...</p>
                                            </div>
                                        </div>
                                    </div>

                                    <!-- Accordion Item -->
                                    <div class="accordion_container">
                                        <div class="accordion d-flex flex-row align-items-center">
                                            <div>Auctor mi eget odio feugiat, quis aliquet velit ornare</div>
                                        </div>
                                        <div class="accordion_panel">
                                            <div>
                                                <p>Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae...</p>
                                            </div>
                                        </div>
                                    </div>

                                    <!-- Accordion Item (Active) -->
                                    <div class="accordion_container">
                                        <div class="accordion d-flex flex-row align-items-center active">
                                            <div>Vivamus auctor mi eget odio feugiat, quis aliquet velit ornare</div>
                                        </div>
                                        <div class="accordion_panel">
                                            <div>
                                                <p>Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae...</p>
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>

                            <!-- Tabs -->
                            <div class="col-lg-6 tabs_col">
                                <div class="tabs">
                                    <div class="tabs_container">
                                        <div class="tabs d-flex flex-row align-items-center justify-content-start flex-wrap">
                                            <div class="tab">Vivamus auctor</div>
                                            <div class="tab">Auctor mi eget</div>
                                            <div class="tab active">Vivamus auctor</div>
                                        </div>
                                        <div class="tab_panels">
                                            <div class="tab_panel"><p>Vestibulum ante ipsum primis in faucibus orci luctus...</p></div>
                                            <div class="tab_panel"><p>Vestibulum ante ipsum primis in faucibus orci luctus...</p></div>
                                            <div class="tab_panel active"><p>Vestibulum ante ipsum primis in faucibus orci luctus...</p></div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>

                    <!-- (Continue with Loaders, Milestones, Icon Boxes, and Footer as in your HTML but with JSP paths) -->

                </div>
            </div>
        </div>
    </div>

    <!-- ======================== FOOTER ========================= -->
    <footer class="footer">
        <div class="footer_content">
            <div class="container">
                <div class="row footer_row">

                    <!-- Address -->
                    <div class="col-lg-3">
                        <div class="footer_title">Our Address</div>
                        <ul class="footer_list">
                            <li>Beach Str. 345</li>
                            <li>67559 Miami</li>
                            <li>USA</li>
                        </ul>
                    </div>

                    <!-- Reservations -->
                    <div class="col-lg-3">
                        <div class="footer_title">Reservations</div>
                        <ul class="footer_list">
                            <li>Tel: 345 5667 889</li>
                            <li>Fax: 6783 4567 889</li>
                            <li>reservations@hotelriver.com</li>
                        </ul>
                    </div>

                    <!-- Newsletter -->
                    <div class="col-lg-3">
                        <div class="footer_title">Newsletter</div>
                        <form action="#" class="newsletter_form" id="newsletter_form">
                            <input type="email" class="newsletter_input" placeholder="Your email address" required="required">
                            <button class="newsletter_button">Subscribe</button>
                        </form>
                    </div>

                    <!-- Certificates -->
                    <div class="col-lg-3">
                        <div class="certificates d-flex flex-row align-items-start justify-content-lg-between">
                            <div class="cert"><img src="${pageContext.request.contextPath}/images/cert_1.png" alt=""></div>
                            <div class="cert"><img src="${pageContext.request.contextPath}/images/cert_2.png" alt=""></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Copyright -->
        <div class="copyright">
            Copyright &copy;
            <script>document.write(new Date().getFullYear());</script>
            All rights reserved | Made with <i class="fa fa-heart-o"></i> by 
            <a href="https://colorlib.com" target="_blank">Colorlib</a>
        </div>
    </footer>
</div>

<!-- ======================== SCRIPTS ========================= -->
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
<script src="${pageContext.request.contextPath}/js/elements.js"></script>

</body>
</html>
