package com.ustglobal.lambdaexpression;

public class TestMultiply {
	public static void main(String[] args) {
		MultiplyInterface multi = (a,b) -> a*b;
		int pro = multi.multiply(20,10);
		System.out.println("Product is "+pro);

	}
}
