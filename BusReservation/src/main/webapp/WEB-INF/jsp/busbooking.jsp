<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Book bus</h1>
   <form method="post" action="booking1.do">
   Source:
  <input type="text" name="source" id="source" class="input2" />&nbsp;&nbsp;&nbsp;
  Destination
  <input type="text" name="destination" id="destination" class="input2" />&nbsp;&nbsp;&nbsp;
  Journey date:
   <input type="date" name="dt_of_booking" id=" dt_of_booking" class="input3" />&nbsp;&nbsp;&nbsp;
   Number of Passengers:
 <input type="text" name="no_of_passengers" id="no_of_passengers" class="input4" />&nbsp;&nbsp;&nbsp;
  <br>
   <input type="submit" value="Search Bus">
    </form>
  
  <hr>

<table id="bus">
  <tr>
    <th>Bus Id</th>
   
    <th>Bus name</th>
     <th>Bus No.</th>
    <th>Bus type</th>
    <th>No of seats</th>
    <th>Fare</th>
    <th>Departure time</th>
    <th>Arrival time</th>
    <th>Route</th>
    <th>Distance</th>
  </tr>
 

 <c:forEach items="${bus_list}" var="bus">
 
 <form action="booking2.do" method="post">
 <input type="hidden" name="busid" value="${bus.bus_id}"/>
  <input type="hidden" name="fare" value="${bus.fare}"/>
  <div>
      <tr>
           <td> <c:out value="${bus.bus_id}"/></td>
          <td>  <c:out value="${bus.bus_name}"/></td>  
           <td><c:out value="${bus.bus_no}"/> </td>
            <td><c:out value="${bus.bus_type}"/> </td> 
          <td> <c:out value="${bus.no_of_seats}"/></td>
           <td><c:out value="${bus.fare}"/> </td>
            <td><c:out value="${bus.departure_time}"/> </td>
             <td><c:out value="${bus.arrival_time}"/> </td>
            <td><c:out value="${bus.route.route_id}"/> </td>  
             <td><c:out value="${bus.route.distance}"/> </td>  
              <td><input type="submit" value="Book Now...."> </td>
           </tr>
   </div>
  </form>

    </c:forEach> 

  
</body>
</html>