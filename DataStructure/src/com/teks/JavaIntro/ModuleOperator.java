package com.teks.JavaIntro;

public class ModuleOperator {

	public static void main(String[] args) {
		int arr[]={ 3,2,1,5,7,8,1,4,1,2,1,4,6};
		int count=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]==3) {
			count++;
		}
		}
		System.out.println(count);
		
		System.out.println("******************@@@**************");
		
		int count2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%3==0) {
				count2++;
			}
		}
		System.out.println(count2);
		
		System.out.println("******************@@@**************");
		
		int count3=0;
		for(int i=0; i<arr.length;i++) {
			if((arr[i]%2==0 || arr[i]%3==0)) {
				count3++;
			}
		}
		System.out.println(count3);
		
		System.out.println("******************@@@**************");
		int count4=0;
		for(int i=0; i<arr.length;i++) {
			if((arr[i]%2==0 && arr[i]%3==0)) {
				count4++;
			}
		}
		System.out.println(count4);
		
		System.out.println("******************@@@**************");
		boolean flag=false;
		if((12>4 || 6<3) && (3>8 || 4>2)) {
			flag=true;
		}
		System.out.println(flag);
	}

}
