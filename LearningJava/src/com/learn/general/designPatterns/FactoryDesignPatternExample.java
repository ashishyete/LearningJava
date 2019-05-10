package com.learn.general.designPatterns;

public class FactoryDesignPatternExample {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		Shape shape = sf.setShape("Triangle");
		shape.draw();
	}
}

interface Shape {
	public void draw();

}

class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Circle--");
	}
}

class Triangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Triangle--");
	}
}

class ShapeFactory {

	public Shape setShape(String shapeName) {

		if (shapeName.equals("Circle")) {
			return new Circle();
		} else if (shapeName.equals("Triangle")) {
			return new Triangle();
		} else {
			return null;
		}
	}
}
