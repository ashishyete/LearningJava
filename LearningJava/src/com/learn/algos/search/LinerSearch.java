package com.learn.algos.search;

//TimeComplexity O(n)
public class LinerSearch {

	public static void main(String[] args) {
		int [] myArr = {12, 1, 67, 4, 9, 56, 73, 2, 8 };
		int num =33;
		System.out.println(linearSearch(myArr,num));
	}
	
	public static boolean linearSearch(int[] intArr,int num) {
		for(int i : intArr) {
			if(i==num) {
				return true;
			}
		}
		return false;
	}
}
