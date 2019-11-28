package com.ustglobal.maps;

import java.util.HashMap;

public class Map2 {
	public static void main(String[] args) {

		HashMap h = new HashMap();
		h.put("aanu", 324);
		h.put("maanu",9038);
		h.put("monaaa", 93498);

		HashMap h1 = new HashMap();
		h1.put("karthik", 214);
		h1.put("chand",4234);
		h1.put("anand",35254);

		boolean hashKey = h.containsKey("aanu");
		System.out.println("has key " +hashKey);  

		boolean hashvalue = h.containsValue(343);
		System.out.println("has value " +hashvalue);

		h.putAll(h1);								//to add all values of one hashmap to other
		System.out.println("after put all " +h);

		System.out.println(h.size());

		System.out.println(h.isEmpty());
		
		h.clear();
		System.out.println("after clear" +h);

	}
}
