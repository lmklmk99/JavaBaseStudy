package com.example.lmklmk99.javabasestudy.study.sort;

public class InsertionSort extends Sort {

	private int data[];

	public int[] executeSort(int data[]) {
		this.data = (int[])data.clone();
		return insertionSort(this.data);
	}

	public int[] insertionSort(int data[]) {

		for (int index = 1; index < data.length; index++) {
			int temp = data[index];

			for (int i = index; i > 0; i--) {
				if (temp < data[i - 1]) {
					data[i] = data[i - 1];

					if (i == 1) {
						data[i - 1] = temp;
						break;
					}
				} else {
					data[i] = temp;
					break;
				}
			}
		}

		return data;
	}

}
