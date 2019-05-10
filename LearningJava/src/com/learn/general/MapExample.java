package com.learn.general;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		System.out.println(returnMap("ashish yete"));
		System.out.println(varagsExample("Ashish Yete"));
	}

	public static Map<Character, Integer> returnMap(String str) {
		Map<Character, Integer> hMap = new HashMap<>();

		char charArr[] = str.toCharArray();
		int count = 1;	
		for (Character ch : charArr) {

			if (hMap.keySet().contains(ch)) {
				count = hMap.get(ch);
				count = count + 1;
				hMap.put(ch, count);
			} else {
				hMap.put(ch, count);
			}
		}

		return hMap;
	}
	
	public static String varagsExample(String ... str) {
		return "hello " + str[0];
	}

}
