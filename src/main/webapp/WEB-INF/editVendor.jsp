<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updatevendor" method="post">
		<pre>
ID:<input type=text name="id" value="${vendors.id}"/>
CODE:<input type=text name="code" value="${vendors.code}"/>
NAME:<input type=text name="name" value="${vendors.name}"/>
TYPE:<select name="type" >
<option>Regular</option>
<option>Contract</option>
</select>
   

EMAIL:<input type=text name="email" value="${vendors.email}"/>
PHONE:<input type=text name="phone" value="${vendors.phone}"/>
ADDRESS: <textarea name="address" rows="3" cols="50" value="${vendors.address}"></textarea> 
<input type="submit" value="save">

<a href="allVendor">View All Vendors</a>
		</pre>
	</form>

</body>
</html>