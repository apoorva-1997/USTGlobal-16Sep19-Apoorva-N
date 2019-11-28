package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
public static void main(String[] args) {
	TreeSet t = new TreeSet();
	t.add(213);  //only generics are allowed ,sorting mentained
	t.add(67);
	t.add(38);
	t.add(67);
	t.add(87);
	

	System.out.println("*********************for looop");
	for(Object o : t) {
		System.out.println(o);
	}

	System.out.println("*********************Iterator");
	Iterator i = t.iterator();
	while(i.hasNext()) {
		Object o1 = i.next();
		System.out.println(o1);
	}
}
}
