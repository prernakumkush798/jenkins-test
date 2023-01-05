<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create vendor</title>
</head>
<body>
	<form action="savevendor" method="post">
		<pre>
ID:<input type=text name="id" />
CODE:<input type=text name="code" />
NAME:<input type=text name="name" />
TYPE:<select name="type" >
<option>Regular</option>
<option>Contract</option>
</select>
   

EMAIL:<input type=text name="email" />
PHONE:<input type=text name="phone" />
ADDRESS: <textarea name="address" rows="3" cols="50"></textarea> 
<input type="submit" value="save">

<a href="allVendor">View All Vendors</a>
		</pre>
	</form>
	${msg}
</body>
</html>