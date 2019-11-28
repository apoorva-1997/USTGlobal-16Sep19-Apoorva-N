package com.ustglobal.exception.first;

public class TestA {
	public static void main(String[] args) {
		int[] a = {10,20,30};

		System.out.println(a[1]);
		System.out.println(a[2]);
		try {
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index not present");
		}

	}
}
