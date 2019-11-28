package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
	    try {
	    	//step 1 : load the driver
	    	Driver driver = new Driver();
	    	DriverManager.registerDriver(driver);
	    	
	    	//step 2 : get connection
	    	
	    	String url = "jdbc:mysql://localhost:3306/ustglobal_db?user=root&password=root";
	    	conn = DriverManager.getConnection(url);
	    	
	    	//step 3 : issue SQL Query
	    	String sql = "select*from employee_info";
//	    	String sql = "insert into employee_info values("+args[0]+",'"+args[1]+"',"+args[2]+",'"+args[3]+"')";
	    	stmt = conn.createStatement();
	    	int count = stmt.executeUpdate(sql);
	    	
	       //step 4 : read the results
	    	
	    	System.out.println(count + "Row(s) inserted");
	    	
	    }catch(SQLException e) {
	    	e.printStackTrace();
	    }finally {
	    	try {
	    		if(conn != null) {
	    			conn.close();
	    		}
	    		if(stmt != null) {
	    			stmt.close();
	    		}
	    	}catch(SQLException e) {
	    		e.printStackTrace();
	    	}
	    }
	}
}
