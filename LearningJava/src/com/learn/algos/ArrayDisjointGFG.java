package com.learn.algos;

import java.util.HashSet;
import java.util.Set;

public class ArrayDisjointGFG {

	public static void main(String[] args) {

		int set1[] = {12, 34, 11, 9, 3};
		int set2[] = {2, 1, 0, 5};
		
		Set<Integer> s = new HashSet<Integer>();
		for(Integer i : set1) {
			s.add(i);
		}
		boolean flag = false;
		for(Integer i : set2) {
			if(s.contains(i)) {
				flag= true;
			}
		}
		if(flag) {
			System.out.println("Joint");
			
		}else {
			System.out.println("Disjoint");
		}
		
		
	}
	
}
