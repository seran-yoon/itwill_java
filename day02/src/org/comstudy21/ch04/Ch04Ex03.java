package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04Ex03 {

	public static void main(String[] args) {
		//������ �Է¹޾Ƽ� ������ ����ϴ� ���α׷�
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
		 
		 System.out.println("���� �Է� <<< ")
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
		
		System.out.println("%d���� %S�����Դϴ�", score, grade);
		 */
		
	}
}
