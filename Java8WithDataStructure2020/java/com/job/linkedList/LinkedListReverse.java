package com.job.linkedList;

public class LinkedListReverse {

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
	
	public void reverseList(Node temp) {
		
		Node current  = temp;
		Node prev = null;
		Node forward = null;
		
		while(current  != null) {
			forward = current.next;
			current.next = prev;
			prev = current;
			current = forward;
		}
		head = prev;
	}

	public static void main(String[] args) {

		LinkedListReverse list = new LinkedListReverse();

		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		
		System.out.println("Before Reversing:.....");
		list.display(head);
		
		list.reverseList(head);
		
		System.out.println("After Reversing:.....");
		list.display(head);
		
	}

}
