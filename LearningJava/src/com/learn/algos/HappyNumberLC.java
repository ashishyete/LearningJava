package com.learn.algos;

import java.util.HashSet;

public class HappyNumberLC {

	public static void main(String[] args) {

		int num = 19;
		System.out.println(isHappyNum(num));
	}

	public static boolean isHappyNum(int num) {

		HashSet<Integer> hSet = new HashSet<>();

		while (num != 1) {
			int sum = 0;
			int current = num;
			while (current != 0) {
				sum += (current % 10) * (current % 10);
				current /= 10;
			}
			if (hSet.contains(sum)) {
				return false;
			}
			hSet.add(sum);
			num = sum;
		}
		return true;
	}
}
