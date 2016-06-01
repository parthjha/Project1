package com.svist.TravelKhana.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/doContact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

		response.setContentType("text/html");
		java.io.PrintWriter out=response.getWriter();
		
		
		out.println("<html>");
	    out.println("<head>");
	    out.println("<title></title>");
	    out.println("</head>");
	    out.println("<body>");
	    
	    out.println("<center>Thank for response  We will contact you soon</center>");
	    
	    out.println("</body>");
	    out.println("</html>");
		
		
	}

}
