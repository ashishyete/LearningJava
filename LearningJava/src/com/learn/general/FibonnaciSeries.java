package com.learn.general;

public class FibonnaciSeries {

	public static void main(String[] args) {
		fiboSeries(8);
	}

	
	public static void fiboSeries(int n) {
		for (int i=0;i<n;i++) {
			System.out.println(fibo(i));
		}
	}
	
	public static int fibo(int n) {
		if (n == 1)
			return 1;
		if (n == 0)
			return 0;
		return (fibo(n - 1) + fibo(n - 2));
	}

}