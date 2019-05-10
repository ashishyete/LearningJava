package com.learn.general;

import java.util.Stack;

public class StackClassExample {
	
	public static void main(String[] args) {
		
		StackClassExample obj = new  StackClassExample();
		Stack<Integer> stack = new Stack<>();
		obj.displayFullStack(stack);
		obj.stackPush(stack);
		obj.displayFullStack(stack);
		obj.stackPeek(stack);
		obj.stackPop(stack);
		obj.displayFullStack(stack);
		obj.stackisEmpty(stack);
		
		
	}

	public void stackPush(Stack<Integer> stack) {
		for (int i=0;i<2;i++)
			stack.push(i);
	}
	
	public void displayFullStack(Stack<Integer> stack) {
		System.out.println(stack);
	}
	
	public void stackPeek(Stack<Integer> stack) {
		System.out.println(stack.peek());
	}
	public void stackPop(Stack<Integer> stack) {
		System.out.println(stack.pop());
	}
	public void stackisEmpty(Stack<Integer> stack) {
		System.out.println(stack.isEmpty());
	}
}
