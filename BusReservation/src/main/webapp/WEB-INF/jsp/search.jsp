<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
.input1 { 
    width: 100%; 
    margin-bottom: 10px; 
    background: rgba(253, 253, 253, 0.3);
    border: none;
    outline: none;
    padding: 10px;
    font-size: 13px;
    color: rgb(255, 255, 255);
    text-shadow: 1px 1px 1px rgba(248, 246, 246, 0.3);
    border: 1px solid rgba(0,0,0,0.3);
    border-radius: 4px;
    box-shadow: inset 0 -5px 45px rgba(100,100,100,0.2), 0 1px 1px rgba(255,255,255,0.2);
  
}

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

</style>

</head>
<body>




<!--         <input type="text" list="srccities" name="u" id="n" placeholder="Source" required="required" class="input2" style="max-width: 300px"/>
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
          
<form method="post" action="searchbus.do">
Source:
<input type="text" name="source" id="source" class="input2" />&nbsp;&nbsp;&nbsp;
Destination
<input type="text" name="destination" id="destination" class="input2" />
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

</body>
</html>