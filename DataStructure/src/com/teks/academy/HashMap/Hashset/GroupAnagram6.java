package com.teks.academy.HashMap.Hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram6 {
	
	public static List<List<String>> groupAnagram(String[] str){
		HashMap<String,List<String>> map = new HashMap<>();
		for(String st : str) {
			char[] arr = st.toCharArray();
			Arrays.sort(arr);
			String s = new String(arr);
			map.computeIfAbsent(s, k ->new ArrayList<>()).add(s);
		}
		
		System.out.println(map);
		return null;
		
	}
	
	
	public static void main(String[] args) {
		String[] arr = {"tan","nat","eat","bat"};
		groupAnagram(arr);

	}

}
