package com.teks.academy.LeetCode.binerySearch;

public class LeetBinarySearch2 {
	//arr = [1,3,5,7,8,10]
	//find the index where we can insert a new element 
	//element we are adding in the above array is not there in the array
	
	public static  int test(int[] arr , int target) {
		int l=0;
		int r =arr.length-1;
		int ans =0;
		while(l<=r) {
			int mid = l+(r-l)/2;
//			if(arr[mid] == target) {
//				ans = mid;				
//				not used in this case
//			}
//			else
//			
			 if(arr[mid] > target) {
				r = mid-1;
			}
			else {
				l = mid+1;
			}
		}
		System.out.println("index "+l);
		return l;
	}

	public static void main(String[] args) {
		int[] arr= {1,3,4,5};
		int num=2;
		test(arr, num);

	}

}
