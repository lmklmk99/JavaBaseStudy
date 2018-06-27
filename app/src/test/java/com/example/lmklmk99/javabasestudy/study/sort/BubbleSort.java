package com.example.lmklmk99.javabasestudy.study.sort;

public class BubbleSort extends Sort {

	private int data[];

	public int[] executeSort(int data[]) {
		this.data = (int[])data.clone();
		return bubbleSort(this.data);
	}

	private int[] bubbleSort(int data[]) {

		boolean continueFlag = false;

		for (int index = 0; index < data.length - 1; index++) {
			if (data[index] > data[index + 1]) {
				int temp = data[index];
				data[index] = data[index + 1];
				data[index + 1] = temp;
				continueFlag = true;
			}
		}

		if (continueFlag == true) {
			bubbleSort(data);
		}

		return data;
	}
}
