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
import com.servlet.student.dto.Student;
@WebServlet(value="/ustud2")
public class UpdateStudentController2 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Student s = new Student();
	s.setStudId(Integer.parseInt(req.getParameter("sid")));
	s.setStudEmail(req.getParameter("smail"));
	s.setStudName(req.getParameter("sname"));
	
	StudentDao dao = new StudentDao();
	dao.updateStudentById(s, s.getStudId());
	
	if(s!=null) {
		RequestDispatcher dispatcher = req.getRequestDispatcher("displaystudent.jsp");
		dispatcher.include(req, resp);
	}
	else {
		PrintWriter pw = resp.getWriter();
		pw.println("Student not found");
	}
}
}
