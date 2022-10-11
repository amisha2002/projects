<%@page import="com.servlet.student.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ustud2" method ="get">
<div >
<% Student s =(Student) request.getAttribute("stud"); %>
 <div class="mb-3 row" >
    <label for="inputPassword" class="col-sm-2 col-form-label">Id</label>
    <div class="col-sm-10">
      <input type="number"  id="inputPassword" value="<%= s.getStudId()%>" name = "sid" readonly="readonly">
    </div>
  </div>
  <div class="mb-3 row" >
    <label for="inputPassword" class="col-sm-2 col-form-label">Name</label>
    <div class="col-sm-10">
      <input type="text"  id="inputPassword" value=" <%=s.getStudName()%>" name = "sname">
    </div>
  </div>
  <div class="mb-3 row">
    <label for="staticEmail" class="col-sm-2 col-form-label">Email</label>
    <div class="col-sm-10">
      <input type="text"  id="staticEmail" value=" <%= s.getStudEmail() %> "name = "smail">
    </div>
  </div>
  </div>
  <div style = "text-align: center;">
  <input type="submit" class="btn btn-success" value ="UPDATE">
  </div>
 </form>


</form>
</body>
</html>