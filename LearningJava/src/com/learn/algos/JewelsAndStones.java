package com.learn.algos;

import java.util.ArrayList;
import java.util.List;

public class JewelsAndStones {

	public static void main(String[] args) {

		String J = "bce";
		String S = "eea";
		List<Character> list = new ArrayList<>();
		int counter =0;
		for (int j = 0; j < J.length(); j++) {
			list.add(J.charAt(j));
			for (int i = 0; i < S.length(); i++) {
				if(list.contains(S.charAt(i))) {
					counter++;
				}
			}
			list.clear();
		}
		System.out.println(counter);
	}
	
}
