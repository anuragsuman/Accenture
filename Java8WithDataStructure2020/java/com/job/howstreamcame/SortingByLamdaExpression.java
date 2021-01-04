package com.job.howstreamcame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingByLamdaExpression{
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
	public static void main(String[] args) {
		
		List<SortingByLamdaExpression> sortingByAnnomousClassesList = new ArrayList<SortingByLamdaExpression>();
		SortingByLamdaExpression student1 = new SortingByLamdaExpression();
		student1.setStudentAge(30);
		student1.setStudentName("Anurag Suman");
		student1.setStudentNative("Begusarai");

		SortingByLamdaExpression student2 = new SortingByLamdaExpression();
		student2.setStudentAge(31);
		student2.setStudentName("Rabikant Sinha");
		student2.setStudentNative("Jamtara");

		SortingByLamdaExpression student3 = new SortingByLamdaExpression();
		student3.setStudentAge(35);
		student3.setStudentName("Saurabh Kumar");
		student3.setStudentNative("Begusarai");

		sortingByAnnomousClassesList.add(student1);
		sortingByAnnomousClassesList.add(student2);
		sortingByAnnomousClassesList.add(student3);
		
		 Collections.sort(sortingByAnnomousClassesList, (p1, p2) -> {
	         return p1.studentName.compareTo(p2.studentName); 
	      }); 
		
		for(SortingByLamdaExpression c : sortingByAnnomousClassesList) {
			System.out.println(c.getStudentName()+"__"+c.getStudentAge()+"___"+c.getStudentNative());
		}
		
	}
	

}
