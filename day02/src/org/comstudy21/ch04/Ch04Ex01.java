package org.comstudy21.ch04;

import java.util.Scanner;

public class Ch04Ex01 {

	public static void main(String[] args) {
		//정수를 입력받아서 홀수-짝수 판별하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		int integer = sc.nextInt();
		
		if(integer%2==0){
			System.out.println("짝수");
		}else{
			System.out.println("홀수");
		}

		/* 문자열 변수를 생성해서 결과값 저장 후 나중에 한번에 출력
		 String result = ""; 
		 
		 if(integer%2==0){
			result = "짝수";
		}else{
			result = "홀수";
		}
		
		System.out.println(result);
		 */
		
		
		/* 문자열 변수를 생성, 홀수 결과값을 미리 지정하고 if문만 쓰기
		 String result = "홀수"; 
		 
		 if(integer%2==0){
			result = "짝수"; }
		
		System.out.println(result);
		 */
		
	}
}
