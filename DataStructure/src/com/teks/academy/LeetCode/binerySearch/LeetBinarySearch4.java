package com.teks.academy.LeetCode.binerySearch;

class LeetBinarySearch4 {
   ///LeftMost element proplem
	static int leftMost(int[] arr, int target ) {
		int l=0;
		int ans =-1;
		int r = arr.length-1;
		while(l<=r) {
			int mid   =(l+r)/2;
			if(arr[mid]>=target) {
				r= mid -1;
			}
			else {
				l = mid+1;
			}
		
		}
	return  l;
	}
	
	public static void main(String[] args) {
		int[] arr= {3,3,3,3,4,5};
		int num=3;
		System.out.println(" "+leftMost(arr, num));

	}

}
