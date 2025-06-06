package com.teks.academy.LeetCode;

public class Leet3_StringReplace {

	
//	Given a valid (IPv4) IP address, return a defanged version of that IP address.
//
//			A defanged IP address replaces every period "." with "[.]".
	
//	Explanation
//	Example 1:
//
//		Input: address = "1.1.1.1"
//		Output: "1[.]1[.]1[.]1"
//	
static String defangIPaddr(String address) {
        
	System.out.println(address);
        
	String ans = "";
	for(int i=0; i<address.length();i++) {
		char ch = address.charAt(i);
		
		if(ch!='.') {
			
			ans = ans+ch;
		}
		else {
			ans = ans+"[.]";
		}
		
	}
        return ans;
    }
	public static void main(String[] args) {
		String a ="1.1.1.1";
	      System.out.println(defangIPaddr(a));

	}

}
