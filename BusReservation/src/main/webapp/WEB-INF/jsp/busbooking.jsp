<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buswala | booking</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
#bus {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}
#bus td, #bus th {
  border: 1px solid #ddd;
  padding: 8px;
}
.btn{
  float: right;
  width: 20%;
  padding: 10px;
  background: #f5df61;
  color: black;
  font-size: 17px;
  border: 1px solid black;
 margin-bottom: 10px;
  cursor: pointer;
}
#bus th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #f5df61;
  color: black;
}
.input2 { 
    width: 40%; 
    margin-bottom: 10px; 
    background: #f5df61;
    border: none;
    outline: none;
    padding: 10px;
    font-size: 13px;
    color: black;
    text-shadow: 1px 1px 1px black;
    border: 1px solid rgba(0,0,0,0.3);
    border-radius: 4px;
    box-shadow: inset 0 -5px 45px rgba(100,100,100,0.2), 0 1px 1px rgba(255,255,255,0.2);
    margin-top: 30px;
    margin-left: 275px;
    margin-bottom: 30px;
  
}

.button2{
background-color: black;
color: white;
padding: 10px 10px 10px 10px;

}
.button2:hover {
  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
}
</style>
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
    <th>Book Bus</th>
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
              <td><input type="submit" class="button2" value="Book Now...."> </td>
           </tr>
   </div>
  </form>

    </c:forEach> 

  
</body>
</html>