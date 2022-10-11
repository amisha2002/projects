<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">
	<BR>
	<h1>REGISTRATION</h1>
	<br>
	<form action="Register" method="POST">
		FIRST NAME : <input type="text" name="fname" required><br>
		<br> LAST NAME : <input type="text" name="lname" required><br>
		<br> PHONE NUMBER : <input type="tel" name="phno" required><br>
		<br> EMAIL : <input type="email" name="email" required><br>
		<br> LANGUAGES : <input type="checkbox" name="lang" value="c">C
		<input type="checkbox" name="lang" value="c++">C++ <input
			type="checkbox" name="lang" value="java">JAVA <input
			type="checkbox" name="lang" value="any">Any<br>
		<br> <input type="submit" value="SUBMIT"> <input
			type="reset" value="RESET">
	</form>
</body>
</html>

