package com.learn.general;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountVowelsAndConsonants {
	
	public static void main(String[] args) {
		String str = "HOw Many vowels in this String??".replaceAll(" ","").toLowerCase(); // only Alphabets
		int counter=0;
		int specialChar=0;
		Pattern pat = Pattern.compile("[a-z]");
		Matcher m =null;
		char [] charArr = str.toCharArray();

		for (char ch : charArr) {
			m = pat.matcher(String.valueOf(ch));
			if(!m.find()) {
				specialChar++;
			}
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				counter++;
				break;

			}
		}
		
		System.out.println("Number of Vowels : = "+counter);
		System.out.println("Number of Consonants : = " +(str.length()-counter-specialChar));
		System.out.println("Number of Special Char = " +specialChar);
		
		
		//_____________________________________//
		
		List<Character> charList = new ArrayList<>();
		charList.add('a');
		charList.add('e');
		charList.add('i');
		charList.add('o');
		charList.add('u');
		
		int counter_me=0;
		int specialChar_me=0;
		
		char [] charArray = str.toCharArray();
		
		for (Character ch : charArray) {
			if(Character.isLetter(ch)) {
				if(charList.contains(ch)) {
					counter_me++;
				}
			}else {
				specialChar_me++;
			}
		}
		System.out.println("Special Char Count : "+specialChar_me);
		System.out.println("Vowel Char Count : "+counter_me);
		System.out.println("Consonant Char Count : "+(charArr.length-counter_me-specialChar_me));
		
		
	}

}
