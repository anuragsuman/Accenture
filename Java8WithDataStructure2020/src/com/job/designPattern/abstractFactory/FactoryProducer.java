package com.job.designPattern.abstractFactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice) {
		
		if(choice.equals("Shape")) {
			return new ShapeFactory();
		}
		return null;
	}

}
