package com.ustglobal.objectclass;

public class Test {
	public static void main(String[] args) {
		                        
		Pen p = new Pen();
		int p0 = p.hashCode();
		System.out.println("HashCode of p is "+p0);
		
		Pen p1 = new Pen();
		String s = p1.toString();
		System.out.println("toString of p1 is "+s);
		System.out.println(p);
		
  		
	}
}
