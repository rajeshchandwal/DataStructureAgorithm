package com.teks.academy.TwoDimensionalArray;

public class CheckDiagonalEqual {

	public static void main(String[] args) {
		int[][] mat = {{1,2,3,11},{4,1,6,2},{7,8,1,13}};
		int r = mat.length;
		int c = mat[0].length;
		int i=0;
		int j=0;
		boolean isValid = true;
		int temp = mat[i][j];
		while(i<r && j<c) {
			if(mat[i][j]!=temp) {
				isValid=false;
			}
			
			i++;
			j++;
		}
		System.out.println(isValid);

	}

}
