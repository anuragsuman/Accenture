package com.job.designPattern.builder;

import lombok.Builder;

@Builder
public class BuilderByAnnotation {
	
	private int id;
	private String name;
	private double salary;
	@Override
	public String toString() {
		return "BuilderByAnnotation [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
