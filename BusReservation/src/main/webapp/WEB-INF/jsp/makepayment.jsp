<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" type="text/css" media="screen" href="css/main.css" />
<title>Buswala|Payment</title>
</head>



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
<body>

<div class="topnav">
 
                <a  href="index.jsp">HOME</a>
              
                 <a href="aboutus.do">ABOUT US</a>
                 <a href="contact-us.do">CONTACT US</a>
                  <a href="userlogout.do">LOGOUT</a>
                     <a href="cancel_booking.do">CANCEL BOOKING</a>
               <!--  <li><a href="#about">About</a></li> -->
              
</div>

<form id="regForm" modelAttribute="user" action="booking4.do" method="post" >
		<table align="center">
		
		<tr>
				<td>Card</td>
				<td><input type="radio" name="card_type" id="debit" value="debit" checked/>Debit Card
			   <input type="radio" name="card_type" id="credit" value="credit" />Credit Card
			   </td>
			</tr> 
			<tr>
				<td>Card Number</td>
				<td><input type="text" name="card_number"
						id="card_number" class="input1" />
						<div id="id1"></div>
						</td>
			</tr>
			<tr>
				<td>Name of Card Holder</td>
				<td><input type="text" name="name" id="name" class="input1"/><div id="id3"></div></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="cvv"
						id="cvv" class="input1"/>
						<div id="id2"></div>
						</td>
			</tr>
			
			<tr>
				<td>Expiry Date</td>
				<td><input type="date" name="exp"
						id="exp"/><div id="id4" class="input1"></div></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" class="btn btn-primary btn-block btn-large" value="Make Payment"></td>
			</tr>
			<tr></tr>
			
		</table>
	</form>


</body>
</html>