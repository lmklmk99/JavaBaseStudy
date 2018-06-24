package com.example.lmklmk99.javabasestudy.study.singleton;

import org.junit.Test;

public class StudySingleton {
	@Test
	public void executeTest() {
		CallObject c1 = new CallObject();
		CallObject c2 = new CallObject();

		System.out.print("c1 : ");
		c1.callCount();

		System.out.print("c2 : ");
		c2.callCount();

		System.out.print("c1 : ");
		c1.callCount();

		System.out.print("c2 : ");
		c2.callCount();

		System.out.print("c1 : ");
		c1.callCount();
	}

}
