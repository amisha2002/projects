<%@page import="com.servlet.student.dao.StudentDao"%>
<%@page import="com.servlet.student.dto.Student"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">
<%
StudentDao dao = new StudentDao();
List<Student> stud = dao.getAllData();
%>
<table border="3px solid black" >
<tr>

<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Delete</th>
<th>Update</th>
</tr>

<% 
for(Student s : stud) {
%>
<tr>
<td><%= s.getStudId() %></td>
<td><%= s.getStudName() %></td>
<td><%= s.getStudEmail() %></td>
<td><a href="delete?sid=<%= s.getStudId() %>" class="btn btn-primary btn-lg"><button>DELETE</button></a></td>
<td><a href="ustud1?sid=<%= s.getStudId() %>" class="btn btn-primary btn-lg"><button>UPDATE</button></a></td>
</tr>
<% 	
}
%>
</table>
</body>
</html>