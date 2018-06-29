package com.example.lmklmk99.javabasestudy.practice.sort;

import java.util.Arrays;

import org.junit.Test;

public class TestPSort {

	@Test
	public void testSort() {
		int[] data = getRandomData(5);

		PSort bubble = new PBubbleSort();
		PSort insertion = new PInsertionSort();
		PSort selection = new PSelectionSort();
		PSort merge = new PMargeSort();
		PSort quick = new PQuickSort();

		System.out.println("Low Data : " + Arrays.toString(data));

		bubble.printSort(data);
		insertion.printSort(data);
		selection.printSort(data);
		merge.printSort(data);
		quick.printSort(data);
	}

	private int[] getRandomData(int size) {
		int[] data = new int[size];

		for (int index = 0; index < data.length; index++) {
			data[index] = (int)(Math.random() * data.length);
		}

		return data;
	}
}
