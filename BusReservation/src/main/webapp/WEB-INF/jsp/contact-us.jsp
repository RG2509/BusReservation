<!DOCTYPE html>
<html lang="en">
<head>
<title>Contact Us</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
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
  margin-top: 160px;
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
  <h2><i>Contact Us</i></h2>
</header>

<section>
 
  
  <article>

    <p>If you like what you see, why wait? Simply send us your contact information, and we'll not only
     provide you with fully customised details of how we can help you develop your company's potential, 
    but you'll also be the first to hear about our new products and developments.</p>
    <p> For rest of the cities in India please dial with STD code (080) 39 41 41 41.</p>
  </article>
</section>

<footer>
  <p> &copy Copyrights.All rights reserved.</p><br>
  <a href="index.jsp">Buswala | LTI</a>
</footer>
</body>
</html>
