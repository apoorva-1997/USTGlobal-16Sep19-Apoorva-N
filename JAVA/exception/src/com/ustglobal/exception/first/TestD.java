package com.ustglobal.exception.first;

public class TestD {
	public static void main(String[] args) {
		
		int []  a = {10,20,30};
		int b = 10;
		
		try {
			System.out.println(b/0);
		}
		catch(ArithmeticException e) {
			System.out.println("divided by zero");
		}
		
		try {
			System.out.println(a[2]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array index not present");
		}
	}
}
