package com.svist.TravelKhana.beans;

public class Food {
	private int f_id;
	private String f_name ;
	private String f_type;
	private String f_desc;
	private int l_id;
	private int f_price;
	
	
	
	
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(int f_id, String f_name, String f_type, String f_desc, int l_id, int f_price) {
		super();
		this.f_id = f_id;
		this.f_name = f_name;
		this.f_type = f_type;
		this.f_desc = f_desc;
		this.l_id = l_id;
		this.f_price = f_price;
	}
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getF_type() {
		return f_type;
	}
	public void setF_type(String f_type) {
		this.f_type = f_type;
	}
	public String getF_desc() {
		return f_desc;
	}
	public void setF_desc(String f_desc) {
		this.f_desc = f_desc;
	}
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public int getF_price() {
		return f_price;
	}
	public void setF_price(int f_price) {
		this.f_price = f_price;
	}
	
	
	
	
	
	
	
	
	
}
