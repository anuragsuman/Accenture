package com.job.howstreamcame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingByAnnomousClass {
	
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
		
		List<SortingByAnnomousClass> sortingByAnnomousClassesList = new ArrayList<SortingByAnnomousClass>();
		SortingByAnnomousClass student1 = new SortingByAnnomousClass();
		student1.setStudentAge(30);
		student1.setStudentName("Anurag Suman");
		student1.setStudentNative("Begusarai");

		SortingByAnnomousClass student2 = new SortingByAnnomousClass();
		student2.setStudentAge(31);
		student2.setStudentName("Rabikant Sinha");
		student2.setStudentNative("Jamtara");

		SortingByAnnomousClass student3 = new SortingByAnnomousClass();
		student3.setStudentAge(35);
		student3.setStudentName("Saurabh Kumar");
		student3.setStudentNative("Begusarai");

		sortingByAnnomousClassesList.add(student1);
		sortingByAnnomousClassesList.add(student2);
		sortingByAnnomousClassesList.add(student3);
		
		Collections.sort(sortingByAnnomousClassesList, new Comparator<SortingByAnnomousClass>() {

			@Override
			public int compare(SortingByAnnomousClass o1, SortingByAnnomousClass o2) {
				if(o1.getStudentAge() == o2.getStudentAge()) {
					return 0;
				}else if(o1.getStudentAge() >= o2.getStudentAge()) {
					return 1;
				}
				return 0;
			}
		});
		
		for(SortingByAnnomousClass c : sortingByAnnomousClassesList) {
			System.out.println(c.getStudentName()+"__"+c.getStudentAge()+"___"+c.getStudentNative());
		}
		
	}

}
