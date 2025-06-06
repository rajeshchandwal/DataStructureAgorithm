package com.teks.academy.LeetCode;

public class Leet8_Pattern {

	
	static void test(int row, int column) {

		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print("*");		
				if(j!=column-1) {
					System.out.print(" ");		
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		test(5,10);
	}

}
