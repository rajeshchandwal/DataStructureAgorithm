package com.teks.academy.LeetCode.binerySearch;

public class LeeatBinearch7 {
	
	//you are a product manager unfortunately leading a team t develop a new product , unfortunately the latest version of 
//your product fails the quality check since each version is developed based on the previous version all the versionafter 
//bad version is bad
//suppose you have n version[1,2,...n] and you want to find out the first bad version
//you have given api isBadVersion(version)
	
	
	 public static  boolean isBadVersion(int val) {
		 int arr[] = {0,0,0,0,1,1,1,1};
		 if(arr[val] == 1) {
			 return true;
		 }
		 return false;
	 }

	public static void main(String[] args) {
		int n = 9;
		int l = 0;
		int r= n-1;
		while(l<=r) {
			int mid = l+(r-l)/2;			
				if(isBadVersion(mid)) {
					r = mid-1;
				}else {
					l= mid+1;
				}
						
		}
		System.out.println("index l value "+l);

	}

}
