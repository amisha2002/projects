<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
try {
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registration2","root","root");
String lan = request.getParameter("langs");
if(lan != null) {
%>
<table>
<tr>
			 <td>First Name</td>
			<td>Last Name</td>
			<td>Phone Number</td>
			<td>Email Id</td>
			<td>Languages</td>
			<tr>
			<% 
	ResultSet rs=null;
	if(lan.equals("Any"))
	{
		PreparedStatement ps1 = con.prepareStatement("select r.fname,r.lname,r.phno,r.email,r.lang from registeruser r  ");
		rs = ps1.executeQuery();
		}	
	else{
	PreparedStatement ps1 = con.prepareStatement("select r.fname,r.lname,r.phno,r.email,r.lang from registeruser r where r.lang = ?");
	ps1.setString(1, lan);
	rs = ps1.executeQuery();
	}
	while(rs.next()){ 
%>
<tr>
<td><%=rs.getString("fname")%></td>
<td><%=rs.getString("lname")%></td>
<td><%=rs.getString("phno")%></td>
<td><%=rs.getString("email")%></td>
<td><%=rs.getString("lang")%></td>
</tr>
<%} %> 
<%
}
}
catch(ClassNotFoundException e){
e.printStackTrace();
}

%>
</table>
</body>
</html>
