package com.learn.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListInOneLine {
	
	public static void main(String[] args) {
		
		String val [] = {"A","B","C"};
		List<String> list1 = new ArrayList<>(Arrays.asList(val));
		list1.add("D");
		System.out.println(list1);
		
	}

}
