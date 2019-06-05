package com.learn.algos;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SecondSmallestElementInAnArray {
	
	public static void main(String[] args) {
		
		int nums[] = {4,2,1,2,1};
		
		 Set<Integer> ss = new HashSet<>();
	        for(Integer num : nums){
	          if(ss.contains(num)){
	            ss.remove(num);
	          }else {
	        	  ss.add(num);
	          }
	    }
	        System.out.println(ss.toArray()[0]);
		
		int intArr[] = {3,8,4,2,1};
		
		int last = Integer.MAX_VALUE;
		int secLast = Integer.MAX_VALUE;
		
		for(Integer i : intArr) {
			if(i<last) {
				secLast = last;
				last = i;
			}
			else if(i<secLast && i!=last) {
				secLast =i;
			}
		}
		System.out.println("SecLast : "+secLast +" Last : "+last);
		Arrays.sort(intArr);
		System.out.println("SecLast " + intArr[1]);
		
		Integer [] intArr1 = new Integer[intArr.length];
		for(int i =0 ;i <intArr1.length;i++) {
			intArr1[i]=intArr[i];
		}
		
		Collections.sort(Arrays.asList(intArr1));
		System.out.println(intArr1[1]);
		
	}

}
