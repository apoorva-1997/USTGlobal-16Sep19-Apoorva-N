package com.ustglobal.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList6 {
public static void main(String[] args) {
	ArrayList<String> a = new ArrayList<String>();
	a.add("ammu");
	a.add("appuuu");
	a.add("chinnnn");
	
	String s = a.get(0);
	System.out.println(s.toUpperCase());
	
	Iterator<String> i = a.iterator();
	while(i.hasNext()) {
		String s1 = i.next();
		System.out.println(s1);
	}
	
	System.out.println("*********list iterator************");
	
	ListIterator<String> li = a.listIterator();
	while(li.hasNext()) {
		String s2 = li.next();
		System.out.println(s2);
	}
	
	System.out.println("*******for each**********");
	
	for(String s3 : a) {
		System.out.println(s3);
	}
}
}
