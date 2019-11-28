package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class Treemap1 {
public static void main(String[] args) {
	 
	TreeMap<String, Integer> t = new TreeMap<String, Integer>();
	
	t.put("hubli" ,560091);
	t.put("blore" ,582201);
	t.put("lxr" ,580167);
	System.out.println(t);
	
//	t.put(null,9685);    			//cant add null
	
	for(Map.Entry<String, Integer> m : t.entrySet()) {
		String s = m.getKey();
		System.out.println("key is "+s);
		
		Integer i = m.getValue();
		System.out.println("value is "+i);
	}
}
}
