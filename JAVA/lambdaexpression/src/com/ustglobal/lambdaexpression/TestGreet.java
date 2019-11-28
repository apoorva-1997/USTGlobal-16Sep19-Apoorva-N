package com.ustglobal.lambdaexpression;

public class TestGreet {
	public static void main(String[] args) {
		GreetInterface greet = (message) -> {
			System.out.println("hello");
			System.out.println(message);
			return message;
	};
	System.out.println("hi");
}
}