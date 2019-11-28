package com.ustglobal.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;


public class DeletePStmt{
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {  
			
			Class.forName ("com.mysql.jdbc.Driver");  //standard method

			String url = "jdbc:mysql://localhost:3306/ustglobal_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
		
			String sql ="delete from employee_info where id =?";
			pstmt = conn.prepareStatement(sql);

			String eid = args[0];
			pstmt.setInt(1, Integer.parseInt(args[0]));

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
