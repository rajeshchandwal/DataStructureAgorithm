package com.teks.academy.HashMap.Hashset;

import java.util.HashMap;

public class HashmapLengthHalf {
	
	
	public static int majorityElement(int[] nums) {
//		Given an array nums of size n, return the majority element.
//
//				The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that 
		//the majority element always exists in the array.
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0; i<nums.length;i++) {
			int key = nums[i];
			hm.put(key, hm.getOrDefault(key, 0)+1);
			
		}
		int ans =-1;
		int n = nums.length/2;
		System.out.println(hm);
		for(int  macha : hm.keySet()) {
			int value  = hm.get(macha);
			if(value > n) {
			ans = macha;
			break;
			}

	}
		System.out.println(ans);
		return ans;


	}

	public static void main(String[] args) {
		int[] nums = {3,3,3,5,5,5,5};
		majorityElement(nums);

	}

}
