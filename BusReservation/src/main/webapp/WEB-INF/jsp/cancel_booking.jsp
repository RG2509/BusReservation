
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/mycss.css">
<link rel="img" href="img">

<title>Registration</title>


  <script>


     function valid()
     {
         var fname=document.getElementById('fullname').value;
         
         var email=document.getElementById('email').value;
         var password=document.getElementById('password').value;
         
         var contact=document.getElementById('mobile').value;
        
         var flag = true;
         var fnameregex=/^[A-Za-z]{3,}$/;
       
         var contactregex=/^[0-9]{10,10}$/;
         var passwordregex=/^[a-zA-Z0-9$@]{8,}$/; 
         var emailregex=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})$/;
   		 id1.innerHTML='';
         id2.innerHTML='';
         id3.innerHTML='';
         id4.innerHTML='';
        
       
         if(fname=='')
         {
            id1.innerHTML='plz fill your First name';
         flag=false;

         }
         
         else
           if(fnameregex.test(fname)==false)
        {
          id1.innerHTML="name must be in alphabets";
          //location.replace()
          flag=false;

        } 
         
        


        //password

        if(password=='')
         {
            id4.innerHTML='plz fill password';
            flag= false;
         }
       
   	 
       else
         if(passwordregex.test(password)==false)
        {
          id4.innerHTML="IMPROPER PASSWORD";
          //location.replace()
          flag=false;

        } 
        //date of birth

       
        //phone
        if(contact=='')
         {
            id6.innerHTML='plz fill correct mobile number';
           flag= false;
         }
        
   	 
       else
         if(contactregex.test(contact)==false)
        {
          id6.innerHTML="IMPROPER mobile number";
          //location.replace()
          flag=false;

        } 
        if(email=='')
        {
           id3.innerHTML='plz fill correct email';
          
           flag=false;

        }
        else
            if(emailregex.test(email)==false)
           {
             id3.innerHTML="Incorrect format";
             //location.replace()
             flag=false;

           } 
        if (!flag) { 
            event.preventDefault();
        } else {
        }
        return flag;
        

     }
    </script>

</head>
<body background="img/air1.png">
<div class="header">
  <h1>Buswala.COM</h1>
</div>

<div class="topnav">
 
</div>
 
<div class="row">

<div class="column side2">
    
	<form id="cancelForm" modelAttribute="book" action="cancel_booking.do" method="post" onsubmit="valid()" >
		<table align="center">
			<tr>
			<td>
				<label>Booking ID:</label>
			<input type="text" name="booking_id"
						id="booking_id" />
				</td>
			</tr>
			<tr>
			<td>
				<label>email:</label>
			<input type="text" name="email"
						id="email" />
				</td>
			</tr>
	
				<tr>
				<td><input type="submit"  value="submit"></td>
			</tr>
			
			<tr>
				<td colspan="2">
				 <b>${status}</b>
				<a href="index.jsp">Home</a></td>
			</tr>
		</table>
	</form>
</div>
</div>
<div class="footer">
  <p>BUS Reservation</p>
</div>

</body>
</html>