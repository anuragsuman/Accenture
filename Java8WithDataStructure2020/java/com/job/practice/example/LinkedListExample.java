package com.job.practice.example;

public class LinkedListExample{
	static Node head;
	Node tail;
	static class Node{
		int data;
		Node next; 
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public void add(int data){
		Node new_node = new Node(data);
		if(head == null){
			tail = new_node;
			head = new_node;
		}else{
			tail.next = new_node;//this line is for linking
			tail = new_node;
		}
	}
	public void display(Node temp) {
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public int length(Node temp) {
		int count = 0;
		while(temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
	//delete the linked list
	public void delete(int position,Node temp) {
		
		int count = 0;
		while(temp != null) {
			count++;
			if(count == position) {
				break;
			}
			temp = temp.next;
		}
		//System.out.println(count);
		if(count == position) {
			temp.next = temp.next.next;
		}
		
	}
	public static void main(String args[]){
		LinkedListExample list = new LinkedListExample();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.delete(3, head);

       list.display(head);
	}

}
