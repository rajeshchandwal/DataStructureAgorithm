package com.teks.academy.LeetCode.binerySearch;

public class LeetBinarySearch12 {

	
//	You are given an integer n indicating there are n specialty retail stores. There are m product types of varying amounts, which are given as a 0-indexed integer array quantities, where quantities[i] represents the number of products of the ith product type.
//
//	You need to distribute all products to the retail stores following these rules:
//
//	A store can only be given at most one product type but can be given any amount of it.
//	After distribution, each store will have been given some number of products (possibly 0). Let x represent the maximum number of products given to any store. You want x to be as small as possible, i.e., you want to minimize the maximum number of products that are given to any store.
//	Return the minimum possible x.
	public static boolean isPossible(int n, int[] quantity, int limit) {
		
		for(int i=0; i<quantity.length;i++) {
			int val = quantity[i];
			int temp = val/limit;
			if(val % limit != 0) {
				temp++;
			}
			n = n- temp;
			if(n<0) {
				return false;
			}			
		}
		return true;		
	}
	public static void main(String[] args) {
		
		int[] quantity = {11,6};
		int n = 5; //shops
		
		
		int l=1;
		int r=(int)Math.pow(10, 9);
		while(l<=r) {
			int mid = l+(r-l)/2;
			if(isPossible(n,quantity, mid)) {
				r = mid-1;
			}
			else {
				l = mid+1;
			}
		}
		System.out.println("l "+l);

		

	}

}
