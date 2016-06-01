package com.svist.TravelKhana.utils;

import java.util.List;

import com.svist.TravelKhana.beans.Food;


public interface FoodUtils {

	public boolean addFood(Food f);
	public Food getFood(int id);
	public Food getFoodByName(String name);
	public List<Food> getAllFood();
	public List<Food> getAllFoodById(int id);
	
}
