package com.learn.general;

public class ConstructorChaining {

	int x = 0;
	int y = 0;

	public ConstructorChaining() {
		this(10);
		System.out.println("no args : int x "+x + " int y "+y);
	}
	
	public ConstructorChaining(int x) {
		this(10,21);
		this.x=x;
		System.out.println("one args : int x "+x + " int y "+y);
	}
	public ConstructorChaining(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("two args : int x "+x + " int y "+y);
	}

	
	public static void main(String[] args) {
		new ConstructorChaining(12);
	}
}
