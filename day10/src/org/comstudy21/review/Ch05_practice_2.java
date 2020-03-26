package org.comstudy21.review;

public class Ch05_practice_2 {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 100;
		int big;
		int diff;
		
//		big = (num1>num2) ? num1:num2;
//		System.out.println("贖 熱 : " + big);
//		
//		diff=(num1>num2) ? (num1-num2):(num2-num1);
//		System.out.println("瞰渤高 : " + diff);
		
	
		if(num1>num2){
			big = num1;
			diff = num1-num2;
			System.out.println("贖 熱 : " + big);
			System.out.println("瞰渤高 : " + diff);
		} else if(num1<num2){
			big = num2;
			diff = num2-num1;
			System.out.println("贖 熱 : " + big);
			System.out.println("瞰渤高 : " + diff);
		}
		
	}

}
