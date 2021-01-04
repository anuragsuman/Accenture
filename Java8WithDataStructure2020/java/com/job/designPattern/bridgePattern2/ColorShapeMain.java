package com.job.designPattern.bridgePattern2;

import java.util.Scanner;

public class ColorShapeMain {

	public static void main(String[] args) {
		
		System.out.println("Draw the Shape? Rectangle or Circle ?");
		Scanner scnShape = new Scanner(System.in);
		String strShape = scnShape.next();
		System.out.println("fill the Color? Red or Green ?");
		Scanner scnColor = new Scanner(System.in);
		String strColor = scnColor.next();
		if(strShape.equalsIgnoreCase("Rectangle") && strColor.equalsIgnoreCase("Red")){
			Color color = new RedColor();
			Shape rectangleShape = new Rectangle(color);
			rectangleShape.drawShape(strShape,strColor);
		}else if(strShape.equalsIgnoreCase("Rectangle") && strColor.equalsIgnoreCase("Green")){
			Color color = new GreenColor();
			Shape rectangleShape = new Rectangle(color);
			rectangleShape.drawShape(strShape,strColor);
		}else if(strShape.equalsIgnoreCase("Circle") && strColor.equalsIgnoreCase("Red")){
			Color color = new RedColor();
			Shape circleShape = new Circle(color);
			circleShape.drawShape(strShape,strColor);
		}else if(strShape.equalsIgnoreCase("Circle") && strColor.equalsIgnoreCase("Green")){
			Color color = new GreenColor();
			Shape circleShape = new Circle(color);
			circleShape.drawShape(strShape,strColor);
		}
		
	}
}
