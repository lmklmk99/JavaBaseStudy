package com.example.lmklmk99.javabasestudy.study.search;

import org.junit.Test;

public class StudySearch {
	@Test
	public void executeTest() {
		Binary binSearch = new Binary();

		int[] data = getRandomNum(30);
		int[] findNum = getRandomNum(30);
		int result = binSearch.searchCnt(data, findNum[0]);
		String resultString = "Search Num : " + findNum[0];

		if (result != Search.SEARCH_FAIL) {
			resultString += " Search Cnt : " + result;
		} else {
			resultString += " Search Failed!!";
		}

		System.out.println("Base Data : " + java.util.Arrays.toString(data));
		System.out.println(resultString);
	}

	private int[] getRandomNum(int maxCnt) {
		int[] data = new int[maxCnt];

		for (int index = 0; index < data.length; index++) {
			data[index] = (int)((Math.random() * data.length));
		}

		return data;
	}
}
