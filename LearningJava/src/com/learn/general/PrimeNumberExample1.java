package com.learn.general;

public class PrimeNumberExample1 {

	public static void main(String[] args) {

		int intArr[] = { 2, 3, 4, 5, 6, 7 ,13};
		//System.out.println(countPrimeNumsInArray(intArr));
		System.out.println(generatePrimeNumbersFrom1to100());
		
		
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
	
	public static String generatePrimeNumbersFrom1to100() {
		String primeNumbers="";
		int n=100;
		for (int i = 1; i <= n; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(int num =i; num>=1; num--)
	         {
		    if(i%num==0)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    //Appended the Prime number to the String
		    primeNumbers = primeNumbers + i + " ";
		 }	
	      }	
		return primeNumbers;
	}

}
