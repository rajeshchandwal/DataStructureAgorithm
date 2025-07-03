package com.teks.academy.HashMap.Hashset;

import java.util.HashMap;

public class Anagram5 {
	
	public static boolean anagram(String s, String t) {
		
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(char c :t.toCharArray()) {
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
