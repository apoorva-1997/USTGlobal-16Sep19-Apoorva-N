package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteUpdatePStmtQuery {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		 
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ustglobal_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			String sql = "update employee_info set name =?,salary = ?, gender = ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			
			String eid = args[0];
			int id = Integer.parseInt(eid);
			
			String name = args[1];
			
			String sal = args[2];
			int salary = Integer.parseInt(sal);
			
			String gender = args[3];
			
			pstmt.setInt(4, id);   //4 becoz as question mark is at 4
			pstmt.setString(1,name);  //1 becoz of question mark position 
			pstmt.setInt(2, salary);
			pstmt.setString(3, gender);
			
			int count = pstmt.executeUpdate();
			
			System.out.println("updated res " +count);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch(SQLException e ) {
				e.printStackTrace();
			}
		}
	}
}

