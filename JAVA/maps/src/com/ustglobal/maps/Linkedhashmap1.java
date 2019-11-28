package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class Linkedhashmap1 {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> l = new LinkedHashMap<String, Integer>();

		l.put("blore" ,560091);
		l.put("hubli" ,582201);
		l.put("lxr" ,580167);
		System.out.println(l);

		Set<String> s = l.keySet();
		for(Object key : s) {
			System.out.println("key " +key);
		}

		System.out.println("*******************************");

		Collection<Integer> c = l.values();
		for(Object o : c) {
			System.out.println("values " +o);
		}
	}
}
