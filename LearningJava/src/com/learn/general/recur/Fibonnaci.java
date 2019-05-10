package com.learn.general.recur;

public class Fibonnaci {

	public static void main(String[] args) {
		fiboSeries(10);
		System.out.println("");
		fiboSeriesOldWay(10);
	}

	public static void fiboSeries(int number) {
		System.out.println("Fibonnaci Series for Number : " + number);
		for (int i = 1; i < number; i++) {
			System.out.printf("%s ", getFibonnaci(i));
		}
	}

	public static int getFibonnaci(int number) {
		if (number == 0)
			return 0;
		if (number == 1)
			return 1;
		if (number == 2)
			return 1;
		return getFibonnaci(number - 1) + getFibonnaci(number - 2);
	}

	public static void fiboSeriesOldWay(int num) {
		int num1 = 1;
		int num2 = 1;
		int res;
		System.out.printf("%s ", num1);
		System.out.printf("%s ", num2);
		for (int i = 2; i < num; i++) {
			res = num1 + num2;
			System.out.printf("%s ", res);
			num2 = num1;
			num1 = res;
		}
	}

	// 5
	// 11235
}