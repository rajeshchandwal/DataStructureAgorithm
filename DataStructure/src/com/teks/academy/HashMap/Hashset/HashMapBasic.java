package com.teks.academy.HashMap.Hashset;

import java.util.HashMap;

public class HashMapBasic {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> macha = new HashMap<>();
		macha.put(3, 9);
		macha.put(5, 40);
		int n =7;
		if(macha.containsKey(n)) {
			int prev = macha.get(n);
			macha.put(n, prev+1);
		}else {
			macha.put(n, 1);
		}
		
		for(int boom : macha.keySet()) {
			System.out.println(boom + " "+ macha.get(boom));
			
		}

	}

}
