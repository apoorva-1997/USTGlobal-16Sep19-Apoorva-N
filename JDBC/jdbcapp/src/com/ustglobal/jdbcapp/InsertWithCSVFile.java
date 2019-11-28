package com.ustglobal.jdbcapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class InsertWithCSVFile {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/ustglobal_db?user=root&password=root";
		String sql = "insert into employee_info values(?,?,?,?)";
		try(FileReader in = new FileReader("csv.txt");
				BufferedReader reader = new BufferedReader(in);
				Connection conn = DriverManager.getConnection(url);
				PreparedStatement pstmt = conn.prepareStatement(sql);)	{
			while(reader.ready()) {
				String line =reader.readLine();
				String [] datas = line.split(",");
				int id = Integer.parseInt(datas[0]);
				String name = datas[1];
				int sal = Integer.parseInt(datas[2]);
				String gender = datas[3];

				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, sal);
				pstmt.setString(4, gender);

//				int count = pstmt.executeUpdate();
//				System.out.println("rows insertes "+count);  		//cant insert large amt of data by this way as it hits db every time
				
				pstmt.addBatch();		//insert data once and hit db once 
			}
			int [] counts = pstmt.executeBatch();
			System.out.println("rows inserted "+counts.length);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
