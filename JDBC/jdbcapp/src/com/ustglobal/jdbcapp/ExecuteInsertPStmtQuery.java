package com.ustglobal.jdbcapp;

import java.sql.*;
import com.mysql.jdbc.Driver;

public class ExecuteInsertPStmtQuery {
	public static void main(String[] args) {
		
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
	    try {
	    	//step 1 : load the driver
	    	Driver driver = new Driver();
	    	DriverManager.registerDriver(driver);
	    	
	    	//step 2 : get connection
	    	
	    	String url = "jdbc:mysql://localhost:3306/ustglobal_db?user=root&password=root";
	    	conn = DriverManager.getConnection(url);
	    	
	    	//step 3 : issue SQL Query
	    	
	    	String sql = "insert into employee_info values(?,?,?,?)";
//	    	stmt = conn.createStatement();
//	    	int count = stmt.executeUpdate(sql);
	    	pstmt = conn.prepareStatement(sql);  // run using run configuration

	    	String id = args[0];
	    	int eid = Integer.parseInt(id);      //Parsing must be done as pstmt accept only string args
	    	pstmt.setInt(1, eid);
	    	
	    	String name = args[1];
	    	pstmt.setString(2, name);
	    	
	    	String salary = args[2];
	    	int sal = Integer.parseInt(salary);
	    	pstmt.setInt(3,sal);
	    	
	    	String gender = args[3];
	    	pstmt.setString(4,gender);
	    	
	    	int count = pstmt.executeUpdate(); //should not pass  sql query as it is passed while creating pstmt
	    	
	       //step 4 : read the results
	    	
	    	System.out.println(count + "Row(s) inserted");
	    	
	    }catch(SQLException e) {
	    	e.printStackTrace();
	    }finally {
	    	try {
	    		if(conn != null) {
	    			conn.close();
	    		}
//	    		if(stmt != null) {
//	    			stmt.close();
//	    		}
	    		if(pstmt != null) {
	    			pstmt.close();
	    		}
	    	}catch(SQLException e) {
	    		e.printStackTrace();
	    	}
	    }
	}
}
