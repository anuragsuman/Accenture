package com.job.linkedList;


public class LinkedListDisplay{

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
	
	public void display(Node temp) {
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {

		LinkedListDisplay list = new LinkedListDisplay();

		list.addNode(1);
		list.addNode(2);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		
		list.display(head);
		
	}


	
}
