package com.svist.TravelKhana.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.svist.TravelKhana.beans.Food;
import com.svist.TravelKhana.beans.Location;
import com.svist.TravelKhana.test.RandomNo;
import com.svist.TravelKhana.utils.FoodUtils;
import com.svist.TravelKhana.utils.FoodUtilsImp;
import com.svist.TravelKhana.utils.LocationUtils;
import com.svist.TravelKhana.utils.LocationUtilsImp;

/**
 * Servlet implementation class AddFood
 */
@WebServlet("/AddFood")
public class AddFood extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		java.io.PrintWriter out=response.getWriter();
	    String name= request.getParameter("name");
	   // int trainno = Integer.parseInt(id);
		String type= request.getParameter("type");
		String desc= request.getParameter("desc");
		String location= request.getParameter("location");
		String price1 = request.getParameter("price");
		int price = Integer.parseInt(price1);
		LocationUtils utils=new LocationUtilsImp();
		Location l=utils.getLocationId(location);
		int l_id=l.getL_id();
		int i=RandomNo.getRandomNo();
		int f_id=i*i+i;
		
		FoodUtils utils1 =new FoodUtilsImp();
		Food f=new Food(f_id, name, type, desc, l_id,price);
		
		if(utils1.addFood(f))
		{
			out.println("<html>");
		    out.println("<head>");
		    out.println("<title></title>");
		    out.println("</head>");
		    out.println("<body>");
		    
		    out.println("<center>Food Added !!</center>");
		    
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
		
		
	//wr.println(type+"  "+desc +name+ location );
	
		
	}

}
