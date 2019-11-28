package com.ustglobal.springcore.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

@Configuration
public class BookConfig {

	@Bean(name="book")
	public Book getBook() {
		Book book = new Book();
		book.setName("Sheldon");
		book.setPrice(800);
		book.setAuthor(getAuthor());
		return book;
	}

	@Bean(name="author")
	public Author getAuthor() {
		Author author = new Author();
		author.setName("sinney");
		author.setPenName("bright");
		return author;
	}

	@PostConstruct								//used for annotating lifecycle 
	public void init() {
		System.out.println("init method executing  from book");
	}
	@PreDestroy									//used for annotating lifecycle 
	public void destroy() {
		System.out.println("destroyed method executing  from book");
	}
}
