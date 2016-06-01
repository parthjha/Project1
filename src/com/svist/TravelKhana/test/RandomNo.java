package com.svist.TravelKhana.test;
import java.util.Random;

import com.sun.org.apache.xerces.internal.dom.PSVIDOMImplementationImpl;
public class RandomNo {

	public static int getRandomNo()
	{
		int pick = 0;
		Random rand = new Random(); 
		for (int j = 0; j<50; j++) 
		{       
			 pick = rand.nextInt(200); 
		//System.out.println(pick); 
		}
		return pick;
	}
}



	


