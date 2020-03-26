package org.comstudy21.review;

public class Ch05_practice_4 {

	public static void Q1(String[] args) {
		
		int n = 1;
		int sum = 0;
		
		while(n<100){
			sum += n;
			n++;
		}
		
		System.out.println(sum);
	}

	public static void Q2(String[] args) {
		
		int n = 1;
		
		while(n<=100){
			System.out.print(n+" ");
			n++;
		}
		
		System.out.println();
		
		int num = 100;
	
		do{
			System.out.print(num+" ");
			num--;
		} while(num>0);
	}
	
	
	public static void Q3(String[] args) {
		
		int n = 1;
		int sum = 0;
		
		while(n<=100){
			if(n%2==0 && n%7==0){
				System.out.println(n);
				sum += n;
			}
			n++;
		}
		
		System.out.println(sum);
	}
	
	
	
}
