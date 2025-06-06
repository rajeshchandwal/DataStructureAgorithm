package com.teks.academy.LeetCode.binerySearch;

public class LeetBinarySeary1 {

	
	static void test(int[] arr, int target ) {
		int l=0;
		int ans =-1;
		int r = arr.length-1;
		while(l<=r) {
			int mid   =(l+r)/2;
			if(arr[mid] == target) {
				System.out.println(mid);
				
				ans = mid;
				break;				
			}
			
			else if(arr[mid]>=target) {
				r= mid -1;
			}
			else {
				l = mid+1;
			}
		
		}
		System.out.println("value is "+ans);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int num=4;
		test(arr, num);
	//	System.out.println("index "+ test(arr, num));

	}

}
