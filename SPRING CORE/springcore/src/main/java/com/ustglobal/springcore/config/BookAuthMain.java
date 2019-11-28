package com.ustglobal.springcore.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.di.Book;

public class BookAuthMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class);
		Book book = context.getBean(Book.class);
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		System.out.println(book.getAuthor());
		System.out.println(book.getAuthor().getPenName());
		context.close();
	}
}
