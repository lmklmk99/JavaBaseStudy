package com.example.lmklmk99.javabasestudy.study;

import org.junit.Test;

public class StudyStrcmp {
	@Test
	public void executeTest() {
		System.out.println("strcmp(abc, cbc) result : " + strcmp("abc", "cbc"));
		System.out.println("strcmp(cbc, abc) result : " + strcmp("cbc", "abc"));
		System.out.println("strcmp(abcde, cbc) : result : " + strcmp("abcde", "cbc"));
		System.out.println("strcmp(abc, abc) result : " + strcmp("abc", "abc"));
	}

	private int strcmp(String s1, String s2) {
		int pos = 0;

		while (s1.length() > pos || s2.length() > pos) {
			if (s1.length() <= pos) {
				return 1;
			}

			if (s2.length() <= pos) {
				return -1;
			}

			if (s1.charAt(pos) > s2.charAt(pos)) {
				return 1;
			} else if (s1.charAt(pos) < s2.charAt(pos)) {
				return -1;
			} else {
				pos++;
			}
		}

		return 0;
	}
}
