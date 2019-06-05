package com.learn.algos;

import java.util.HashSet;
import java.util.Set;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int intArr[] = {0,1,2,4,5,6};
		
		Set<Integer> hSet = new HashSet<>();
		for(Integer i : intArr) {
			hSet.add(i);
		}
		
		for(int i=0;i<intArr.length+1;i++) {
			if(!hSet.contains(i)) {
				System.out.println("Missing Element is : "+i);
			}
		}
		
		int sum =0;
		int n = intArr.length;
		int result;
		
		for(Integer i : intArr) {
			sum+=i;
		}
		result = ((n*(n+1)/2)-sum);
		System.out.println("Missing Number is : "+result);
		
		
		
		
	}
}
