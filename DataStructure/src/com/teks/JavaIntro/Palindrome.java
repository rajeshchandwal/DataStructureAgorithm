package com.teks.JavaIntro;

public class Palindrome {

	public static void main(String[] args) {
		//First Case
		
		String str = "abas";
		String newStr = "";
		for(int i = str.length()-1;i>=0;i--) {
			newStr = newStr+str.charAt(i);
		}
		
		if(newStr.equals(str)) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("not pallindrome");
		}
				
		System.out.println("*************@@@@@@@@@@@@****************");
		
		int n=str.length();
		boolean flag = true;
		for(int i=0;i<n/2;i++) {
			if(str.charAt(i)!=str.charAt(n-i-1)) {
				flag=false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("not pallindrome");
		}
		
		
		
		
	}

}
