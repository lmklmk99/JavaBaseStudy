package com.example.lmklmk99.javabasestudy.study.search;

public class Binary extends Search {

	int searchCnt = 0;

	public Binary() {
	}

	@Override
	public int searchCnt(int[] data, int num) {
		return binarySearch(data, num, 0, data.length - 1);
	}

	private int binarySearch(int[] data, int num, int left, int right) {

		int half = (right - left) / 2;
		if (left < 0 || right > data.length - 1 || half < 0) {
			return Search.SEARCH_FAIL;
		}

		this.searchCnt++;

		if (half == 0) {
			if (data[left] != num && data[right] != num) {
				return Search.SEARCH_FAIL;
			}
		} else {
			if (data[left + half] > num) {
				this.searchCnt = binarySearch(data, num, left, left + half);
			} else if (data[left + half] < num) {
				this.searchCnt = binarySearch(data, num, left + half, right);
			}
		}

		return this.searchCnt;
	}
}
