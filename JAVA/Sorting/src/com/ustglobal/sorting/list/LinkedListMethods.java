package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class LinkedListMethods {
public static void main(String[] args) {
	
	LinkedList<Integer> l = new LinkedList<Integer>();
	l.add(20);
	l.add(4);
	l.add(5);
	l.add(1);
	
	Integer peekElement = l.peek();
	System.out.println("peek ele "+peekElement);
	
	Integer peekFirstElement = l.peekFirst();
	System.out.println("peek first ele "+peekFirstElement);
	
	Integer peekLastElement = l.peekLast();
	System.out.println("peek last ele "+peekLastElement);
	
	System.out.println("*******after peek " +l);
	
	Integer poole = l.poll();
	System.out.println("pool ele "+poole);
	
	Integer poole1 = l.pollFirst();
	System.out.println("pool first ele "+poole1);
	
	Integer poole2 = l.pollLast();
	System.out.println("pool last ele "+poole2);
	
	System.out.println("********after pool " +l);

	l.push(12);
	System.out.println("after push " +l);
	
	Integer p = l.pop();
	System.out.println();
	System.out.println("after pop "+l);
}
}
