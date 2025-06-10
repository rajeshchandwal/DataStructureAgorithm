package com.teks.academy.LeetCode.binerySearch;

public class LeetBinarySearch6 {

	
	//Given an array sorted in non-desecnding order (ascending order) return maximum
	//between the number of positive and negetive integer and the no of negetive integer
	
	public static int leftMost(int[] arr, int target) {
		int l=0;
		int r= arr.length-1;
		
		while(l<=r) {
			int mid = (l+r)/2;
			if(arr[mid]>=target) {
//here we are dealing with left most so move r to left by including arr[mid]>=target in condition
				r = mid-1;
				//
			}
			else {
				l= mid+1;
			}
			
			
		}
		return l;
		
	}
	public static void main(String[] args) {
	int arr[] = {-2,-1,-1,1,2,3};
		int negetive = leftMost(arr,0); //l index = 3 = negetive
		int one  = leftMost(arr,1);
		System.out.println("one "+one);
		int pos = arr.length - one;
		System.out.println("positive "+pos);
		System.out.println("negetive "+negetive);
		int max = Math.max(one, pos);
		System.out.println("max "+max);
		
		
	}

}
