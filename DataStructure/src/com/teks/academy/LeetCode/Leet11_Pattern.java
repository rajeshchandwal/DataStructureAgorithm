package com.teks.academy.LeetCode;

public class Leet11_Pattern extends RuntimeException{

	static void test(int row, int column) {
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<column-i;j++) {
				
				System.out.print(" ");
			}
			
			for(int k=0;k<3;k++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
		test(3,3);

	}

}
