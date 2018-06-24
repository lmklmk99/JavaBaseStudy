package com.example.lmklmk99.javabasestudy.study;

import org.junit.Test;

public class StudyAbc {
	@Test
	public void executeTest() {
		totalCombination();
	}

	private void totalCombination() {
		char data[] = {'a', 'b', 'c'};
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				for (int k = 0; k < data.length; k++) {
					String tmp = "" + data[i] + data[j] + data[k] + ", ";
					sb.append(tmp);
				}
			}
		}

		System.out.println(sb.toString().substring(0, sb.toString().length() - ", ".length()));
	}
}
