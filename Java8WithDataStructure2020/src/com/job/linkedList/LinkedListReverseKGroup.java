package com.job.linkedList;

public class LinkedListReverseKGroup {

	static Node head;
		   Node tail;
	Node prev;

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
		Node prev=null;
		Node forward = null;
		
		while(current  != null) {
			forward = current.next;
			current.next = prev;
			prev = current;
			current = forward;
		}
		head = prev;
	}
	
	
	public Node reverseList_K(Node temp, int k) {
		
		Node current  = temp;
		//Node prev=null; 
		Node forward = null;
		int count=0;
		
		while(current  != null && count < k) {
			forward = current.next;
			current.next = prev;
			prev = current;
			current = forward;
			count++;
		}
		 return current;
		 
	}
	
	public Node reverseKGroup(Node temp, int k) {
		
		if(temp == null) {
			return null;
		}
		Node current = reverseList_K(temp,k);
		
		if(current != null) {
			System.out.println(current.data);
		}
		
		temp.next = reverseKGroup(current, k);
		
		return prev;
	}
	

	public static void main(String[] args) {

		LinkedListReverseKGroup list = new LinkedListReverseKGroup();

		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		
		//list.display(head);
		
		//list.reverseList(head);
		
		//list.display(head);
		
		list.reverseKGroup(head, 2);
		list.display(head);
	}

}
