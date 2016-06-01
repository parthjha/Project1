package com.svist.TravelKhana.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.svist.TravelKhana.beans.Order1;
import com.svist.TravelKhana.beans.Train;



public class TrainUtilsImp implements TrainUtils {

	static Connection con = null;
	static Statement st = null;
	static PreparedStatement pst = null;
	static ResultSet rs = null;
	
	@Override
	public boolean addTrain(Train t) {
		
		boolean added = false;
		int res = 0;
		con = DBUtils.getConnected();
		String sql = "insert into train values(?,?,?,?)";
		pst = DBUtils.getPreparedStatement(sql);
		try {

			pst.setInt(1,t.getT_id());
			pst.setString(2, t.getT_name());
			pst.setString(3, t.getT_source());
			pst.setString(4, t.getT_destination());

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
	public Train getTrain(int id) {

		con = DBUtils.getConnected();
		Train t= null;
		String sql = "select * from Train where t_id=? ";
		pst = DBUtils.getPreparedStatement(sql);
		try {
			pst.setInt(1, id);
		
			rs = pst.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					t=new Train();
					t.setT_name(rs.getString(2));
					t.setT_source(rs.getString(3));
					t.setT_destination(rs.getString(4));
				
					
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtils.releaseResources();
		return t;
	}

	@Override
	public List<Train> getAllTrain() {
		Train t= null;
		List<Train> trainList = new ArrayList<Train>();
		con = DBUtils.getConnected();
		String sql = "select * from train;";
				
		pst = DBUtils.getPreparedStatement(sql);
		try {
			
			rs = pst.executeQuery();
			if (rs != null)
				while (rs.next()) {
					t=new Train();
					t.setT_id(rs.getInt(1));
					t.setT_name(rs.getString(2));
					t.setT_source(rs.getString(3));
					t.setT_destination(rs.getString(4));
					trainList.add(t);
				}
		} catch (SQLException e) {
			System.out.println("Error");
		} finally {
			DBUtils.releaseResources();
		}
		return trainList;

	}

	
	
}
