package com.example.lmklmk99.javabasestudy.practice.sort;

import java.util.Arrays;

import android.support.annotation.NonNull;

public class PQuickSort implements PSort {
	@Override
	public int[] executeSort(@NonNull int[] data) {
		return sort(data.clone(), 0, data.length -1);
	}

	@Override
	public void printSort(@NonNull int[] data) {
		System.out.println("Quick Sort : " + Arrays.toString(executeSort(data)));
	}

	private int[] sort(int[] data, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int leftCurrIndex = startIndex;
			int rightCurrIndex = endIndex;
			int pivot = data[startIndex];

			while (leftCurrIndex < rightCurrIndex) {

				while (data[rightCurrIndex] > pivot && leftCurrIndex < rightCurrIndex) {
					rightCurrIndex--;
				}

				while (data[leftCurrIndex] <= pivot && leftCurrIndex < rightCurrIndex) {
					leftCurrIndex++;
				}

				int temp = data[leftCurrIndex];
				data[leftCurrIndex] = data[rightCurrIndex];
				data[rightCurrIndex] = temp;
			}

			data[startIndex] = data[leftCurrIndex];
			data[leftCurrIndex] = pivot;

			sort(data, startIndex, leftCurrIndex - 1);
			sort(data, leftCurrIndex + 1, endIndex);
		}

		return data;
	}
}
