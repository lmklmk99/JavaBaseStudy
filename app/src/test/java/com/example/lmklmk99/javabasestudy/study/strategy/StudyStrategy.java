package com.example.lmklmk99.javabasestudy.study.strategy;

import org.junit.Test;

public class StudyStrategy {
	@Test
	public void executeTest() {
		Monitor mon = new Monitor();
		Keyboard kb = new Keyboard();
		Mouse mo = new Mouse();

		Computer device1 = new Computer(mon);
		Computer device2 = new Computer(kb);
		Computer device3 = new Computer(mo);

		device1.work();
		device2.work();
		device3.work();
	}
}
