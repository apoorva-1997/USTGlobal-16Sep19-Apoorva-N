package com.ustglobal.collection;

import java.util.ArrayList;

public class Array {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(22.0);
	al.add("suraj");
	al.add(true);
	al.add(null);
	al.add('S');
	
	for(Object o : al) {
		System.out.println(o);
	}
}
}
