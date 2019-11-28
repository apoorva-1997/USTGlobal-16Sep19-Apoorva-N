package com.ustglobal.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array3 {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(22.0);
	al.add("apoo");
	al.add(true);
	al.add(null);
	al.add('S');
	System.out.println("******using iterator******");
	
	
	Iterator i = al.iterator();
	while(i.hasNext()) {
		Object o = i.next();
		System.out.println(o);
	}
}
}
