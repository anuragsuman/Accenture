package com.job.priorityqueue;

import java.util.PriorityQueue;

public class MyPriorityQueue {

	public static void main(String[] args) {
		 
		
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>( (a,b) -> -1 * a.compareTo(b));
		PriorityQueue<Employee> student = new PriorityQueue<Employee>((c,d) -> d.getEmpId() - c.getEmpId());
		
		Employee e1 = new Employee(1,"anurag");
		Employee e2 = new Employee(3,"aa");
		Employee e3 = new Employee(6,"dddd");
		Employee e4 = new Employee(2,"sssssss");
		
		
		/*
		 * queue.add(5); queue.add(4); queue.add(1); queue.add(7);
		 */
		
		student.add(e1);
		student.add(e2);
		student.add(e3);
		student.add(e4);
		
		while(!student.isEmpty()) {
			System.out.println(student.poll());
		}
	}

}
