package com.svist.TravelKhana.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.svist.TravelKhana.beans.Food;
import com.svist.TravelKhana.beans.Order1;
import com.svist.TravelKhana.beans.User;

public class OrderUtilsImp implements OrderUtils {
	static Connection con = null;
	static Statement st = null;
	static PreparedStatement pst = null;
	static ResultSet rs = null;
	
	@Override
	public boolean addOrder(Order1 o) {
		// TODO Auto-generated method stub
	
		boolean added = false;
		int res = 0;
		con = DBUtils.getConnected();
		String sql = "insert into order1 values(?,?,?,?,?,?,?,?)";
		pst = DBUtils.getPreparedStatement(sql);
		try {
				
			
			pst.setInt(1,o.getO_id() );
			pst.setInt(2, o.getO_quant());
			pst.setInt(3, o.getPrice());
			pst.setString(4, o.getO_type());
			pst.setInt(5, o.getFood_id());	
			pst.setInt(6, o.getUser_id());
			pst.setString(7, o.getO_status());
			pst.setString(8, o.getO_date());
			
	
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
	public Order1 getOrder(int id) {
	
		con = DBUtils.getConnected();
		Order1 o= null;
		String sql = "select * from order1 where o_id=? ";
		pst = DBUtils.getPreparedStatement(sql);
		try {
			pst.setInt(1, id);
		
			rs = pst.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					o=new Order1();
					
					o.setO_quant(rs.getInt(2));
					o.setPrice(rs.getInt(3));
					o.setO_type(rs.getString(4));
					o.setFood_id(rs.getInt(5));
					o.setUser_id(rs.getInt(6));
					o.setO_status(rs.getString(7));
					o.setO_date(rs.getString(8));
					
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtils.releaseResources();
		return o;

	
	}

	@Override
	public List<Order1> getAllOrder() {
		Order1 o = null;
		List<Order1> orderList = new ArrayList<Order1>();
		con = DBUtils.getConnected();
		String sql = "select * from order1;";
				
		pst = DBUtils.getPreparedStatement(sql);
		try {
			
			rs = pst.executeQuery();
			if (rs != null)
				while (rs.next()) {
					o=new Order1();
					
					o.setO_id(rs.getInt(1));
					o.setO_quant(rs.getInt(2));
					o.setPrice(rs.getInt(3));
					o.setO_type(rs.getString(4));
					o.setFood_id(rs.getInt(5));
					o.setUser_id(rs.getInt(6));
					o.setO_status(rs.getString(7));
					o.setO_date(rs.getString(8));
					orderList.add(o);
				}
		} catch (SQLException e) {
			System.out.println("Error");
		} finally {
			DBUtils.releaseResources();
		}
		return orderList;

	}

	@Override
	public boolean UpdateStatus(String status, int id ) {
		boolean update = false;
		int res = 0;
		con = DBUtils.getConnected();
		String sql = "update order1 set o_status=? where o_id=? ;";
		pst = DBUtils.getPreparedStatement(sql);
		try {
				

			pst.setString(1, status);
			pst.setInt(2, id);
			res = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtils.releaseResources();
		if (res > 0)
			update = true;
		return update ;
		

	}

	@Override
	public List<Order1> getAllOrderById(int user_id) {
		Order1 o= null;
		List<Order1> orderList = new ArrayList<Order1>();
		con = DBUtils.getConnected();
		String sql = "select * from order1 where USER_ID=?; ";
				
		pst = DBUtils.getPreparedStatement(sql);
		try {
			
			pst.setInt(1, user_id);
			rs = pst.executeQuery();
			if (rs != null)
				while (rs.next()) {
					o=new Order1();
					o.setO_id(rs.getInt(1));
					o.setO_quant(rs.getInt(2));
					o.setPrice(rs.getInt(3));
					o.setO_type(rs.getString(4));
					o.setFood_id(rs.getInt(5));
					o.setUser_id(user_id);
					o.setO_status(rs.getString(7));
					o.setO_date(rs.getString(8));
					
						
				orderList.add(o);
				}
		} catch (SQLException e) {
			System.out.println("Error");
		} finally {
			DBUtils.releaseResources();
		}
		return orderList;

	}

}
