package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;


public class MyFirstJDBC {
	public static void main(String[] args) {
		
		Connection conn = null;
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			//Step 1 : Loading Driver
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//Step 2 : get the connection
			
			String url = "jdbc:mysql://localhost:3306/ustglobal_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
		
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

		}catch(SQLException e) {
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
			}
			catch(SQLException e) {
				e.printStackTrace();	
			}
		}

	}
}
