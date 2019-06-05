package com.learn.general;

public class FibonacciNumber {

	public static void main(String[] args) {
		System.out.println(new FibonacciNumber().fib(0));
	}

	int sum = 0;

	public int fib(int N) {

		if(N==1)
			return 1;
		else if(N==0)
			return 0;
		for (int i = N-1; i <= N; i++) {
			sum = fibb(i);
		}
		return sum;
	}

	public int fibb(int N) {
		if (N == 0) {
			return 0;
		}
		if (N == 1) {
			return 1;
		}
		if (N == 2) {
			return 1;
		}
		return fibb(N - 1) + fib(N - 2);
	}

}
