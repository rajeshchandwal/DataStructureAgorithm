package com.teks.academy.LeetCode.QueueStactStringBuilder;

import java.util.Stack;

public class LeetCodeStack1 {

	public static void main(String[] args) {
		
		//2)sum top 2 element and push
		
		Stack<Integer> st = new Stack<>();
		st.push(11);
		st.push(2);
		st.push(6);
		int to = st.pop();
		int to2 = st.peek();
		int ans = to+to2;
		st.push(to);
		st.push(ans);
		System.out.println(st);

	}

}
