package com.job.linkedList;

public class LinkedListAdd {

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
	
	
	public static int length(Node temp) {
		int count=0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	
	public void addNodeInPosition(Node temp, int positionFromEnd, int number) {
		//Start : To reach the position where we want to add the element.
		int count=0;
		int length = length(temp);
		int end = length - positionFromEnd;
		while(count < end ) {
			count++;
			temp = temp.next;
		}
		//End
	
		Node new_node = new Node(number);
		
		new_node.next = temp.next;
		temp.next=new_node;
	}
	
	public static void main(String[] args) {

		LinkedListAdd list = new LinkedListAdd();

		list.addNode(1);
		list.addNode(2);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		
		list.addNodeInPosition(head,4,3);
		
		list.display(head);
		
	}
	
}
