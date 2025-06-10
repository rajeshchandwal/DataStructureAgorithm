package com.teks.academy.LeetCode.binerySearch;

public class LeetBinarySearch11 {
	
	
//	A conveyor belt has packages that must be shipped from one port to another within days days.
//
//	The ith package on the conveyor belt has a weight of weights[i].
	//Each day, we load the ship with packages on the conveyor belt (in the order given by weights).
	//We may not load more weight than the maximum weight capacity of the ship.
//	Return the least weight capacity of the ship that will result in all the packages on the conveyor
//	belt being shipped within days days.
//	Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
//			Output: 15
	public static boolean isPossible(int[] weight, int days, int k) {
		int temp = 0;
		for(int i=0; i<weight.length;i++) {
			int val = weight[i];
			if(val > k) {
				return false;
			}
			if(temp+val > k) {
				days = days-1;
				temp = 0;
			}
			temp = temp +val;
			if(days == 0 ) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		int[] weight = {1,2,3,4,5,6,7,8,9,10};
		int days = 5;
		
		
		int l=1;
		int r=(int)Math.pow(10, 9);
		while(l<=r) {
			int mid = l+(r-l)/2;
			if(isPossible(weight, days, mid)) {
				r = mid-1;
			}
			else {
				l = mid+1;
			}
		}
		System.out.println("l "+l);

	}

}
