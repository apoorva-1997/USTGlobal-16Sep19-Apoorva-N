package com.ustglobal.singleton;

public class MySingleton {
	
	private final static MySingleton instance = new MySingleton();    
	String s;
	
	private MySingleton () {

	}
	public static MySingleton getDbConnection() {
		return instance;
	}
}

