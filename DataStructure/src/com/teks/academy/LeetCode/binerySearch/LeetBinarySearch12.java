package com.teks.academy.LeetCode.binerySearch;

public class LeetBinarySearch12 {

	public static boolean isPossible(int n, int[] quantity, int limit) {
		
		for(int i=0; i<quantity.length;i++) {
			int val = quantity[i];
			int temp = val/limit;
			if(val % limit != 0) {
				temp++;
			}
			n = n- temp;
			if(n<0) {
				return false;
			}			
		}
		return true;		
	}
	public static void main(String[] args) {
		
		int[] quantity = {11,6};
		int n = 5; //shops
		
		
		int l=1;
		int r=(int)Math.pow(10, 9);
		while(l<=r) {
			int mid = l+(r-l)/2;
			if(isPossible(n,quantity, mid)) {
				r = mid-1;
			}
			else {
				l = mid+1;
			}
		}
		System.out.println("l "+l);

		

	}

}
