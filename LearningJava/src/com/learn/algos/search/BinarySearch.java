package com.learn.algos.search;

import java.util.Arrays;

// Time Complexity : O(log n)
public class BinarySearch {

	public static void main(String[] args) {

		int [] myArr = {12, 1, 67, 4, 9, 56, 73, 2, 8 };
		int num =8;
		Arrays.sort(myArr);
		System.out.println(binarySearchAlgo(myArr, num));
		
	}
	
	public static boolean binarySearchAlgo(int[] myArr,int num) {
		
		int startInd = 0;
		int endInd = myArr.length-1;
		int midInd = (startInd+endInd)/2;
		int midElement = myArr[midInd];
		while(startInd <= endInd) {
			if(num < midElement) {
				endInd = midInd -1;
				midInd = (startInd+endInd)/2;
				midElement = myArr[midInd];
			} else if(num > midElement) {
				startInd = midInd +1;
				midInd = (startInd+endInd)/2;
				midElement = myArr[midInd];
			} else {
				return true;
			}
		}
		return false;
	}
}
