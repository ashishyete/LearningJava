package com.learn.general.designPatterns;

import java.util.Hashtable;

public class PrototypeDesignPatternExample {
 
	public static void main(String[] args) {
		ShapePrototype.loadCache();
		for(int i=0;i<10;i++) {
		ShapePDP shape = ShapePrototype.getClonedObject("2");
		shape.draw();
		}
	}
}

abstract class ShapePDP implements Cloneable {

	public abstract void draw();

	private String id;
	private String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("This is being called");
		return clone;
	}
}

class TrianglePDP extends ShapePDP {

	@Override
	public void draw() {
		System.out.println("Inside Triangle!");
	}
}

class CirclePDP extends ShapePDP {

	@Override
	public void draw() {
		System.out.println("Inside Circle!");
	}
}

class ShapePrototype {

	private static Hashtable<String, ShapePDP> hashTable = new Hashtable<>();

	public static void loadCache() {
		TrianglePDP triangle = new TrianglePDP();
		triangle.setId("1");
		hashTable.put(triangle.getId(), triangle);
		CirclePDP circle = new CirclePDP();
		circle.setId("2");
		hashTable.put(circle.getId(), circle);
	}

	public static ShapePDP getClonedObject(String Id) {
		ShapePDP cachedShape = hashTable.get(Id);
		System.out.println("Hash Code : " + cachedShape.hashCode());
		return (ShapePDP) cachedShape.clone();
	}

}