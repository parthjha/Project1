package com.svist.TravelKhana.beans;

public class Location {

	private int  l_id ;
	private String l_name;
	
	public Location(int l_id, String l_name) {
		super();
		this.l_id = l_id;
		this.l_name = l_name;
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	
	
	
	
}
