package com.ustglobal.threads.properties;

public class MyThread extends Thread{

	public static void main(String[] args) {
		System.out.println("main started");
		
		String name = Thread.currentThread().getName();
		System.out.println("current thread name : " +name);
		
		MyThread m = new MyThread();
		String mname = m.getName();
		System.out.println("current thread name : " +mname);
		
		Thread.currentThread().setName("java");
		
		m.setName("apoo");
		System.out.println("thread name " +m.getName());
		
		
		System.out.println("main ended");
	}
}
