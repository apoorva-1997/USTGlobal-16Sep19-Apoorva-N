 package com.ustglobal.singleton;

public class Test {
public static void main(String[] args) {
	
	MySingleton m = MySingleton.getDbConnection();
	m.s = "helo";
	System.out.println(m.hashCode());
	
	MySingleton s = MySingleton.getDbConnection();
	s.s ="hi";;
	System.out.println(s.hashCode());
	System.out.println(m.s);
	System.out.println(s.s);
}
}
