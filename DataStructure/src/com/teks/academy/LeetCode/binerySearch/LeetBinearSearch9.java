package com.teks.academy.LeetCode.binerySearch;

public class LeetBinearSearch9 {

	
	
	//Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

	//Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses 
	//some pile of bananas and eats k bananas from that pile. If the pile has less 
	//than k bananas, she eats all of them instead and will not eat any more bananas
	//during this hour.

	//Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

	// the minimum integer k such that she can eat all the bananas within h hours.
	public static boolean isPossible(int[] piles, int h, int k ) {
		
		for(int i=0;i<piles.length;i++) {
			int temp = piles[i]/k;
			if(piles[i]%k != 0) {
				temp++;
			}
			h= h-temp;
			if(h<0) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		int[] piles = {3,6,7,11};
		int h =8;
		int l=0;
		int r=10000000;
		while(l<=r) {
			int mid = l+(r-l)/2;
			if(isPossible(piles, h, mid)) {
				r = mid-1;
			}
			else {
				l = mid+1;
			}
		}
		System.out.println("l "+l);

	}

}
