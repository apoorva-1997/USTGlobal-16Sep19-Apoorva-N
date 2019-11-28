package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

import com.mysql.jdbc.Driver;


public class first {
	public static void main(String[] args) {
		
		Connection conn = null;
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;
		try {
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			
			//Step 2 : get the connection
			
//			String url = "jdbc:mysql://localhost:3306/ustglobal_db?user=root&password=root";
			
			String url =prop.getProperty("url"); 
			conn = DriverManager.getConnection(url,prop);
		
			//Step 3 : Issue SQL Query
			
			stmt = conn.createStatement();
			String sql = "select * from employee_info where id = 1";
			rs = stmt.executeQuery(sql);
			
			//Step 4 : Read the result
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int salary = rs.getInt("salary");
				String gender = rs.getString("gender");

				System.out.println("id : " +id);
				System.out.println("name : " +name);
				System.out.println("salary : " +salary);
				System.out.println("gender : " +gender);
				System.out.println("*****************************");
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//Step 5 : Close all JDBC Objects   
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
				if(reader!=null) {
					reader.close();
				}
			}
			catch(Exception e) {
				e.printStackTrace();	
			}
		}

	}
}

