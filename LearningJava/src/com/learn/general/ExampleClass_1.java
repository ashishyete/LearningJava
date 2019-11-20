package com.learn.general;

public class ExampleClass_1 {

	public static void main(String[] args) {

		int[] intArr = { 1, 1, 2, 4, 6, 7, 7, 9 , 9 ,9 };
		
		int[] r = new int[10];
		
		for(int i : intArr) {
			r[i]=1;
		}
		
		for(int i=1;i<intArr.length;i++) {
			if(r[i]==0) {
				System.out.println("Missing Number : "+i);
			}
		}

	}

}
