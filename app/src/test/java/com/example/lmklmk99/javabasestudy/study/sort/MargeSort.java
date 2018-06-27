package com.example.lmklmk99.javabasestudy.study.sort;

public class MargeSort extends Sort {

	private int[] data;

	public int[] executeSort(int[] data) {
		this.data = (int[])data.clone();
		return margeSort(this.data, 0, data.length - 1);
	}

	private int[] margeSort(int data[], int left, int right) {
		if (left < right) {
			int mid = ((left + right) / 2);

			margeSort(data, left, mid);
			margeSort(data, mid + 1, right);
			marge(data, left, right, mid);
		}

		return data;
	}

	private int[] marge(int data[], int left, int right, int mid) {

		int tempData[] = new int[data.length];
		int left1 = left;
		int right1 = mid;
		int left2 = mid + 1;
		int right2 = right;

		int index = left1;

		while ((left1 <= right1) && (left2 <= right2)) {
			if (data[left1] < data[left2]) {
				tempData[index] = data[left1];
				left1++;
			} else {
				tempData[index] = data[left2];
				left2++;
			}

			index++;
		}

		while (left1 <= right1) {
			tempData[index] = data[left1];
			left1++;
			index++;
		}

		while (left2 <= right2) {
			tempData[index] = data[left2];
			left2++;
			index++;
		}

		index = left;
		while (index <= right) {
			data[index] = tempData[index];
			index++;
		}

		return data;
	}
}
