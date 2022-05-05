<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Location</title>
</head>
<body>
<h2>update Location here</h2>
<form action="/update11" method="post">
<pre>
id <input type="text" name="id" value="${location.id }">
name<input type="text" name="name" value="${location.name }">
code <input type="text"name="code" value="${location.code }">
type:
urban<input type="radio" value="urban" name="type"/>
rural<input type="radio" value="rural" name="type"/>
<input type="submit" value="update">
</pre>
</form>
${msg}
</body>
</html>