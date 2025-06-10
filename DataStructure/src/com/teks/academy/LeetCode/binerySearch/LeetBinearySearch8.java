package com.teks.academy.LeetCode.binerySearch;

public class LeetBinearySearch8 {

	
	//Given an array of integers nums and an integer threshold, we will 
//	choose a positive integer divisor, divide all the array by it, and sum
//	the division's result. Find the smallest divisor such that the result 
//	mentioned above is less than or equal to threshold.

	//Each result of the division is rounded to the nearest integer greater 
	//than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).
	
//	Input: nums = [1,2,5,9], threshold = 6
//			Output: 5
	
	public static boolean isPossible(int[] nums, int thresold, int k ) {
		int temp=0;
		for(int i=0; i<nums.length;i++) {
			int upper = nums[i]/k;
			if(nums[i] %k != 0) {
				upper++;
			}
			temp = temp+upper;
		}
		if(temp <=  thresold) {
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		int[] arr = {1,2,5,9};
		int l=0;
		int r= arr.length-1;
		int threshold = 6;
		while(l<=r) {
			int mid = l+(r-l)/2;			
				if(isPossible(arr,threshold,mid)) {
					r = mid-1;
				}else {
					l= mid+1;
				}
				
		}
		
		System.out.println("l value "+r);	

	}

}
