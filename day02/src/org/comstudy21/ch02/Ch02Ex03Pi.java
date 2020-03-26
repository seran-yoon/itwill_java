package org.comstudy21.ch02;

import static java.lang.System.out; //System.out.print를 쓸때 System.을 생략하기 위한 import -> out.print 쓰고 shift+ctrl+o 해서 import해줌
import java.util.Scanner;

public class Ch02Ex03Pi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
 		final double PI = 3.141592; //final을 붙이면 값을 못바꿈 -> 변수가 상수가 됨 -> 상수는 대문자로 써주는게 좋음
		 
		int r = sc.nextInt(); //함수 안에서 선언하는 변수는 지역변수(local) -> r은 클래스 안의 함수안에서 선언했으니 지역변수 -> 지역변수는 초기화 필수, 값을 미리 지정해줘야 함
		
		double area = 0;
		double round = 0;
		
		area = r*r*PI;
		round = 2*PI*r;
		
		out.printf("반지름이 %d인  원의 둘레의 길이는  %f이다\n", r, round); //printf는 줄바꿈을 따로 써줘야 함
		out.printf("반지름이 %d인  원의 넓이는  %f이다", r, area);

	}

}

//자바에서는 정수보다 실수가 더 큰 타입
//정수와 정수를 연산하면 결과값은 정수, 정수와 실수를 연산하면 결과값은 실수
//long타입보다 float타입이 더 큰 타입으로 인식
