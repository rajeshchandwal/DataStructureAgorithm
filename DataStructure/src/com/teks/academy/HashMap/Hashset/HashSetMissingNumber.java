package com.teks.academy.HashMap.Hashset;

import java.util.HashSet;

public class HashSetMissingNumber {

	public static void main(String[] args) {
		int[] arr = {1,4,4,3};
		HashSet<Integer> hs = new HashSet<>();
		int duplicate =-1;
		for(int i=0; i<arr.length;i++) {
		int val = arr[i];
		if(!hs.contains(val)) {
			hs.add(val);
		}else {
			duplicate =val;
		}
		}
		System.out.println("Missing Logic");
		int missing =-1;
		int n = arr.length;
		for(int i = 1; i<= n ;i++) {
			if(!hs.contains(i)) {
				missing =i;
			}
		}
				System.out.println(missing);

	}

}
