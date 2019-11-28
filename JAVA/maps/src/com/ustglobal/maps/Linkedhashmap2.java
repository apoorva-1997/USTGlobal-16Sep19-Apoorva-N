package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap2 {
	public static void main(String[] args) {
		
		
		LinkedHashMap<String,Integer> l = new LinkedHashMap<String, Integer>();

		l.put("blore" ,560091);
		l.put("hubli" ,582201);
		l.put("lxr" ,580167);
		System.out.println(l);
		
		for(Map.Entry<String ,Integer> m : l.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key = " +key+"..." +"values is " +value);
		}
		}
}
