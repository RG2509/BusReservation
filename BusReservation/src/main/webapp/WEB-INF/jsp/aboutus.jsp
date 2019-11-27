<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
* {
  box-sizing: border-box;
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


body {
  font-family: Arial, Helvetica, sans-serif;
  background-image: url("img/bus.jpg");
}

/* Style the header */
header {
  
  padding: 30px;
  text-align: center;
  font-size: 35px;
  color: black;
}

h2{
 font-family: "Comic Sans MS", cursive, sans-serif;
 color: black;
}

/* Container for flexboxes */
section {
  display: -webkit-flex;
  display: flex;
}

/* Style the navigation menu */
nav {
  -webkit-flex: 1;
  -ms-flex: 1;
  flex: 1;
  background: #ccc;
  padding: 20px;
}

/* Style the list inside the menu */
nav ul {
  list-style-type: none;
  padding: 0;
}

/* Style the content */
article {
  -webkit-flex: 3;
  -ms-flex: 3;
  flex: 3;
  background-color: #f1f1f1;
  padding: 10px;
}

/* Style the footer */
footer {
  background-color: #777;
  padding: 2px;
  text-align: center;
  color: white;
  margin-top: 200px;
}

/* Responsive layout - makes the menu and the content (inside the section) sit on top of each other instead of next to each other */
@media (max-width: 600px) {
  section {
    -webkit-flex-direction: column;
    flex-direction: column;
  }
}


</style>


</head>
<body>
<div class="topnav">
 
    
               <a href="index.jsp">HOME</a>
                <a href="userlogin.do">USER LOGIN</a>
                <a href="userregister.do">USER SIGNUP</a>
               
                 <a href="logout.do">LOGOUT</a>
                 <a href="aboutus.do">ABOUT US</a>
                 <a href="contact-us.do">CONTACT US</a>
               <!--  <li><a href="#about">About</a></li> -->
              
</div>

<header>
  <h2><i>About Us</i></h2>
</header>

<section>
 
  
  <article>
    
    <p>BUSWALA is India's largest online bus ticketing platform that has transformed bus travel in the country by 
    bringing ease and convenience to many Indians who travel using buses. Founded in 2006,
     Buswala is part of India's leading company LTI. 
     By providing widest choice, superior customer service, lowest prices and unmatched benefits,
     Buswala has served many customers. 
    </p>
    <p></p>
  </article>
</section>

<footer>
  <p> &copy Copyrights.All rights reserved.</p><br>
  <a href="index.jsp">Buswala | LTI</a>
</footer>


</body>
</html>