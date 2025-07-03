package com.teks.academy.LeetCode.QueueStactStringBuilder;

import java.util.Stack;

public class LeetCodeStack4 {

	
//	You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
//
//	You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
//
//	An integer x.
//	Record a new score of x.
//	'+'.
//	Record a new score that is the sum of the previous two scores.
//	'D'.
//	Record a new score that is the double of the previous score.
//	'C'.
//	Invalidate the previous score, removing it from the record.
//	Return the sum of all the scores on the record after applying all the operations.
//
//	The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.
//	
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
		String[] operations = {"5","2","C","D","+"};
		System.out.println(calPoints(operations));

		
	}

}
