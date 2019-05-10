package com.learn.algos;

import java.util.Arrays;
import java.util.Collections;

public class ReverseString {

	public static void main(String[] args) {
		/*String s = "the sky is blue";
		String strArr[] = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = strArr.length - 1; i >= 0; i--) {
			sb.append(strArr[i]);
			if(i!=0)
			sb.append(" ");
		}
		System.out.println(sb.toString());*/
		System.out.println(new ReverseString().reverseWordsInString("the sky is blue"));
		System.out.println(reverseString("hello"));
		helloClass obj = new helloClass();
		obj.greet();
	}

	
	public String reverseWordsInString (String s) {
		String [] str = s.trim().split("\\s+");
		Collections.reverse(Arrays.asList(str));
		return String.join(" ",str);
	}
	
	//String hello
	//output olleh
	
	public static String reverseString(String s) {
		char charArr [] = s.toCharArray();
		int pointer1 = 0;
		int pointer2 = s.length()-1;
		int counter =0;
		while(pointer1<pointer2) {
			char temp = charArr[pointer1];
			charArr[pointer1++]=charArr[pointer2];
			charArr[pointer2--] = temp;
			System.out.println("Loop running: "+counter++);
		}
		return new String(charArr);
	}
	
}

interface hello{
	default void greet() {
		System.out.println("Greetings!");
		
	}
}

class helloClass implements hello{
	public void sayHello() {
		System.out.println("Hi");
	}
}

