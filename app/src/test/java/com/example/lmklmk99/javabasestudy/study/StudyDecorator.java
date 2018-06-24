package com.example.lmklmk99.javabasestudy.study;

import org.junit.Test;

public class StudyDecorator {

	@Test
	public void executeTest() {
		Decorator deco = new Decorator();
		DecoChild deco1 = new DecoChild(deco);
		DecoChild deco2 = new DecoChild(deco1);

		System.out.println("deco said " + deco.workString());
		System.out.println("deco1 said " + deco1.workString());
		System.out.println("deco2 said " + deco2.workString());
	}

	public class Decorator {
		public String workString() {
			return "Work hard.. TT";
		}
	}

	public class DecoChild extends Decorator {

		Decorator deco;

		public DecoChild(Decorator deco) {
			this.deco = deco;
		}

		@Override
		public String workString() {
			String work = "Study and " + deco.workString();
			return work;
		}
	}
}
