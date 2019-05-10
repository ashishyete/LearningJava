package com.learn.algos;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String s ="Sky Is Blue , eulB sI ykS";
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse().trimToSize();
		System.out.println(sb.toString());
		
		System.out.println(s.equalsIgnoreCase(sb.toString()));
		
	}

}
