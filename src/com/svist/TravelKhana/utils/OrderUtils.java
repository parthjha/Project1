
package com.svist.TravelKhana.utils;

import java.util.List;

import com.sun.swing.internal.plaf.basic.resources.basic;
import com.svist.TravelKhana.beans.Order1;


public interface OrderUtils {
	public boolean addOrder(Order1 o);
	public Order1 getOrder(int id);
	public List<Order1> getAllOrder();
	public List<Order1> getAllOrderById(int user_id);
	public boolean UpdateStatus(String status ,int id);
	
}
