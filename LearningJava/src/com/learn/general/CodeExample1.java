package com.learn.general;

public class CodeExample1 {

	public static void main(String[] args) {

		int[] intArr = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };
		
		int[] registry = new int[intArr.length];
		
		for(int i: intArr) {
			registry[i]=1;
		}
		
		for(int i=1;i<intArr.length;i++) {
			if(registry[i]==0)
				System.out.println("Num : "+i);
		}
		
		
		
		
		
	}

}
