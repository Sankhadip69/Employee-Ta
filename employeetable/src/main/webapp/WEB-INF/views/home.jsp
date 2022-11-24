<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<link href="/css/my-style-sheet.css" rel="stylesheet" type="text/css">
<body>
	<h1 align="center">Employee Details</h1>
	
	<div class="topnav">
  <a class="active" href="home">Home</a>
  
  <form action="search" method="post">
  <input type="text" name="query" placeholder="Search..">
  </form>
  
  <div class="topnav-right">
    <a href="showReg">ADD</a>
  </div>
  
</div>

	<hr>
	<br>
	<table>
		<tr>
			<th>Id</th>
			<th>EName</th>
			<th>DOJ</th>
			<th>YOE</th>
			<th>Designation</th>
		</tr>
		<c:forEach items="${employees}" var="employee">
		<tr>
			<td>${employee.id}</td>
			<td>${employee.eName}</td>
			<td>${employee.dOJ}</td>
			<td>${employee.yOE}</td>
			<td>${employee.designation}</td>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>