package com.teks.academy.LeetCode;

public class Leet21_Pattern {

	static void test(int num) {
		
		
		for(int i=0;i<num;i++) {
	
			for(int j=0;j<num-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=0;k--) {
			System.out.print(k+1);
			
		
	}
			System.out.println();
		}	
	}
	public static void main(String[] args) {
		test(5);

	}

}
