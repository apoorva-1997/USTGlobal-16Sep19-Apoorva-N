package com.ustglobal.exception.first;

public class TestF {
	public static void main(String[] args) {
		
		int[] a = {10,20,30};
		String s = "HELLO";
		int b = 10;
		
		try {
			String s1 = s.toLowerCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("main ended");
	}
}

