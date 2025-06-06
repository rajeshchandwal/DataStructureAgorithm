package com.teks.academy.LeetCode;

public class Leet4_JewsStones {

	
//	You're given strings jewels representing the types of stones that are jewels, and stones
//	representing the stones you have. Each character in stones is a type of stone you have.
//	You want to know how many of the stones you have are also jewels.
	
//	Input: jewels = "aA", stones = "aAAbbbb"
//			Output: 3
	static int defangIPaddr(String jewels, String stones) {


        int count =0;
  for(int i=0; i<jewels.length();i++) {
    for(int j=0;j<stones.length();j++){
      
      if(jewels.charAt(i) == stones.charAt(j)) {
        count++;
        
      }
      
    }
  }
   


   return count;
}
	
	
	static void doubleForLoopConcept() {
		
		for(int i=0;i<2;i++) {
			System.out.println("outer loop "+i);
			for(int j=0;j<3;j++) {
				System.out.println("Inn "+i+" "+j);
				
				if(i==1) {
					break;
				}
			}
		}
		
		
	}
public static void main(String[] args) {
 
 String jewels="aA";
 String stone ="aAAbbbbaAA";
 System.out.println(defangIPaddr(jewels,stone));
doubleForLoopConcept();
}
}
