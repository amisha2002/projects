package com.servlet.student.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.student.dao.StudentDao;
@WebServlet(value="/delete")
public class StudentDeleteController extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	StudentDao dao= new StudentDao();
	Integer studentid = Integer.parseInt(req.getParameter("sid"));
	dao.deleteStudent(studentid);
	PrintWriter pw = resp.getWriter();
	pw.write("<html><body><h1>Data Deleted Successfully</h1></body></html>");
	RequestDispatcher rd = req.getRequestDispatcher("displaystudent.jsp");
	rd.include(req, resp);

}
}
