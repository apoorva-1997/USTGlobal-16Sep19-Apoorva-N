package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuery1 {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		FileReader reader = null;
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);

			Class.forName("com.mysql.jdbc.Driver");
			
			String url =prop.getProperty("url"); 
			conn = DriverManager.getConnection(url,prop);
		
		
			
			String sql = "update employee_info set name ='ammu',salary = 45000, gender = 'f' where id = 1";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			System.out.println("updated res " +count);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(reader!=null) {
					reader.close();
				}
			}catch(Exception e ) {
				e.printStackTrace();
			}
		}
	}
}
