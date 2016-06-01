package com.svist.TravelKhana.utils;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class DBUtils {
	static Connection con = null;
	static Statement st = null;
	static PreparedStatement pst = null;
	static ResultSet rs = null;
	
	
	// establish Connection
	
	
	public static Connection getConnected() {
		String user = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/travelkhana";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	// get Statement 

	public static Statement getStatement() {
		try {
			st = (Statement) con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return st;
	}
	
	// Prepare Statement

	public static PreparedStatement getPreparedStatement(String sql) {
		try {
			pst = (PreparedStatement) con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pst;
	}

	// release resource 
	public static void releaseResources() {
		try {
			if (rs != null)
				rs.close();
			if (pst != null)
				pst.close();
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
