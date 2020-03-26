package org.comstudy21.ch01;

public class Ch01Ex02Output {

	public static void main(String[] args) {
		
		System.out.println("성명 : ");
		System.out.println("홍길동");
		
		System.out.printf("성명 : %s\n", "김길동");
		System.out.printf("나이 : %d\n", 25);
		System.out.printf("시력 : %.1f\n", 1.5);
		System.out.printf("혈액형 : %c\n", 'A');

	}
}

/*
 
 *** 변환문자 ***
 %s - 문자열로 변환
 %i - 정수로 변환
 %d - (10진수)정수로 변환  %o(8진수) %x(16진수)
 %c - 문자로 변환
 %f - 실수로 변환
 
 *** 문자와 문자열의 차이 ***
 문자는 홑따옴표를 사용하고 문자열은 쌍따옴표를 사용한다
 'A' - 문자 -> [A]
 "A" - 문자열 -> [A][\0]
 문자열은 메모리에 최소 2글자가 들어간다
 
 *** 특수문자 ***
 \n - 줄 바꿈
 \r - 리턴
 \t - 탭 키
 \' - 홑따옴표
 \" - 쌍따옴표
 \a - 경고음
 
 */
