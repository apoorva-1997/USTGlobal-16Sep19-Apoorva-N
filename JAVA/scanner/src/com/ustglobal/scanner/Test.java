package com.ustglobal.scanner;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		System.out.println("Scanner Class");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age = sc.nextInt();
		System.out.println("Age is "+age);

		System.out.println("enter name");
		String name = sc.next();
		System.out.println("name is "+name);

	    System.out.println("are u female?");
		boolean b = sc.hasNextBoolean();
		System.out.println(b);
	}
}
