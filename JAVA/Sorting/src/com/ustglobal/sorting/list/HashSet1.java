package com.ustglobal.sorting.list;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
public static void main(String[] args) {
	HashSet h = new HashSet();
	h.add(23);
	h.add("weg");
	h.add(null);
	h.add(43.9);
	h.add(true);
	h.add("weg");
	
	System.out.println("************for*********");
	
	for(Object o :h) {
		System.out.println(o);
	}
	
	System.out.println("********iterator********");
	Iterator i = h.iterator();
	while(i.hasNext()) {
		Object o = i.next();
		System.out.println(o);
	}
}
}
