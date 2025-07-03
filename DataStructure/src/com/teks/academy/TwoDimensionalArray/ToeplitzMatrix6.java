package com.teks.academy.TwoDimensionalArray;

public class ToeplitzMatrix6 {

//	Toeplitz Matrix
//	Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.
//
//			A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.
//	Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
//			Output: true
	
	public static boolean validFun(int[][] matrix,int y, int x) {
		
		int r = matrix.length;
		int c = matrix[0].length;
		int i = y;
		int j=x;
		int temp = matrix[i][j];
		boolean isValid = true;
		while(i<r && j<c) {
			if(matrix[i][j] != temp) {
				isValid = false;
			}
			i++;
			j++;
			
		}
		System.out.println(isValid);
		return false;
		
	}
	public static void main(String[] args) {
		
		int[][] mat = {{11,2,3,11},{4,11,2,12}, {7,4,11,2}};
		
		boolean ans =true;
		int r = mat.length;
		int c =mat[0].length;
		for(int j=0; j<c;j++) {
			
		boolean 	temp = validFun(mat,0,j);
			if(temp ==false) {
				ans = false;
			}
		}
		
		for(int i=1;i<r; i++) {
			
		boolean 	temp  = validFun(mat,i,0);
			
			if(temp ==false) {
				ans = false;
			}
			
		}
		
		
		
		

	}

}
