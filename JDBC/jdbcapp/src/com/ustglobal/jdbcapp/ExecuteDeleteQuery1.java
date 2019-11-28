package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class ExecuteDeleteQuery1 {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		FileReader reader = null;
		
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);

			Class.forName("driver-class-name");
			
			String url =prop.getProperty("url"); 
			conn = DriverManager.getConnection(url,prop);
		
		
		
			String sql = "delete-query";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			System.out.println("deleted res " +count);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (conn!= null) {
					conn.close();
				}
				if (stmt!=null) {
					stmt.close();
				}
				if(reader!= null) {
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
