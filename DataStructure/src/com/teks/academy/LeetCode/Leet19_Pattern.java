package com.teks.academy.LeetCode;

public class Leet19_Pattern {

	static void test(int num) {
		for(int i=num-2;i>0;i--) {
			for(int j=1;j<num-i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		test(8);
	}

}
