package com.ustglobal.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayList7 {
public static void main(String[] args) {
	LinkedList l = new LinkedList();
	l.add(3);
	l.add(333.55);
	l.add("dvDsv");
	l.add(null);
	
	System.out.println("*******using for loop*****");
	
	for (int i=0 ; i<4;i++) {
		System.out.println(l.get(i));	
	}
	
	System.out.println("******foreach*******");
	
	for(Object o : l) {
		System.out.println(o);
	}
	
	System.out.println("iteratot");
	
	Iterator i = l.iterator(); 
	while(i.hasNext()) {
		Object o1 = i.hasNext();
		System.out.println(o1);
	}

	System.out.println("list iteratotr");
		ListIterator l1 = l.listIterator();
		while(i.hasNext()){
			Object o3 = i.hasNext();
			System.out.println(o3);
		}
		

}
}
