package com.learn.general.designPatterns;

public class AbstractFactoryDesignPatternExample {

	public static void main(String[] args) {
		FactoryProducer fp = new FactoryProducer();
		AbstractFactory af = fp.getFactory("ShapeAF");
		AbstractFactory af1 = fp.getFactory("ColorAF");
		ShapeAF sf = af.getShape("CircleAF");
		ColorAF cf = af1.getColor("BlueAF");
		sf.draw();
		cf.color();
	}
}

interface ShapeAF {

	public void draw();
}

class TriangleAF implements ShapeAF {
	@Override
	public void draw() {
		System.out.println("Inside Triangle!");
	}
}

class CircleAF implements ShapeAF {
	@Override
	public void draw() {
		System.out.println("Inside Circle!");
	}
}

interface ColorAF {

	public void color();
}

class RedAF implements ColorAF {

	@Override
	public void color() {
		System.out.println("Red Color!");
	}
}

class BlueAF implements ColorAF {

	@Override
	public void color() {
		System.out.println("Blue Color!");
	}
}

abstract class AbstractFactory {
	public abstract ShapeAF getShape(String type);

	public abstract ColorAF getColor(String color);
}

class ShapeFactoryAF extends AbstractFactory {

	@Override
	public ShapeAF getShape(String type) {
		if (type.equals("CircleAF")) {
			return new CircleAF();
		} else if (type.equals("TriangleAF")) {
			return new TriangleAF();
		}
		return null;
	}

	@Override
	public ColorAF getColor(String color) {
		return null;
	}
}

class ColorFactoryAF extends AbstractFactory {

	@Override
	public ShapeAF getShape(String type) {
		return null;
	}

	@Override
	public ColorAF getColor(String color) {
		if (color.equals("RedAF")) {
			return new RedAF();
		} else if (color.equals("BlueAF")) {
			return new BlueAF();
		}
		return null;
	}

}

class FactoryProducer {

	public AbstractFactory getFactory(String choice) {
		if (choice.equals("ShapeAF")) {
			return new ShapeFactoryAF();
		} else if (choice.equals("ColorAF")) {
			return new ColorFactoryAF();
		}
		return null;
	}
}