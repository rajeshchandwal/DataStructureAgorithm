package com.teks.academy.LeetCode.binerySearch;

public class LeetBinarySearch13 {

	
//	You are given an integer array nums where the ith bag contains nums[i] balls. 
	//You are also given an integer maxOperations.
//
//	You can perform the following operation at most maxOperations times:
//
//	Take any bag of balls and divide it into two new bags with a positive number of balls.
//	For example, a bag of 5 balls can become two new bags of 1 and 4 balls, or
	//two new bags of 2 and 3 balls.
//	Your penalty is the maximum number of balls in a bag. You want to minimize your
	//penalty after the operations.
//
//	Return the minimum possible penalty after performing the operations.
	
//	Input: nums = [2,4,8,2], maxOperations = 4
//			Output: 2
	
	public static boolean isPossible(int[] nums, int maxOperation, int k) {
		for(int i=0; i < nums.length;i ++) {
			int val = nums[i];
			int temp = val/k;
			if(val%k!=0) {
				temp++;
			}
			temp--; //suppose 9/
			maxOperation = maxOperation - temp;
			if(maxOperation < 0) {
			return false;	
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		int[] nums = {2,4,8,2};
		int n = 3; 
		int maxOperation = 2;
		
		int l=1;
		int r=(int)Math.pow(10, 9);
		while(l<=r) {
			int mid = l+(r-l)/2;
			if(isPossible(nums,maxOperation, mid)) {
				r = mid-1;
			}
			else {
				l = mid+1;
			}
		}
		System.out.println("l "+l);

	}

}
