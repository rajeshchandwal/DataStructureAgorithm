package com.teks.academy.HashMap.Hashset;

import java.util.HashMap;

public class DuplicateWord {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		String[] arr = {"Hai", "to","bye","to"};
		
		for(int i=0; i<arr.length;i++) {
			String key = arr[i];
//			if(hm.containsKey(key)) {
//				int curval = hm.get(key);
//				hm.put(key, curval+1);
//			}else {
//				hm.put(key, 1);
//			}
			
			hm.put(key, hm.getOrDefault(key, 0)+1);
		}
		
		for(String boom : hm.keySet()) {
			System.out.println(boom + " "+ hm.get(boom));

	}

	}

}
