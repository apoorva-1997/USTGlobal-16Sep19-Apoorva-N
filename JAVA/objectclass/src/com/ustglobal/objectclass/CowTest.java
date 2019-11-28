package com.ustglobal.objectclass;

public class CowTest {
	public static void main(String[] args) {
		Cowboolean c1 = new Cowboolean(1, "ganga", 20000);
		Cowboolean c2 = new Cowboolean(2, "gouri", 30000);
		Cowboolean c3 = new Cowboolean(1, "ganga", 20000);
		Cowboolean c4 = c3;
		boolean isEqual = c1.equals(c2);
		System.out.println(c1.equals(c3));
		System.out.println(c3.equals(c4));
		System.out.println(c3.equals(c2));

	}
}
