package com.svist.TravelKhana.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.svist.TravelKhana.beans.User;
import com.svist.TravelKhana.test.RandomNo;
import com.svist.TravelKhana.utils.UserUtils;
import com.svist.TravelKhana.utils.UserUtilsImp;

/**
 * Servlet implementation class Register
 */
@WebServlet("/doRegister")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		java.io.PrintWriter wr=response.getWriter();
	    String name = request.getParameter("name");
	    String email = request.getParameter("email");
		String password = request.getParameter("password");
		String mobile = request.getParameter("mobile");
		long l = Long.parseLong(mobile);
		int i=RandomNo.getRandomNo();
		int id=i*i+i;
		UserUtils utils=new UserUtilsImp();
		User u=new User(id, name, email,password, l);
		if(utils.addUser(u))
		{
			response.sendRedirect("user.jsp");
		}
		else
		{
			response.sendRedirect("register.jsp");
		}
		
		
		
	}

}
