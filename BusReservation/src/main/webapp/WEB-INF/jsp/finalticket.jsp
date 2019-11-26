<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
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
 
  <c:forEach items="${buslist}" var="bus">
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
          
            </div>
    </c:forEach> 
 
 
 
  
</table>
 
</body>
</html>