package com.teks.academy.TwoDimensionalArray;

public class ReverseMatrix2 {

	public static void main(String[] args) {
		 int[][] mat = {{1,2,0},{4,3,6},{2,8,1}};
         int row = mat.length;
         int column = mat[0].length;
         int n = column;
         for(int i=0;i<n;i++) {
        	 for(int j=0;j<n/2;j++) {
        		int temp = mat[i][j];
        		mat[i][j] =mat[i][n-1-j];
        		mat[i][n-1-j] = temp;
        	 }
        	 
         }
         for(int i=0;i<row;i++) {
             for(int j=0;j<column;j++) {
                 System.out.println(mat[i][j]);
             }
             
         }


	}

}
