package com.example.lmklmk99.javabasestudy.practice.sort;

import java.util.Arrays;

import android.support.annotation.NonNull;

public class PBubbleSort implements PSort {
	@Override
	public int[] executeSort(@NonNull int[] data) {
		return sort(data.clone());
	}

	@Override
	public void printSort(@NonNull int[] data) {
		System.out.println("Bubble Sort : " + Arrays.toString(executeSort(data)));
	}

	private int[] sort(int[] data) {
		for (int count = 0; count < data.length; count++) {
			for (int index = 0; index < data.length - 1; index++) {
				if (data[index] > data[index + 1]) {
					int temp = data[index];
					data[index] = data[index + 1];
					data[index + 1] = temp;
				}
			}
		}

		return data;
	}
}
