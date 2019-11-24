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

body {
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
  background-color: #dbc2f1;
  padding: 30px;
  text-align: center;
  font-size: 35px;
  color: white;
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
  padding: 10px;
  text-align: center;
  color: white;
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


<header>
  <h2>About Us</h2>
</header>

<section>
 
  
  <article>
    <h1>BUSWALA.COM</h1>
    <p>BUSWALA is India’s largest online bus ticketing platform that has transformed bus travel in the country by 
    bringing ease and convenience to millions of Indians who travel using buses. Founded in 2006,
     redBus is part of India’s leading online travel company MakeMyTrip Limited (NASDAQ: MMYT). 
     By providing widest choice, superior customer service, lowest prices and unmatched benefits,
      redBus has served over 8 million customers. 
    redBus has a global presence with operations across Indonesia, Singapore, Malaysia, Colombia and Peru apart from India</p>
    <p></p>
  </article>
</section>

<footer>
  <p>Footer</p>
</footer>


</body>
</html>