package com.learn.intStreamExample;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntStreamExample {
	public static void main(String[] args) {
		
		Integer aa[] = {3,5,3,10,7,2,8,6};
		
		int bb[] = new int [aa.length];
		int counter =0;
		for(int x : aa) {
			bb[counter]=x;
			counter++;
		}
	
		int cc[]= Arrays.asList(aa).stream().mapToInt(Integer::intValue).toArray();
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<aa.length;i++) {
			if(cc[i]<min) {
				min=cc[i];
			}
		
			if(cc[i]>max) {
				max=cc[i];
			}
		
	}
		System.out.println("Min Num is -- Max is  : "+min + " --- "+max);
		
		System.out.println(IntStream.of(cc).min().getAsInt());
		System.out.println(IntStream.of(cc).max().getAsInt());
		
		IntStream.of(cc).min().ifPresent(o->System.out.println(o));
		
		IntSummaryStatistics s = IntStream.of(cc).summaryStatistics();
		System.out.println(s.getMax());
		System.out.println(s.getMin());
		System.out.println(s.getSum());
		
		int copy[]  = Arrays.copyOf(cc, cc.length);
		
		Arrays.sort(copy);
		for(int i=0;i<3;i++) {
			System.out.println(copy[i]);
		}
	
		System.out.println("----");
		IntStream.of(cc).distinct().sorted().filter(n->n%2==0).forEach(System.out::println);
		
		
		IntStream.rangeClosed(1, 100).forEach(System.out::println);
	}
	
	
}
