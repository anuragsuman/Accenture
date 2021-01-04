package com.job.designPattern.abstractFactory;

public class AbstractFactoryPattern {

	public static void main(String[] args) {

		AbstractFactory shapeF = FactoryProducer.getFactory("Shape");
		Shape shape1 = shapeF.getShape("Circle");
		shape1.draw();
		
	}

}
