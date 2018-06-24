package com.example.lmklmk99.javabasestudy.study;

import java.util.ArrayList;

import org.junit.Test;

public class StudyIterator {

	@Test
	public void executeTest() {
		ArrayList<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		Iterator iterator = new Iterator(list);

		while (iterator.hasMoreData()) {
			System.out.println(iterator.nextData());
		}
	}

	public class Iterator {

		private ArrayList<String> list;
		int pos = 0;

		public Iterator(ArrayList<String> list) {
			this.list = list;
		}

		public boolean hasMoreData() {
			return (pos < list.size());
		}

		public String nextData() {
			return list.get(pos++);
		}
	}

}
