package com.ustglobal.threads.defining;

public class ThreadTest {
	public static void main(String[] args) {

		System.out.println("main started ");
		MytThread m = new MytThread();
		
		/*
		 * Dont call run() method it behaves like normal prgm all code will execute
		 * insithread only
		 */
//		m.run();
		
		m.start(); 									/* IllegalThreadStateException is occured */
		m.start();
		for(int i =0;i<10;i++) {
			System.out.println("main thread");
		}
	
		System.out.println("main ended ");
	}
}
