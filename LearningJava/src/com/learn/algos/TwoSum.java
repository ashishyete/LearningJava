package com.learn.algos;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int arr[] = { 2, 11, 7, 15 };
		int target = 26;

		for (Integer i : returnIndices(arr, target)) {
			System.out.print(i + " ");
		}

	}

	public static int[] returnIndices(int nums[], int target) {

		int res[] = new int[2];
		Map<Integer, Integer> hMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int difference = target - nums[i];
			if (hMap.containsKey(difference)) {
				res[0] = i;
				res[1] = hMap.get(difference);
				return res;
			}
			hMap.put(nums[i], i);
			System.out.println("Printing HashMap: "+hMap);
		}
		return res;
	}

}
