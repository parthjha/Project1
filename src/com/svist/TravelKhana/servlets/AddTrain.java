package com.svist.TravelKhana.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.svist.TravelKhana.beans.Train;
import com.svist.TravelKhana.utils.TrainUtils;
import com.svist.TravelKhana.utils.TrainUtilsImp;

/**
 * Servlet implementation class AddTrain
 */
@WebServlet("/AddTrain")
public class AddTrain extends HttpServlet {
	private static final long serialVersionUID = 2L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		java.io.PrintWriter out=response.getWriter();
	    String id = request.getParameter("trainno");
	    int trainno = Integer.parseInt(id);
		String trainname= request.getParameter("trainname");
		String source= request.getParameter("source");
		String destination=request.getParameter("destination");
		
		Train t=new  Train(trainno, trainname,source,destination);
		TrainUtils utils=new TrainUtilsImp();
				
			if(utils.addTrain(t))
			{
				out.println("<html>");
			    out.println("<head>");
			    out.println("<title></title>");
			    out.println("</head>");
			    out.println("<body>");
			    
			    out.println("<center>Train Added sucessfully</center>");
			    
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
