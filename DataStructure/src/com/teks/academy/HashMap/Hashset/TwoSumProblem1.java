package com.teks.academy.HashMap.Hashset;

import java.util.HashMap;

public class TwoSumProblem1 {
	
	public static int[]  twoSum(int[] arr ,int target) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length;i++) {
			
			int complete = target- arr[i];
			if(map.containsKey(complete)) {
				return new int[] {map.get(complete),i};
			}
			map.put(arr[i], i);
			
		}
		
		
		return null;
		
	}

	public static void main(String[] args) {
		int[] num = {5,8,2,7,3};
		int[] num2 =twoSum(num,9);
		for(int i=0; i<num2.length;i++) {
			System.out.println(num2[i]);
		}

	}

}
