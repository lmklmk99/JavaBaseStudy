package com.example.lmklmk99.javabasestudy.study.search;

import org.junit.Test;

public class StudySearch {
	@Test
	public void executeTest() {
		Binary binSearch = new Binary();

		int[] data = getArrayNum(30);
		int findNum = getRandomNum(30);
		int result = binSearch.searchCnt(data, findNum);
		String resultString = "Search Num : " + findNum;

		if (result != Search.SEARCH_FAIL) {
			resultString += " Search Cnt : " + result;
		} else {
			resultString += " Search Failed!!";
		}

		System.out.println(resultString);
	}

	private int[] getArrayNum(int maxCnt) {
		int[] data = new int[maxCnt];

		for (int index = 0; index < data.length; index++) {
			data[index] = index + 1;
		}

		return data;
	}

	private int getRandomNum(int maxCnt) {
		return (int)(Math.random() * maxCnt);
	}
}
