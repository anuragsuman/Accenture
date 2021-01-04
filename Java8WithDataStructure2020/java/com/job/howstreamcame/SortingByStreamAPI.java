package com.job.howstreamcame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingByStreamAPI {
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
		
		List<SortingByStreamAPI> sortingByAnnomousClassesList = new ArrayList<SortingByStreamAPI>();
		SortingByStreamAPI student1 = new SortingByStreamAPI();
		student1.setStudentAge(30);
		student1.setStudentName("Anurag Suman");
		student1.setStudentNative("Begusarai");

		SortingByStreamAPI student2 = new SortingByStreamAPI();
		student2.setStudentAge(25);
		student2.setStudentName("Rabikant Sinha");
		student2.setStudentNative("Jamtara");

		SortingByStreamAPI student3 = new SortingByStreamAPI();
		student3.setStudentAge(29);
		student3.setStudentName("Saurabh Kumar");
		student3.setStudentNative("Begusarai");

		sortingByAnnomousClassesList.add(student1);
		sortingByAnnomousClassesList.add(student2);
		sortingByAnnomousClassesList.add(student3);
		
		
		
		sortingByAnnomousClassesList.stream().sorted((e1,e2)-> e1.getStudentName().compareTo(e2.getStudentName()))
									         .forEach((e) -> System.out.println(e.getStudentName()+"__"+e.getStudentAge()));
		
		sortingByAnnomousClassesList.stream().sorted((e1,e2)-> e1.getStudentAge()- e2.getStudentAge())
									         .forEach((e) -> System.out.println(e.getStudentName()+"__"+e.getStudentAge()));
		
		
		
		
		Map<SortingByStreamAPI,String> mapForStringValue = new HashMap<SortingByStreamAPI, String>();
		mapForStringValue.put(student1, "value1");
		mapForStringValue.put(student2, "value2");
		mapForStringValue.put(student3, "value3");
		
		//when map key having student object then how to do the sorting......
		
		mapForStringValue.entrySet().stream().sorted((e1,e2)->e1.getKey().hashCode() - e2.getKey().hashCode())
											 .forEach((e)->System.out.println("Map:"+e.getValue()));
		
		mapForStringValue.entrySet().stream().sorted((e1,e2)->e1.getKey().studentAge - e2.getKey().studentAge)
		 .forEach((e)->System.out.println("Map:"+e.getValue()));
		
		
		
	}
	

}
