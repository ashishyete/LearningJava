package com.learn.algos;

import java.util.ArrayList;
import java.util.List;

public class RecursionGenerateParenthesisCombinations {

	public static void main(String[] args) {
		System.out.println(generateParenthesis(3));
		System.out.println(generateBrackets(3));
	}

	public static List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		String s = "";
		dfs(result, s, n, n);
		return result;
	}

	public static void dfs(List<String> result, String s, int left, int right) {

		if (left > right) {
			return;
		}
		if (left == 0 && right == 0) {
			result.add(s);
			return;
		}
		if (left > 0) {
			dfs(result, s + "(", left - 1, right);
		}
		if (right > 0) {
			dfs(result, s + ")", left, right - 1);
		}

	}

	public static List<String> generateBrackets(int n) {
		List<String> result = new ArrayList<>();
		String s = "";
		dfsForBracket(result, s, n, n);
		return result;
	}

	public static void dfsForBracket(List<String> result, String s, int left, int right) {
		if (left == 0 && right == 0) {
			result.add(s);
			return;
		}
		if (left > right) {
			return;
		}
		if (left > 0) {
			dfsForBracket(result, s + "{", left - 1, right);

		}
		if (right > 0) {
			dfsForBracket(result, s + "}", left, right - 1);
		}
	}
}
