package com.teks.academy.HashMap.Hashset;

import java.util.HashMap;

public class LongestSubString7 {

	public static int longestSubStr(String str) {
		int max=0;
		int left =0;
		HashMap<Character, Integer> map = new HashMap<>();
		for(int right=0; right<str.length();right++) {
		char ch = str.charAt(right);
			if(map.containsKey(ch)) {
				left = Math.max(left, map.get(ch)+1);
			}
			map.put(ch, right);
			max = Math.max(max, right-left+1);
		}
		
		System.out.println(max);
		return max;
		
	}
	public static void main(String[] args) {
		longestSubStr("abcabcbb");

	}

}
