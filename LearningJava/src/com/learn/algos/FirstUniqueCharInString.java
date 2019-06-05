package com.learn.algos;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharInString {
	
	public static void main(String[] args) {
		
		String s ="";
		Map<Character,Integer> hMap = new HashMap<>();
        char c[] = s.toCharArray();
        
        for(int i=0;i<c.length;i++){
            if(!hMap.containsKey(c[i])){
                hMap.put(c[i],i);
            }else{
                hMap.put(c[i],-1);
            }
        }
        
        int min = Integer.MAX_VALUE;
        for(char cb: hMap.keySet()){
            if(hMap.get(cb) > -1 && hMap.get(cb) < min){
                min = hMap.get(cb);
            }
        }
        
        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
	}

}
