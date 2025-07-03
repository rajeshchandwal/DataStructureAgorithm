package com.teks.academy.TwoDimensionalArray;

public class ColumnRowSize {

	public static void main(String[] args) {
		int [][] mat = {{5,4},{2,3}};
		int row = mat.length;
		int column = mat[0].length;
		System.out.println("row "+row+ " column "+column);
		
		for(int i=0;i<row;i++) {
			for(int j=0; j<column;j++) {
				System.out.println(mat[i][j]);
			}
		}
		
		System.out.println("Print first row");
		
		for(int i=0; i<column; i++) {
		System.out.println(mat[0][i]+ " ");	
		}

		System.out.println("Print first column");
		
		for(int i=0; i<row; i++) {
			System.out.println(mat[i][0]+ " ");	
			}
		
		System.out.print("Main diagonal: ");
        for (int i = 0; i < row; i++) {
            System.out.print(mat[i][i] + " ");
        }
        
        System.out.print("reverse diagonal: ");
        
        for(int i=0;i<row;i++) {
        	int j = column - i -1;
        	System.out.println(mat[i][j]);
        }
	}

}
