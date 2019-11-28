package com.ustglobal.springcore.di;

import org.springframework.stereotype.Component;
import com.ustglobal.springcore.di.Animal;

@Component("cat")

public class Cat implements Animal{

	@Override
	public void makeSound() {
		System.out.println("meowwwwwwwwwwwwwwwwwwwww");
	}

}
