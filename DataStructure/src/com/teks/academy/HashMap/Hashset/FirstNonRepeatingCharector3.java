package com.teks.academy.HashMap.Hashset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstNonRepeatingCharector3 {
	
	public static char firstNonRepeating(String str) {
		
		Map<Character, Integer> map = new HashMap<>();
		List<Character> list = new ArrayList<>();
		for(char ch :str.toCharArray()) {
			if(list.contains(ch)) {
				list.remove(ch);
			}else {
				list.add(ch);
			}
			
			
		}
		
		System.out.println(list.get(0));
		return 0;
		
		
		
	}

	public static void main(String[] args) {
		firstNonRepeating("helo");

	}

}
