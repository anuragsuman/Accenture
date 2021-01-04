package com.job.howstreamcame;

import java.util.Comparator;

public class Student implements Comparator<Student>{
	
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getStudentAge() == o2.getStudentAge()) {
			return 0;
		}else if(o1.getStudentAge() >= o2.getStudentAge()) {
			return 1;
		}
		return 0;
	}
	
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
	
}
