package com.example.lmklmk99.javabasestudy.study;

import org.junit.Test;

public class StudyDuplicate {

	@Test
	public void executeTest() {
		System.out.println(getUniCharByNode("total"));
		System.out.println(getUniCharByNode("teeter"));
		System.out.println(getUniCharByNode("teeterr"));
		System.out.println("");
		System.out.println(getUniqueChar("total"));
		System.out.println(getUniqueChar("teeter"));
		System.out.println(getUniqueChar("teeterr"));
	}

	private String getUniCharByNode(String str) {
		int strData[] = new int[26];
		String resultStr = "";

		for (int index = 0; index < str.length(); index++) {
			int charInt = str.charAt(index) - 'a';
			strData[charInt] += 1;
		}

		for (int index = 0; index < str.length(); index++) {
			int charInt = str.charAt(index) - 'a';

			if (strData[charInt] == 1) {
				resultStr += str.charAt(index);
			}
		}

		return resultStr.length() > 0 ? resultStr : "Search fail!";
	}

	private String getUniqueChar(String str) {
		String resultStr = "";
		String cmpStr;
		String prevStr = "";
		String nextStr = str;

		for (int index = 0; index < str.length(); index++) {
			cmpStr = str.substring(index, index + 1);
			prevStr = str.substring(0, index);
			nextStr = str.substring(index + 1);

			if ((!prevStr.contains(cmpStr)) && (!nextStr.contains(cmpStr))) {
				resultStr += cmpStr;
			}
		}

		return resultStr.length() > 0 ? resultStr : "Search fail!";
	}
}
