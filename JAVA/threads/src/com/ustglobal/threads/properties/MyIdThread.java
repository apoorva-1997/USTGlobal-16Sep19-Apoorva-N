package com.ustglobal.threads.properties;

public class MyIdThread extends Thread{
	public static void main(String[] args) {
		
		System.out.println("main started");
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread i = new MyIdThread();
		System.out.println("my id thread : " +i.getId());
		
		System.out.println("main ended");
	}
}
