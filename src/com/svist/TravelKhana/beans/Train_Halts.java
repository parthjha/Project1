package com.svist.TravelKhana.beans;

public class Train_Halts {
	
	private int  halts_id ;
	private  int location_id ;
	
	
	
	public Train_Halts(int halts_id, int location_id) {
		super();
		this.halts_id = halts_id;
		this.location_id = location_id;
	}
	public Train_Halts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getHalts_id() {
		return halts_id;
	}
	public void setHalts_id(int halts_id) {
		this.halts_id = halts_id;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	
		
	

}
