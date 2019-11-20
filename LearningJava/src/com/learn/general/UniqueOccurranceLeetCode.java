package com.learn.general;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurranceLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,2,1,1,3};
		
		System.out.println(uniqueOccurrences(arr));

	}
	
	public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> numMap = new HashMap();
        for(int nums:arr){
            numMap.put(nums,numMap.getOrDefault(nums,0)+1);
            System.out.println(numMap);
        }
        Set<Integer> numSet = new HashSet(numMap.values());
        return numSet.size()==numMap.size();
    }

}
