package com.teks.academy.LeetCode;

public abstract class Leet23_TimeSpace {
	
	static void test() {
		
		int[] priceList = {7,2,1,3,6,4,10 };
		int position=0;
		int buy=priceList[0];//[7,1,5,3,6,4]arri
		int profit=0;
		
		for(int i=0;i<priceList.length;i++) {
			
			if(buy>priceList[i]) {
				buy=priceList[i];
			}
			if(profit < priceList[i]-buy) {
				profit = priceList[i]-buy;
			}
			//profit = priceList[i]-buy;
			
			
//			for(int j=i+1;j<priceList.length;j++) {
//				int temp =priceList[j]-priceList[i];
//				System.out.println(temp);
//				if(profit<temp) {
//					profit =temp;
//				}
//				
//			}
		}
	
		System.out.println(profit);
		
	}
	public static void main(String[] args) {
		test();

	}

}
