package com.example.lmklmk99.javabasestudy.practice.sort;

import java.util.Arrays;

import android.support.annotation.NonNull;

public class PMargeSort implements PSort {
	@Override
	public int[] executeSort(@NonNull int[] data) {
		return sort(data.clone(), 0, data.length - 1);
	}

	@Override
	public void printSort(@NonNull int[] data) {
		System.out.println("Merge Sort : " + Arrays.toString(executeSort(data)));
	}

	private int[] sort(int[] data, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int midIndex = (startIndex + endIndex) / 2;
			sort(data, startIndex, midIndex);
			sort(data, midIndex + 1, endIndex);
			marge(data, startIndex, midIndex, endIndex);
		}
		return data;
	}

	private int[] marge(int[] data, int startIndex, int midIndex, int endIndex) {
		int[] tempData = data.clone();
		int leftCurrIndex = startIndex;
		int rightCurrIndex = midIndex + 1;
		int tempIndex = startIndex;

		while(leftCurrIndex <= midIndex && rightCurrIndex <= endIndex) {
			if (tempData[leftCurrIndex] <= tempData[rightCurrIndex]) {
				data[tempIndex++] = tempData[leftCurrIndex++];
			} else {
				data[tempIndex++] = tempData[rightCurrIndex++];
			}
		}

		while(leftCurrIndex <= midIndex) {
			data[tempIndex++] = tempData[leftCurrIndex++];
		}

		return data;
	}
}
