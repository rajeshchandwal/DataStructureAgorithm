package com.teks.academy.LeetCode.binerySearch;

public class LeetBinarySearch5 {

	   ///RightMost element proplem
		static int rightMost(int[] arr, int target ) {
			int l=0;
			int ans =-1;
			int r = arr.length-1;
			while(l<=r) {
				int mid   =(l+r)/2;
			 if(arr[mid]>target) {
					r= mid -1;
				}
				else {
					l = mid+1;
				}
			
			}
		return  r;
		}
		
		public static void main(String[] args) {
			int[] arr= {3,3,3,3,4,5};
			int num=3;
			System.out.println("rightMost "+rightMost(arr, num));

		}

}
