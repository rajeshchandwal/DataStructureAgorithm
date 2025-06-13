package com.teks.academy.LeetCode.QueueStactStringBuilder;

import java.util.Stack;

public class LeetCodeStack4 {

	
	public static int calPoints(String[] operations) {
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<operations.length;i++) {
			String s = operations[i];
			if(s.equals("+")) {
				int to = st.pop();
				int to2 = st.peek();
				int tempAns = to+to2;
				st.push(to);
				st.push(tempAns);
			}
			else if(s.equals("D")) {
				int to = st.peek();
				st.push(to*2);
				
			}else if(s.equals("C")) {
				st.pop();
			}
			else {
				st.push(Integer.valueOf(s));
			}
		}
		int ans =0;
		for(int i : st) {
			ans = ans+i;
		}
		return ans;
		
	}
	public static void main(String[] args) {
		String[] operations = null;
		calPoints(operations);

	}

}
