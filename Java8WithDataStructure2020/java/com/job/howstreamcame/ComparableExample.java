package com.job.howstreamcame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample implements Comparable<ComparableExample>{
	
	private int studentAge;
	private String studentName;
	private String studentNative;
	
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentNative() {
		return studentNative;
	}
	public void setStudentNative(String studentNative) {
		this.studentNative = studentNative;
	}
	


	@Override
	public int compareTo(ComparableExample student) {
		if(studentAge == student.getStudentAge()) {
			return 0;
		}else if (studentAge >= student.getStudentAge()) {
			return 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		List<ComparableExample> comparableExampleList = new ArrayList<ComparableExample>();
		ComparableExample comparableExample = new ComparableExample();
		comparableExample.setStudentAge(30);
		comparableExample.setStudentName("Anurag Suman");
		comparableExample.setStudentNative("Begusarai");
		
		ComparableExample comparableExample1 = new ComparableExample();
		comparableExample1.setStudentAge(31);
		comparableExample1.setStudentName("Rabikant Sinha");
		comparableExample1.setStudentNative("Jamtara");
		
		ComparableExample comparableExample2 = new ComparableExample();
		comparableExample2.setStudentAge(35);
		comparableExample2.setStudentName("Saurabh Kumar");
		comparableExample2.setStudentNative("Begusarai");
		
		comparableExampleList.add(comparableExample);
		comparableExampleList.add(comparableExample1);
		comparableExampleList.add(comparableExample2);
		
		Collections.sort(comparableExampleList);
		
		for(ComparableExample c : comparableExampleList) {
			System.out.println(c.getStudentName()+"__"+c.getStudentAge()+"___"+c.getStudentNative());
		}
	}

}
