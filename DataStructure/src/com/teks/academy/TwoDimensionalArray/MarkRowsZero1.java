package com.teks.academy.TwoDimensionalArray;

public class MarkRowsZero1 {

	public static void main(String[] args) {
		 int[][] mat = {{1,2,0},{4,3,6},{2,8,1}};
         int row = mat.length;
         int column = mat[0].length;
         boolean[] rows = new boolean[row];
         boolean[] columns = new boolean[column];
         
         for(int i=0;i<row;i++) {
             for(int j=0;j<column;j++) {
                 if(mat[i][j]==0) {
                     rows[i]= true;
                     columns[j]=true;
                 }
             }
             
         }
         
           for(int i=0;i<row;i++) {
             for(int j=0;j<column;j++) {
                 if(rows[i] || columns[j] ) {
                     mat[i][j]=0;
                 }
             }
             
         }

           
           for(int i=0;i<row;i++) {
               for(int j=0;j<column;j++) {
                   System.out.println(mat[i][j]);
               }
               
           }
	}

}
