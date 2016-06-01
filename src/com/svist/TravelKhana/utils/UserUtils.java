package com.svist.TravelKhana.utils;

import java.util.List;

import com.svist.TravelKhana.beans.Train;
import com.svist.TravelKhana.beans.User;

public interface UserUtils {


	public boolean addUser(User u);
	public User getUser(int id);
	public List<User> getAllUser();
	public User validate(String email, String password);
	
	public User getUserByName(String name);
}
