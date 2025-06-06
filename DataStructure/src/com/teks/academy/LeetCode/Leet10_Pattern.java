package com.teks.academy.LeetCode;

public class Leet10_Pattern {

	static void test(int row, int column) {
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<column;j++) {
				
				if(i==0 || i==row-1|| j==0|| j== column-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
		

		test(5,9);
	}

}
