package com.teks.academy.LeetCode.QueueStactStringBuilder;

import java.util.Stack;

public class LeetCodeStack6 {

	
//	You are given a string s.
//
//	Your task is to remove all digits by doing this operation repeatedly:
//
//	Delete the first digit and the closest non-digit character to its left.
//	Return the resulting string after removing all digits.
//
//	Note that the operation cannot be performed on a digit that does not have any non-digit character to its left.
//
//	 
	
	public static String clearDigits(String s) {
		Stack<Character> st = new Stack<>();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch >='0' && ch <= '9') {
				st.pop();
			}else {
				st.push(ch);
			}
			
		}
		
		while(!st.isEmpty()) {
			sb.append(st.pop());
		}
		sb.reverse();
		return sb.toString();
		
	}
	public static void main(String[] args) {
		String s = "ab4d";
	System.out.println(clearDigits(s));	
	}

}
