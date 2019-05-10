/**
 * 
 */
package com.learn.general;

/**
 * @author AC03582
 *
 */

public class ExampleClass {
	public static void main(String[] args) {
		
		ExampleClass1 obj1 = new ExampleClass1();
		System.out.println(obj1.getValOfX1());
		System.out.println(obj1.getValOfX2());
		ExampleClass2 obj2 = new ExampleClass2();
		System.out.println(obj2.getValOfX2());
		System.out.println(obj2.getValOfX2());
	
		ExampleClass2 obj3 = new ExampleClass1();
		System.out.println(obj3.getValOfX2());
	}
}

class ExampleClass1 extends ExampleClass2 {

	int x = 10;

	public int getValOfX1() {
		return this.x;
	}

}

class ExampleClass2 {

	int x = 20;

	public int getValOfX2() {
		return this.x;
	}
}
