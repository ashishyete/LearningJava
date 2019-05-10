package com.learn.general.recur;

public class RecursionExample1 {

	public static void main(String[] args) {
		System.out.println("---------------------");
		printFunct(4);
		System.out.println("---------------------");
		System.out.println("Cats Eyes " +catEyes(10));
		System.out.println("---------------------");
		System.out.println("Facorial : "+factorial(5));
		System.out.println("---------------------");
		fibSeries(10);
	}

	public static void printFunct(int num) {
		System.out.println(num);
		if (num == 0) {
			return;
		} else {
			printFunct(num - 1);
		}
	}

	public static int catEyes(int num) {
		if (num == 0) {
			return 0;
		} else {
			return 2 + catEyes(num - 1);
		}
	}

	public static int factorial(int n) {
		if(n==1 || n==0)
			return 1;
		return n*factorial(n-1);
	}
	
	public static void fibSeries(int n) {
		for(int i=0;i<n-1;i++)
		System.out.print(fibonnaciSeries(i)+" ");
	}
	
	public static int fibonnaciSeries(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		if(n==2)
			return 1;
		return fibonnaciSeries((n-1))+fibonnaciSeries((n-2));
					
			
	}
	
}
