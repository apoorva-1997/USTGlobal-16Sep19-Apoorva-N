package com.ustglobal.objectclass;

public class CarTest {
	public static void main(String[] args) {
		
		Car c = new Car(22, "apoo","Black");
		
		int c1 = c.hashCode();
		System.out.println(c1);
		
		String c2 = c.toString();
		System.out.println(c2);
	}
}
