package com.svist.TravelKhana.beans;

public class Order1 {

	private  int o_id;
	private int o_quant;
	private int price;
	private String o_type;
	private int food_id;
	private int user_id;
	private String  o_status;
	private String o_date;
	public int getO_id() {
		return o_id;
	}
	public void setO_id(int o_id) {
		this.o_id = o_id;
	}
	public int getO_quant() {
		return o_quant;
	}
	public void setO_quant(int o_quant) {
		this.o_quant = o_quant;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getO_type() {
		return o_type;
	}
	public void setO_type(String o_type) {
		this.o_type = o_type;
	}
	public int getFood_id() {
		return food_id;
	}
	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getO_status() {
		return o_status;
	}
	public void setO_status(String o_status) {
		this.o_status = o_status;
	}
	public String getO_date() {
		return o_date;
	}
	public void setO_date(String o_date) {
		this.o_date = o_date;
	}
	public Order1(int o_id, int o_quant, int price, String o_type, int food_id, int user_id, String o_status,
			String o_date) {
		super();
		this.o_id = o_id;
		this.o_quant = o_quant;
		this.price = price;
		this.o_type = o_type;
		this.food_id = food_id;
		this.user_id = user_id;
		this.o_status = o_status;
		this.o_date = o_date;
	}
	public Order1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
