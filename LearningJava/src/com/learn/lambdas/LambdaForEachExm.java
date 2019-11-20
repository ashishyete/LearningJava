package com.learn.lambdas;

public class LambdaForEachExm {

	public static void main(String[] args) {

		String str = "Ashish Yete";
		
		str.chars().forEach(n-> System.out.println((char)n));
		
		str.chars().forEach(p-> System.out.print((char)p));
		
		//int x =10/0;
		//System.out.println(x);
		
		double d =10.0/0.0;
		System.out.println("  " + d);
		
	}

}
