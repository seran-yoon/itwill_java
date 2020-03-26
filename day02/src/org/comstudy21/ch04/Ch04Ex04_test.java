package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04Ex04_test {

	public static void main(String[] args) {
		// 입력받은 점수만큼 학점을 표시하고, 
		// X3점 이하는 -학점, X7점 이상은 +학점, 그 외에는 0학점으로 표시
		// 입력받는 점수는 0~100점 사이에서만 학점 출력, 그 외의 숫자 입력시 에러 표시
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		String result = " ";
		
		if(0<=score && score<=100){
			if(score>=90){
				result = "A";
			}
			else if(score>=80) {
				result = "B";
			}
			else if(score>=70) {
				result = "C";
			}
			else if(score>=60) {
				result = "D";
			}
			else {
				result = "F";
			}
			
			if(score>=60 && score%10>=7 || score==100){
				result += "+";
			} else if (score>=60 && score%10<=3){
				result += "-";
			}
			
			System.out.println(result);
		}
		else {
			System.out.println("에러");
		}
		
	}
}

//String은 2자 이상의 문자열을 선언하기 때문에 기호 변수를 따로 주지 않고 원해 성적에 기호를 붙여서 쓰는게 가능 (학점 변수로에 기호 붙이기)
//result += "+";
