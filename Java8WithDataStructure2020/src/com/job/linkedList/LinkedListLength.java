package com.job.linkedList;


public class LinkedListLength {

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
	
	
	public static int length(Node temp) {
		int count=0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public static void main(String[] args) {

		LinkedListLength list = new LinkedListLength();

		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		
		System.out.println("Length of LinkedList : "+length(head));
		
	}


	
}
