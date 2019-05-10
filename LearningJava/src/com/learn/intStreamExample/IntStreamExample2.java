package com.learn.intStreamExample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


//get first 3 numbers of Array : Distinct elements.
public class IntStreamExample2 {
	
	public static void main(String[] args) {
		
		int arr[] = {3,5,7,9,2,1,1};
		IntStream.of(arr).sorted().distinct().limit(3).forEach(System.out::println);
		IntStream.of(arr).sorted().distinct().limit(3).min().ifPresent(System.out::println);
		
		System.out.println("Skipping first 3 Elements");
		IntStream.of(arr).map(t->t*10).forEach(System.out::println);
		
		List<Integer> dd = IntStream.of(arr).boxed().collect(Collectors.toList());
		System.out.println(dd);
		
		System.out.println(IntStream.of(arr).allMatch(x->x%2==0));
		
	}

}
