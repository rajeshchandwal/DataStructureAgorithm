package com.teks.academy.LeetCode.binerySearch;

public class LeetBinarySearch10 {
	
	//You are given an integer array bloomDay, an integer m and an integer k.

	//You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.

	//The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] and then can be used in exactly one bouquet.

	//Return the minimum number of days you need to wait to be able to make m bouquets from the garden. 
	//If it is impossible to make m bouquets return -1.
	
//	Input: bloomDay = [1,10,3,10,2], m = 3, k = 1
//			Output: 3
	public static boolean isPossible(int[] bloomDay, int m, int k, int day ) {
		
		int took = 0;
		for(int i=0; i<bloomDay.length;i++) {
			if(bloomDay[i] <= day) {
				took = took+1;
			}else {
				took = 0;
			}
			
			if(took == k) {
				m= m-1;
				took =0;
			}
			if(m == 0) {
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		int[] bloomDay = {7,7,7,7,12,7,7};
		int m = 2;
		int k = 3;
		//int h =8;
		int l=1;
		int r=(int)Math.pow(10, 9);
		while(l<=r) {
			int mid = l+(r-l)/2;
			if(isPossible(bloomDay, m,k, mid)) {
				r = mid-1;
			}
			else {
				l = mid+1;
			}
		}
		System.out.println("l "+l);
	}

}
