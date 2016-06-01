package com.svist.TravelKhana.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.svist.TravelKhana.beans.Food;
import com.svist.TravelKhana.beans.Location;
import com.svist.TravelKhana.beans.Order1;

public class LocationUtilsImp implements LocationUtils {
 
	static Connection con = null;
	static Statement st = null;
	static PreparedStatement pst = null;
	static ResultSet rs = null;
	
	@Override
	public boolean addLocation(Location l) {
		
		
		boolean added = false;
		int res = 0;
		con = DBUtils.getConnected();
		String sql = "insert into location values(?,?)";
		pst = DBUtils.getPreparedStatement(sql);
		try {
				
			pst.setInt(1, l.getL_id());
			pst.setString(2, l.getL_name());
		
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
	public Location getLocation(int id) {
		con = DBUtils.getConnected();
		Location o= new Location();
		String sql = "select * from location where L_id=? ";
		pst = DBUtils.getPreparedStatement(sql);
		try {
			pst.setInt(1, id);
		
			rs = pst.executeQuery();
			if (rs != null) {
				while (rs.next()) {
				o.setL_name(rs.getString(2));
			
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtils.releaseResources();
		return o;

	}


	@Override
	public List<Location> getAllLocation() {
		Location l = null;
		List<Location> locationList = new ArrayList<Location>();
		
		con = DBUtils.getConnected();
		String sql = "select * from location;";
				
		pst = DBUtils.getPreparedStatement(sql);
		try {
			
			rs = pst.executeQuery();
			if (rs != null)
				while (rs.next()) {
					l=new Location();
					l.setL_id(rs.getInt(1));
					l.setL_name(rs.getString(2));
					
					locationList.add(l);
				}
		} catch (SQLException e) {
			System.out.println("Error");
		} finally {
			DBUtils.releaseResources();
		}
		return locationList;

	}

	@Override
	public Location getLocationId(String name) {
		con = DBUtils.getConnected();
		Location o= new Location();
		String sql = "select * from location where l_name=? ";
		pst = DBUtils.getPreparedStatement(sql);
		try {
		
			pst.setString(1,name);
			rs = pst.executeQuery();
			
			if (rs != null) {
				while (rs.next()) {
				
					o.setL_id(rs.getInt(1));
					
			
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtils.releaseResources();
		return o;
	}

}
