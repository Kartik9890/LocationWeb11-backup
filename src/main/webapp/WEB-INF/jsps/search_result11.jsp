<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All locations list</title>
</head>
<body>
<h2>List of locations</h2>
	<table>
			<tr>
			<th>id</th>
			<th>name</th>
			<th>code</th>
			<th>type</th>
			<th>delete</th>
			<th>update</th>
			</tr>
	
	<c:forEach items="${list11}" var="list11">
	<tr>
	<td>${list11.id}</td>
	<td>${list11.name}</td>
	<td>${list11.code}</td>
	<td>${list11.type}</td>
	<td><a href="delete?id=${list11.id}">delete</a></td>
	<td><a href="update?id=${list11.id}">update</a></td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>