package com.teks.academy.LeetCode;

public class Leet1AssciiValue {

//	You are given a string s. The score of a string is defined as the sum of the absolute difference
//	between the ASCII values of adjacent characters.	
	
	static int scoreOfString(String s) {
		
		int store =0;
		for(int i=0;i<s.length()-1;i++) {//skip last index 3 so s.length()-1
			char first =s.charAt(i);
			char second =s.charAt(i+1);
			int aAscii =first; //type casting char convert to its Ascii Value
			int bAscii =second;
			store = store + Math.abs(aAscii-bAscii);
			
		}
		return store;
	}
	public static void main(String[] args) {

		System.out.println(scoreOfString("hello"));


	}

}
