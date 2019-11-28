package com.ustglobal.collection;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {

	public static void main(String[] args) {

		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(2);
		l.add(4);  //sorting must ahve generics
		l.add(10);
		l.add(8);
		l.add(9);
		
		System.out.println("before sort "+l);
		Collections.sort(l);
		System.out.println("after sort "+l);
		
		Collections.reverse(l);
		System.out.println("After reverse " +l);  
		
		Collections.shuffle(l);
		System.out.println("after shuffeling "+l);
	}
}
