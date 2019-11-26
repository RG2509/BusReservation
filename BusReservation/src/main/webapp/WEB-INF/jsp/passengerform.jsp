<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" type="text/css" media="screen" href="css/main.css" />

<script>

function validate()
{
	alert("hello");
	

var p_name= document.getElementById("p_name").value;
var mobile_no = document.getElementById("p_mobile").value;
var gender= document.getElementById("gender").value;
var mobileRGEX =  /^{10}$/;
var mobResult = mobileRGEX.test(mobile_no);


document.getElementById('error-p_name').innerHTML = '';
document.getElementById('error-mobile_no').innerHTML = '';
document.getElementById('error-gender').innerHTML = '';


    if(p_name=='')
	 {
	  document.getElementById('error-p_name').innerHTML = "Name cannot be blank";
	 return false;
     }
	 
    else if(mobile_no=='')
	 {
		 document.getElementById('error-mobile_no').innerHTML = "Mobile number cannot be blank";
		 return false;
	 }
   else if(!mobResult)
	{
	 document.getElementById('error-mobile_no').innerHTML = "mobile format is wrong";
	 return false;
	} 
    else if(gender=='')
	 {
		 document.getElementById('error-gender').innerHTML = "Gender cannot be blank";
		 return false;
	 }
   
    else{
    	return true;
    	}
}


 </script>
 <style>

.input1 { 
    width: 100%; 
    margin-bottom: 10px; 
    background: rgba(253, 253, 253, 0.3);
    border: none;
    outline: none;
        padding: 10px 175px 10px 10px;
    font-size: 13px;
    color: rgb(255, 255, 255);
    text-shadow: 1px 1px 1px rgba(248, 246, 246, 0.3);
    border: 1px solid rgba(0,0,0,0.3);
    border-radius: 4px;
    box-shadow: inset 0 -5px 45px rgba(100,100,100,0.2), 0 1px 1px rgba(255,255,255,0.2);
    
  
}

.input1[type=radio]:checked ~ .check {
  border: 5px solid #0DFF92;
}


   
body {
    text-align: center;
    background-image: url("img/bus.jpg");
}
form {
    display: inline-block;
}

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






</style>


<title>Buswala | Passenger Form</title>
</head>
<body>

 
    <!-- <a href="userlogout.do">Logout</a>
    <a href="index.jsp">Home</a>
    <a href="userlogout.do">About-us</a> -->
    
    <div class="topnav">
 
    
                <a  href="index.jsp">HOME</a>
               
                
                 <a href="aboutus.do">ABOUT US</a>
                 <a href="contact-us.do">CONTACT US</a>
                  <a href="userlogout.do">LOGOUT</a>
                     <a href="cancel_booking.do">CANCEL BOOKING</a>
               <!--  <li><a href="#about">About</a></li> -->
              
</div>

	 <div class="form1">
	 <h1 style="align-content: center;">Passenger Form</h1>
     <form id="regForm"  action="booking3.do" modelAttribute="p"  method="post"  >
        
        <table>
        <tr>
        <td>
          <input type="text"  name="p_name" id="p_name"   placeholder="Full Name"  class="input1"/></td></tr>
   <tr><td> <div id="error-p_name" style="color: red"></div></td>
          </tr>
         <tr><td>  <input type="text"  name="mobile_no"  id="p_mobile" placeholder="Mobile Number"  class="input1"/></td></tr>
          <tr> <td><div id="error-mobile_no" style="color: red"></div></td>
           </tr>
          <tr><td> <input  type="radio" name="gender"  id="gender" placeholder="Gender" value="male" checked/>Male
       <input  type="radio" name="gender"  id="gender" placeholder="Gender" value="female"/>Female</td>
          </tr>
         <tr> <td><div id="error-gender" style="color: red"></div></td>

          <tr><td> <button type="submit" id="register"  class="btn btn-primary btn-block btn-large" onclick="return validate()">Register</button></td></tr>
         
         
          </table>
        </form>
	</div>

</body>
</html>