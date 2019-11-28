package com.ustglobal.accessmodifiers.pkg1;

public class Demo {
	private int a = 10;
	long b = 700;
	protected double c = 6.89;
	public String name = "Apooo";

	private void add() {
		System.out.println("Demo () method");
	}
	
	void sub() {
		System.out.println("sub() method");
	}
	
	protected void mul() {
		System.out.println("mul() method");
	}
	
	public void div() {
		System.out.println("div() method");
	}
}
