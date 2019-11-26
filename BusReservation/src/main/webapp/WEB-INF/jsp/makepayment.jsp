<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

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
						id="card_number" />
						<div id="id1"></div>
						</td>
			</tr>
			<tr>
				<td>Name of Card Holder</td>
				<td><input type="text" name="name" id="name"/><div id="id3"></div></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="cvv"
						id="cvv" />
						<div id="id2"></div>
						</td>
			</tr>
			
			<tr>
				<td>Expiry Date</td>
				<td><input type="date" name="exp"
						id="exp"/><div id="id4"></div></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit"  value="Make Payment"></td>
			</tr>
			<tr></tr>
			
		</table>
	</form>


</body>
</html>