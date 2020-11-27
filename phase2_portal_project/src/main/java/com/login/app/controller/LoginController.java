package com.login.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.app.model.User;
import com.login.app.service.LoginService;
import com.login.app.service.impl.LoginServiceImpl;
import com.student.exception.BusinessException;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		User user=new User();
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		PrintWriter out=response.getWriter();
		LoginService loginService=new LoginServiceImpl();
		RequestDispatcher rd=null;
		try {
			if(loginService.isValidLoginCredentials(user)) {
				HttpSession session = request.getSession();
				session.setAttribute("username", user.getUsername());
				response.sendRedirect("view.jsp");
				//rd.forward(request, response);
				
				//navigate to success
				//rd=request.getRequestDispatcher("success.jsp");
				//rd.forward(request, response);
			}
		} catch (BusinessException e) {
			//communicate error to client
			rd=request.getRequestDispatcher("login.jsp");
			request.setAttribute("error", e.getMessage());
			rd.include(request, response);
			//rd.include(request, response);
			//out.print("<center><span style='color:red;'>"+e.getMessage()+"</span></center>");
		}
	}

}
