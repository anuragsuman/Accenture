package com.job.designPattern.bridgePattern2;

public class Circle extends Shape{
	
	public Circle(Color color) {
		super.color = color;
	}


	@Override
	public void drawShape(String shape,String color) {
		System.out.println("draw the shape "+shape+" with color "+color);
	}

}
