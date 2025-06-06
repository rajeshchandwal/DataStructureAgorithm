package com.teks.academy.LeetCode;

public class Leet15_Pattern {

	static void test(int num) {
		for(int i=num-1;i>=0;i--) {
			for(int j=0;j<num-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<num;i++) {
			for(int j=0;j<num-i-1;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");
			} 
			System.out.println();
		}
	}
	public static void main(String[] args) {
		test(5);

	}

}
