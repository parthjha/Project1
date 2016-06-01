package com.svist.TravelKhana.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.svist.TravelKhana.beans.Food;
import com.svist.TravelKhana.beans.User;

public class UserUtilsImp  implements UserUtils{

	static Connection con = null;
	static Statement st = null;
	static PreparedStatement pst = null;
	static ResultSet rs = null;
	@Override
	public boolean addUser(User u) {
	
		boolean added = false;
		int res = 0;
		int i=1;
	
		con = DBUtils.getConnected();
		String sql = "insert into user values(?,?,?,?,?)";
		
		pst = DBUtils.getPreparedStatement(sql);
		try {
			
			i=i+u.getU_id();
			pst.setInt(1,i);
			pst.setString(2,u.getU_name());
			pst.setString(3, u.getU_email());
			pst.setString(4,u.getU_password());
			pst.setLong(5, u.getU_phn_no());

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
	public User getUser(int id) {
		
		con = DBUtils.getConnected();
		User  u= null;
		String sql = "select * from user where u_id=? ";
		pst = DBUtils.getPreparedStatement(sql);
		try {
			pst.setInt(1, id);
		
			rs = pst.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					u=new User();
				
					u.setU_name(rs.getString(2));
					u.setU_email(rs.getString(3));
					u.setU_password(rs.getString(4));
					u.setU_phn_no(rs.getInt(5));

				
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtils.releaseResources();
		return u;

	}
	


	@Override
	public List<User> getAllUser() {
		
		User u = null;
		List<User> userList = new ArrayList<User>();
		con = DBUtils.getConnected();
		String sql = "select * from User;";
				
		pst = DBUtils.getPreparedStatement(sql);
		try {
			
			rs = pst.executeQuery();
			if (rs != null)
				while (rs.next()) {
					
					
					u=new User();
					u.setU_id(rs.getInt(1));
					u.setU_name(rs.getString(2));
					u.setU_email(rs.getString(3));
					u.setU_password(rs.getString(4));
					u.setU_phn_no(rs.getInt(5));
					userList.add(u);
				}
		} catch (SQLException e) {
			System.out.println("Error");
		} finally {
			DBUtils.releaseResources();
		}
		return userList;

		// TODO Auto-generated method stub
		
	}

	@Override
	public User validate(String email, String password) {
		con = DBUtils.getConnected();
		User u= null;
		String sql = "select * from user where u_email=? and  u_password=? ;" ;
		pst = DBUtils.getPreparedStatement(sql);
		try {
			pst.setString(1, email);
			pst.setString(2, password);
			rs = pst.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					u=new User();
					u.setU_id(rs.getInt(1));
					u.setU_name(rs.getString(2));
					u.setU_email(rs.getString(3));
					u.setU_password(rs.getString(4));
					u.setU_phn_no(rs.getLong(5));
					
				
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtils.releaseResources();
		return u;
	}

	@Override
	public User getUserByName(String name) {
		con = DBUtils.getConnected();
	
		User u=new User();
		String sql = "select * from user where u_name=? ";
		pst = DBUtils.getPreparedStatement(sql);
		try {
			pst.setString(1, name);
		
			rs = pst.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					//f=new Food();
					u=new User();
					u.setU_id(rs.getInt(1));
					u.setU_email(rs.getString(3));
					u.setU_password(rs.getString(4));
					u.setU_phn_no(rs.getInt(5));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtils.releaseResources();
		return u;


	}

}
