package com.learn.general.designPatterns;

public class DesignPatternAbstractFactory {
	
	public static void main(String[] args) {
		DPAFColorFactory colorFac = new DPAFColorFactory();
		DPAFColor color = colorFac.dpafColor("Red");
		color.color();
		
		DPAFShapeFactory shapeFac = new DPAFShapeFactory();
		DPAFShape shape = shapeFac.dpafShape("Circle");
		shape.draw();
	}

}

interface DPAFShape {
	public void draw();
}

class DPAFTriangle implements DPAFShape {

	@Override
	public void draw() {
		System.out.println("Inside Triangle");
	}
}

class DPAFCircle implements DPAFShape {

	@Override
	public void draw() {
		System.out.println("Inside Circle");
	}
}

interface DPAFColor {
	public void color();
}

class DPAFBlue implements DPAFColor {

	@Override
	public void color() {
		System.out.println("Blue");
	}
}

class DPAFRed implements DPAFColor {

	@Override
	public void color() {
		System.out.println("Red");
	}
}

abstract class DPAFAbstractFactory {
	abstract DPAFShape dpafShape(String type);

	abstract DPAFColor dpafColor(String color);
}

class DPAFShapeFactory extends DPAFAbstractFactory {

	@Override
	DPAFShape dpafShape(String type) {
		if (type.equals("Circle")) {
			return new DPAFCircle();
		} else if (type.equals("Triangle")) {
			return new DPAFTriangle();
		}
		return null;
	}

	@Override
	DPAFColor dpafColor(String color) {
		return null;
	}
}

class DPAFColorFactory extends DPAFAbstractFactory {

	@Override
	DPAFShape dpafShape(String type) {
		return null;
	}

	@Override
	DPAFColor dpafColor(String color) {
		if (color.equals("Red")) {
			return new DPAFRed();
		} else if (color.equals("Blue")) {
			return new DPAFBlue();
		}
		return null;
	}

}
