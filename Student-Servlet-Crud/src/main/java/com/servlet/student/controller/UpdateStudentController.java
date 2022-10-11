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
@WebServlet(value="/ustud1")
public class UpdateStudentController extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	StudentDao dao = new StudentDao();
	Integer id = Integer.parseInt(req.getParameter("sid"));
	Student s = dao.getById(id);
	if(s!=null) {
		RequestDispatcher dispatcher = req.getRequestDispatcher("studentupdate.jsp");
		req.setAttribute("stud", s);
		dispatcher.forward(req, resp);
	}
	else {
		PrintWriter pw = resp.getWriter();
		pw.println("Student not found");
	}
}
}
