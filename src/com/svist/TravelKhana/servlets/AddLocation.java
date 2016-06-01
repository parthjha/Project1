package com.svist.TravelKhana.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.svist.TravelKhana.beans.Location;
import com.svist.TravelKhana.utils.LocationUtils;
import com.svist.TravelKhana.utils.LocationUtilsImp;

/**
 * Servlet implementation class AddLocation
 */
@WebServlet("/AddLocation")
public class AddLocation extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		java.io.PrintWriter out=response.getWriter();
	    String id1= request.getParameter("id");
	   int l_id= Integer.parseInt(id1);
		String l_name= request.getParameter("name");
		Location l=new Location(l_id, l_name);
		LocationUtils utils=new LocationUtilsImp();
		if(utils.addLocation(l))
		{
			
			out.println("<html>");
		    out.println("<head>");
		    out.println("<title></title>");
		    out.println("</head>");
		    out.println("<body>");
		    
		    out.println("<center>Location Added Successfully !! </center>");
		    
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
		    
		    out.println("<center>Failed !!!</center>");
		    
		    out.println("</body>");
		    out.println("</html>");	
			
		}
		
		
	
		
	}

}
