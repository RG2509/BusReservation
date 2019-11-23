<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form id="regForm" modelAttribute="user" action="userregister.do" method="post">
<table>

<tr>
<td>Full Name</td>
<td><input  type="text" name="fullname" id="fullname"/></td>
</tr>

<tr>
<td>mobile</td>
<td><input type="text" name="mobile"  id="mobile"/></td>
</tr>

<tr>
<td>Email</td>
<td><input type="text" name="email"  id="email"/></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="Password"  id="password"/></td>
</tr>

<tr>
<td colspan="2">
<input type="submit" value="submit"/>
</td>
</tr>
</table>
</form>

</body>
</html> -->




<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>User|Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="css/main.css" />
   <script>



function valid(){
	var res =true;	
	var fullname=document.getElementById("fullname").value;  
	var password=document.getElementById("password").value; 
	var email=document.getElementById("email").value;
	var mobile=document.getElementById("mobile").value; 

	 
	var id1 = document.getElementById('id1');
	var id2 = document.getElementById('id2');
	var id3 = document.getElementById('id3');
	var id4 = document.getElementById('id4');

	var passwordRGEX = /^[A-Za-z0-9]\w{7,14}$/;
     var emailRGEX = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	var mobileRGEX =  /^[0-9]{10}$/;
	var fnRGEX = /^[A-Za-z]{3,}$/;
	
	id1.innerHTML='';
	id2.innerHTML='';
	id3.innerHTML='';
	id4.innerHTML='';
	
	if(fullname=='' || fullname.length==0)
	 { 
	id1.innerHTML = "Fullname cannot be blank";
	res=false;
	 }
	else
    if(fnRGEX.test(fullname) == false){
		id1.innerHTML="Name must be in alphabets only";
		     res=false;
		  }

	

	if(password==''|| password.length==0)
	{
      id2.innerHTML = "Password cannot be blank";
      res=false;
	}
	 
	else
	if(passwordRGEX.test(password)==false){
		id2.innerHTML = "password format is wrong";
		res=false;
	}
	
	
	if(email==''|| email.length==0)
	{
      id3.innerHTML = "Email cannot be blank";
      res=false;
	} 
	else
	if(emailRGEX.test(email)==false){
		id3.innerHTML = "Email format is wrong";
		res=false;
	}
	

	if( mobile=='' || mobile.length==0)
	{
	id4.innerHTML = "Mobile cannot be blank";
    res=false;
	} 
	else
	if(mobileRGEX.test(mobile)==false){
		id4.innerHTML = "mobile format is wrong";
		res=false;
	}
	
	
	return res;

} 
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
</style>
   
</head>
<body class="background">
        


    <div class="form1">
        <h1 style="align-content: center;">Registration</h1>
        <form id="regForm" modelAttribute="user" action="userregister.do" method="post"  onsubmit="return valid()">
        <table>
        <tr>
        <td>
          <input type="text"  name="fullname" id="fullname" placeholder="Full Name"  class="input1"/></td></tr>
   <tr><td> <div id="id1" style="color: red"></div></td>
          </tr>
         <tr><td>  <input type="text"  name="mobile"  id="mobile" placeholder="Mobile Number"  class="input1"/></td></tr>
          <tr> <td><div id="id4" style="color: red"></div></td>
           </tr>
          <tr><td> <input  type="text" name="email"  id="email" placeholder="Email"  class="input1"/></td></tr>
         <tr> <td><div id="id3" style="color: red"></div></td>
          </tr>
          <tr><td>  <input  type="password" name="Password"  id="password" placeholder="Password"  class="input1"/></td></tr>
          <tr><td><div id="id2" style="color: red"></div></td>
          </tr>
          <tr><td> <button type="submit" id="register"  class="btn btn-primary btn-block btn-large">Register</button></td></tr>
         
          </table>
        </form>
        <hr>
        <b>${status}</b>
    </div>
   
    
          
</body>


</html>









