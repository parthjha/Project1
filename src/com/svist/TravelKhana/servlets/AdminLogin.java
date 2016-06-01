package com.svist.TravelKhana.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.svist.TravelKhana.beans.User;
import com.svist.TravelKhana.utils.UserUtils;
import com.svist.TravelKhana.utils.UserUtilsImp;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 2L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		java.io.PrintWriter wr=response.getWriter();
	    String str = request.getParameter("email");
		String str1 = request.getParameter("password");
		String email=str.toLowerCase();
		String password=str1.toLowerCase();
		//wr.print("  "+email+"  "+password);
		


	 if ((email != null && !email.equals("")) &&( password != null&& !password.equals(""))){

				UserUtils utils=new UserUtilsImp();
				User u=null; 
				u= utils.validate(email, password);	
				if (u != null) {
					HttpSession session = request.getSession();
					System.out.println(u.getU_name());
					//session.setAttribute("user", u);
				response.sendRedirect("adminMainPage.jsp");
				 	} 
				 
				 else {
						response.sendRedirect("index.jsp");
					} 	
			}
	 
	 else {
			response.sendRedirect("index.jsp");
		}
	 
	}

}
