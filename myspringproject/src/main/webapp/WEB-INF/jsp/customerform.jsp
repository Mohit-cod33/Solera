<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
</head>
<body>
<h2>Enter dealer data: </h2>
<form name="customerform" method="get" action="/addCustomer" modelAttribute="customeraddress">
    Dealer Name: <input type="text" name="customerName"/> <br/>
    Dealer City: <input type="text" name="city"/> <br/> 
    <input type="submit" value="customer" />
</form>

</body>
</html>