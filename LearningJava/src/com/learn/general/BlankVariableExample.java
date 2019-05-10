package com.learn.general;

public class BlankVariableExample {
	
	final static int blankVar;
	final int blankVar1;
	
	
	
	public BlankVariableExample() {
		super();
		this.blankVar1 = 101;
	}
	static {
		blankVar=100;
	}
	public static void main(String[] args) {
		
		System.out.println(blankVar);	
		System.out.println(new BlankVariableExample().blankVar1);
		
		int x =34;
		int q =x%10;
		int h = x/10;
		String str = String.valueOf(q+""+h);
		System.out.println(Integer.parseInt(str));
		
		
	}

}
