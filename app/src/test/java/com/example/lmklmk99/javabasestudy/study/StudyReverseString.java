package com.example.lmklmk99.javabasestudy.study;

import java.util.StringTokenizer;

import org.junit.Test;

public class StudyReverseString {
	@Test
	public void executeTest() {
		String data = "do or do not. there is no try";
		System.out.println(reverseString(data));
		System.out.println(reverseStringByTokenizer(data));
	}

	public static String reverseString(String string) {
		String returnBuf = "";
		String token = "";

		for (int index = 0; index < string.length(); index++) {
			if (string.charAt(index) == ' ') {
				returnBuf = token + " " + returnBuf;
				token = "";
			} else {
				token = token + string.charAt(index);
			}
		}

		returnBuf = token + " " + returnBuf;
		return returnBuf;
	}

	public static String reverseStringByTokenizer(String string) {
		StringTokenizer token = new StringTokenizer(string);
		StringBuffer reBuffer = new StringBuffer();

		while (token.hasMoreTokens()) {
			reBuffer.insert(0, token.nextToken() + " ");
		}

		return reBuffer.toString();
	}
}
