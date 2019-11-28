package com.ustglobal.exception.first;

public class Paytm {
	void book() {
		System.out.println("Paytm started");
		IRCTC i = new IRCTC();
		i.confirm();
		System.out.println("Paytm ended");
	}
}
