package com.teks.academy.LeetCode;

public class Leet5_GreaterNumber {
	static int greaterNumber(int[] arr) {

	      int greaterNumber = arr[0];
	      for(int i=0;i<arr.length;i++) {
	        if(greaterNumber < arr[i]) {
//	          greaterNumber = arr[i];
	        	greaterNumber = Math.max(greaterNumber, arr[i]); //will return greater number
	          
	        }
	      }
	            


	        return greaterNumber;
	    }
	    public static void main(String[] args) {
	      
	    int arr[] = {12,34,10,56,44};
	      System.out.println(greaterNumber(arr));
	  }
}
