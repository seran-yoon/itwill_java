package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04Ex03 {

	public static void main(String[] args) {
		//성적을 입력받아서 학점을 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score>=90){
			System.out.println("A");
		}
		else if(score>=80) {
			System.out.println("B");
		}
		else if(score>=70) {
			System.out.println("C");
		}
		else if(score>=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		/*
		 int score = 0;
		 String grade = " ";
		 
		 System.out.println("성적 입력 <<< ")
		 score = sc.nextInt();
		 
		 if(score>=90){
			grade = "A";
		}
		else if(score>=80) {
			grade = "B";
		}
		else if(score>=70) {
			grade = "C";
		}
		else if(score>=60) {
			grade = "D";
		}
		else{
			grade = "F";
		}
		
		System.out.println("%d점은 %S학점입니다", score, grade);
		 */
		
	}
}
