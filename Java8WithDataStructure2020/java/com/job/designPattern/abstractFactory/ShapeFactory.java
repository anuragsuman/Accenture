package com.job.designPattern.abstractFactory;

public class ShapeFactory extends AbstractFactory{
	
	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}else if(shapeType.equals("Circle")) {
			return new Circle();
		}else if(shapeType.equals("Rectangle")) {
			return new Rectangle();
		}
		return null;
	}

}
