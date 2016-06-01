package com.svist.TravelKhana.beans;

public class Train {
	private int t_id ;
	private String t_name;
	private String t_source;
	private String t_destination;
	
	
	public Train(int t_id, String t_name, String t_source, String t_destination) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.t_source = t_source;
		this.t_destination = t_destination;
	}
	
	
	
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getT_source() {
		return t_source;
	}
	public void setT_source(String t_source) {
		this.t_source = t_source;
	}
	public String getT_destination() {
		return t_destination;
	}
	public void setT_destination(String t_destination) {
		this.t_destination = t_destination;
	}
	
	
	
}
