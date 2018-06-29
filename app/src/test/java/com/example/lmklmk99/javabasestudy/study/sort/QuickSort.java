package com.example.lmklmk99.javabasestudy.study.sort;

public class QuickSort extends Sort {

	int data[];

	public int[] executeSort(int[] data) {
		this.data = (int[])data.clone();
		return quickSort(data, 0, data.length - 1);
	}

	public int[] quickSort(int[] data, int left, int right) {
		if (left < right) {
			int pivot = data[left];
			int leftPos = left;
			int rightPos = right;

			while (leftPos < rightPos) {
				while ((data[rightPos] > pivot) && (leftPos < rightPos)) {
					rightPos--;
				}

				while ((data[leftPos] <= pivot) && (leftPos < rightPos)) {
					leftPos++;
				}

				int temp = data[leftPos];
				data[leftPos] = data[rightPos];
				data[rightPos] = temp;
			}

			data[left] = data[leftPos];
			data[leftPos] = pivot;

			quickSort(data, left, leftPos - 1);
			quickSort(data, leftPos + 1, right);
		}

		return data;
	}
}
