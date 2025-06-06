package com.teks.academy.LeetCode;

public class Leet6_MaxPair {

	
//	Find Maximum Number of String Pairs
	
//	Input: words = ["ab","ba","cc"] //ab reverse is ba repeated once in an array
//			Output: 1
	  static int maximumNumberOfStringPairs(String[] words) {
		 
	    int maxPair =0;
	        for(int i=0;i<words.length-1;i++) {
	          String word = words[i];
	          StringBuilder builder = new StringBuilder(word);
	          builder.reverse();
	          
	          for(int j=i+1; j<words.length;j++) {
	        	  
	        	  if(words[i].equals("0")) {
		        		 break; 
		        	  }
	   if(builder.toString().equals(words[j])) {
	            	maxPair++;
	            	words[j] ="0";
	            	break;
	            }
	          }
	          
	        }
	        for(int k=0;k<words.length;k++) {
	        	System.out.println(words[k]);
	        }
	        return maxPair;
	        
	    }
	  
	  static void pattern(String[] words) {
		  for(int i=0;i<words.length-1;i++) {
			  
			  for(int j=i+1;j<words.length;j++) {
				  System.out.println(i+" "+j);
			  }
			
		  }
	  }
	public static void main(String[] args) {
		
		String[] arr = {"cd","ac","dc","ca","zz","dc","dc"};
		System.out.println(maximumNumberOfStringPairs(arr));
		//pattern(arr);
	}

}
