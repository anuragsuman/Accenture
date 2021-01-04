package com.job.howstreamcame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		Student student1 = new Student();
		student1.setStudentAge(30);
		student1.setStudentName("Anurag Suman");
		student1.setStudentNative("Begusarai");

		Student student2 = new Student();
		student2.setStudentAge(31);
		student2.setStudentName("Rabikant Sinha");
		student2.setStudentNative("Jamtara");

		Student student3 = new Student();
		student3.setStudentAge(35);
		student3.setStudentName("Saurabh Kumar");
		student3.setStudentNative("Begusarai");

		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);

		Collections.sort(studentList, new Student());

		for(Student c : studentList) {
			System.out.println(c.getStudentName()+"__"+c.getStudentAge()+"___"+c.getStudentNative());
		}

	}

}
