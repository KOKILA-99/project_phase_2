package com.student.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.student.dao.StudentSearchDAO;
import com.student.dao.impl.StudentSearchDAOImpl;
import com.student.exception.BusinessException;
import com.student.model.Student;
import com.student.model.Subject;
import com.student.service.StudentSearchService;
import com.student.service.impl.StudentSearchServiceImpl;

/**
 * Servlet implementation class EmployeeSearchController
 */
public class StudentSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentSearchController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String value = request.getParameter("value");
		StudentSearchService service= new StudentSearchServiceImpl();
			try {
				int class_name=Integer.parseInt(value);
				List<Student> studentsList=service.getReportByClass(class_name);
				List<Subject> detailsList= service.getReportSubjectByClass(class_name);
				HttpSession session=request.getSession();
				session.setAttribute("employeesList", studentsList);
				session.setAttribute("detailsList", detailsList);
				response.sendRedirect("results.jsp");
			}catch(NumberFormatException | BusinessException e) {
				if(e instanceof NumberFormatException) {
					request.setAttribute("error", "Class cannot be Empty or Character ");
				}else {
					request.setAttribute("error", e.getMessage());
				}
				request.getRequestDispatcher("view.jsp").forward(request, response);
			}
			

}
	
}
