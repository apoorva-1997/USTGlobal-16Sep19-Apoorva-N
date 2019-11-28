package com.ustglobal.exception.first;

public class TestB {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			b = 10/0;
			System.out.println(b);
			System.out.println("hi");
			System.out.println("hello");
		}
		catch(ArithmeticException e) {
			System.out.println("divided by zero");
		}
		
	}
}
