package com.svist.TravelKhana.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.svist.TravelKhana.beans.Food;
import com.svist.TravelKhana.beans.Location;
import com.svist.TravelKhana.utils.FoodUtils;
import com.svist.TravelKhana.utils.FoodUtilsImp;
import com.svist.TravelKhana.utils.LocationUtils;
import com.svist.TravelKhana.utils.LocationUtilsImp;

/**
 * Servlet implementation class SearchFood
 */
@WebServlet("/doSearchFood")

public class SearchFood extends HttpServlet {
	private static final long serialVersionUID = 2L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		java.io.PrintWriter wr=response.getWriter();
	    String train= request.getParameter("train");
		String location = request.getParameter("location");
	
		LocationUtils utils=new LocationUtilsImp();
		Location l=utils.getLocationId(location);
		int id=l.getL_id();
		FoodUtils util=new FoodUtilsImp();
		List<Food> list = new ArrayList() ;
		 list= util.getAllFoodById(id);
			HttpSession session = request.getSession();
			session.setAttribute("listoffood", list);
			response.sendRedirect("orderFood.jsp");
			
		
		
		
		
		 
	
		
		 //wr.println(f.getF_name() +f.getL_id());
		
		//wr.print("  "+train+"  "+location);
		
		
	
		
		
	}

}
