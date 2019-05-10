package com.learn.general.collections;

import java.util.LinkedList;

public class LinkedListExample1 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> lList = new LinkedList<>();
		lList.add(1);
		lList.add(2);
		lList.add(3);
		lList.add(4);
		lList.add(5);
	
		while(lList.iterator().hasNext()) {
			System.out.println(lList.iterator().next());	
		}
		
		
		
	}

}
