package com.job.BinarySearchTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BST {

	Node head;
	int diameter;

	class Node{
		int data;
		Node left;
		Node right;
		int lenth;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
			this.lenth = 0;
		}

		public void setLenth(int lenth) {
			this.lenth = lenth;
		}

		public int getLenth() {
			return lenth;
		}

	}

	private void add(int data) {
		head = createBinaryTree(head, data);
	}



	public Node createBinaryTree(Node temp,int data) {

		if(temp == null) {
			return new Node(data);
		}else if (data <= temp.data) {
			temp.left = createBinaryTree(temp.left,data);
		}else if (data > temp.data) {
			temp.right = createBinaryTree(temp.right,data);
		}else {
			return temp;
		}

		return temp;
	}

	public void inorder() {
		inorderWay(head);
	}

	public void inorderWay(Node temp) {
		if(temp != null) {
			inorderWay(temp.left);
			System.out.println(temp.data);
			inorderWay(temp.right);
		}
	}


	public void horizontalBst(Node temp) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(temp);

		while(!queue.isEmpty()) {
			Node element = queue.remove();
			System.out.println(element.data);

			if(element.left != null) {
				queue.add(element.left);
			}

			if(element.right != null) {
				queue.add(element.right);
			}

		}

	}

	public void topView(Node temp) {
		Queue<Node> queue = new LinkedList<Node>();
		Map<Integer,Node> map = new HashMap<Integer,Node>();
		temp.setLenth(0);

		queue.add(temp);

		while(!queue.isEmpty()) {

			Node element = queue.remove(); 

			//if(!map.containsKey(element.getLenth()))
			map.put(element.getLenth(), element);

			System.out.println(element.data);

			if(element.left != null) {
				element.left.setLenth(element.getLenth() - 1);
				queue.add(element.left);
			}

			if(element.right != null) {
				element.right.setLenth(element.getLenth() + 1);
				queue.add(element.right);
			}
		}


		map.forEach((key,value) -> System.out.println("key: " + key + "  Value: " + value.data));
	}


	public int height(Node temp) {
		if(temp == null)
			return 0;

		int lh = height(temp.left);

		int rh = height(temp.right);

		return 1 + Integer.max(lh, rh);
	}

	public int diameter(Node temp) {

		if(temp == null)
			return 0;

		diameter = 0;

		int lh = diameter(temp.left);

		int rh = diameter(temp.right);

		diameter = Math.max((lh + rh + 1), diameter);

		return Math.max(lh, rh) + 1;
	}

	public List<Integer> leftView(Node temp) {

		Queue<Node> queue = new LinkedList<Node>();
		List<Integer> list = new ArrayList<Integer>();
		queue.offer(temp);

		while(!queue.isEmpty()) {

			int lenght = queue.size();

			for(int i = 0; i < lenght; i++) {
				Node current = queue.poll();
				if(i == 0) list.add(current.data);
				if(current.right != null) queue.add(current.right);
				if(current.left != null) queue.add(current.left);

			}
		}
		return list;
	}


	public static void main(String[] args) {

		BST b = new BST();
		b.add(6);
		b.add(4);
		b.add(5);
		b.add(3);
		b.add(7);

		//b.inorder();

		System.out.println("+++++++++++++++++++");
		//b.horizontalBst(b.head);

		System.out.println("+++++++++");

		b.topView(b.head);

		System.out.println("++++++++++");

		int diameter = b.diameter(b.head);

		System.out.println("Diameter: " + diameter);

	}


}
