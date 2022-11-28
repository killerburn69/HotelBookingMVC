<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/public/css/userCheckBooking.css">
    <script src="https://kit.fontawesome.com/476aa9aedb.js" crossorigin="anonymous"></script>
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/public/img/logo-alt.980da429.svg" type="image/x-icon">
    <title>Booking History</title>
</head>
<body>
    <div class="wrapper">
        <header class="header">
			  <div class="container-fluid">
                <div class="header-main">
                    <%@include file = './common/navbarWithSearch.jsp' %>
                </div>
            </div>
        </header>
        <section class="checkBook">
            <div class="container-fluid">
                <h1 class="checkBook-heading">Booking Hotel of  <span>${bookingInfo.name}</span></h1>
                <div class="payRoom-detail">
                    <h1 class="payRoom-heading">Booking information</h1>
                    <div class="payRoom-detail-payment">
                        <div class="payRoom-detail-img">
                            <img src="${booking.hotel.imageUrl}" alt="">
                            <div class="payRoom-detail-desc">
                                <h3>${booking.hotel.hotelName }</h3>
                            </div>
                        </div>
                        <div class="payRoom-date">
                            <div class="payRoom-user">
                                <span>Name of hotel booking customer</span>
                                <span>${bookingInfo.name }</span>
                            </div>
                            <div class="payRoom-code">
                                <span>Check-in code</span>
                                <span>${bookingInfo.booking.bookingId}</span>
                            </div>
                            <div class="payRoom-checkin">
                                <span class="date">Checkin Date</span>
                                <span>${booking.checkinDate}</span>
                            </div>
                            <div class="payRoom-checkout">
                                <span class="date">Checkout Date</span>
                                <span>${booking.checkoutDate }</span>
                            </div>
                            <div class="quantity-room">
                                <span>Number of guests and rooms</span>
                                <span>${booking.guest}  Guests, ${booking.rooms} Rooms</span>
                            </div>
                            <div class="price-per-night">
                                <span>${booking.rooms} Rooms x ${booking.total / booking.rooms / booking.hotel.price} Nights</span>
                                <span>${booking.total }</span>
                            </div>
                        </div>
                        <div class="payRoom-total">
                            <span class="total-heading">Total</span>
                            <span class="price">${booking.total }</span>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </div>
    <script src="${pageContext.request.contextPath}/public/js/userCheckBooking.js"></script>
</body>
</html>