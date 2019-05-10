package com.learn.algos;


public class RecurssiveStairCaseProblem {
	
	public static void main(String[] args) {
		System.out.println(numberOfWays(3));
	}
	
	public static int numberOfWays(int x) {
		if(x==0||x==1)
			return 1;
		return ((numberOfWays(x-2))+numberOfWays(x-1));
	}

}
