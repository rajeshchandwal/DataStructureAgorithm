package com.teks.academy.HashMap.Hashset;

import java.util.HashMap;

public class DublicateRecordArrayByhashMap {

	public static void main(String[] args) {
		
		
	
		HashMap<Integer, Integer> macha = new HashMap<>();
		
		int[] arr = {6,7,8,9,6,9};
for(int i=0; i<arr.length; i++) {
	int n = arr[i];
	if(macha.containsKey(n)) {
		int prev = macha.get(n);
		macha.put(n, prev+1);
	}else {
		macha.put(n, 1);
	}
	
}
		
		for(int boom : macha.keySet()) {
			System.out.println(boom + " "+ macha.get(boom));

	}
	}

}
