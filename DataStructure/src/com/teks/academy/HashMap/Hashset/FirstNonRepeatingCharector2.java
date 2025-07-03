package com.teks.academy.HashMap.Hashset;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharector2 {
	
	public static char firstNonRepeating(String str) {
		
		Map<Character, Integer> map = new HashMap<>();
		for(char ch :str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
			
		}
		
		for(char key :map.keySet()) {
			if(map.get(key)==1) {
				System.out.println("key "+map.get(key));
				return (char)key;
			}
		}
		return 0;
		
		
		
	}

	public static void main(String[] args) {
		//s come first then e so s is 
System.out.println(firstNonRepeating("esllo"));
	}

}
