package com.svist.TravelKhana.utils;

import java.util.List;

import com.svist.TravelKhana.beans.Food;
import com.svist.TravelKhana.beans.Location;

public interface LocationUtils {

	public boolean addLocation(Location l);
	public Location getLocation(int id);
	public Location getLocationId(String name);
	public List<Location> getAllLocation();
	

}
