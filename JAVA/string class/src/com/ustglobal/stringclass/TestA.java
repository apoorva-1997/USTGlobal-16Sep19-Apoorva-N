package com.ustglobal.stringclass;

public class TestA {
	public static void main(String[] args) {
		
		String s1 = "Aishu";			//obj created in constant pool of heap memory
		String s2 = "Apooo";

		String s3 = new String("Aishu");
		String s4 = new String("Aishu");		//obj created in heap memory
		String s5 = "Aishu";

		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s1 == s5);
		
		System.out.println("*********************");
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));
		
		System.out.println("*********************");
		
		String s6 = s1.toLowerCase();
		System.out.println(s6);
		
		String s7 = s1.toUpperCase();
		System.out.println(s7);
		
		char c = s1.charAt(3);
		System.out.println(c);
		
		boolean b = s1.equalsIgnoreCase("AiSHu");	//check content irrespective of case
		System.out.println(b);
		
		System.out.println(s1.length());
		
		
		System.out.println("*********************");
		
		StringBuffer sb1  = new StringBuffer("Apoo");
		sb1.append("rva");
		System.out.println(sb1);
	}
}
