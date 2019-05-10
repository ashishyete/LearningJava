package com.learn.algos;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
	
	public static void main(String[] args) {
		
		System.out.println(isValidParenthesis("()"));
	}
	
	
	
	
	public static boolean isValidParenthesis(String s) {
	
		Map<Character, Character> hMap = new HashMap<>();
		hMap.put('(',')');
		hMap.put('[',']');
		hMap.put('{','}');
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {
			if(hMap.keySet().contains(s.charAt(i))) {
				stack.push(s.charAt(i));
				System.out.println("1-"+s.charAt(i));
			}else if(hMap.values().contains(s.charAt(i))) {
				System.out.println("2-"+s.charAt(i));
				if(!stack.isEmpty()&&hMap.get(stack.peek()).equals(s.charAt(i))) {
					System.out.println("3-"+s.charAt(i));
					System.out.println("4-"+stack.peek());
					stack.pop();
				}
			}else {
				return false;
			}
		}
		return stack.empty();
		
	}

}
