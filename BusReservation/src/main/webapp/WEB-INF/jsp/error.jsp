<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="view" method="POST"  modelAttribute="myBean">
 <table>
 <tr><td>Name</td> <td><form:input type="text" path="name" name="name"/></td> </tr>
 <tr><td>Account Status:</td><td> <form:select path="astatus" items="${mlist}" name="astatus">
 </form:select></td></tr>
 <tr><td><input type="submit" value="Register"/></td><td></td> </tr>
 </table>
 </form:form>

</body>
</html>