package com.example.lmklmk99.javabasestudy.study.factory;

import org.junit.Test;

public class StudyFactory {
	@Test
	public void executeTest() {
		Pet pet1 = PetFactory.create("Bird");
		Pet pet2 = PetFactory.create("Cat");
		Pet pet3 = PetFactory.create("Dog");

		pet1.call();
		pet2.call();
		pet3.call();
	}
}
