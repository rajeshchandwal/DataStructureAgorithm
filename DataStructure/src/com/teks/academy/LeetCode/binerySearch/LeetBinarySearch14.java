package com.teks.academy.LeetCode.binerySearch;

public class LeetBinarySearch14 {
	
	
	
//	You are given a 0-indexed integer array candies. Each element in the array denotes 
	//a pile of candies of size candies[i]. You can divide each pile into any number of 
	//sub piles, but you cannot merge two piles together.
//
//	You are also given an integer k. You should allocate piles of candies to k children such that each child gets the same number of candies. Each child can be allocated candies from only one pile of candies and some piles of candies may go unused.
//
//	Return the maximum number of candies each child can get.
//	Input: candies = [5,8,6], k = 3
//			Output: 5
	public static boolean isPossible(int[] candies, long k, int mid) {
		
		for(int i= 0; i<candies.length;i++) {
			int temp = candies[i]/mid;
			k = k - temp;
			if(k <= 0) {
				return true;
			}
			
		}
		return false;
		
	}

	public static void main(String[] args) {
		int[] candies = {5,8,6};
		long k = 3;
		int l = 1;
		int r = 100000;
		while(l<= r) {
			int mid = l+(r-l)/2;
			if(isPossible(candies,k,mid)) {
				l = mid + 1;
			}else {
				r = mid-1;
			}
		}
		System.out.println("r "+r);

	}

}
