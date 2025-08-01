package com.teks.academy.TwoDimensionalArray;

import java.util.*;

public class MatrixOverlap {
	
	public static List<int[]> mergeIntervals(int[][] intervals){
		// Step 1: Sort intervals by start time
		Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
		
       
		List<int[]> merger = new ArrayList<>();
		int[] current = intervals[0];
		merger.add(current);
		
		for(int[] interval : intervals) { 
			int currentEnd = current[1];
			int intervalEnd = interval[1];
			int intervalStart =interval[0];
			if(intervalStart <= currentEnd) {
				current[1] = Math.max(currentEnd, intervalEnd);
			}
			else {
				//no  overLapping
				current = interval;
				merger.add(current);
			}
			
		}
		
		
		return merger;
		
	}

	public static void main(String[] args) {
		int[][] intervals = {
	            {1, 3},
	            {2, 6},
	            {8, 10},
	            {15, 18}
	        };

		List<int[]> result = mergeIntervals(intervals);

	        for (int[] interval : result) {
	            System.out.println(Arrays.toString(interval));
	        }

	}

}
