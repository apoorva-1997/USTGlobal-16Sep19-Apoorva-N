package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
public static void main(String[] args) {
	TreeSet<String> t = new TreeSet<String>();
	t.add("anu");  //only generics are allowed ,sorting mentained
	t.add("Sush");
	t.add("deeps");
	t.add("kruths");
	t.add("menus");
	

	System.out.println("*********************for looop");
	for(String o : t) {
		System.out.println(o);
	}

	System.out.println("*********************Iterator");
	Iterator<String> i = t.iterator();
	while(i.hasNext()) {
		String o1 = i.next();
		System.out.println(o1);
	}
}
}
