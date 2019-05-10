package com.learn.general.designPatterns;

import java.util.Hashtable;

public class DesignPatternPrototype {

	public static void main(String[] args) {
		DPProtoype.loadCache();
		DPProtoAbstract obj = DPProtoype.getClonedObject("1");
	}

}

abstract class DPProtoAbstract {

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

class DPProtoTriangle extends DPProtoAbstract{

	@Override
	public void draw() {
		System.out.println("Inside Triangle");
	}
}

class DPProtoype {

	private static Hashtable<String, DPProtoAbstract> hashTable = new Hashtable<>();

	public static void loadCache() {
		DPProtoTriangle triangle = new DPProtoTriangle();
		triangle.setId("1");
		hashTable.put(triangle.getId(), triangle);
	
	}

	public static DPProtoAbstract getClonedObject(String Id) {
		DPProtoAbstract cachedShape = hashTable.get(Id);
		System.out.println("Hash Code : " + cachedShape.hashCode());
		return (DPProtoAbstract) cachedShape.clone();
	}

}