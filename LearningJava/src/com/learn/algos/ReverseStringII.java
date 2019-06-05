package com.learn.algos;

public class ReverseStringII {

	public static void main(String[] args) {
		System.out.println(reverseStr("abcdefg", 2));
	}
	
	public static String reverseStr(String s, int k) {
        int counter =1;
        char charArr[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<charArr.length;i++){
            if(counter%k ==0){
                sb.append(charArr[i+counter]).append(charArr[i]);        
            }else{
                sb.append(charArr[i]);
            }
            counter++;
        }
        return sb.toString();
    }
	
}
