<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

 <html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Admin|Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="css/main.css" />
     <script >
    function validate()
    {
   
   /*  if(email=="virat@gmail.com"&&password=="virat@123")
    	{
    	alert("login successfull");
    	
    	} */
   
    	var res=true;
    	var email = document.getElementById("email_id").value;
    	var password = document.getElementById("password").value;

    	    if(email=='' || email.length==0)
    		 {
    		  document.getElementById('error-email').innerHTML = "Email cannot be blank";
    		  res=false;
    	     }
    		 
    		 if(password=='' || password.length==0)
    		 {
    			 document.getElementById('error-password').innerHTML = "Password cannot be blank";
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
        <h1>Login</h1>
        <form id="loginForm" modelAttribute="bus"  action="adminlogin.do"	method="post"  onsubmit="return validate()">
        <table>
           <tr><td> <input type="text" id="email_id"  name="email_id" placeholder="Username"  class="input1"/></td></tr>
            <tr><td><div id="error-email" style="color: red"></div></td></tr>
            <tr><td><input type="password" name="password" id="password" placeholder="Password" class="input1"/></td></tr>
             <tr><td><div id="error-password" style="color: red"></div></td></tr>
            <tr><td> <button type="submit" id="login" name="login"  class="btn btn-primary btn-block btn-large">Login</button>
            </td></tr>
            </table>
        </form>
    </div>
</body>
</html>



