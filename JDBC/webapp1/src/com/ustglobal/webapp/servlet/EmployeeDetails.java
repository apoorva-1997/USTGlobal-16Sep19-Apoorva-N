package com.ustglobal.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;

public class EmployeeDetails extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/eform"); 
		dispatcher.forward(req, resp);
	
		PrintWriter out = resp.getWriter(); 
		resp.setContentType("text/html");
		out. println("<html>");
		out.println("<body>");
		
		String eid = req.getParameter("id");
		int id = Integer.valueOf(eid);
		Connection conn = null;
		Statement stmt = null;
	    try {
	    	Driver driver = new Driver();
	    	DriverManager.registerDriver(driver);
	    	
	    	
	    	String url = "jdbc:mysql://localhost:3306/ustglobal_db?user=root&password=root";
	    	conn = DriverManager.getConnection(url);
	    	
	    	
	    	String sql = "select*from employee_info";
	    	stmt = conn.createStatement();
	    	int count = stmt.executeUpdate(sql);
	    	
	    	
	    	out.println(count + "Row(s) inserted");
	    	
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
