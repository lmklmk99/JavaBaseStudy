package com.example.lmklmk99.javabasestudy.practice.sort;

import java.util.Arrays;

import android.support.annotation.NonNull;

public class PSelectionSort implements PSort {
	@Override
	public int[] executeSort(@NonNull int[] data) {
		return sort(data.clone());
	}

	@Override
	public void printSort(@NonNull int[] data) {
		System.out.println("Selection Sort : " + Arrays.toString(executeSort(data)));
	}

	private int[] sort(int[] data) {
		for (int pivotIndex = 0; pivotIndex < data.length; pivotIndex++) {
			int pivot = data[pivotIndex];
			int smallIndex = pivotIndex;

			for (int index = pivotIndex; index < data.length; index++) {
				if (data[smallIndex] > data[index]) {
					smallIndex = index;
				}
			}

			if (smallIndex > pivotIndex) {
				data[pivotIndex] = data[smallIndex];
				data[smallIndex] = pivot;
			}
		}

		return data;
	}
}
