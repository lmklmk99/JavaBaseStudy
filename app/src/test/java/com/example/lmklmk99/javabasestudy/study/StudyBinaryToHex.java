package com.example.lmklmk99.javabasestudy.study;

import org.junit.Test;

public class StudyBinaryToHex {
	@Test
	public void executeTest() {
		String binary = "1011010101";
		String Hex = "A396F96D";

		System.out.println("Binary " + binary + " To Decimal " + convertBase(2, binary));
		System.out.println("Hex " + Hex + " To Decimal " + convertBase(16, Hex));

		long result = Long.parseLong(binary, 2);
		System.out.println("Binary " + binary + " To Decimal " + result);
		result = Long.parseLong(Hex, 16);
		System.out.println("Hex " + Hex + " To Decimal " + result);
	}

	public static int convertChar(char ch) {
		int result = 0;
		if (ch >= '0' && ch <= '9') {
			result = ch - '0';
		} else if (ch >= 'A' && ch <= 'F') {
			result = 10 + (ch - 'A');
		} else if (ch >= 'a' && ch <= 'f') {
			result = 10 + (ch - 'a');
		}

		return result;
	}

	public static long convertBase(int exp, String data) {
		long result = 0;

		for (int index = data.length() - 1; index >= 0; index--) {
			int tmp = data.length() - 1 - index;
			result += Math.pow(exp, tmp) * convertChar(data.charAt(index));
		}

		return result;
	}
}
