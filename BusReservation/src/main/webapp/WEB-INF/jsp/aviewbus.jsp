
<%@page import="org.springframework.web.bind.annotation.RequestMapping"%>
<%@page import="com.model.Bus"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/mycss.css">

<title>Welcome</title>
</head>
<body>

<%-- 
<div class="topnav">
   <%@include file="usermenu.html" %>
</div>
 --%>

<%--  
<div class="column side2">

<h3>Bus Details</h3>
<hr size="4" color="gray"/>


 <c:forEach items="${buslist}" var="bus">
      <div>
            <b>Bus_ID:<c:out value="${bus.bus_id}"/></b><br>
            <c:out value="${bus.bus_no}"/><br>  
           Bus_NO:<c:out value="${user.email}"/><br>  
           Number_of_Seats:<c:out value="${bus.no_of_seats}"/> <br>
            
           
            
            
       </div>
    </c:forEach> 
</div>
</div>
  --%>



<!DOCTYPE html>
<html>
<head>
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
</style>
</head>
<body>


       <!--  <input type="text" list="srccities" name="u" id="n" placeholder="Source" required="required" class="input2" style="max-width: 300px"/>
        <datalist id="srccities">
          <option value="Mumbai">Mumbai</option>
          <option value="Pune">Pune</option>
        </datalist>
        
        
        <input type="text" list="descities" name="p" placeholder="Destination" required="required" class="input2" style="margin:auto; max-width: 300px"/>
        <button type="submit"><i class="fa fa-search" onclick="searchbus.do"></i></button>
        <datalist id="descities">
            <option value="Mumbai"></option>
            <option value="Pune"></option>
          </datalist> -->

          

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