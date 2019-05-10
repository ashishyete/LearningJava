package com.learn.general;

public class ImmutableClassExample {
	
	public static void main(String[] args) {
		
	ImmutableClassEx obj = new ImmutableClassEx(11, 12);
	System.out.println(obj.getX());
	System.out.println(obj.getY());

	String str ="Hello";
	String str1 = str.substring(str.length()+1,str.length());
	System.out.println("SubString : "+str1);
	
	}

}


final class ImmutableClassEx{

	private int x=10;
	private int y=10;
	
	public ImmutableClassEx(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}