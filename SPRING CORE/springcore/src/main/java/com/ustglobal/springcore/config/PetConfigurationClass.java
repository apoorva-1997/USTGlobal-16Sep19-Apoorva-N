package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.springcore.Cat;
import com.ustglobal.springcore.Dog;
import com.ustglobal.springcore.di.Pet;

@Configuration
public class PetConfigurationClass {

	@Bean(name="dog")
	public Dog getDog() {
		return new Dog();
	}
	@Bean(name = "cat")
	public Cat getCat() {
		return new Cat();
	}
	
	@Bean(name = "pet")							//wiring
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Boney");
	  //pet.setAnimal(getDog());					//instead of set use autowireing in Pet class
		return pet;
}
}