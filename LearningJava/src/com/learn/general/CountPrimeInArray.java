package com.learn.general;

public class CountPrimeInArray {

	public static void main(String[] args) {
		System.out.println(countPrimes(10));
	}

	public static int countPrimes(int n) {
		int counter = 0;

		boolean[] primes = new boolean[n];

		for (int i = 0; i < primes.length; i++) {
			primes[i] = true;
		}

		for (int i = 2; i * i < primes.length; i++) {
			if (primes[i]) {
				for (int j = i; i * j < primes.length; j++) {
					primes[i*j] = false;
				}
			}
		}
	
		for(int i=2;i<primes.length;i++) {
			if(primes[i]) {
				counter++;
			}
		}

		return counter;
	}

}
