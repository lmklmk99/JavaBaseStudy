package com.example.lmklmk99.javabasestudy.practice.sort;

import java.util.Arrays;

import android.support.annotation.NonNull;

public class PInsertionSort implements PSort {
	@Override
	public int[] executeSort(@NonNull int[] data) {
		return sort(data.clone());
	}

	@Override
	public void printSort(@NonNull int[] data) {
		System.out.println("Insertion Sort : " + Arrays.toString(executeSort(data)));
	}

	private int[] sort(int[] data) {
		for (int pivotIndex = 1; pivotIndex < data.length; pivotIndex++) {
			int pivot = data[pivotIndex];

			for (int index = pivotIndex; index > 0; index--) {
				if (data[index - 1] > pivot) {
					data[index] = data[index - 1];

					if (index == 1) {
						data[index - 1] = pivot;
						break;
					}
				} else {
					data[index] = pivot;
					break;
				}
			}
		}

		return data;
	}
}
