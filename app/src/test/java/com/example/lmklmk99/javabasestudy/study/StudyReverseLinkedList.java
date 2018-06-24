package com.example.lmklmk99.javabasestudy.study;

import org.junit.Test;

public class StudyReverseLinkedList {
	@Test
	public void executeTest() {
		LinkedList list = new LinkedList();

		list.insert(new Node(1));
		list.insert(new Node(2));
		list.insert(new Node(3));
		list.insert(new Node(4));
		list.insert(new Node(5));
		list.insert(new Node(6));

		list.printList();

		System.out.println(list.getData(2));
		System.out.println(list.getReverseDataTip(2));

		list.reverse();
		list.printList();

		System.out.println(list.getData(2));
		System.out.println(list.getReverseDataTip(2));
	}

	public class Node {
		Node next;
		int data;

		public Node(int data) {
			this.data = data;
		}
	}

	public class LinkedList {

		Node mHead;

		public void insert(Node node) {

			if (mHead == null) {
				mHead = node;
			} else {
				Node curNode = mHead;
				while (curNode.next != null) {
					curNode = curNode.next;
				}
				curNode.next = node;
			}
		}

		public void printList() {
			Node curNode = mHead;
			while (curNode.next != null) {
				System.out.print("" + curNode.data + " -> ");
				curNode = curNode.next;
			}

			System.out.println("" + curNode.data);
		}

		public void reverse() {
			Node currNode = mHead;
			Node tempNode;

			while (currNode.next != null) {
				tempNode = currNode.next;
				currNode.next = tempNode.next;
				tempNode.next = mHead;
				mHead = tempNode;
			}
		}

		public int getData(int getIndex) {
			Node curNode = mHead;
			for (int index = 0; index < getIndex; index++) {
				curNode = curNode.next;
			}

			return curNode.data;
		}

		public int getReverseData(int getIndex) {
			reverse();
			return getData(getIndex);
		}

		public int getReverseDataTip(int getIndex) {
			Node tempNode = mHead;
			Node curNode = mHead;
			int cnt = 0;

			while (tempNode.next != null) {
				cnt++;

				tempNode = tempNode.next;

				if (cnt > getIndex) {
					curNode = curNode.next;
				}
			}

			return curNode.data;
		}
	}
}
