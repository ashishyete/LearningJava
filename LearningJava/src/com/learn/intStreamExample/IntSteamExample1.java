package com.learn.intStreamExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.IntStream;

public class IntSteamExample1 {

	public static void main(String[] args) {
		
		Map<String,Integer> l = new HashMap<>();
		l.put("Ashish",1);
		l.put("A",2);
		
		System.out.println(l.getOrDefault("P", -1));

		int arr[] = { 3, 5, 5, 7, 9, 2, 1 };

		int minInt = arr[0];

		for (int iterArr : arr) {
			if (minInt > iterArr)
				minInt = iterArr;
		}

		System.out.println("Conventional Way - Min number from Array is : " + minInt);

		// IntSteam way
		int minIntLambda = IntStream.of(arr).min().getAsInt();

		int intStr[] = IntStream.of(arr).distinct().toArray();

		top2Numbers(intStr);

		System.out.println("IntStream Way - Min number from Array is : " + minIntLambda);

		// printMin
		System.out.println("Min :");
		IntStream.of(arr).min().ifPresent(System.out::println);
		// printMax
		System.out.println("Max :");
		IntStream.of(arr).max().ifPresent(System.out::println);
		// printAverage
		System.out.println("Avg :");
		IntStream.of(arr).average().ifPresent(System.out::println);
		// printSum
		System.out.println("Sum :");
		System.out.println(IntStream.of(arr).sum());
		// printCount
		System.out.println("Count :");
		System.out.println(IntStream.of(arr).count());

		// Summary Statistics

		IntSummaryStatistics summaryStats = IntStream.of(arr).summaryStatistics();
		System.out.println("min : " + summaryStats.getMin() + " Max :" + summaryStats.getMax() + " Avg : "
				+ summaryStats.getAverage());

	}

	public static void top2Numbers (int [] numbers) {
		
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		
		for(Integer xx : numbers) {
			if(xx>max1) {
				max2=max1;
				max1=xx;
			}			
		}
		System.out.println("$$$$$$$$$$max1 = : "+max1);
		System.out.println("$$$$$$$$$$max2 = : "+max2);

		
	}
}
