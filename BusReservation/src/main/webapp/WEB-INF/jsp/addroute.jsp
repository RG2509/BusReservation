<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- </head>
<body>
 <form id="addRoute" modelAttribute="route" action="addroute.do" method="post">
       
              <center>
              <table>
              <tr>
              <td>Route_id:<br>
              <input type="text" name="route_id" id="route_id" />
              </td>
              </tr>
              
              <tr>
              <td>Source<br>
              <input type="text" name="source" id="source" />
              </td>
              </tr>
              
              <tr>
              <td>Destination<br>
              <input type="text" name="destination" id="destination" />
              </td>
              </tr>
              
               <tr>
              <td>Distance<br>
              <input type="text" name="distance" id="distance" />
              </td>
              </tr>
              
              <tr>
				<td></td>
				<td ><input type="submit" id="Add" name="Add" value="AddRoute"></td>
			</tr>
			</table>
</body>
</html> -->





<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Update route</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="css/main.css" />
    <script src="main.js">
    

    </script>

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
</style>
    
</head>
<body  background="img/bus.jpg">

  <ul>
               
                <li><a href="adminlogout.do">Logout</a></li>
                <li><a href="addbus.do">Add bus</a></li>
                <li><a href="aviewbus.do">View bus</a></li>
              
              </ul>
        


    <div class="form1">
        <h1>Add route</h1>
        <form id="addRoute" modelAttribute="route" action="addroute.do" method="post">
            <input type="text" name="route_id" id="route_id" placeholder="Route id" required="required" class="input1"/>
            <input type="text" name="source" id="source" placeholder="Source" required="required" class="input1"/>
            <input type="text" name="destination" id="destination" placeholder="Destination" required="required" class="input1"/>
            <input type="text" name="distance" id="distance" placeholder="Distance" required="required" class="input1"/>
            
            <button type="submit" class="btn btn-primary btn-block btn-large">Add Route</button>
        </form>
        
    </div>
   
    
          
</body>
