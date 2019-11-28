package com.ustglobal.exception.second;

import java.io.IOException;
import java.sql.SQLException;

public class TestB {
	public static void main(String[] args) {
		System.out.println("main started");

		FileTest f = new FileTest();
		try {
			try {
				try {
					f.open();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("main ended");
	}
}
