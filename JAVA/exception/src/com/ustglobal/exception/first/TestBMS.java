package com.ustglobal.exception.first;

public class TestBMS {
public static void main(String[] args) {
	System.out.println("BMS started");
	TestPVR p = new TestPVR();
	try {
		p.book();
		System.out.println("booking confirmed");
	}
	catch(ArithmeticException ae){
		System.out.println("booking failed");
		}
	System.out.println("BMS ended");
}
}
