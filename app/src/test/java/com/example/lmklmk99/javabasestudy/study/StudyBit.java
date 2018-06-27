package com.example.lmklmk99.javabasestudy.study;

import org.junit.Test;

public class StudyBit {

	@Test
	public void executeTest() {
		System.out.println("Value 4 is TwoPow : " + checkTwoPow(4));
		System.out.println("Value 5 is TwoPow : " + checkTwoPow(5));
	}

	private boolean checkTwoPow(int value) {
		int cnt = 0;

		while (value > 0) {
			cnt += (value & 1);
			value = value >> 1;

			if (cnt > 1) {
				return false;
			}
		}

		return true;
	}
}
