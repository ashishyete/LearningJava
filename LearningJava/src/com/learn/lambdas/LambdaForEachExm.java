package com.learn.lambdas;

import java.util.stream.Collectors;

public class LambdaForEachExm {

	public static void main(String[] args) {

		String str = "Ashish Yete";
		
		str.chars().forEach(n-> System.out.println((char)n));
		
	}

}
