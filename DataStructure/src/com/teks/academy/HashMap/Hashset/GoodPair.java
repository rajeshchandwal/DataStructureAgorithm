package com.teks.academy.HashMap.Hashset;

import java.util.HashMap;

public class GoodPair {



//1512. Number of Good Pairs
//	Given an array of integers nums, return the number of good pairs.
//
//			A pair (i, j) is called good if nums[i] == nums[j] and i < j.
	
//	Input: nums = [1,2,3,1,1,3]
//			Output: 4
	
	public static void main(String[] args) {
HashMap<Integer, Integer> hm = new HashMap<>();
		
		int[] arr = {1,2,1,1,1};
		int ans = 0;
for(int i=0; i<arr.length; i++) {

	if(hm.containsKey(arr[i])) {
		ans = ans + hm.get(arr[i]);
		hm.put(arr[i], hm.get(arr[i])+1);
	
	}else {
		hm.put(arr[i], 1);
	}
	
}
      System.out.println(ans);
	}

}
