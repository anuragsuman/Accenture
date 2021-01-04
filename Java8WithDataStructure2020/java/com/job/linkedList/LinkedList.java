package com.job.linkedList;

public class LinkedList {

	static Node head;
	Node tail;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addNode(int data) {
		Node n1 = new Node(data);
		if (head == null) {
			head = n1;
			tail = n1;
		} else {
			tail.next = n1;
			tail = n1;
		}
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		
	}
}
