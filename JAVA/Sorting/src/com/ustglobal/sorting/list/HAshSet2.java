package com.ustglobal.sorting.list;

import java.util.HashSet;
import java.util.Iterator;

public class HAshSet2 {
public static void main(String[] args) {
	HashSet h = new HashSet();
	h.add("dsc");
	h.add("qefDC");
	h.add("edvg");
	
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
