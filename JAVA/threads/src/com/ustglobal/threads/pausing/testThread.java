package com.ustglobal.threads.pausing;

public class testThread {
public static void main(String[] args) {
	
	System.out.println("started ");
	
	MyThread t =new MyThread();
	t.start();
	
	for(int i =0;i<10;i++) {
		System.out.println("mainthread started");
	}
	System.out.println("ended ");}

}
