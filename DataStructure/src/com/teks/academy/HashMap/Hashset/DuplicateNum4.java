package com.teks.academy.HashMap.Hashset;

import java.util.HashMap;

public class DuplicateNum4 {

	public static void main(String[] args) {
		int[] arr = {1,2,2,2,2,3,4,4};
		HashMap<Integer, Integer> map = new HashMap<>();
		System.out.println("hello");
		for(int i=0; i<arr.length;i++) {
			
			
				map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			
			
			
		}
		
		for(int key : map.keySet()) {
			//System.out.println("hello"+map.get(key));
			if(map.get(key)>1) {
				System.out.println(map.get(key));
			}
		}

	}

}
