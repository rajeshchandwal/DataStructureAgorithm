package com.teks.academy.LeetCode;

public class Leet13_Pattern {

	static void test(int n) {
		

		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		

		test(3);
	}

}
