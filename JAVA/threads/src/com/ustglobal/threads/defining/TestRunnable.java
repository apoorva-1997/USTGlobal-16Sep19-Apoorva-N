package com.ustglobal.threads.defining;

public class TestRunnable {
	public static void main(String[] args) {

		System.out.println("main started");
		myRunnalble m = new myRunnalble();

		Thread t = new Thread();
		t.start();
		for(int i=0 ;i<10;i++) {
			System.out.println("main thread");
	}
	System.out.println("main ended");
}
}
