package com.example.lmklmk99.javabasestudy.study;

import org.junit.Test;

public class StudyRadian {

	@Test
	public void executeTest() {
		drawArc(90);
	}

	private void drawArc(double r) {

		double x = 0;
		double y = 0;

		while (x <= 90) {
			y = Math.sqrt((r * r) - (x * x));
			System.out.println("X : " + x + " Y : " + y);
			x++;
		}
	}
}
