package com.learn.general;

public class PrimeNumberExample1 {

	public static void main(String[] args) {

		int intArr[] = { 2, 3, 4, 5, 6, 7 ,13};
		System.out.println(countPrimeNumsInArray(intArr));
	}

	public static int countPrimeNumsInArray(int[] intArr) {
		int counter = 0;

		for (Integer i : intArr) {
			if (isPrime(i)) {
				counter++;
			}
		}

		return counter;
	}

	public static boolean isPrime(int n) {
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
