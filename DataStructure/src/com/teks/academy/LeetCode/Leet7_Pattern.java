package com.teks.academy.LeetCode;

public class Leet7_Pattern {

	public static void main(String[] args) {
		
		
		for(int i=0;i<3;i++) {
			//System.out.print("macha");
			for(int j=0;j<3;j++) {
				
				System.out.print("* ");				
			}
			System.out.println();
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
		for(int x=0;x<3;x++) {
			
			for(int y=0;y<3;y++) {
				System.out.print("*");	
				if(y!=3-1) {
					System.out.print("-");	
				}
			}
			System.out.println();
		}
	}
}
