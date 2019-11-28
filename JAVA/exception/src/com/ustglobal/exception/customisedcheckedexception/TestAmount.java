package com.ustglobal.exception.customisedcheckedexception;

public class TestAmount {
	public static void main(String[] args) {
		System.out.println("main started");
		Validator v = new Validator();
		
		try {
			v.checkAmount(50000);
			System.out.println("Withdraw your cash");
		} 
		
		catch (InvalidAmountException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("main ended");
	}
}
