<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Data</title>
<style>
table{
border-collapse:collapse;
}
</style>
</head>
<body>

<div align="center">
 <table border="1" cellpadding="5">
<caption>Add Pet Details</caption>
<form action=AddPet method ="post">
<tr>
	<th>name:</th>
	<td><input type = "text" name = "name"><br></td>
</tr>
<tr>
	<th>category:</th>
	<td><input type = "text" name = "category"><br></td>
<tr>
	<th>photo:</th>
	<td><input type = "text" name = "photo"><br></td>
</tr>
<tr>
	<th>status:</th>
	<td><input type = "text" name = "status"><br></td>
</tr>
<tr>
	<th>tags:</th>
	<td><input type = "text" name = "tag"><br></td>
</tr>
<tr>
	<th>submit:</th>
	<td><input type = "submit" value = "submit"></td>
</tr>
</form>
</table>
</div>
</body>
</html>