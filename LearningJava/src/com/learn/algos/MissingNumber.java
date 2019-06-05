package com.learn.algos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int intArr [] = {1,2,3,4,5};
		Set<Integer> hashSet = new HashSet<>();
		for(Integer i : intArr) {
			hashSet.add(i);
		}
		for(int i=0;i<intArr.length+1;i++) {
			if(!hashSet.contains(i)) {
				System.out.println("Missing Number :" +i);
			}
		}
		
		int sum =0;
		for(int i : intArr) {
			sum +=i;
		}
		
		int n = intArr.length;
        System.out.println ((n * (n+1)/2) - sum);
        
        int [] heights = {1,2,1,2,1,1,1,2,1};
        System.out.println(heightChecker(heights));
	}
	public static int heightChecker(int[] heights) {
        int counter=0;
        int[] heights2 = new int [heights.length];
        heights2= Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights2);
        for(int i=0;i<heights.length;i++) {
        	if(heights[i]!=heights2[i])
        		counter++;
        }
        return counter;
    }
	
	

}
