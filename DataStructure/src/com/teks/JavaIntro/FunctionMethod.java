package com.teks.JavaIntro;

public class FunctionMethod {

	public static void fun(int n,String str) {
		for(int i =0;i<n;i++) {
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		FunctionMethod.fun(3, "Rajesh");
		FunctionMethod.fun(4, "Kiru");
		FunctionMethod.fun(5, "jagu");
	}

}
