package com.teks.academy.BubbleSort_Arraysort;

import java.util.Arrays;

public class SortByJavaArray {
	
	public static void bubbleSort(int[] arr)  {
		
	Arrays.sort(arr);
	int n  = arr.length;
	
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	}


	public static void main(String[] args) {
	int[] arr = {9,0,6,8,3};
		
		bubbleSort(arr);

	}

}
