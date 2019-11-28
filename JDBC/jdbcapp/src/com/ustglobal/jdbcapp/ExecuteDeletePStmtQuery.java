package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class ExecuteDeletePStmtQuery {
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {  

//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName ("com.mysql.jdbc.Driver");  //standard method

			String url = "jdbc:mysql://localhost:3306/ustglobal_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			String sql ="delete from employee_info where id = ?";
			pstmt = conn.prepareStatement(sql);

			String eid = args[0];
			pstmt.setInt(1, Integer.parseInt(args[0]));
			//			int id = Integer.parseInt(eid);
			//			pstmt.setInt(1, id);

			int count = pstmt.executeUpdate();
			
			System.out.println("deleted res " +count);
		}catch(Exception e ) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt !=null) {
					pstmt.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
