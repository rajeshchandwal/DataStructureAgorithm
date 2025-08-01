package com.teks.academy.HashMap.Hashset;

import java.util.HashMap;

public class Anagram5 {
	
	public static boolean anagram(String s, String t) {
		
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(int i=0;i<t.length();i++) {
			char c = t.charAt(i);
			if(!map.containsKey(c)) {
				return false;
			}
				
		
				map.put(c, map.get(c)-1);
			 if(map.get(c)== 0) {
				 map.remove(c);
			 }
				
			
		}
		System.out.print(map.size());
		return map.isEmpty();
		
	}

	public static void main(String[] args) {
		anagram("is","si");

	}

}
