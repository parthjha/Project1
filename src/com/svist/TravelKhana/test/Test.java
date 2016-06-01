package com.svist.TravelKhana.test;


import java.util.ArrayList;
import java.util.List;

import com.svist.TravelKhana.beans.Food;
import com.svist.TravelKhana.beans.Location;
import com.svist.TravelKhana.beans.Order1;
import com.svist.TravelKhana.beans.Train;
import com.svist.TravelKhana.beans.User;
import com.svist.TravelKhana.utils.FoodUtils;
import com.svist.TravelKhana.utils.FoodUtilsImp;
import com.svist.TravelKhana.utils.LocationUtils;
import com.svist.TravelKhana.utils.LocationUtilsImp;
import com.svist.TravelKhana.utils.OrderUtils;
import com.svist.TravelKhana.utils.OrderUtilsImp;
import com.svist.TravelKhana.utils.TrainUtils;
import com.svist.TravelKhana.utils.TrainUtilsImp;
import com.svist.TravelKhana.utils.UserUtils;
import com.svist.TravelKhana.utils.UserUtilsImp;

public class Test {
	
	/**
	 * @param args
	 */
	public static void main(String args[])
	{
	
		  FoodUtils utils=new FoodUtilsImp();
			Food f=	utils.getFoodByName("pizza");
	     System.out.println(f.getF_price());
	     System.out.println(f.getF_name());
		
	/*	UserUtils util=new UserUtilsImp();
	User u=	util.getUserByName("parth");
	System.out.println(u.getU_id());
		
		/List<Food> list = new ArrayList() ;
		  FoodUtils utils=new FoodUtilsImp();
	list=	utils.getAllFoodById(1);
	 for (Food f : list) {
			
		 System.out.println(f.getF_name());
		 System.out.println(f.getF_type());
		 System.out.println(f.getF_price());
	 }
		
		
		/*List<Food> list = new ArrayList() ;
		  FoodUtils utils=new FoodUtilsImp();
		  list =utils.getAllFoodById(1);
		 for (Food f : list) {
			
			 System.out.println(f.getF_name());
			 System.out.println(f.getF_type());
		 }
*/
		
		
		/* 
		List<Food> list = new ArrayList() ;
		  FoodUtils utils=new FoodUtilsImp();
		  list =utils.getAllFood();
		 for (Food f : list) {
			
			 System.out.println(f.getF_name());
			 System.out.println(f.getF_price());
			 System.out.println(f.getF_type());
		}
		
		
    LocationUtils utils=new LocationUtilsImp();
	Location l=utils.getLocationId("sealdah");
	
	System.out.println(l.getL_id());
	
		
	//System.out.println(	++GetInteger.count);
		
		//System.out.println("abc"+RandomNo.getRandomNo());
	/*int i=RandomNo.getRandomNo();*/
	
		
		//Food f =new Food(i,"jkdjfk", "xyx", "jhdsjf", 1);
	//	FoodUtils util=new FoodUtilsImp();
	//Food f=util.getFood(1);
	
	//System.out.println(f.getF_name());
		
		
		/*
		Bdo  b=new Bdo(2,"Sam","sam@gmail.com","123");
		BdoUtils util=new BdoUtilsImp();
	if(util.addBdo(b))
	System.out.println("Added");
	else
		System.out.println("Fail");
	*/
		/*
		User u=new User(1,"parth", "x@xyz.com", "123", 983162);
		UserUtils util=new UserUtilsImp();
		if(util.addUser(u))
			System.out.println("Added");
			else
				System.out.println("Fail");
		*/
		
		 /* List<Train> list = new ArrayList() ;
		  TrainUtils utils=new TrainUtilsImp();
		  list =utils.getAllTrain();
		 for (Train train : list) {
			
			 System.out.println(train.getT_name());
		}*/
		
		
		/* List<Location> list = new ArrayList() ;
		  LocationUtils utils=new LocationUtilsImp();
		  list =utils.getAllLocation();
		 for (Location l : list) {
			
			 System.out.println(l.getL_name());
		}
		 
		 
		/*Train t =new Train(13186, "ganga sagar","sealdah","jaynagar");
		TrainUtils util=new TrainUtilsImp();
		if(util.addTrain(t))
			System.out.println("Added");
			else
				System.out.println("Fail");
			*/
	
		//String status="undeliverd";
		/* List<Order1> list = new ArrayList() ;
		 OrderUtils util=new OrderUtilsImp();
			list=util.getAllOrderById(9313);
			
		for(Order1 l:list)
		{
			
			System.out.println(l.getO_date());
			System.out.println(l.getO_quant());
			System.out.println(l.getUser_id());
			
		}
		 */

	}
	
	

}
