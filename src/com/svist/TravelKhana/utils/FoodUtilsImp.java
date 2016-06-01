package com.svist.TravelKhana.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.svist.TravelKhana.beans.Food;


public class FoodUtilsImp implements FoodUtils{
	static Connection con = null;
	static Statement st = null;
	static PreparedStatement pst = null;
	static ResultSet rs = null;
	
	
	

	@Override
	public Food getFood(int id) {
		con = DBUtils.getConnected();
		Food f= new Food();
		String sql = "select * from food where f_id=? ";
		pst = DBUtils.getPreparedStatement(sql);
		try {
			pst.setInt(1, id);
		
			rs = pst.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					f=new Food();
					f.setF_name(rs.getString(2));
					f.setF_type(rs.getString(3));
					f.setF_desc(rs.getString(4));
					f.setL_id(rs.getInt(5));
					f.setF_price(rs.getInt(6));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtils.releaseResources();
		return f;

	}

	@Override
	public List<Food> getAllFood() {
		Food f= null;
		List<Food> foodList = new ArrayList<Food>();
		con = DBUtils.getConnected();
		String sql = "select * from food; ";
				
		pst = DBUtils.getPreparedStatement(sql);
		try {
			
			rs = pst.executeQuery();
			if (rs != null)
				while (rs.next()) {
					
					f=new Food();
					f.setF_id(rs.getInt(1));
					f.setF_name(rs.getString(2));
					f.setF_type(rs.getString(3));
					f.setF_desc(rs.getString(4));
					f.setL_id(rs.getInt(5));
					f.setF_price(rs.getInt(6));
					
					foodList.add(f);
				}
		} catch (SQLException e) {
			System.out.println("Error");
		} finally {
			DBUtils.releaseResources();
		}
		return foodList;

	}

	@Override
	public boolean addFood(Food f) {

		boolean added = false;
		int res = 0;
	
		con = DBUtils.getConnected();
	
		String sql="insert into food values(?,?,?,?,?,?)";
		pst = DBUtils.getPreparedStatement(sql);
		try {
			
			pst.setInt(1,f.getF_id());
			pst.setString(2, f.getF_name());
			pst.setString(3, f.getF_type());
			pst.setString(4, f.getF_desc());
			pst.setInt(5, f.getL_id());
			pst.setInt(6, f.getF_price());
			res = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtils.releaseResources();
		if (res > 0)
			added = true;
		return added;

	}

	@Override
	public List<Food> getAllFoodById(int id) {
		Food f= null;
		List<Food> foodList = new ArrayList<Food>();
		con = DBUtils.getConnected();
		String sql = "select * from food where l_id=?; ";
				
		pst = DBUtils.getPreparedStatement(sql);
		try {
			
			pst.setInt(1, id);
			rs = pst.executeQuery();
			if (rs != null)
				while (rs.next()) {
					
					f=new Food();
					f.setF_id(rs.getInt(1));
					f.setF_name(rs.getString(2));
					f.setF_type(rs.getString(3));
					f.setF_desc(rs.getString(4));
					f.setF_price(rs.getInt(6));
						
					foodList.add(f);
				}
		} catch (SQLException e) {
			System.out.println("Error");
		} finally {
			DBUtils.releaseResources();
		}
		return foodList;

	}

	@Override
	public Food getFoodByName(String name) {
		con = DBUtils.getConnected();
		Food f= new Food();
		String sql = "select * from food where f_name=? ";
		pst = DBUtils.getPreparedStatement(sql);
		try {
			pst.setString(1, name);
		
			rs = pst.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					f=new Food();
					f.setF_id(rs.getInt(1));
					f.setF_name(name);
					f.setF_type(rs.getString(3));
					f.setF_desc(rs.getString(4));
					f.setL_id(rs.getInt(5));
					f.setF_price(rs.getInt(6));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtils.releaseResources();
		return f;

	}

}
