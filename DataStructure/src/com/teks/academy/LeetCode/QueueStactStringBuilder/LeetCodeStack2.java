package com.teks.academy.LeetCode.QueueStactStringBuilder;

import java.util.Stack;

public class LeetCodeStack2 {

	public static void main(String[] args) {
		//1) multiply top by 2 and push
		
		Stack<Integer> st = new Stack<>();
		st.push(11);
		st.push(2);
		st.push(6);
		
		int to = st.peek();
		int ans = to*2;
		
		st.push(ans);
		System.out.println(st);

	}

}
