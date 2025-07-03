package com.teks.academy.LeetCode.Array;

public class ArrayMaxInterval {
	
	public static int maximumDifference(int[] nums) {
		//2016. Maximum Difference Between Increasing Elements
//		Given a 0-indexed integer array nums of size n, find the maximum difference between nums[i] and nums[j] (i.e., nums[j] - nums[i]), such that 0 <= i < j < n and nums[i] < nums[j].
//
//				Return the maximum difference. If no such i and j exists, return -1.
		
//		Input: nums = [7,1,5,4]
//				Output: 4
//				Explanation:
//				The maximum difference occurs with i = 1 and j = 2, nums[j] - nums[i] = 5 - 1 = 4.
//				Note that with i = 1 and j = 0, the difference nums[j] - nums[i] = 7 - 1 = 6, but i > j, so it is not valid.
		int n = nums.length;
		int max = -1;
		for(int i=0; i<n-1; i++) {
			
			for(int j=i+1; j<n;j++) {
				int a = nums[i];
				int b = nums[j];
				if(a<b) {
					int temp = b-a;
					max = Math.max(max, temp);
					//max = Math.max(max, temp); → evaluates and updates max.
				}
			}
		}
		
		return max;
		
	}

	public static void main(String[] args) {
		int[] num = {7,1,5,4};
		System.out.println(maximumDifference(num));

	}

}
