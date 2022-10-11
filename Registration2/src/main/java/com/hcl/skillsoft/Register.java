package com.hcl.skillsoft;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		         
		String fn=request.getParameter("fname");  
		String ln=request.getParameter("lname");  
		String ph=request.getParameter("phno");  
		String em=request.getParameter("email");
		String la = request.getParameter("lang");
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registration2","root","root");
		PreparedStatement ps=con.prepareStatement("insert into registeruser values(?,?,?,?,?)");   
		ps.setString(1,fn);  
		ps.setString(2,ln);  
		ps.setString(3,ph);  
		ps.setString(4,em); 
		ps.setString(5,la );
		ps.execute();		   
			int i=ps.executeUpdate();  
			if(i>0) { 
				out.print("You are successfully registered...");  
			}
		out.println(" <html><body align='center'><form action='dd.jsp'> Language : <select name='langs' <option value='c'>C</option> <option value='c++'>C++</option><option value='java'>JAVA</option><option value='any'>ANY</option></select><input type='submit' value='SUBMIT'></form>"  );

		    


		 }catch (Exception e2) {
				System.out.println(e2);
				} 
	
			
		 
		}
	}


