package com.teks.academy.LeetCode.binerySearch;

public class LeetBinarySearch3 {

	
	//Given an array of character sorted in ascending order find the greatets character that is 
	//less than the target character in the array target character is not present in the array
	//target = d return c
	//target z retyrn 'y'
	//target b return a
	
	
	//{'c','e','g','k','y'} asscii valie {91,101,103, 107,121} internally it will compare asci value
	
	
	
	//less than means return r greater than means return l
	static char test(char[] arr, char target ) {
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
		if(r==-1) {
			return 'a';
		}
		
		System.out.println("value is "+arr[r]);
		return arr[r];
	}
	public static void main(String[] args) {
		char[] arr= {'c','e','g','k','y'};
		char target='z';
		System.out.println("return value is "+test(arr, target));
	}
}
