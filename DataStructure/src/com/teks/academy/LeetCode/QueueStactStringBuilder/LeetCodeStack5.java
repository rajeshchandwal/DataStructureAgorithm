package com.teks.academy.LeetCode.QueueStactStringBuilder;

import java.util.Stack;

public class LeetCodeStack5 {
	
	
//	Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum
//			number of nested parentheses.
//	Example 1:
//
//		Input: s = "(1+(2*3)+((8)/4))+1"
//
//		Output: 3
	public static int maxDepth(String s) {
		
		Stack<Character> st = new Stack();
		int ans=0;
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch =='(') {
				st.push('(');
				
			}
			else if(ch == ')'){
				st.pop();
			}
			ans = Math.max(ans, st.size());
		}
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "(1+(2*3)+((8)/4))+1";
System.out.println(maxDepth(s));

	}

}
