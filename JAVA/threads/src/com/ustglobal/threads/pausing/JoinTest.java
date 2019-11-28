package com.ustglobal.threads.pausing;

public class JoinTest {
	public static void main(String[] args) {
		System.out.println("main started");

		MyJoinThread m = new MyJoinThread();
		m.start();
		try {
			m.join(1000);			//after completion of child thread main thread waits
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
		System.out.println("main ended");
	}
}
