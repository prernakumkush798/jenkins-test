<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Vendors</title>
</head>
<body>
	<h1>all vendors will be displayed here</h1>
	<table>
		<thead>
			<tr>
				<th>id</th>
				<th>code</th>
				<th>name</th>
				<th>type</th>
				<th>email</th>
				<th>phone</th>
				<th>address</th>
			</tr>


			<c:forEach items="${vendors}" var="vend">
				<tr>
					<td>${vend.id}</td>
					<td>${vend.code}</td>
					<td>${vend.name}</td>
					<td>${vend.type}</td>
					<td>${vend.email}</td>
					<td>${vend.phone}</td>
					<td>${vend.address}</td>
					<td><a href="deletevendor?id=${vend.id}">DELETE</a></td>
					<td><a href="editvendor?id=${vend.id}">EDIT</a></td>


				</tr>
			</c:forEach>

		</thead>

	</table>
<button><a href="showvendor">BACK</a></button>



</body>
</html>