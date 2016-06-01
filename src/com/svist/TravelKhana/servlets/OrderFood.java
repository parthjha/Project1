package com.svist.TravelKhana.servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.svist.TravelKhana.beans.Food;
import com.svist.TravelKhana.beans.Order1;
import com.svist.TravelKhana.test.RandomNo;
import com.svist.TravelKhana.utils.FoodUtils;
import com.svist.TravelKhana.utils.FoodUtilsImp;
import com.svist.TravelKhana.utils.OrderUtils;
import com.svist.TravelKhana.utils.OrderUtilsImp;

/**
 * Servlet implementation class OrderFood
 */
@WebServlet("/OrderFood")
public class OrderFood extends HttpServlet {
	private static final long serialVersionUID = 2L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		java.io.PrintWriter out=response.getWriter();
		
		boolean mycheck=request.getParameter("food")!=null;
		//List<Food> list=new ArrayList<Food>();
	
			//wr.println(mycheck);

			 String  id1=request.getParameter("name");
			 int id = Integer.parseInt(id1);
			 int count=0;
			//String[] list = request.getParameterValues("food");
			String[] list=request.getParameterValues("food");
		
				for(String a:list  )
				{
					
					//wr.println(a);
					FoodUtils util=new FoodUtilsImp();
					Food f=util.getFoodByName(a);


					   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
					   //get current date time with Date()
					   Date date = new Date();
					   String d=dateFormat.format(date);
				
						int i=RandomNo.getRandomNo();
						Order1 o =new Order1(i,1, f.getF_price(),f.getF_type(),f.getF_id(), id,"Undelivered", d);
						OrderUtils utils=new OrderUtilsImp();
						if(utils.addOrder(o))
						{
							count++;
							
						}
						else
						{
							
							
						}
				
				
				
				
				
			}
			
			
			if(count>0)
			{
				
				out.println("<html>");
			    out.println("<head>");
			    out.println("<title></title>");
			    out.println("</head>");
			    out.println("<body>");
			    
			    out.println("<center>Order Booked Sucessfully</center>");
			    
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
			
			
					
				
				
			
		// TODO Auto-generated method stub
	}

}
