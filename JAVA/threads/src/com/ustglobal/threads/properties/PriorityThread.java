package com.ustglobal.threads.properties;

public class PriorityThread extends Thread{
	public static void main(String[] args) {

		System.out.println("main started");

		int p = Thread.currentThread().getPriority();
		System.out.println("main thread priority is : " +p);

		Thread.currentThread().setPriority(6);
		System.out.println("set priority "+ Thread.currentThread().getPriority());

		PriorityThread t = new PriorityThread();
		int q = t.getPriority();
		System.out.println("my thread priority : "+q);

		t.setPriority(16);
		System.out.println("preotity thread priority " +t.getPriority());
		System.out.println("main ended");
	}
}
