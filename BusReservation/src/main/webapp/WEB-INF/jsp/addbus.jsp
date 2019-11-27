<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>

<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <!--   <title>Register bus</title> -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="css/main.css" />
   <script src="main.js"></script>
<style>
    ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
  }
  
  li {
    float: left;
  }
  
  li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
  }
  
  li a:hover {
    background-color: #111;
  }
  
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

</style>
   

    
</head>
<body  background="img/bus.jpg">
        
  <ul>
               
                <li><a href="adminlogout.do">Logout</a></li>
                <li><a href="addroute.do">Update route</a></li>
                <li><a href="aviewbus.do">View bus</a></li>
              
              </ul>

    <div class="form1">
        <h1>Register bus</h1>
        <form id="addbus" modelAttribute="bus"  action="addbus.do"	method="post">
            <input type="text" name="bus_id" id="bus_id" placeholder="Bus id" required="required" class="input1"/>
            <input type="text" nname="bus_name" id="bus_name" placeholder="Bus Name" required="required" class="input1"/>
            <input type="text" name="bus_no" id="bus_no" placeholder="Bus Number" required="required" class="input1"/>
            <input type="text" name="bus_type" id="bus_type" placeholder="Bus Type" required="required" class="input1"/>
            <input type="text" name="no_of_seats" id="no_of_seats" placeholder="Number of seats" required="required" class="input1"/>
            <input type="text" name="fare" id="fare" placeholder="Fare" required="required" class="input1"/>
            <input type="text" name="departure_time" id="departure_time" placeholder="Departure Time" required="required" class="input1"/>
            <input type="text" name="arrival_time" id="arrival_time" placeholder="Arrival Time" required="required" class="input1"/>
            <input type="text" name="route_id" id="route_id" placeholder="Route id" required="required" class="input1"/>
            <button type="submit" class="btn btn-primary btn-block btn-large">Add Bus</button>
        </form>
        
    </div>
        
</body>


</html>


