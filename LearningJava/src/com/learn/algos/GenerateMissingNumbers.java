package com.learn.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateMissingNumbers {
	
	public static void main(String[] args) {
	
		int intArr[] = {1,1,2};
		System.out.println(findMissingNumbers(intArr));
		
		
		 Set<Integer> hSet = new HashSet();
		
	}

	public static List<Integer> findMissingNumbers(int [] nums){
		List<Integer> missingNumbers = new ArrayList<>();
		Set<Integer> hSet = new HashSet<>();
		
		for(Integer i : nums) {
			hSet.add(i);
		}
		for(int i=1;i<nums.length;i++) {
			if(!hSet.contains(i)) {
				missingNumbers.add(i);
			}
		}
		return missingNumbers;
	}
	
}
