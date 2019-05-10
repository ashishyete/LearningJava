package com.learn.general;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class IteratorExample {
	
	public static void main(String[] args) {
		
		List<Integer> ll = new ArrayList<>();
		for(int i=0;i<10;i++) {
			ll.add((int) ((Math.random())*99));
		}
		System.out.println(ll);
		
		Iterator<Integer> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ListIterator<Integer> listItr = ll.listIterator();
		while(listItr.hasNext()) {
			System.out.println("**"+listItr.next());
		}
		while(listItr.hasPrevious()) {
			System.out.println("^^"+listItr.previous());
		}
	}

}
