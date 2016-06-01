package com.svist.TravelKhana.beans;

public class User {
	private int u_id;
	private String u_name;
	private String  u_email;
	private String u_password;
	private long u_phn_no;
	
	
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_email() {
		return u_email;
	}
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	public long getU_phn_no() {
		return u_phn_no;
	}
	public void setU_phn_no(long u_phn_no) {
		this.u_phn_no = u_phn_no;
	}
	public User(int u_id, String u_name, String u_email, String u_password, long u_phn_no) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_email = u_email;
		this.u_password = u_password;
		this.u_phn_no = u_phn_no;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

	

}
