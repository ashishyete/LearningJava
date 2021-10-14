package com.learn.algos;

import java.util.HashMap;

public class IsomorphicString {

	public static void main(String[] args) {
		String s = "ofoo";
		String t = "abua";
		System.out.println(isIsomorphic(s, t));
	}

	public static boolean isIsomorphic(String s, String t) {

		HashMap<Character, Character> map1 = new HashMap<>();
		HashMap<Character, Character> map2 = new HashMap<>();

		if (s.length() != t.length()) {
			System.out.println("Length Issues");
			return false;
		}

		for (int i = 0; i < s.length(); i++) {
			if (map1.containsKey(s.charAt(i))) {
				if (t.charAt(i) != map1.get(s.charAt(i))) {
					System.out.println("Failed at Point -1");
					return false;
				}
			} else {
				if (map2.containsKey(t.charAt(i))) {
					System.out.println("Failed at Point -2");
					return false;
				}
			}

			map1.put(s.charAt(i), t.charAt(i));
			map2.put(t.charAt(i), s.charAt(i));
		}
		System.out.println("Map-1 " + map1);
		System.out.println("Map-2 " + map2);

		return true;
	}

}
