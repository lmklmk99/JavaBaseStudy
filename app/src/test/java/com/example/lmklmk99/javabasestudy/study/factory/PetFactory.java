package com.example.lmklmk99.javabasestudy.study.factory;

public class PetFactory {

	public static Pet create(String type) {

		if (type.equals("Cat")) {
			return new Cat();
		} else if (type.equals("Dog")) {
			return new Dog();
		} else if (type.equals("Bird")) {
			return new Bird();
		}

		return null;
	}
}
