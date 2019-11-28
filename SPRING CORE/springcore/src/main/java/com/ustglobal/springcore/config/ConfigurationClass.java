package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.ustglobal.springcore.Cat;
import com.ustglobal.springcore.Dog;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

@Configuration									//annotation for beans.xml
@Import(PetConfigurationClass.class)
public class ConfigurationClass {
	@Bean(name="hello")
	//@Scope("prototype")							//for prototype obj isnt destroyes
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMsg("I LOVE JAVA");
		return hello;
			
	}
//	
//	@Bean(name="dog")
//	public Dog getDog() {
//		return new Dog();
//	}
//	@Bean(name = "cat")
//	public Cat getCat() {
//		return new Cat();
//	}
	
//	@Bean(name = "pet")							//wiring
//	public Pet getPet() {
//		Pet pet = new Pet();
//		pet.setName("Boney");
//	  //pet.setAnimal(getDog());					//instead of set use autowireing in Pet class
//		return pet;
		
//	}
}

