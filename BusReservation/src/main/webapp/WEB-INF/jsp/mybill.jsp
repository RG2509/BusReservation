<%@ page language="java" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
God is good....
<hr> Booking Inforamtion
<br>
Booking Id :  ${booking.booking_id} 
From: ${booking.pick_loc} To: ${booking.drop_loc}   Date of Journey:${booking.dt_of_booking}
<br>
Total Fare: (Rs) ${booking.total_fare}  Total No. of Passenger : ${booking.no_of_passengers}

<hr> Passenger Information
<br>
<c:forEach items="${booking.passengers}" var="passenger">
Passenger Name : ${passenger.p_name} <br>
Contact Number : ${passenger.mobile_no} <br>
</c:forEach>

<hr> Billing Information
<br>
Transaction Id : ${booking.payment.payment_id} <br>




</body>
</html>