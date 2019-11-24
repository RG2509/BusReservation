<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">


<title>Registration</title>
</head>
<body>



     <form id="regForm"  action="booking3.do" method="post" >
        <table>
        <tr>
        <td>
          <input type="text"  name="pname" id=""pname"" placeholder="Full Name"  class="input1"/></td></tr>
   <tr><td> <div id="id1" style="color: red"></div></td>
          </tr>
         <tr><td>  <input type="text"  name="phone"  id=""phone"" placeholder="Mobile Number"  class="input1"/></td></tr>
          <tr> <td><div id="id4" style="color: red"></div></td>
           </tr>
          <tr><td> <input  type="text" name=""gender""  id=""gender"" placeholder="Email"  class="input1"/></td></tr>
         <tr> <td><div id="id3" style="color: red"></div></td>

          <tr><td> <button type="submit" id="register"  class="btn btn-primary btn-block btn-large">Register</button></td></tr>
         
          </table>
        </form>


</body>
</html>