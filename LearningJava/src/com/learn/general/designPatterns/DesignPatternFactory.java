package com.learn.general.designPatterns;

public class DesignPatternFactory {

	public static void main(String[] args) {
		DPFFactory factory = new  DPFFactory();
		DPFShape shape = factory.getShape("Circle");
		shape.draw();
	}
	
}

interface DPFShape {
	public void draw();
}

class DPFTriangle implements DPFShape {

	@Override
	public void draw() {
		System.out.println("Inside Triangle");
	}
}

class DPFCircle implements DPFShape {

	@Override
	public void draw() {
		System.out.println("Inside Circle");
	}
}

class DPFFactory {

	public DPFShape getShape(String type) {
		if (type.equals("Circle")) {
			return new DPFCircle();
		} else if (type.equals("Triangle")) {
			return new DPFTriangle();
		}
		return null;
	}
}
