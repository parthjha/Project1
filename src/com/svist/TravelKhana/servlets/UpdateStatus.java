package com.svist.TravelKhana.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.svist.TravelKhana.beans.Order1;
import com.svist.TravelKhana.utils.OrderUtils;
import com.svist.TravelKhana.utils.OrderUtilsImp;

/**
 * Servlet implementation class UpdateStatus
 */

@WebServlet("/doUpdate")
public class UpdateStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		response.setContentType("text/html");
		java.io.PrintWriter out=response.getWriter();
		String status= request.getParameter("status");
		String id1= request.getParameter("id");
		int id= Integer.parseInt(id1);
		OrderUtils util=new OrderUtilsImp();
		if(util.UpdateStatus(status, id))
		{
			out.println("<html>");
		    out.println("<head>");
		    out.println("<title></title>");
		    out.println("</head>");
		    out.println("<body>");
		    
		    out.println("<center>Order Added Successfully !!!</center>");
		    
		    out.println("</body>");
		    out.println("</html>");
		
		}
		else
		{
			out.println("<html>");
		    out.println("<head>");
		    out.println("<title></title>");
		    out.println("</head>");
		    out.println("<body>");
		    
		    out.println("<center>Failed !!</center>");
		    
		    out.println("</body>");
		    out.println("</html>");
			
		}

		
		
	}

}
