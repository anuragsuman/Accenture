package com.job.designPattern.factory;

public class FactoryPattern {

	public static void main(String[] args) {
		ShapeFactory sha = new ShapeFactory();
		Shape shape1 = sha.getShape("Circle");
		shape1.draw();
		Shape shape2 = sha.getShape("Rectangle");
		shape2.draw();

	}

}
