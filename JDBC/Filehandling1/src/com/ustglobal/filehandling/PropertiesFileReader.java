package com.ustglobal.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {
	public static void main(String[] args) {
		String path = "text.properties";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			Properties properties = new Properties();   //prop class implement maps
			properties.load(reader);
			
			String url = properties.getProperty("url");
			String user = properties.getProperty("user");
			String password = properties.getProperty("password");
			
			System.out.println("url is "+url);
			System.out.println("user is "+user);
			System.out.println("password is +"+password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
}
