package com.learn.general.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
	
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Ashish",1);
		map.put("Amar",2);
		map.put("aafa",3);
		map.put("hghhdf",4);
		
		// for loop
		
		for(String s : map.keySet()) {
			System.out.println("key : "+s +" val : "+map.get(s));
		}
		System.out.println("---");
		//
		Iterator<String> keySetItr = map.keySet().iterator();
		while(keySetItr.hasNext()) {
			String key  =keySetItr.next(); 
			System.out.println("Key : " +key  +" Val : "+map.get(key));
		}
		
		System.out.println("---");
		
		for(Map.Entry<String,Integer> entry : map.entrySet()) {
			System.out.println("Key : "+entry.getKey() + " Val : "+entry.getValue());
		}
		System.out.println("---");
		
		map.forEach((k,v)->System.out.println("Key Lambda : "+k +" Val Lambda : "+v));
		System.out.println("---");

		map.entrySet().stream().forEach(e-> System.out.println("Key : "+e.getKey() + " val : "+e.getValue()));
		
	}

}
