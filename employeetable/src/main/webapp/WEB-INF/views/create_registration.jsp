<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>

<body>
	<h2>Add Employee</h2>
	<form action="home" method="post">
	<pre>
	  <label for="id">Employee Id:</label>
	  <input type="text"  name="id"><br><br>
	  <label for="eName">Employee Name:</label>
	  <input type="text" name="EName"><br><br>
	  <label for="dOJ">Date of Joining:</label>
	  <input type="text" name="dOJ"><br><br>
	  <label for="yOE">Year of Experience:</label>
	  <input type="text" name="yOE"><br><br>
	  <label for="designation">Designation:</label>
	  <input type="text" name="designation"><br><br>
	  <button type="submit" value="Save">Save</button>
	  <br>
	  
	</pre>
	
</form>
</body>
</html>