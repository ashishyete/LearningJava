package com.learn.general;

import java.util.HashMap;
import java.util.Map;

public class WordsFormedByCharacters {
	
	public static void main(String[] args) {
		
		String str = "atach";
		String strList [] = {"hello"};
		
		Map<Character, Integer> hMap = new HashMap<Character, Integer>();
		for(char c: str.toCharArray()) {
			hMap.put(c, hMap.getOrDefault(c, 0)+1);
			System.out.println(hMap);
		}
		
		for(String st : strList) {
			for(char cx: st.toCharArray()) {
				if(hMap.get("cx")==null) {
					System.out.println("false -1 : : " +cx);
				}
			}
		}
		
		
	}

}
