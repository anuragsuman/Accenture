package com.job.linkedList;

public class LinkedListDelete {

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
		
		while(temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
	
	public static int length(Node temp) {
		int count=0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	
	public void deleteKthNodeEnd(Node temp, int k) {
		int count=0;
		
		int length = length(temp);
		int end = length - k;
		
		while(count < end -1) {
			count++;
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	
	public static void main(String[] args) {

		LinkedListDelete list = new LinkedListDelete();

		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		
		
		list.deleteKthNodeEnd(head,3);
		
		
		list.display(head);
		
	}


	
}
