package com.example.lmklmk99.javabasestudy.study.sort;

import org.junit.Test;

public class StudySort {
	@Test
	public void executeTest() {
		int data[] = {5, 8, 6, 1, 2, 4, 3, 9, 8, 2, 4};

		Sort bubbleSort = new BubbleSort();
		Sort insertSort = new InsertionSort();
		Sort margeSort = new MargeSort();
		Sort quickSort = new QuickSort();

		System.out.println(" data   = { " + getStringForInteger(data) + " }");

		System.out.println(" bubble = { " + getStringForInteger(bubbleSort.excuteSort(data)) + " }");
		System.out.println(" insert = { " + getStringForInteger(insertSort.excuteSort(data)) + " }");
		System.out.println(" marge  = { " + getStringForInteger(margeSort.excuteSort(data)) + " }");
		System.out.println(" quick  = { " + getStringForInteger(quickSort.excuteSort(data)) + " }");
	}

	public String getStringForInteger(int data[]) {
		StringBuffer sb = new StringBuffer();

		for (int index = 0; index < data.length; index++) {
			sb.append(Integer.toString(data[index]));
			if (index < data.length - 1) {
				sb.append(", ");
			}
		}

		return sb.toString();
	}
}
