package com.ustglobal.exception.first;

public class TestE {
	public static void main(String[] args) {
		int[] a = {10,20,30};
		String s = "hello";
		int b = 10;
		try {
			String s1 = s.toLowerCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);
			
		}
		catch(NullPointerException npe) {
			System.out.println("dont use null");
		}
		catch(ArithmeticException e) {
			System.out.println("divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("out of index");
		}
	}
}

