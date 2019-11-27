<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet">


 <link rel="stylesheet" type="text/css" media="screen" href="css/main.css" />
   <style>
   
  

.topnav {
  overflow: hidden;
  background-color: #333;
}
.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}
.topnav a:hover {
  background-color: #f5df61;
  color: black;
}

   body {

   
background-image: url("img/bus.jpg");   
text-align:center;color:yellow;
font-family: Arial, Helvetica, sans-serif;    
 box-sizing: border-box;

  font-family: Arial, Helvetica, sans-serif;
    }
    
   /* .background1{
   background-image: url("img/images.jpg");
   opacity:0.5;
    } */
    header {
     
 
  padding: 10px;
  text-align: center;
  font-size: 30px;
  color: white;
}
nav {
  -webkit-flex: 1;
  -ms-flex: 1;
  flex: 1;
  background: #ccc;
  padding: 20px;
}
nav ul {
  list-style-type: none;
  padding: 0;
}
footer {
  background-color: #777;
  padding: 2px;
  text-align: center;
  color: white;
  margin-top: 50px;
}
@media (max-width: 400px) {
  section {
    -webkit-flex-direction: column;
    flex-direction: column;
  }
}
.input2 { 
    width: 30%; 
    margin-bottom: 10px; 
    background: rgb(2, 0, 0);
    border: none;
    outline: none;
    padding: 10px;
    font-size: 13px;
    color:#f5f5f5;
    text-shadow: 1px 1px 1px rgba(248, 246, 246, 0.3);
    border: 1px solid rgba(0,0,0,0.3);
    border-radius: 4px;
    box-shadow: inset 0 -5px 45px rgba(100,100,100,0.2), 0 1px 1px rgba(255,255,255,0.2);
    margin-top: 100px;
    margin-left: 100px;
  
}
.input2[type=date] { 
    width: 30%; 
    margin-bottom: 10px; 
    background: rgb(2, 0, 0);
    border: none;
    outline: none;
    padding: 10px;
    font-size: 13px;
    color: #f5f5f5;
    text-shadow: 1px 1px 1px rgba(248, 246, 246, 0.3);
    border: 1px solid rgba(0,0,0,0.3);
    border-radius: 4px;
    box-shadow: inset 0 -5px 45px rgba(100,100,100,0.2), 0 1px 1px rgba(255,255,255,0.2);
    margin-top: 30px;
    margin-left: 267px;
  
}


.input3 { 
    width: 30%; 
    margin-bottom: 10px; 
    background: rgb(2, 0, 0);
    border: none;
    outline: none;
    padding: 10px;
    font-size: 13px;
    color: #f5f5f5;
    text-shadow: 1px 1px 1px rgba(248, 246, 246, 0.3);
    border: 1px solid rgba(0,0,0,0.3);
    border-radius: 4px;
    box-shadow: inset 0 -5px 45px rgba(100,100,100,0.2), 0 1px 1px rgba(255,255,255,0.2);
    margin-top: 30px;
    margin-left: -63px;
  
}

::placeholder {
  color: white;
  opacity: 1; /* Firefox */
}

h2{
 font-family: "Comic Sans MS", cursive, sans-serif;
 color: black;
}

.b1{
background-color: black;
color: white;
padding: 10px 15px 10px 15px;
margin-right: 300px;
margin-left: -258px;
}



/* .container {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
} */

</style>


<title>Home|Buswala</title>
</head>
<body>
<img alt="logo" src="img/logo1.jpg"  width="150" height="100" style="float: left">
<header>

	
  <h2><i>Buswala.com</i></h2>
</header>
<div class="topnav">
 
    
                <a  href="adminlogin.do">ADMIN LOGIN</a>
                <a href="userlogin.do">USER LOGIN</a>
                <a href="userregister.do">USER SIGNUP</a>
              
                 <a href="cancel_booking.do">CANCEL</a>
                
                
                 <a href="aboutus.do">ABOUT US</a>
                 <a href="contact-us.do">CONTACT US</a>
               <!--  <li><a href="#about">About</a></li> -->
              
</div>
  
 
 <form method="POST" action="booking1.do">      
<input type="text" list="srccities" name="source" id="source" placeholder="Source" required="required" class="input2"/>
<datalist id="srccities">
  <option value="Mumbai"></option>
  <option value="Pune"></option>
  <option value="Banglore"></option>
</datalist>

<input type="text" list="descities" name="destination" id="destination" placeholder="Destination" required="required" class="input2"/>
<datalist id="descities">
    <option value="Mumbai"></option>
    <option value="Pune"></option>
    <option value="Banglore"></option>
  </datalist>
<input type="date"  name="dt_of_booking" id=" dt_of_booking" class="input2" placeholder="Date" style="float: left"><br>
<input type="text" name="no_of_passengers" id="no_of_passengers" class="input3" placeholder="No. of passengers" /><br>
 
 <button type="submit" class="b1">Search Bus</button> 
</form>
 



<footer>
  <p> &copy Copyrights.All rights reserved.</p><br>
  <a href="index.jsp">Buswala | LTI</a>
</footer>
              
              



</body>
</html>
