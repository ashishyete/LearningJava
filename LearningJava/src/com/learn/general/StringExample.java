package com.learn.general;

public class StringExample {
	
	public static void main(String[] args) {
		
		String str1 ="ABC";
		String str2 ="ABC";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		if(str1== str2) {
			System.out.println("Passed ==");
		}
		
	}

}
