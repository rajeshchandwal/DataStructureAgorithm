package com.teks.academy.LeetCode;

public class Leet2IncreamentDecreament {

	
//	2)Final Value of Variable After Performing Operations
	
//	The operations are performed as follows:
//		Initially, X = 0.
//		--X: X is decremented by 1, X =  0 - 1 = -1.
//		X++: X is incremented by 1, X = -1 + 1 =  0.
//		X++: X is incremented by 1, X =  0 + 1 =  1.
	static int test(String[] a){
	    
	    int ans=0;
	    for(int i=0;i<a.length;i++){
	      if(a[i].equals("--X") || a[i].equals("X--") ) {
	    	  ans = ans -1;
	      }
	      else{
	    	  ans = ans +1;
	      }
	    }
	    return ans;
	  }
	    public static void main(String[] args) {
	      
	      String[] a={"--X","++X","X++"};
	      System.out.println(test(a));
	  }
}
